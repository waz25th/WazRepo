import java.util.Scanner; // this helps with user input 

public class javatutorialtwo{
    // create a new scanner object called userInput
    // by calling new and passing the Scanner constructor the scanner object is created
    static Scanner userInput = new Scanner(System.in); 

    public static void main(String [] args){
        System.out.print("your number: ");

        if (userInput.hasNextInt()){ // if statement
            int numberEntered = userInput.nextInt();
            System.out.println("you entered:" + numberEntered);
// simple maths code below
            int numEnteredTimes3 = numberEntered + numberEntered + numberEntered; // declare int variable, addition operator
            System.out.println(numberEntered + " + " + numberEntered + " + " + numberEntered +  " = " + numEnteredTimes3);

            int numEnteredMinus3 = numberEntered - 3;
            System.out.println(numberEntered + " - 3  = " + numEnteredMinus3);

            int numResult = numEnteredTimes3 - numEnteredMinus3;
            System.out.println(numEnteredTimes3 + " - " + numEnteredMinus3 + " = " + numResult);

            int numEnteredABS = Math.abs(numberEntered); // this returns the absolute value of the integer entered

            int numCeiling = (int) Math.ceil (4.89); //this will round up to the nearest whole number
            System.out.println (numEnteredABS + " " +" is the ABS");

            int randomNumber = (int) (Math.random() * 26); // this will return a random number between 0 and 25
            System.out.println(randomNumber + " is the Random Number");

        } else { 
            // else statement if anything but an integer is used by the user
            System.out.println("you need to input an integer");
        }
    }
}