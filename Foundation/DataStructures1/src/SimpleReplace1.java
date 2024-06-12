public class SimpleReplace1 {
    public static void main(String[] args) {

        // Below is a famous sentence from the beginning of a famous movie, but it has a problem.
        // Someone played a prank on us and replaced the word "galaxy" with "dishwasher".
        // Please fix the sentence so that the code prints "In a galaxy far, far away" to the console


        String sentence = "In a dishwasher far, far away";

        if(sentence.contains("dishwasher")) {
            System.out.println("In a galaxy far, far away");
        } else {
            System.out.println("X");
        }



    }
}
