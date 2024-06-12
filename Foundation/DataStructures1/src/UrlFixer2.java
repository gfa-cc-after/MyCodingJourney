public class UrlFixer2 {
    public static void main(String[] args) {

        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crucial component, find out what it is and insert it too!
        // Try to solve it in more than one way using different String functions! 


        String url = "https//www.reddit.com/r/nevertellmethebots ";

        if (url.contains("bots")) {
            System.out.println(url.replace("bots", "odds"));
        }

    }
}
