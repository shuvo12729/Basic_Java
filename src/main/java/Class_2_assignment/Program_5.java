package Class_2_assignment;

import java.util.Scanner;

public class Program_5 {
    public static void main(String[] args) {

    /*5.Take a number as input from the user. Now write a program to show table of the given numbers. Output will be shown like this:-------------------------3
        10*1=10
        10*2=20
        10*3=20
        .
        .
        .
        10*10=100*/

        System.out.println("Type a number :");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();


        for(int i=1; i<=10; i++) {

            int multiply = input*i;
            System.out.print(input+"*"+i+"="+multiply+"   ");
        }












    }

}