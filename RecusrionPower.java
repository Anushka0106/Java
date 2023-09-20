import java.util.Scanner;

public class RecusrionPower {
    public static int calPower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xPownm1= calPower(x, n-1);
       int  xPow= x* xPownm1;
       return xPow;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x =sc.nextInt();
        int n =sc.nextInt();
        int ans = calPower(x, n);
        System.out.println("the sum of power is :"+ans);

    }
}
