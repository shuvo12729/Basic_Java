package Class_2_assignment;

import java.util.Scanner;

public class Program_1 {
    public static void main(String[] args) {

        /*1. Write a program that takes a year from user and print whether that year is a leap
        year or not*/

        boolean leap = false;

        System.out.println("Please type a year: ");

        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        // if the year is divided by 4
        if (year % 4 == 0) {

            // if the year is century
            if (year % 100 == 0) {

                // if year is divided by 400
                // then it is a leap year
                if (year % 400 == 0){
                    leap = true;

                }else
                    leap = false;

            }

            // if the year is not century
            else
                leap = true;
        }

        else
            leap = false;

        if(leap){
            System.out.println(year + " is a leap year.");
        }

        else
            System.out.println(year + " is not a leap year.");




    }

}
