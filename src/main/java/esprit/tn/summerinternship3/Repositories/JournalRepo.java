package esprit.tn.summerinternship3.Repositories;

import esprit.tn.summerinternship3.Entities.Journal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JournalRepo extends JpaRepository<Journal,Long> {
}
