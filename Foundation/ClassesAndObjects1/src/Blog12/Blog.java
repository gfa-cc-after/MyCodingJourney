package Blog12;

import BlogPost2.BlogPost1;

import java.util.ArrayList;
import java.util.List;

public class Blog {
    //Reuse your BlogPost class
    //Create a Blog class which can:
    //store a list of BlogPosts
    //and has the following methods:
    //add(BlogPost) -> adds a BlogPost to the list
    //delete(int) -> deletes the BlogPost from the given index
    //update(int, BlogPost) -> replaces an item at the given index with a new BlogPost

   // UNFINISHED
    List<BlogPost1> listOfBlogposts;

    public Blog() {
        this.listOfBlogposts = new ArrayList<>();
    }

   public void add(BlogPost1 blogPost) {
        blogPost.add(blogPost);
   }

}
