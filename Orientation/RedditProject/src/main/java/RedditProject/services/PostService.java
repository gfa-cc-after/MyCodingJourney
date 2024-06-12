package RedditProject.services;
import RedditProject.models.Post;
import RedditProject.repositories.PostRepository;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    public List<Post> getAllPosts() {
        // Implement logic to fetch all posts
        return postRepository.findAll();
    }

    public void addPost(String title, String content) {
        Post post = new Post();
        post.setTitle(title);
        post.setContent(content);
        postRepository.save(post);
    }

    public void upvotePost(Long postId) {
        // Implement logic to upvote a post
        Post post = postRepository.findById(postId).orElseThrow(() -> new RuntimeException("Post not found"));
         post.setScore(post.getScore() + 1);
         postRepository.save(post);
    }

    public void downvotePost(Long postId) {
        // Implement logic to downvote a post
        Post post = postRepository.findById(postId).orElseThrow(() -> new RuntimeException("Post not found"));
        post.setScore(post.getScore() - 1);
        postRepository.save(post);
    }

    public Post getPostById(Long postId) {
        return postRepository.findById(postId)
                .orElseThrow(() -> new RuntimeException("Post not found"));
    }
}