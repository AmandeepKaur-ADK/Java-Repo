import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n to calculate fibonacci series upto n numbers: ");
        int n = in.nextInt();
        // 0 1 1 2 3 5 
        int a = 0;
        int b = 1;
        int sum;
        System.out.println(a+"\n"+b);
        for(int i=0;i<n;i++){
            sum = a + b;
            System.out.println(sum + "\t");
            a = b;
            b = sum;
           
        }
        
    }
}
