package Class_3_assignment;

import java.util.Scanner;

public class Program_2 {
    public static void main(String[] args) {

        //2. Write a program to show range of prime numbers from 2 to n using while loop [n is the number by user input]


        System.out.println("Input number for prime number: ");
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
