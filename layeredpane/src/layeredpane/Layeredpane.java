/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layeredpane;




import javax.swing.*;  
import java.awt.*;  
public class Layeredpane {  

    
    
  public static void main(String[] args) {  

    JFrame frame =new JFrame();
    
     JLayeredPane pane = new JLayeredPane(); 
     
    //creating buttons  
    JButton top = new JButton();  
    top.setBackground(Color.white);  
    top.setBounds(20, 20, 50, 50);  
    
    JButton middle = new JButton();  
    middle.setBackground(Color.red);  
    middle.setBounds(40, 40, 50, 50);  
    
    JButton bottom = new JButton();  
    bottom.setBackground(Color.cyan);  
    bottom.setBounds(60, 60, 50, 50);  
    //adding buttons on pane  
    pane.add(bottom, new Integer(1));  
    pane.add(middle, new Integer(2));  
    pane.add(top, new Integer(3));  
     
     
      frame.setSize(500, 500); //hajm l frame 
      frame.add(pane); //idafat l pane l frame
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
  }  
}  


