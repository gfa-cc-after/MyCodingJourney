package MavenTestProjectLogin.MavenTestProjectLogin.services;

import MavenTestProjectLogin.MavenTestProjectLogin.interfaces.UserRepository;
import MavenTestProjectLogin.MavenTestProjectLogin.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
       return userRepository.save(user);
    }
}
