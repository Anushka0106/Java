import java.util.Scanner;

public class Factorialfunction {
    public static void calculateFactorial(int n){
        if(n<0){
            System.out.println("invalid Output");
            return;
        }
        
        int fact=1;
        for(int i = n;i>=1;i--){
            fact = fact*i;
        }
       System.out.println("Factorial is "+fact);
       return;
    }
    public static void main(String args[]){
        System.out.println("Enter the value:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
calculateFactorial(n);
    }
}
