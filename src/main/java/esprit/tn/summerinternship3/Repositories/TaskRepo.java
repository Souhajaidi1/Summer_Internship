package esprit.tn.summerinternship3.Repositories;

import esprit.tn.summerinternship3.Entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepo extends JpaRepository<Task,Long> {
}
