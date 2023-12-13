
package pm;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Pm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        trouver("[:+:]","ab +-do");
         ArrayList<String> oper = new ArrayList<>();
        oper.add("="); 
        oper.add("||");
        oper.add("&&");
        oper.add("|");
        oper.add("^");
        oper.add("&");
        oper.add("==");
        oper.add("!=");
        oper.add("<");
        oper.add(">");
        oper.add("<=");
        oper.add(">=");
        oper.add("<<");
        oper.add(">>>");
        oper.add(">>");
        oper.add("+");
        oper.add("-");
        oper.add("%");
        oper.add("*");
        oper.add("/");
        System.out.print("=====>"+oper.size());
        
    }
    public static void trouver(String exp,String txt){
Pattern verification =Pattern.compile(exp);
Matcher expmatcher =verification.matcher(txt);
int i=1;

while(expmatcher.find()){

if(expmatcher.group().length()!=0){

System.out.print("match N=:"+i+""+expmatcher.group().trim()+"\n");
i++;
}
}
}
    
}
