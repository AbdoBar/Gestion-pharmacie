
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.Arrays;
import static javafx.scene.text.Font.font;
import static javafx.scene.text.Font.font;
import static javafx.scene.text.Font.font;
import javax.swing.JFileChooser;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.filechooser.FileSystemView;
import static javax.swing.text.StyleConstants.Bold;


public class editor extends javax.swing.JFrame implements ActionListener{

   
    public editor() {
        initComponents();
      // btnapply.addActionListener(this);
       for(String s:GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames())
           fontname.addItem(s);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jToolBar2 = new javax.swing.JToolBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        jToolBar1 = new javax.swing.JToolBar();
        fontname = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        size = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        Color = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        profont = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        jToolBar2.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Text Editor");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jScrollPane1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        TextArea.setColumns(20);
        TextArea.setRows(5);
        TextArea.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                TextAreaCaretUpdate(evt);
            }
        });
        TextArea.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                TextAreaAncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                TextAreaAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        TextArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextAreaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TextAreaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                TextAreaMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(TextArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 540, 380));

        jToolBar1.setRollover(true);

        fontname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fontnameActionPerformed(evt);
            }
        });
        jToolBar1.add(fontname);
        jToolBar1.add(jPanel3);

        size.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "12", "14", "16", "18", "20", "24", "36", "48", "72" }));
        size.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sizeActionPerformed(evt);
            }
        });
        jToolBar1.add(size);
        jToolBar1.add(jPanel2);

        Color.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "red", "green", "blue", "magenta" }));
        Color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColorActionPerformed(evt);
            }
        });
        jToolBar1.add(Color);
        jToolBar1.add(jPanel1);

        profont.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Plain", "Bold", "Italic", "Bold Italic" }));
        profont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profontActionPerformed(evt);
            }
        });
        jToolBar1.add(profont);
        jToolBar1.add(jPanel4);

        getContentPane().add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 20));

        jMenu1.setText("File");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.META_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_exit_24px.png"))); // NOI18N
        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_open_pane_24px.png"))); // NOI18N
        jMenuItem5.setText("Open");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_save_24px_1.png"))); // NOI18N
        jMenuItem6.setText("Save");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_file_24px_1.png"))); // NOI18N
        jMenuItem7.setText("New file");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_copy_24px_1.png"))); // NOI18N
        jMenuItem2.setText("copy");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_cut_24px_2.png"))); // NOI18N
        jMenuItem3.setText("cut");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_paste_24px_2.png"))); // NOI18N
        jMenuItem4.setText("paste");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("View");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Help");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fontnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fontnameActionPerformed
 int fontsize=Integer.parseInt((String)size.getSelectedItem());
      String f=(String)fontname.getSelectedItem();
        String pfont=(String)profont.getSelectedItem();
        if("Bold"== pfont){
        TextArea.setFont(new Font(f,Font.BOLD,fontsize));
    }
      else if("Bold"==pfont&& "Italic"==pfont){
        TextArea.setFont(new Font(f,Font.BOLD | Font.ITALIC,fontsize));
    }
      else if("Italic"==pfont){
        TextArea.setFont(new Font(f,Font.ITALIC,fontsize));
    } else{
          TextArea.setFont(new Font(f,Font.PLAIN,fontsize));
      }             // TODO add your handling code here:
    }//GEN-LAST:event_fontnameActionPerformed

    private void sizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sizeActionPerformed
int fontsize=Integer.parseInt((String)size.getSelectedItem());
      String f=(String)fontname.getSelectedItem();
        String pfont=(String)profont.getSelectedItem();
        if("Bold"== pfont){
        TextArea.setFont(new Font(f,Font.BOLD,fontsize));
    }
      else if("Bold"==pfont&& "Italic"==pfont){
        TextArea.setFont(new Font(f,Font.BOLD | Font.ITALIC,fontsize));
    }
      else if("Italic"==pfont){
        TextArea.setFont(new Font(f,Font.ITALIC,fontsize));
    } else{
          TextArea.setFont(new Font(f,Font.PLAIN,fontsize));
      }         // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_sizeActionPerformed

    private void ColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColorActionPerformed
 String color=(String)Color.getSelectedItem();
      if("red".equals(color))
         TextArea.setForeground(new java.awt.Color(255, 51, 51));
      
        if(color=="blue")
      TextArea.setForeground(new java.awt.Color(51, 51, 255)); 
        if(color=="green")
       TextArea.setForeground(new java.awt.Color(0, 153, 0));
        if(color=="magenta")
        TextArea.setForeground(new java.awt.Color(153,0,153));
                  
    }//GEN-LAST:event_ColorActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
      dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
