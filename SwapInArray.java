package ProgrammingInJava;

import java.util.Arrays;

public class SwapInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,4,3,5};
        System.out.println(Arrays.toString(arr));
        swap(arr,2, 3 );
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] a, int index1, int index2){
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }

}
