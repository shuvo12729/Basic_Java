package Class_3_assignment;

import java.util.Scanner;

public class Program_3 {
    public static void main(String[] args) {

        // 3. Write a program to make a digital tasbih where the program counts each time user press enter until press 0


        System.out.println("Press enter to start your zikir: \nPress 0 and hit enter for quit");
        Scanner scanner=new Scanner(System.in);
        int count=0;
        while(true){
            String readLine = scanner.nextLine();
            count++;
            if(readLine.equals("0")){
                break;
            }
            System.out.print(count);
        }




    }
}
