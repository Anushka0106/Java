import java.util.Scanner;

public class Factorial {
    public static int printSum(int n){
        if(n==1||n==0){
            return 1;
        }
        int nm1= printSum(n-1);
        int nm=n*nm1;
        return nm;
    }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = printSum(n);
    System.out.println(ans);
  }
}
