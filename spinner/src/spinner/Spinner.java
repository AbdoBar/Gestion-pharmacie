/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spinner;




import javax.swing.*;  
import javax.swing.event.*;
public class Spinner 
{
  public static void main(String[] args) 
  {  
    JFrame frame = new JFrame();  
    
    JLabel label = new JLabel();  // ecrire un titre       
    label.setHorizontalAlignment(JLabel.CENTER);  
    label.setSize(250,100);  
    //cree un model
    SpinnerModel model = new SpinnerNumberModel(
                10, //valeur initiale
                02, //valeur minimum
                20, //valeur maximum
                1² //pas
    ); 
      
    //cree un spinner
    JSpinner sp = new JSpinner(model); // add model in spinner
    sp.setBounds(100,100,45,30);  
    frame.add(sp);  // add spiner in frame
    
    frame.add(label);
    frame.setSize(250,250);  
    frame.setLayout(null);  
    frame.setVisible(true);  
    
    
    sp.addChangeListener(new ChangeListener() {
      @Override
      public void stateChanged(ChangeEvent e) {
        label.setText("la Valeur est  : " + ((JSpinner)e.getSource()).getValue());
      }
    });
  }
}

