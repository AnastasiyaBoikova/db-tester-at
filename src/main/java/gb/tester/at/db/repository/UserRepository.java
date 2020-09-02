package gb.tester.at.db.repository;

import gb.tester.at.db.mogel.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

        List<User> findAllByNameContaining (String name);
}
