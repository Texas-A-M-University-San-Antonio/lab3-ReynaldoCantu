/**
 * Name: [Reynaldo Cantu IV]
 * Date: [9/10/2025]
* Purpose: InClass 3 - Practice using squares in program.
* This InClass excersice demonstrates double variables, asking the user for inputs to the variables
* and finds the surface area using outputs that square integers (Math.pow).
 */

import java.util.Scanner;// Don't forget to import and declare a Scanner for user input.

public class InClass3_Reynaldo_Cantu
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        // In-Class 3 Example:
        // Step 1: Prompt the user to enter the length of the side of a cube.
        double side, volume, surfaceArea;
    

        // Step 2: Read the user's input and store it in a variable.
        System.out.println("Please enter the length of the side of the cube: ");
        side = input.nextDouble();

        // Step 3: Use an appropriate method to determine the volume of the cube.
        volume = Math.pow(side, 3);
        // Step 4: Use an appropriate method to determine the surface area of the cube.
        surfaceArea = 6 * Math.pow(side, 2);
        // HINT: Steps 3 and 4 will use the Math.pow(a, b) method
        // Step 5: Print the volume and surface area in clear sentences.
        System.out.println("THe volume of the cube is " + volume);
        System.out.println("The surface area of the cube is " + surfaceArea);

        System.out.println();
    }
}