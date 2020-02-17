
package javastring;
import java.util.Scanner;

public class JavaString {

    
    public static void main(String[] args) {
    
        
        String country; 
        Scanner input=new Scanner (System.in);
              country=input.nextLine();
              String reverse="";
              for(int i=country.length()-1;i>=0;i--)
              {
              reverse=reverse+country.charAt(i);
              }
    System.out.println("reverse= "+reverse);
        
            }
    
    
}
