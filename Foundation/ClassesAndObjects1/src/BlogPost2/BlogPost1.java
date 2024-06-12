package BlogPost2;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class BlogPost1 {
    String title;
    String authorName;

    String text;
    String publicationDate;
            // magic discovered ctrl +A to generate all not only title
    public BlogPost1(String title, String authorName, String text, String publicationDate) {
        this.title = title;
        this.authorName = authorName;
        this.text = text;
        this.publicationDate = publicationDate;
    }

 // this magical whatever String toString() makes it readable>> without it code will compile but wont be readable
    @Override
    public String toString() {
        return "Title: " + title + "Author: " + authorName + " Publication Date: " + publicationDate + " Text: "+ text;
    }

    public void add(BlogPost1 blogPost) {
    }
}
