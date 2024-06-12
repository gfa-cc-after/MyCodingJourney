package P2PchatApp.services;

import P2PchatApp.models.User;
import P2PchatApp.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServices {
    private final UserRepository userRepository;

    public void registerUser(String username, String password){
        // check if username exists
        if(userRepository.existsByUsername(username)){
            throw new IllegalArgumentException("Username is already Taken");
        }
        // creating new user as object
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        // and save user to the repo database
        userRepository.save(user);
    }

    public boolean loginUser(String username, String password) {
        // here i find user by username so i can use it down
        User user = userRepository.findByUsername(username);
        // check if user exists if not throw error
        if (user == null) {
            throw new IllegalArgumentException("User not found");
        }
        // check if pasword is correct
        return user.getPassword().equals(password);

    }
}
