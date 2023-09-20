import java.util.*;


public class table {
    public static void main (String[] args){
        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1 ;i<=10;i++){
           int  sum = n*i;
            System.out.println(sum);
        }
    }
    
}
