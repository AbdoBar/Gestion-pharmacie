/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morad;

import org.apache.commons.text.similarity.JaroWinklerSimilarity;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class  extends JFrame {
    private JLabel text1Label;
    private JLabel text2Label;
    private JTextField text1Field;
    private JTextField text2Field;
    private JButton compareButton;
    private JLabel similarityLabel;

    public TextComparator() {
        super("Text Comparator");

        text1Label = new JLabel("Text 1:");
        text2Label = new JLabel("Text 2:");
        text1Field = new JTextField(20);
        text2Field = new JTextField(20);
        compareButton = new JButton("Compare");
        similarityLabel = new JLabel("");

        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(text1Label);
        panel.add(text1Field);
        panel.add(text2Label);
        panel.add(text2Field);
        panel.add(compareButton);
        panel.add(similarityLabel);

        compareButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text1 = text1Field.getText();
                String text2 = text2Field.getText();

                JaroWinklerSimilarity similarity = new JaroWinklerSimilarity();
                double score = similarity.apply(text1, text2);

                similarityLabel.setText("Similarity score: " + score);
            }
        });

        setContentPane(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new TextComparator();
    }
}


  
 
   
    
    
}
