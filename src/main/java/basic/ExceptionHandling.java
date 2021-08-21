package basic;

import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            try {
            Scanner input = new Scanner(System.in);
            System.out.println("Input a number:");
            int num1 = input.nextInt();
            System.out.println(num1);

          } catch (Exception e) {
            System.out.println(e.toString());


          } finally {
            System.out.println("Completed");
        }



    }
}
