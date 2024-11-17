
import java.util.Scanner;

public class Basic {
   
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // System.out.print("Enter your name: ");
        // String name = input.nextLine();
        // greeting(name);

        
        // SimpleInterest();
        
        // calcVal();

        // System.out.println("Larger is "+larger());

        System.out.print("Enter the value in rupees: ");
        double inr =input.nextDouble();
        System.out.println("USD "+currencyConverter(inr));
    }

    static double currencyConverter(double inr){
        double usd = inr * 0.012;
        return usd;
    }

static double larger(){
    Scanner input = new Scanner(System.in);
    
    
    while(true){
        System.out.println("Enter value of a: ");
    double a = input.nextDouble();
    System.out.println("Enter value of b: ");
    double b = input.nextDouble();
  if(a>b){
        return a;
    }
    else if(b>a){
        return b;
    }
    else{
        return 0;
    }
    }
   
}

static void calcVal(){
    Scanner in = new Scanner(System.in);
    double ans = 0;
    while (true) {
    System.out.print("Enter the operator: ");
    char op = in.next().trim().charAt(0);
    if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
        System.out.print("Enter first number: ");
        double a = in.nextDouble();
        System.out.print("Enter second number: ");
        double b = in.nextDouble();
        if(op == '+'){
            ans = a + b;
        }
        else if( op == '-'){
            ans = a -b;
        }
        else if(op == '*'){
            ans = a*b;
        }
        else if(op == '/'){
            ans = a/b;
        }
        else if(op == '%'){
            ans = a % b;
        }
    }
    else if(op == 'x' || op == 'X'){
        break;
    }
    else{
        System.out.println("Invalid Operation!");
    }
    System.out.println("Solution is "+ans);
    }
}

static void greeting(String name){
    System.out.println("Hello "+name);
}

static void SimpleInterest(){
     Scanner input = new Scanner(System.in);
    System.out.print("Enter Principal amount: ");
        float p = input.nextFloat();
        System.out.print("Enter Rate of Interest: ");
        float r = input.nextFloat();
        System.out.print("Enter Time period in years: ");
        int t = input.nextInt();
    float SI = (p*r*t)/100;
    System.out.println("Simple Interest is "+SI);
    float amount = p + SI;
    System.out.println("Amount is "+amount);
}


}

