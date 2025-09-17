/**
 * Reynaldo Cantu IV
 * 9/10/2025
 * Purpose: Lab3 - Practice with double variables, int variables,
 * prompting the user, and using Math.pow.
 * This Lab excersice demonstrates variable declaration, prompting the user for 
 * inputs for variabes, and introduces the square function Math.pow to figure out
 * the final value of a home.
 */

 import java.util.Scanner;

public class Lab3_Reynaldo_Cantu 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double iValue, interestRate, fValue; // double allows me to create variables used later in the program
        int elapsedYears; // int also allows a variable that will be later asked for the user to input.

        System.out.println("Please enter the initial value of the home: "); //This line prompts the user to enter a initial value of a home.
        iValue = input.nextDouble(); // The value entered proceeds to be used for the variable "iValue."
        
        System.out.println("Please enter the number of elapsed years: "); // This line prompts the user to enter the number of elapsed years.
        elapsedYears = input.nextInt(); // The value entered by the user is used for the variable "elapsedYears."

        System.out.println("Please enter the interst rate: "); // This line prompts the user to enter an interest rate.
        interestRate = input.nextDouble(); // The value given by the user is then used for the variable "interestRate."

        interestRate = interestRate / 100; // The variable "interestRate" is then divided by 100 to convert from a percentage to a decimal.
        // New value for interstRate is formed.
        

        fValue = iValue * Math.pow((1 + interestRate), elapsedYears);
        // The above line creates an equation with the initial value provided by the user
        // multiplied by 1 + interestRate squared to the amount of years the user entered
        // to then be calculated into the variable final value (fValue).


        System.out.println("The final value of a home is: " + fValue);
        // The above line is used to display to the user the final value of a home 
        // with the final value being inserted by being added by the variable fValue after
        // the statement "The finale value of a home is: ."

        System.out.println();
        //This line is to be used as a period to the end of the program.




    }

}
