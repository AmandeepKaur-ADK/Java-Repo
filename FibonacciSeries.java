package ProgrammingInJava;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of the index: ");
        int n = in.nextInt();
//        Fibonacci series
        int p = 0; //previous index
        int i = 1; //current index
        int count = 2;
        while(count<=n){
            int temp = i;
            i = i + p;
//            System.out.println(p + " "+ i);
            p = temp;
            count++;
        }
        System.out.println(i);
    }
}
