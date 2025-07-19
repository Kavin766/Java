import java.util.Scanner;
public class odd_or_even {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num;
        num=scanner.nextInt();
        if (num%2==0){
            System.out.println(num + " is even number");
        }else {
            System.out.println(num + " is odd number");
        }
        scanner.close();
    }
    
}
