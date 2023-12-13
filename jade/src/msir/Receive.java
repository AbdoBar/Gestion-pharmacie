
package msir;

import jade.core.Agent;


import jade.core.behaviours.CyclicBehaviour;


import jade.lang.acl .ACLMessage;
import javax.swing.JOptionPane;





public class Receive extends Agent{
    
  
   @Override
    protected  void setup() {
         System.out.println("listing..."); 
        addBehaviour(new CyclicBehaviour(this) {
           

            @Override
            public void action() {
                  ACLMessage msg=receive();
               
                 if(msg!=null){
                    System.out.println(msg.getContent()); 
            
                }//else System.out.println(".."); //block();
           
         
            }

        }) ;
        
        
        
        
    
       
      
    }
    } 
    

    

