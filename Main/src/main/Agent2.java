/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;




import jade.core.Agent;
import jade.domain.DFService;
import jade.domain.FIPAAgentManagement.DFAgentDescription;
import jade.domain.FIPAAgentManagement.SearchConstraints;
import jade.domain.FIPAAgentManagement.ServiceDescription;
import jade.domain.FIPAException;
import jade.domain.FIPANames;

import jade.core.Agent;
import jade.domain.DFService;
import jade.domain.FIPAAgentManagement.DFAgentDescription;
import jade.domain.FIPAAgentManagement.ServiceDescription;


public class Agent2 extends Agent{
    String services ="service 1";
    value v=new value();
    @Override
    protected void setup() {
        System.out.println("Agent Recherche prêt.");

        // Rechercher le service "mon-service"
        DFAgentDescription dfd = new DFAgentDescription();
        ServiceDescription sd = new ServiceDescription();
        sd.setType(services );
       // sd.addOntologies(FIPANames.ContentLanguage.FIPA_SL);
        dfd.addServices(sd);

        //SearchConstraints sc = new SearchConstraints(); 
       // sc.setMaxResults(Long.valueOf(1));

        // Envoyer une demande de recherche au DF
        try {
            Agent1 ag=new Agent1();
             value val=new value();
             //ag.setup(1);
           //ag.Serch();
              DFAgentDescription[] result1=val.getResult();
                  for (int i = 0; i < result1.length; i++) {
                  
                 System.out.println("Agent trouve >> : " + result1[i].getName());
            }
                System.out.println("entre en try0" );
            DFAgentDescription[] result = DFService.search(this, val.getDfd());
                System.out.println("entre en try1" );
            //if (result.length > 0) {
                // Récupérer l'agent qui fournit le service
                for (int i = 0; i < result.length; i++) {
                
                 System.out.println("Agent trouve aaa : " + result[i].getName());
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
    /*  @Override
    protected  void setup() {
       /* Behaviour myBehaviour = new MyBehaviour();
        addBehaviour(myBehaviour); 
         DFAgentDescription dfd =new DFAgentDescription();
         ServiceDescription sd=new ServiceDescription();
         sd.setType("service 1");
          sd.addOntologies(FIPANames.ContentLanguage.FIPA_SL);
          
         dfd.addServices(sd);
         SearchConstraints sc = new SearchConstraints();
        sc.setMaxResults(new Long(1));
         //System.out.println("Service added "+sd.getType()); 
         try {
             //DFService.s
                    // DFService.register(this, getAID(),dfd);
                    // System.out.println("Saved"); 
                     DFAgentDescription [] ss=DFService.search(this, dfd);
                     for (int i = 0; i <ss.length; i++) {
                          System.out.println(">>"+ss[i].toString()); 
                 
             }
         } catch (FIPAException ex) {
            
             System.out.println("error"+ex.getMessage());
            // ex.getMessage()
         }
    }    
}*/
  

/*
deux agent 
agent 1: ergister
agent 2 : serch

et afficher en form tableau 
*/