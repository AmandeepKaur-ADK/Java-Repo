package ProgrammingInJava;

import com.sun.tools.jconsole.JConsoleContext;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        while(true){
            float res = 0;
            System.out.print("Enter the operator: ");
            String operator = in.next();
            System.out.print("Enter the two numbers: ");
            float operand1 = in.nextFloat();
            float operand2 = in.nextFloat();
            //break is there inbuild
            
            switch (operator) {
                case "+" -> res = operand1 + operand2;
                case "-" -> res = operand1 - operand2;
                case "/" -> res = operand1 / operand2;
                case "*" -> res = operand1 * operand2;
                default -> System.out.println("Invalid Operator");
            }
            System.out.println("The result of the operation "+operand1+" "+operator+" "+operand2+" is "+ res);
        }
    }
}
