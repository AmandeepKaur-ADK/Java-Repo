package ProgrammingInJava;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        String newNumber = "";
        while(number > 0){
            int rem = number % 10;
            newNumber += rem;
//            System.out.println(newNumber);
            number /= 10;
        }
        System.out.println(newNumber);
//        System.out.println(newNumber.getClass().getSimpleName());
    }
}
