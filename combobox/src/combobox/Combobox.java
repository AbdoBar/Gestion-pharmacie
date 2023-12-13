/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combobox;





import javax.swing.*;    
import java.awt.event.*;    
public class Combobox {    
JFrame f;    
Combobox(){    
    f=new JFrame("ComboBox Example");   
    
    final JLabel label = new JLabel();  // pour ecrir un text ou titre
    
    label.setHorizontalAlignment(JLabel.CENTER);  
    label.setSize(350,400);
    
    JButton b=new JButton("Show");  
    
    b.setBounds(200,100,75,20);  
    
    String languages[]={"C","C++","C#","Java","PHP"};  
    
    final JComboBox cb=new JComboBox(languages);    
    
    cb.setBounds(50, 100,90,20);  
    
    
    f.add(cb);
    f.add(label);
    f.add(b);   
    
    
    f.setLayout(null);    
    f.setSize(350,350); 
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);       
    
    
    b.addActionListener(new ActionListener() {  
        public void actionPerformed(ActionEvent e) {       
       String data = "Programming language Selected: "   + cb.getItemAt(cb.getSelectedIndex());
       label.setText(data);  
}  
});           
}    
public static void main(String[] args) {    
   new Combobox();         
}    
} 
