package RedditProject.services;

import RedditProject.models.User;
import RedditProject.repositories.UserRepository;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public void registerUser(String username, String password) {
        // Check if the username is already taken
        if (userRepository.existsByUsername(username)) {
            throw new IllegalArgumentException("Username already exists!");
        }

        // Create a new user object
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        // Save the user to the database
        userRepository.save(user);
    }

    public boolean loginUser(String username, String password) {
        // Find the user by username
        User user = userRepository.findByUsername(username);

        // Check if the user exists
        if (user == null) {
            throw new IllegalArgumentException("User not found!");
        }

        // Check if the passwords match
        return user.getPassword().equals(password);
    }
}
