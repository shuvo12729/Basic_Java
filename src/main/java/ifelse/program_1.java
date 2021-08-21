package ifelse;

import java.util.Scanner;

public class program_1 {
    public static void main(String[] args) {

        System.out.println("Plz input a number to check it is positive or negative number");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number>=0){

            System.out.println("This is positive");

        }else {
            System.out.println("This is negative");

        }

    }
}
