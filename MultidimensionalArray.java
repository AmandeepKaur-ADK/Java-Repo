package ProgrammingInJava;

import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionalArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] arr = new int[3][2]; //mandatory to mention the no of rows but not number of columns
        int[][] arr2 = {
                {1,2, 3, 4},
                {5, 6 },
                {7, 8, 9}
        };
        System.out.println(arr.length);

        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                arr[i][j] = in.nextInt();
            }
        }

        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }

//        enhanced for loop
        for(int[] a: arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
