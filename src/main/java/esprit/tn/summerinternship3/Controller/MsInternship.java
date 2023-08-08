package esprit.tn.summerinternship3.Controller;

import esprit.tn.summerinternship3.Entities.Internship;
import esprit.tn.summerinternship3.Services.IServiceMsInternship;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/msinternship")
public class MsInternship {
    @Autowired
    private IServiceMsInternship mSinternshipIService ;

    @PostMapping("/ajoutinternship/{userId}")
    public Internship ajouterInternship(@RequestBody Internship internship, @PathVariable Long userId){
        return  mSinternshipIService.ajouterInternship(internship ,userId);
    }
    @PutMapping("/modifierinternship/{userId}/{internshipId}")
    public Internship ModifierInternship (@RequestBody Internship internship , @PathVariable Long userId,@PathVariable Long internshipId){
        System.out.println("userId: " + userId);
        return mSinternshipIService.ModifierInternship(internship,userId,internshipId);
    }
    @GetMapping("/rechercheavancee/{specialty}/{year}/{type}/{isValid}")
    public List<Internship> rechercheAvInternships(@PathVariable String specialty, @PathVariable int year, @PathVariable String type, @PathVariable boolean isValid) {
        return mSinternshipIService.rechercheAvInternships(specialty,year,type,isValid);
    }
    @GetMapping("/recherchebyid/{internshipId}")
    public Internship RechercheById(@PathVariable Long internshipId){
        return mSinternshipIService.RechercheById(internshipId);
    }

    @DeleteMapping("/deleteinternship/{idInternship}/{idUser}")
    public void supprimerInternship(@PathVariable Long idInternship, @PathVariable Long idUser){
        mSinternshipIService.supprimerInternship(idInternship,idUser);
    }

}
