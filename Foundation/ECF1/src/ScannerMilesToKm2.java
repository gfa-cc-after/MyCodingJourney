import java.util.Scanner;

public class  ScannerMilesToKm2 {
    public static void main(String[] args) {
        // Write a program which prompts the user for a double value
        // specifying a distance in miles, converts that value
        // to kilometers and prints it
        //
        // Example:
        //
        // Please enter a distance in miles: 1.8
        // The distance in km: 2.88
        // 1 km = 0.62137119 miles

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please enter the distance in miles HERE: ");

        double DistInMiles = scan1.nextDouble();

        double distInKm = DistInMiles * 1.60934;

        System.out.println("The distance in miles is : "  + distInKm);

    }
}
