import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
        System.out.print("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n");
        System.out.print("Enter the value of operation you wish to perform: ");
        int operator = in.nextInt();
        CalcVal(operator);
        }
    }
    static void CalcVal(int operator){
        Scanner in = new Scanner(System.in);
        if(operator == 1 || operator == 2 ||operator == 3 ||operator == 4){
         System.out.print("Enter the value of first operand:");
       double a = in.nextDouble();
        System.out.print("Enter the value of second operand:");
        double b = in.nextDouble();
             if(operator == 1){
            double sum = a+b;
            System.out.println("Sum of "+a+" and "+b+" is "+sum);
        }
        else if(operator == 2){
            double sub = a-b;
            System.out.println("Sum of "+a+" and "+b+" is "+sub);
        }
        else if(operator == 3){
            double mul = a*b;
            System.out.println("Sum of "+a+" and "+b+" is "+mul);
        }
        else if(operator ==4){
            double div = a/b;
            System.out.println("Quotient of "+a+" divided by "+b+" is "+div);
        }
        }
       
        else{
        System.out.println("Enter valid number");
        }
        
    }
}
