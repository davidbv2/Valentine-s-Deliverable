import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userNum = 0;

        System.out.println("Please enter a positive whole number: ");

        /**
         * While the Scanner has a valid input (sncr.hasNextInput equates to true or false),
         * set the userNum to the input from the user. If that input is less than 0,
         * prompt the user to try again. Otherwise, exit the while loop.
         */

        while (scnr.hasNextInt()) {
            userNum = scnr.nextInt();
            if(userNum < 0)
            {
                System.out.print("Try again. Enter only positive whole numbers Enter here: ");
            }else{
                ;
            }
        }

        /**
         * Now that we have a positive valid number, set original to that number so that we can keep track
         * of it later for comparing.
         */
        int original = userNum;

        /*
        Once positive whole integer is validated, print prompt confirming that with user.
         */
        System.out.println("Yes! " + userNum + " is a positive whole number.\n");

        double cubeResult = 0;

            /*
            Once we have the positive integer, here we can perform operations below continuously to extract individual
            digits from integer. Try calculation with userNum = '153'.
             */

        while (userNum > 0) {
            int d = userNum / 10;
            int k = userNum - (d * 10);
            double cubed = Math.pow(k, 3);
            userNum = d;
            cubeResult += cubed; // Adds up cube Result of each iteration (individual digit) while expression's true
            System.out.println(k + " cubed is " + (int) cubed + ".");
        }

        System.out.print("\n");

            /*
            When cubeResult = original (which is equal to the positive integer entered by user), print 'true' statement
            If false, print 'false' statement.
             */

        if (cubeResult == original) {
            System.out.print("True! " + (int) cubeResult + " is equal to " + original + ". ");
        } else System.out.print("False. " + (int) cubeResult + " is not equal to " + original + ".");
    }
}