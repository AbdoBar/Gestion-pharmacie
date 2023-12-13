
package msir;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import jade.lang.acl.ACLMessage;



public class Sender extends Agent{
   
    @Override
    protected void setup() {
     /*  addBehaviour(new OneShotBehaviour() {
           @Override
           public void action() {*/
         ACLMessage msg = new ACLMessage(ACLMessage.INFORM);
        msg.setContent("Hello, world ☺");
          msg.addReceiver(getAID("AgReceive")); 
       // msg.addReceiver(new AID("receiver", AID.ISLOCALNAME));
        send(msg);
              /* ACLMessage msgs = new ACLMessage() ;
               msgs.setContent("hello");
               send(msgs);*/
                
       /*    }
       
    });*/
}
}   

