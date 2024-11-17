 import java.util.Scanner;
public class checkArmstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = in.nextInt();
        int original = n;
        // let say this is only for 3 digits
        double rem, sum = 0;
        // now I have to calculate the power which is the no of digits in the number
        // int power = 0;
        int temp = n;
        int count = 0;
        while(temp !=0){
            rem = n%10;
            count++;
            temp/=10;
        }
        
        while(n!=0){
            rem = n%10;
            sum += Math.pow(rem, count);
            n /= 10;
        } 
        if(sum == original){
            System.out.println(original+ " is a armstrong number");
        }else{
            System.out.println(original+" is not a armstrong number");
        }
    }
}
