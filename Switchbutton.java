import java.util.*;
public class Switchbutton {
    public static void main(String[] args){
        System.out.println("Enter your number :");
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch(button){
            case 1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("namesty");
            break;
            case 3 : System.out.println("Bonjour");
            break;
            default : System.out.println("invalid Input");
        }
    }
    
}
