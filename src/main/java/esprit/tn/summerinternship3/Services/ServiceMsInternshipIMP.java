package esprit.tn.summerinternship3.Services;

import esprit.tn.summerinternship3.Entities.Internship;
import esprit.tn.summerinternship3.Entities.User;
import esprit.tn.summerinternship3.Repositories.AssignementLetterRepo;
import esprit.tn.summerinternship3.Repositories.InternshipRepo;
import esprit.tn.summerinternship3.Repositories.UserRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class ServiceMsInternshipIMP implements IServiceMsInternship {
    @Autowired
    InternshipRepo internshipRepo;
    @Autowired
    AssignementLetterRepo assignementLetterRepo;
    @Autowired
    UserRepo userRepo;

    @Override
    public Internship ajouterInternship(Internship internship, Long userId) {
        Optional<User> optionalUser = userRepo.findById(userId);

        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            internship.setUserInternship(user); // Assuming Internship has a user relationship

            return internshipRepo.save(internship);
        } else {
            log.info("User with ID " + userId + " not found.");
        }
        return internship;
    }
    @Override
    public Internship RechercheById(Long internshipId){
        Internship internship =internshipRepo.findById(internshipId).orElse(null);

        return internship;
    }
    @Override
    public Internship ModifierInternship (Internship internship , Long userId,Long internshipId){
        Internship internshipUser =internshipRepo.findById(internshipId).orElse(null);
        if (internshipUser != null && internshipUser.getUserInternship().getUserId().equals(userId)){
            internshipUser.setSpeciality(internship.getSpeciality());
            internshipUser.setYear(internship.getYear());
            internshipUser.setType(internship.getType());
            internshipRepo.save(internshipUser);
        }
        return internshipUser;
    }

    @Override
    public void supprimerInternship(Long idInternship, Long idUser) {
        Internship internship =internshipRepo.findById(idInternship).orElse(null);
        User user = userRepo.findById(idUser).orElse(null);
        if(internship != null && internship.getUserInternship().getUserId().equals(idUser)){
            internshipRepo.deleteById(idInternship);
        }else
            log.info("erreur 404");
    }
   @Override
    public List<Internship> rechercheAvInternships(String specialty, int year, String type, boolean isValidated) {
        return internshipRepo.findBySpecialityAndYearAndTypeAndIsValid(specialty, year, type, isValidated);
    }

}