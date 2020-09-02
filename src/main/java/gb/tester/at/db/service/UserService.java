package gb.tester.at.db.service;

import gb.tester.at.db.mogel.User;
import gb.tester.at.db.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserService {

    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public User registerNewUser(String name, String email) {

        User user = new User();

        user.setName(name);
        user.setEmail(email);
        return userRepository.save(user);

    }


}
