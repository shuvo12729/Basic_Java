package Class_2_assignment;

import java.util.Scanner;

public class Program_2 {

    public static void main(String[] args) {

        /*Write a program to calculate CGPA and find grade from 4 subjects (GPA will based upon your university)*/

        int marks[] = new int[4];
        int i, cgpa;
        float total=0, avg;

        Scanner scanner = new Scanner(System.in);


        for(i=0; i<4; i++) {
            System.out.print("Enter Marks of Subject"+(i+1)+":");
            marks[i] = scanner.nextInt();
            total = total + marks[i];
        }
        scanner.close();

        //Calculating average here
        avg = total/4;
        double gpa = 0, total_cgpa = 0;


        //System.out.print("The student Grade is: "+avg/4);

        //Calculating cgpa here
        /*cgpa = i/4;
        System.out.print("The student CGPA is: "+cgpa);*/

        if(avg>=100)
        {
            gpa = 4.0;
            System.out.print("A+");

        }
        else if(avg>=70 && avg<80)
        {
            gpa = 3.5;
            System.out.print("A");
        }
        else if(avg>=60 && avg<70)
        {
            gpa = 3.0;
            System.out.print("B");
        }
        else if (avg>=50 && avg<60)
        {
            gpa = 2.5;
            System.out.print("C");
        }else {
            gpa = 0.0;

        }

        avg += gpa;


        System.out.println("Final Grade is= "+avg/4);

    }
}