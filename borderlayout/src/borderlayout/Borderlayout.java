/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package borderlayout;



// import statement  
import java.awt.*;    
import javax.swing.*;    
public class Borderlayout 
{     
JFrame jframe;    
// constructor  
Borderlayout()  
{  
    // creating a Frame   
    jframe = new JFrame();    
    // create buttons  
    JButton btn1 = new JButton("NORTH");    
    JButton btn2 = new JButton("SOUTH");    
    JButton btn3 = new JButton("EAST");   
    JButton btn4 = new JButton("WEST");    
    JButton btn5 = new JButton("CENTER");  
     // creating an object of the BorderLayout class using   
     // the parameterized constructor where the horizontal gap is 20   
     // and vertical gap is 15. The gap will be evident when buttons are placed   
     // in the frame  
    jframe.setLayout(new BorderLayout(25,20));  
    jframe.add(btn1, BorderLayout.NORTH);    
    jframe.add(btn2, BorderLayout.SOUTH);    
    jframe.add(btn3, BorderLayout.EAST);    
    jframe.add(btn4, BorderLayout.WEST);    
    jframe.add(btn5, BorderLayout.CENTER);    
    jframe.setSize(300,300); 
     jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jframe.setVisible(true);    
}    
// main method  
public static void main(String argvs[])   
{    
    new Borderlayout();    
}    
}    

