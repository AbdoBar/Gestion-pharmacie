
package main;

import jade.domain.FIPAAgentManagement.DFAgentDescription;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] args1={"-gui","Agent1:main.Agent1"};
        String[] args2={"-gui","Agent2:main.Agent2"};
        jade.Boot.main(args1);
          jade.Boot.main(args2);
           /*value v=new value();
             DFAgentDescription[] result=v.getResult();
          
           //v.setResult(result);
                for (int i = 0; i < result.length; i++) {
                  
                 System.out.println("Agent trouve : " + result[i].getName());
            }*/
    }
    
}
