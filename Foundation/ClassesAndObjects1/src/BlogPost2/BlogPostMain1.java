package BlogPost2;

public class BlogPostMain1 {
    public static void main(String[] args) {

        // order can be swapped by when I modify consructor order
        BlogPost1 post1 = new BlogPost1("Lorem Ipsum","John Doe","Lorem ipsum dolor sit amet.","2000.05.04. ");
        BlogPost1 post2 = new BlogPost1("Wait but why","Tim Urban","A popular long-form, stick-figure-illustrated blog about almost everything.","2010.10.10. ");
        BlogPost1 post3 = new BlogPost1("One Engineer Is Trying to Get IBM to Reckon With Trump","William Turton","Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.","2017.03.28");


        System.out.println(post1);
        System.out.println(post2);
        System.out.println(post3);



    }
}
