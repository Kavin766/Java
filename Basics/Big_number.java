
import java.util.Scanner; 
public class Big_number {
    public static void main (String [] args){
        Scanner scanner=new Scanner(System.in);
        int a,b;
        a=scanner.nextInt();
        b=scanner.nextInt();
        if(a>b){
            System.out.println(a+" is the bigest number");
        }else if(b>a) {
            System.out.println(b+" is the bigest number");
        }else{
            System.out.println("Both are equal numbers");
        }
        scanner.close();
    }
}
