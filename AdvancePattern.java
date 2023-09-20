import java.util.Scanner;

public class AdvancePattern {
     public static void main (String[] args){
        System.out.println("Enter number of rows:");
        System.out.println("Enter number of columns:");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m = sc.nextInt();
        // butterfluy pattern
// for (int i =1 ;i<=n;i++){
//     for (int j =1 ;j<=i;j++){
//         System.out.print("*");
//     }
//     for (int j = 1;j<=2*(n-i);j++){
//         System.out.print(" ");
//     }
//     for (int j =1 ;j<=i;j++){
//         System.out.print("*");
//     }

//     System.out.println();
// }
// for (int i =n ;i>=1;i--){
//     for (int j =1 ;j<=i;j++){
//         System.out.print("*");
//     }
//     for (int j = 1;j<=2*(n-i);j++){
//         System.out.print(" ");
//     }
//     for (int j =1 ;j<=i;j++){
//         System.out.print("*");
//     }

//     System.out.println();
// }




// Solid rombus

// for (int i = 1 ;i<=n;i++){
//     for (int j =1;j<=5-i;j++){
//         System.out.print(" ");

//     }
//     for(int j =1 ;j<=5;j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }


//  pyramid triangle
    for(int i = 1;i<=n;i++){
        for(int j = 1;j<=i;j++)

}