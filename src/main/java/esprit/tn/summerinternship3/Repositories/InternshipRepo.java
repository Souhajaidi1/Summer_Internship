package esprit.tn.summerinternship3.Repositories;

import esprit.tn.summerinternship3.Entities.Internship;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InternshipRepo extends JpaRepository<Internship,Long> {
    List<Internship> findBySpecialityAndYearAndTypeAndIsValid(String specialty, int year, String type, boolean isValid);
}
