package MavenLoginPageTest.Maven.TEST.Login.Page.services;

import MavenLoginPageTest.Maven.TEST.Login.Page.models.User;
import MavenLoginPageTest.Maven.TEST.Login.Page.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
        // constructor
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }
}
