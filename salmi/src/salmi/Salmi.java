
package salmi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Salmi {

  
    public static void main(String[] args) {
Pattern p=Pattern.compile("([A-Za-z])([0-9a-zA-Z]{4,20})+@\\w+\\.(com||uk||dz||fr)");
        Matcher m=p.matcher("rozkiallaoui@gmail.com");
        
        boolean b =m.matches();
        
        
        
        boolean b2 =Pattern.compile("9").matcher("as").matches();
        
        
        
        boolean b3 =Pattern.matches("s","as");
          System.out.println(b+"  "+b2 +"  "+b3);         
    
    
    
    
    
    }
    
}
