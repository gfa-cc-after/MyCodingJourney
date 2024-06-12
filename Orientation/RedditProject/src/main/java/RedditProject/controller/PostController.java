package RedditProject.controller;

import RedditProject.models.Post;
import RedditProject.services.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @GetMapping("/posts")
    public String getAllPosts(Model model) {
        List<Post> posts = postService.getAllPosts();
        model.addAttribute("posts", posts);
        return "listPost"; // Return the listPost.html template
    }

    @GetMapping("/post/{postId}")
    public String getPostById(@PathVariable Long postId, Model model) {
        Post post = postService.getPostById(postId);
        model.addAttribute("post", post);
        return "post"; // Return the post.html template
    }

    @PostMapping("/addPost")
    public String addPost(@RequestParam String title, @RequestParam String content) {
        postService.addPost(title, content);
        return "redirect:/posts"; // Redirect to the list of posts
    }

    @PostMapping("/upvote/{postId}")
    public String upvotePost(@PathVariable Long postId) {
        postService.upvotePost(postId);
        return "redirect:/posts"; // Redirect to the list of posts
    }

    @PostMapping("/downvote/{postId}")
    public String downvotePost(@PathVariable Long postId) {
        postService.downvotePost(postId);
        return "redirect:/posts"; // Redirect to the list of posts
    }
}
