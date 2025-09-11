/**
 * Reynaldo Cantu IV
 * 9/10/2025
 * Purpose: 
 * (write a description about this lab 3 program)
 */

 import java.util.Scanner;

public class Lab3_Reynaldo_Cantu 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double iValue, interestRate, fValue;
        int elapsedYears;

        System.out.println("Please enter the initial value of the home: ");
        iValue = input.nextDouble();
        
        System.out.println("Please enther the number of elapsed years: ");
        elapsedYears = input.nextInt();

        System.out.println("Please enter the interst rate: ");
        interestRate = input.nextDouble();

        interestRate = interestRate / 100;

        

        fValue = iValue * Math.pow((1 + interestRate), elapsedYears);


        System.out.println("The final value of a home is: " + fValue);

        System.out.println();




    }

}
