
package main;




import jade.core.Agent;
import jade.core.AID;
import jade.core.behaviours.Behaviour;
import jade.core.behaviours.CyclicBehaviour;
import jade.core.behaviours.OneShotBehaviour;
import jade.domain.DFService;
import jade.domain.FIPAAgentManagement.DFAgentDescription;
import jade.domain.FIPAAgentManagement.ServiceDescription;
import jade.domain.FIPAException;
import jade.domain.FIPANames;
import java.util.logging.Level;
import java.util.logging.Logger;

import jade.core.Agent;

import jade.domain.FIPAAgentManagement.DFAgentDescription;



public class Agent1 extends Agent{
    value v=new value();
     @Override
    protected  void setup() {
       /* Behaviour myBehaviour = new MyBehaviour();
        addBehaviour(myBehaviour); */
         DFAgentDescription dfd =new DFAgentDescription();
         dfd.setName(getAID());
         ServiceDescription sd=new ServiceDescription();
           sd.setName("enregistrer-donnees");
         sd.setType("service 1");
         //sd.addOntologies(FIPANames.ContentLanguage.FIPA_SL);
         dfd.addServices(sd);
         v.setSd(sd);
         System.out.println("Service added "+sd.getType()); 
         try {
             //DFService.s
                     DFService.register(this,dfd);
                     v.setDfd(dfd);
                     System.out.println("Saved"); 
                   /*Agent2 ag=new Agent2();
                     ag.setup();*/
                     /*DFAgentDescription [] ss=DFService.search(this, getAID(), dfd);
                     for (int i = 0; i <ss.length; i++) {
                          System.out.println(">>"+ss[i].toString());
                 
             }*/
         } catch (FIPAException ex) {
            
             ex.printStackTrace();
            // ex.getMessage()
         }
        // if(d==1){
              Serch();
         //} 
    }   
    
    public void  Serch(){
        //value v=new value();
          DFAgentDescription dfd2 = new DFAgentDescription();
      //ServiceDescription sd = new ServiceDescription();
        dfd2.setName(getAID());
            try {
                System.out.println("entre en try0" );
                v.setDfd(dfd2);
            DFAgentDescription[] result = DFService.search(this, dfd2);
                System.out.println("entre en try1" );
            //if (result.length > 0) {
                // Récupérer l'agent qui fournit le service
                 v.setResult(result);
                for (int i = 0; i < result.length; i++) {
                  
                 System.out.println("Agent trouve : " + result[i].getAllServices());
            }
                System.out.println("entre en try2" );
           /* } else {
                System.out.println("Aucun ");
            }*/
        }
        catch(Exception e) {
            System.out.println("entre en catch" );
            e.printStackTrace();
        }
         }
     }     
 /*class MyBehaviour extends Behaviour {

    private boolean done = false;
    int a=0;
    public void action() {
        a++;
        System.out.println("hello world"+a); 
       // ACLMessage msg = myAgent.receive();
    }

    public boolean done() {
        if(a==5)
         done = true;
        return done;
    }  
}*/



