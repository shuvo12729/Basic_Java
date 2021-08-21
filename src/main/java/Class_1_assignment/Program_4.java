package Class_1_assignment;

import java.util.Scanner;

public class Program_4 {

    public static void main(String[] args) {


        /*4. Write a program to generate random numbers from minimum range to maximum range by user input*/

        Scanner scanner = new Scanner(System.in);


        /*4. Write a program to generate random numbers from minimum range to maximum range by user input*/

        System.out.println("Type 1st number :");
        int number1 = scanner.nextInt();

        System.out.println("Type 2nd number :");
        int number2 = scanner.nextInt();

        System.out.println("The maximum number is :" +Math.max(number1,number2));
        System.out.println("The minimum number is :" +Math.min(number1,number2));



        double random_number=Math.random()*(number1-number2)+number1;
        System.out.println("The random number is: " +(int)random_number);
        //System.out.println((int) random_number);




    }
}
