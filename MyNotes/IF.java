public class IF {

    public static void main(String[] args) {

 // EXAMPLE EXAMPLE
        //      if (x < y) {
        //      System.out.println("the condition is true.");
        //      }



// if u want certain code to run when condition is FALSE you need to add ELSE statement :
// EXAMPLE 2

        //     if (x < y) {
        //     System.out.println("The condition is true.");
        //     }  else {
        //     System.out.println("The condition is false.");
        //     }


// EXAMPLE 3

        //      class Main {
        //      public static void main(String args[]) {
        //       int number1 =  14;
        //       int number2 = 10;
        //
        //      if (number1 < number2) {
        //         System.out.println("number1 is smaller than number2");
        //       } else {
        //      System.out.println("number2 is less than or equal to number1");
        //       }
        //     }
        //  }

        // OUTPUT :  number2 is less than or equal to number1



        int x = 10;
        int y = -1;

        if (x>y || x == 10) {
            System.out.println("The condition is true");
        }   else {
            System.out.println("the condition is false");
        }


//EXERCISE 4

        //There are two friends named Maria and Adam. Maria is 27.4 years old and 174 cm tall,
        // and Adam is 28.3 years old and 157 cm tall.
        //
        //Create 4 different variables for Maria and Adam's heights and ages. Give the variables descriptive names,
        // like mariaAge and adamHeight. Choose which numerical type is best suited for each value.
        //
        //Write an if-else statement block to print the following outputs:
        //
        //If Maria is taller than Adam, then print Maria is the taller person to the terminal. If Adam is taller,
        // then print Adam is the taller person.
        //If Adam is older, then print Maria is the younger person to the terminal.
        // If Maria is older, then print Adam is the younger person.


        //Expected Output
        //
        //Maria is the taller person
        //Maria is the younger person

        double mariaAge = 27.4;
        double adamAge = 28.3;
        int mariaHeight = 174;
        int adamHeight = 157;

        if (mariaHeight>adamHeight) {
            System.out.println("Maria is taller person");
        } else {
            System.out.println("Adam is taller person");
        }

        if (adamAge>mariaAge) {
            System.out.println("Maria is younger person");
        } else {
            System.out.println("Adama is younger person");
        }










    }
}
