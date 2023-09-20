public class Strings01 {
public static void main(String args[]){
    StringBuilder sb = new StringBuilder("Tony");
    System.out.println(sb);
    // char at index 0
    System.out.println(sb.charAt(0));
// set char at index 0
sb.setCharAt(0, 'P');
System.out.println(sb);
sb.insert(0,'S');
System.out.println(sb);
sb.insert(3,'n');
System.out.println(sb);
// delete the extra 'n'
// sb.delete(3, 4);
// System.out.println(sb);
sb.delete(3, 5);
System.out.println(sb);

sb.append("h");
sb.append("e");
sb.append("l");
sb.append("l");
sb.append("o");
System.out.println(sb);
System.out.println(sb.length());


}    
}
