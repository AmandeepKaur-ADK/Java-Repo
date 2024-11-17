import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check whether it is palindrome or not: ");
        int n = sc.nextInt();
        int original = n;
        int rem, newNum =0;
        while(n!=0){
            rem = n%10;
            newNum = newNum*10 + rem;
            n /=10;
        }
        if(newNum == original){
            System.out.println(original+ " is a Palindrome");
        }
        else{
            System.out.println(original+" is not a Palindrome");
        }

    }
}