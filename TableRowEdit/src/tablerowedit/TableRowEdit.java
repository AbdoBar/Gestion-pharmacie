/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablerowedit;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;

class TableRowEdit extends JFrame  
{
    private JTable table;
    private JScrollPane jsPane;
    private TableModel myModel;
    private JPanel dialogPanel;
    private JTextField tf[];
    private JLabel     lbl[];
    public void prepareAndShowGUI()
    {
        myModel = new MyModel();
        table = new JTable(myModel);
        jsPane = new JScrollPane(table);
        table.getColumnModel().getColumn(2).setCellRenderer(new LabelCellRenderer());
        table.addMouseListener(new MyMouseAdapter());
        getContentPane().add(jsPane);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        prepareDialogPanel();
        pack();
        setVisible(true);

    }
    private void prepareDialogPanel()
    {
        dialogPanel = new JPanel();
        int col = table.getColumnCount() - 1;
        dialogPanel.setLayout(new GridLayout(col,2));
        tf = new JTextField[col];
        lbl = new JLabel[col];
        for (int i = 0; i < col; i++)
        {
            lbl[i] = new JLabel(table.getColumnName(i));
            tf[i] = new JTextField(10);
            dialogPanel.add(lbl[i]);
            dialogPanel.add(tf[i]);
        }
    }
    private void populateTextField(String[] s)
    {
        for (int i = 0 ; i < s.length ; i++ )
        {
            tf[i].setText(s[i]);
        }
    }
    public class LabelCellRenderer extends DefaultTableCellRenderer 
    {
        public Component getTableCellRendererComponent(JTable table,Object oValue, boolean isSelected, boolean hasFocus, int row, int column) 
        {
            Component c = super.getTableCellRendererComponent(table, oValue,isSelected, hasFocus,row, column);
            String value = (String)oValue;
            JLabel label =(JLabel)c;
            label.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            label.setBackground(Color.lightGray);
            label.setHorizontalTextPosition(SwingUtilities.CENTER);
            label.setHorizontalAlignment(SwingUtilities.CENTER);
            label.setText(value);
            return label;
        }
    }
