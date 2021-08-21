package Class_2_assignment;

import java.util.Scanner;

public class Program_6 {

    public static void main(String[] args) {

       /* 6. Write a program to print prime numbers from 2 to n [n is a number that will be taken from user input]----------------------------5*/



        System.out.println("Input a number for prime number: ");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int count=0;
        for(int j=2;j<n;j++){
            boolean flag=true;
            for(int i=2;i<=j/2;i++){
                if(j%i==0){
                    flag=false;
                    break;
                }
            }

            if(flag==true){
                System.out.println(j);
                count++;
            }
        }
        System.out.println("Total prime numbers from 2 to "+n+" is "+count);












    }
}
