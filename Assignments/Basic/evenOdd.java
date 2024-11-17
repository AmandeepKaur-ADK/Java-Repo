import java.util.Scanner;
public class evenOdd{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Enter the number: ");
        n = in.nextInt();
        if(n%2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}