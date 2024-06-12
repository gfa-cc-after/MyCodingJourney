package RedditProject.services;
import RedditProject.models.Post;
import RedditProject.models.User;
import RedditProject.models.Vote;
import RedditProject.repositories.VoteRepository;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class VoteService {
    private final VoteRepository voteRepository;

    public void upvotePost(User user, Post post) {
        Optional<Vote> existingVote = voteRepository.findByUserAndPost(user, post);
        if (existingVote.isPresent()) {
            // User has already voted on this post
            // You can handle this scenario based on your business logic
            // For example, allow changing the vote, or restrict to one vote per user
            // Here, we'll update the existing vote
            Vote vote = existingVote.get();
            if (!vote.isUpvote()) {
                vote.setUpvote(true); // Change the vote to upvote
                voteRepository.save(vote);
            }
        } else {
            // User has not voted on this post yet, create a new upvote
            Vote newVote = new Vote();
            newVote.setUpvote(true);
            newVote.setUser(user);
            newVote.setPost(post);
            voteRepository.save(newVote);
        }
    }

    public void downvotePost(User user, Post post) {
        Optional<Vote> existingVote = voteRepository.findByUserAndPost(user, post);
        if (existingVote.isPresent()) {
            // User has already voted on this post
            // You can handle this scenario based on your business logic
            // For example, allow changing the vote, or restrict to one vote per user
            // Here, we'll update the existing vote
            Vote vote = existingVote.get();
            if (vote.isUpvote()) {
                vote.setUpvote(false); // Change the vote to downvote
                voteRepository.save(vote);
            }
        } else {
            // User has not voted on this post yet, create a new downvote
            Vote newVote = new Vote();
            newVote.setUpvote(false);
            newVote.setUser(user);
            newVote.setPost(post);
            voteRepository.save(newVote);
        }
    }

    public Optional<Vote> findVoteByUserAndPost(User user, Post post) {
        return voteRepository.findByUserAndPost(user, post);
    }
}