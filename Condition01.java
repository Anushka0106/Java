import java.util.*;
public class Condition01 {
    public static void main(String[] args){
System.out.println("Enter value of a :");
System.out.println("ENter value of b:");
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
if (a==b){
    System.out.println("Equal");
}
else if(a>b){
    System.out.println("a is greater than b");
}
else{
    System.out.println("b is greater than b");
}
    }
    
}
