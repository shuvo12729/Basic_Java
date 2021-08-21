package Class_1_assignment;

import java.util.Scanner;

public class Program_2 {

    public static void main(String[] args) {


        /*2. Write a program to convert double type value to an integer type value*/

        System.out.println("Input a double type number: ");
        Scanner scan=new Scanner(System.in);
        double num= scan.nextDouble();
        System.out.println("Converted to Int type: "+(int) num);
    }
}
