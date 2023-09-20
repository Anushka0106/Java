import java.util.Scanner;
public class RecursionSum {
public static void printSum(int i,int n,int sum){
    if(i == n){
        sum =sum+i;
        System.out.println(sum);
        return ;
    }
    sum = sum+i;
    printSum(i+1, n, sum);
    System.out.println(i);
   
}

    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int i = sc.nextInt();
        printSum(1,5,0);

    }
    
}
