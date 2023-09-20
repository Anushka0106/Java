public class Strings {
    public static void main(String args[]){
    //     String firstname="tony";
    //     String lastname="stark";
    //     String fullname= firstname+" " +lastname;
    //     System.out.println(fullname);
    //     System.out.println(fullname.length());

    
    // //charAt
    // for(int i = 0 ;i<fullname.length();i++){
    //     System.out.println(fullname.charAt(i));
    // }
    //     // compare
        String name1="tony";
        String name2 ="tony";
    //     if(name1.compareTo(name2)==0){
    //        System.out.println("strings are equal");
    //     }
    //     else{
    //         System.out.println("strings are not equal");
    //     }
    

    // if(name1==name2){
    //     System.out.println("strings are equal");
    // }
    // else{
    //     System.out.println("strings are not equal");
    // }
    
    // if(new String("Tony")==new String("Tony")){
    //      System.out.println("strings are equal");
    // }
    // else{
    //     System.out.println("strings are not equal");
    
    // }

    String sentence= "My name is Tony";
    String name = sentence.substring(11,sentence.length());
    System.out.println(name);
    String sentence1= "Tonystrack";
    String name3 = sentence1.substring(0,4);
    System.out.println(name);
}
}
