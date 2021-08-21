package Class_2_assignment;

import java.util.Scanner;

public class Program_3 {
    public static void main(String[] args) {


        /*Create a math quiz program. Scenario: 2 numbers will generate randomly and prompt user to input the summation of 2 numbers.
          If user inputs the correct summation, print "Answer is correct" and user will get 1 point. if user inputs wrong summation,
        then user will get 0 point. Finally after 5 iteration, total score will be shown.*/


        int count = 1, score = 0;
        if (count <= 5) {


            for (int i = 1; i <= 5; i++) {


                Scanner keyboard = new Scanner(System.in);


                System.out.print("Welcome to math quiz! ");


                int randomNumber1 = (int) (20 * Math.random()) + 1;
                int randomNumber2 = (int) (20 * Math.random()) + 1;

                int randomNumberAdd = randomNumber1 + randomNumber2;

                double correct = 0;
                // double percentageCorrect = correct * 25;

                System.out.print(randomNumber1 + " + " + randomNumber2 + " = ");

                int inputNum = keyboard.nextInt();


                if (inputNum == randomNumber1 + randomNumber2) {
                    System.out.println("Correct!");
                    correct++;

                } else {
                    System.out.println("Wrong!");
                    System.out.println("The correct answer is " + randomNumberAdd);

                }


            }


            count++;
            System.out.println("Quiz end! your total score is " + count + " out of " + 5);
        }



































    }
}



