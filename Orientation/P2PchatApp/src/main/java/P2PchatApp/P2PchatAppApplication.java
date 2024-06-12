package P2PchatApp;

import P2PchatApp.models.User;
import P2PchatApp.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class P2PchatAppApplication implements CommandLineRunner {

    private final UserRepository userRepository;

    public P2PchatAppApplication(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(P2PchatAppApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        User newUser = new User();
         newUser.setUsername("Test");
    }
}
