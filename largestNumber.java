package ProgrammingInJava;

import java.util.Scanner;

public class largestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        Largest number
        int max = 0;
        System.out.println("Enter the numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if(num1>num2){
            if(num1>num3){
                max = num1;
            }else{
                max = num3;
            }
        }else{
            if(num2>num3){
                max = num2;
            }
            else{
                max = num3;
            }
        }

        max = Math.max(num1, Math.max(num2, num3));
        System.out.print("Largest number is "+max);





    }
}
