package Class_1_assignment;

import java.util.Scanner;

public class Program_3 {

    public static void main(String[] args) {


        /*3. Write a program to take 3 inputs from user and do sum and average*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type first number :");
        int num1 = scanner.nextInt();

        System.out.println("Type second number :");
        int num2 = scanner.nextInt();

        System.out.println("Type third number :");
        int num3 = scanner.nextInt();

        //summation
        System.out.println("Total Sum is: ");
        int sum = num1+num2+num3;
        System.out.println(sum);
        //System.out.println("Total Sum is: "+num1+num2+num3);

        //Average
        int ave = num1+num2+num3/3;
        System.out.println("Total Average is: "+ ave + "\n");
    }
}
