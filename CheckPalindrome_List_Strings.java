import java.io.*;
import java.util.*;

public class CheckPalindrome_List_Strings {
    static boolean isPalindrome(String str) 
    {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
    public static void Check(List<String> list) {
        boolean x = false;
        ArrayList<String> strlist = new ArrayList<String>(); 
        for(int i=0;i<=list.size();i++){
            x = isPalindrome(list.get(i));
            if(x==true){
                strlist.add(list.get(i)); 
            }
            x=false;
        }
        
}
}



class palindrome {

  public static void main(String[] args) {
    List<String> str ;
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the length of the Array List :");
    int len = input.nextInt();
    ArrayList<String> arrlist = new ArrayList<String>(len); 
    System.out.println("Enter the elements :\n");
    for (int i = 1; i <= len; i++) 
        arrlist.add(input.nextLine()); 
    System.out.println("The elements are :");
    for (int i = 0; i < arrlist.size(); i++) 
        System.out.print(arrlist.get(i) + " "); 
  }
  
}
