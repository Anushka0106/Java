import java.util.Scanner;

public class RecursionFibonacci {
    public static void printSeries(int a,int b ,int n){
      if(n==0){
        return;
      }
     int c  = a+b;
     System.out.println(c);
     printSeries(b, c,n-1);
    }
    public static void main(String[] args) {
        int a =0;
        int b =1;
        System.out.println(a);
        System.out.println(b);
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int n =4;
        
       printSeries(a, b,n-2);
      

    }
}
