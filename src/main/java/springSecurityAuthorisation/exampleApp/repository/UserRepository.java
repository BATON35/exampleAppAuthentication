package springSecurityAuthorisation.exampleApp.repository;

import springSecurityAuthorisation.exampleApp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
