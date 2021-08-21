package Class_4_assignment;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class Program_3 {
    public static void main(String[] args) {

        //Write a program to show the duplicates values . Given array is: {10,5,2,3,2,7,7,15,10}  Output: 2, 7, 10



        //int[] my_array = {10, 5, 2, 3, 2, 7, 7, 10, 15};

       int[] my_array = {2, 7, 10, 3, 2, 5, 7, 10, 15};

        for (int i = 0; i < my_array.length-1; i++)
        {
            for (int j = i+1; j < my_array.length; j++)
            {
                if (( my_array[i] == my_array[j]) && (i != j))

                {

                   /* while (my_array.available() > 0 && newData == false) {
                        rc = my_array.read();*/

                    System.out.println("Duplicate Element : "+my_array[j]);

                }
            }
        }


    }
}
