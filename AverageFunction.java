import java.util.Scanner;

public class AverageFunction {
    public static int calculateAverage(int a ,int b,int c){
        int average = (a+b+c)/2;
        return average;
    }
    public static void main(String args[]){
        System.out.println("enter three numbers:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int average = calculateAverage(a,b,c);
        System.out.println("Average is :"+average);

    }
    
}
