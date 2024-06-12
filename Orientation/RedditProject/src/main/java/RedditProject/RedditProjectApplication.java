package RedditProject;

import RedditProject.models.User;
import RedditProject.repositories.PostRepository;
import RedditProject.repositories.UserRepository;
import RedditProject.repositories.VoteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditProjectApplication  implements CommandLineRunner {

    private final UserRepository userRepository;
    private final PostRepository postRepository;
    private final VoteRepository voteRepository;

    public RedditProjectApplication(UserRepository userRepository, PostRepository postRepository, VoteRepository voteRepository) {
        this.userRepository = userRepository;
        this.postRepository = postRepository;
        this.voteRepository = voteRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(RedditProjectApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        User newUser = new User();
                newUser.setUsername("TEST");

    }
}
