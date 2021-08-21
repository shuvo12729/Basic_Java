package Class_4_assignment;

import java.util.Scanner;

public class Program_2 {
    public static void main(String[] args) {

        // 2. Find the second largest number from an array by user input using function


        int size;
        int firstNum=1, secondNum=0;


         //taking input from user for size of array
        Scanner scan=new Scanner(System.in);
        System.out.print("How many number do you want to this element: ");
        size=scan.nextInt();


        int arr[]=new int[size];//declaration of array
        for(int i=0; i<size; i++){
            System.out.print("Enter the array element "+(i+1)+" :");
            arr[i]=scan.nextInt();

            //taking input for array elements
            if(firstNum<arr[i]){
                secondNum=firstNum;
                firstNum=arr[i];
            }
            else if(secondNum<arr[i]){
                secondNum=arr[i];
            }
        }
        System.out.println("The second largest number is: "+secondNum);



    }
}
