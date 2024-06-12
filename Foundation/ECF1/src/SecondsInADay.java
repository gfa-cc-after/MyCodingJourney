public class  SecondsInADay {
    public static void main(String[] args) {

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables above

        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

       int TimePassed = currentHours * 3600 + currentMinutes * 60 + currentSeconds;

       int remainingSeconds = 24 * 3600 - TimePassed;

        System.out.println(TimePassed);
        System.out.println(remainingSeconds);
    }
}
