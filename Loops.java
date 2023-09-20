import java.util.*;
public class Loops {
public static void main(String[] args){
    // for(int i =0;i<=10;i++){
    //     System.out.println(i);
    // }
    // int i =1;
    // while(i<=10){
    //     System.out.println(i);
    //     i++;
    // }
  System.out.println("Enter your number:");
  Scanner  sc = new Scanner(System.in);
  int n = sc.nextInt();
  
  int i = 1;
  int sum = 0 ;
  do {
      sum = sum +i;
     
    i++;
  }

  while(i<=n);
  System.out.println("the sum of the first "+ n +"natural number is :"+ sum);


   
    


    
   
}
    
}