TextArea.copy();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
TextArea.cut();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
TextArea.paste();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jScrollPane1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jScrollPane1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1AncestorAdded

    private void TextAreaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_TextAreaAncestorAdded
    }//GEN-LAST:event_TextAreaAncestorAdded

    private void TextAreaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_TextAreaCaretUpdate
  /*int fontsize=Integer.parseInt((String)size.getSelectedItem());
      String color=(String)Color.getSelectedItem();
      String pfont=(String)profont.getSelectedItem();
      //String colorc=(String)ComboColor.getSelectedItem();
      String f=(String)fontname.getSelectedItem();
      if("red".equals(color))
         TextArea.setForeground(new java.awt.Color(255, 51, 51));
      
        if(color=="blue")
      TextArea.setForeground(new java.awt.Color(51, 51, 255)); 
        if(color=="green")
       TextArea.setForeground(new java.awt.Color(0, 153, 0));
        if(color=="magenta")
        TextArea.setForeground(new java.awt.Color(153,0,153));
        
    /*  if("Bold"== pfont){
        TextArea.setFont(new Font(f,Font.BOLD,fontsize));
    }
      else if("Bold"==pfont&& "Italic"==pfont){
        TextArea.setFont(new Font(f,Font.BOLD | Font.ITALIC,fontsize));
    }
      else if("Italic"==pfont){
        TextArea.setFont(new Font(f,Font.ITALIC,fontsize));
    } else{
          TextArea.setFont(new Font(f,Font.PLAIN,fontsize));
      }        // TODO add your handling code here:*/
    }//GEN-LAST:event_TextAreaCaretUpdate

    private void profontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profontActionPerformed
    int fontsize=Integer.parseInt((String)size.getSelectedItem());
      String f=(String)fontname.getSelectedItem();
        String pfont=(String)profont.getSelectedItem();
        if("Bold"== pfont){
        TextArea.setFont(new Font(f,Font.BOLD,fontsize));
    }
      else if("Bold"==pfont&& "Italic"==pfont){
        TextArea.setFont(new Font(f,Font.BOLD | Font.ITALIC,fontsize));
    }
      else if("Italic"==pfont){
        TextArea.setFont(new Font(f,Font.ITALIC,fontsize));
    } else{
          TextArea.setFont(new Font(f,Font.PLAIN,fontsize));
      }         // TODO add your handling code here:
    }//GEN-LAST:event_profontActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
          JFileChooser jfc =new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
          jfc.setDialogTitle("Multiple file and directory selection:");
		jfc.setMultiSelectionEnabled(true);
		jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

		int returnValue = jfc.showOpenDialog(null);
		if (returnValue == JFileChooser.APPROVE_OPTION) {
			File[] files = jfc.getSelectedFiles();
			System.out.println("Directories found\n");
			Arrays.asList(files).forEach(x -> {
				if (x.isDirectory()) {
					System.out.println(x.getName());
				}
			});
			System.out.println("\n- - - - - - - - - - -\n");
			System.out.println("Files Found\n");
			Arrays.asList(files).forEach(x -> {
				if (x.isFile()) {
					System.out.println(x.getName());
				}
			});
		}
                
            // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
            // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
		jfc.setDialogTitle("Choose a directory to save your file: ");
		jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

		int returnValue = jfc.showSaveDialog(null);
		if (returnValue == JFileChooser.APPROVE_OPTION) {
			if (jfc.getSelectedFile().isDirectory()) {
				System.out.println("You selected the directory: " + jfc.getSelectedFile());
			}
		}        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
     new editor().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void TextAreaAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_TextAreaAncestorMoved
 
               // TODO add your handling code here:
    }//GEN-LAST:event_TextAreaAncestorMoved

    private void TextAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextAreaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TextAreaMouseClicked

    private void TextAreaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextAreaMousePressed
       
         //this.add(popupmenu);  
                // TODO add your handling code here:
    }//GEN-LAST:event_TextAreaMousePressed

    private void TextAreaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextAreaMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_TextAreaMouseReleased
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editor().setVisible(true);
                
            }
        
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Color;
    private javax.swing.JTextArea TextArea;
    private javax.swing.JComboBox<String> fontname;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JComboBox<String> profont;
    private javax.swing.JComboBox<String> size;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
   /* @Override
    public void actionPerformed(ActionEvent ae) {
       
      int fontsize=Integer.parseInt((String)size.getSelectedItem());
      String color=(String)Color.getSelectedItem();
      String pfont=(String)profont.getSelectedItem();
      //String colorc=(String)ComboColor.getSelectedItem();
      String f=(String)fontname.getSelectedItem();
      if("red".equals(color))
         TextArea.setForeground(new java.awt.Color(255, 51, 51));
      
        if(color=="blue")
      TextArea.setForeground(new java.awt.Color(51, 51, 255)); 
        if(color=="green")
       TextArea.setForeground(new java.awt.Color(0, 153, 0));
        if(color=="magenta")
        TextArea.setForeground(new java.awt.Color(153,0,153));
        
      if("Bold"== pfont){
        TextArea.setFont(new Font(f,Font.BOLD,fontsize));
    }
      else if("Bold"==pfont&& "Italic"==pfont){
        TextArea.setFont(new Font(f,Font.BOLD | Font.ITALIC,fontsize));
    }
      else if("Italic"==pfont){
        TextArea.setFont(new Font(f,Font.ITALIC,fontsize));
    } else{
          TextArea.setFont(new Font(f,Font.PLAIN,fontsize));
      }
    }*/
}
