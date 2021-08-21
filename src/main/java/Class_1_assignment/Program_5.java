package Class_1_assignment;

import java.util.Scanner;

public class Program_5 {

    public static void main(String[] args) {


        /*5. Write a program to solve (a+b)^2 by taking input a and b from the user [^2 means whole square]*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a number");
        int n1 = scanner.nextInt();

        System.out.println("Type a number");
        int n2 = scanner.nextInt();
        scanner.close();


        double square = (n1+n2)*(n1+n2);
        System.out.println("The whole square is :" +square);
    }
}
