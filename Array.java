package ProgrammingInJava;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//       Syntax:  datatype[] variable_name = new datatype[size]

        int[] ros; // declaration of array: ros is getting defined in the stack.
        ros = new int[5]; //initialization: actually here object is being created in the heap memory.


//        Arrays of Primitives
        int[] rnos1 = new int[5];
        rnos1[0] = 23;
        rnos1[1] = 50;
        rnos1[2] = 40;
        rnos1[3] = 80;
        rnos1[4] = 23;


        int[] rnos2 = {1, 2, 3, 4, 5};

//For Input

        for(int i=0;i<ros.length;i++){
            System.out.print("Enter the value of ros["+i+"]: ");
            ros[i] = in.nextInt();
        }


//        To print using for loop

        for(int i=0;i<ros.length;i++){
            System.out.print(ros[i] + " ");
        }

//       To print using for each loop

        for(int element: ros){
            System.out.print(element + " ");//element represents element of the array.
        }



//        To print using Arrays.toString()
        System.out.println(Arrays.toString(ros));


// Array of objects
        String[] names = new String[5];
        System.out.println("Enter 5 names: ");

        for(int i=0;i<names.length;i++){
            names[i] = in.next();
        }
        System.out.println(Arrays.toString(names));

//        Arrays are immutable in java

        int[] nums = {1,2,3,4,5};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[0] = 99;
    }

}
