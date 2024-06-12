public class BMI {
    public static void main(String[] args) {

        double massInKg = 130.2;
        double heightInM = 1.78;

        // Print the Body mass index (BMI) based on these values

        double squareOfHeight = massInKg/(heightInM*heightInM);

        if (squareOfHeight<26) {
            System.out.println("Gratz Ur BMI is " + squareOfHeight + " ur not fat");
        }  else {
            System.out.println("Ur BMI is: " + squareOfHeight+ " gratz u fat fk " );
        }



    }
}
