public class Revision {
    public static void main(String args[]) {


//Create a double variable called number. Set the value to 10. Print the following expressions to the terminal using the println method:
//
//number plus 14
//number is equal to 20
//The remainder of number divided by 2 is 0.
//number multiplied by 3.5.
//Hint: don't change the value of number, just print the output.


        //24.0
        //false
        //true
        //35.0

        double number = 10;

        System.out.println(number+14);
        System.out.println(number==20);

        double remainder = number % 2;
        System.out.println(remainder == 0);
        System.out.println(number*2.5);



 //Create these two variables:
        //
        //A String variable called foxName. Set the value to "Freddy".
        //A char variable called firstLetter. Set the value to 'F'.
        //An int variable called firstNumber. Set the value to -3.
        //An int variable called secondNumber. Set the value to -10.
        //Print to the console the following values and expressions:
        //
        //The value of foxName.
        //The value of firstLetter is equal to 'F'.
        //The value of firstNumber is less than the value of secondNumber.
        //The value of secondNumber minus 10 is -20.
        //The sum of firstNumber and secondNumber is -7.

        //output
        // Freddy
        //true
        //false
        //true
        //false

        String foxName = "Freddy";
        char firstLetter = 'F';
        int firstNumber = -3;
        int secondNumber = -10;

        System.out.println(foxName);
        System.out.println(firstLetter=='F');
        System.out.println(firstNumber<secondNumber);
        System.out.println(secondNumber-10==-20);
        System.out.println(firstNumber+secondNumber==-7);



        //EXERCISE
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


// Maria and Adam decided to raise money for charity, so they signed up for a walk-a-thon. For every lap around the
// park they walked, their donors paid a fixed amount of money.
//
//Maria's donors paid 15 cents per lap.
//Adam's donors paid 12 cents per lap.
//Maria and Adam walked together the whole time, and in total they completed 12 laps. Using a while loop or a for loop,
// write some code to print out the total money they had raised so far at the end of each lap.
// Your output should look like this: Maria and Adam have now raised this many cent: X.X
//
//Hint: make sure you print the number and not X.X!

   // variables to track total money start with 0 cause they have 0 at the start
    int mariaTotal = 0;
    int adamTotal = 0;
  // variable to track lap count
    int lap = 1;


// Loop while lap count is less than or equal to total laps = lebo max laps je 12 preto equal
    while (lap <= 12) {
        // do loopu napchame pocitadlo
        mariaTotal += 15;
        adamTotal += 12;

        // TU SPRAVIME DALSI INT pre COMBINED
        int combined = mariaTotal+adamTotal;
        System.out.println("Maria and Adam have now raised this many cents " + combined);

        lap++;
    }





    }
}
