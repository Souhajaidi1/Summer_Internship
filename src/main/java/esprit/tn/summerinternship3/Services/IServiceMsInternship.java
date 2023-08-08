package esprit.tn.summerinternship3.Services;

import esprit.tn.summerinternship3.Entities.Internship;

import java.util.List;

public interface IServiceMsInternship {
    Internship ajouterInternship (Internship internship , Long userId) ;
    Internship RechercheById(Long internshipId);
    public Internship ModifierInternship (Internship internship , Long userId,Long internshipId);
    public void supprimerInternship(Long idInternship , Long idUser);

    List<Internship> rechercheAvInternships(String specialty, int year, String type, boolean isValidated);
}
