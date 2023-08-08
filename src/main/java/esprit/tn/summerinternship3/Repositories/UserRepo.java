package esprit.tn.summerinternship3.Repositories;

import esprit.tn.summerinternship3.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}
