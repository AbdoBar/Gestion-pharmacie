package cpmpiler_c;


import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Compilation extends javax.swing.JFrame {

    public Compilation() {
        initComponents();
         this.setLocationRelativeTo(this);
         
       
     // new NewJFrame().setVisible(true);
    } 
   
    public static void writeinfile(String fichier , String texte ,boolean a){
         
        try {
            
            File file = new File(fichier);
            FileWriter fwrite = new FileWriter(fichier,a);
            PrintWriter pw = new PrintWriter(fwrite) ;
                pw.println(texte);
                
            pw.close();
            } catch (IOException ex) {
            Logger.getLogger(Compilation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
         
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        label = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt = new javax.swing.JTextArea();
        Syntaxique = new javax.swing.JButton();
        Lixecal = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Compilateur Java");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Bernard MT Condensed", 0, 12)); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txt.setBackground(new java.awt.Color(102, 102, 102));
        txt.setColumns(20);
        txt.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        txt.setForeground(new java.awt.Color(255, 255, 255));
        txt.setRows(5);
        txt.setText("\n");
        jScrollPane2.setViewportView(txt);

        Syntaxique.setBackground(new java.awt.Color(153, 153, 153));
        Syntaxique.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Syntaxique.setText("A.Syntaxique");
        Syntaxique.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Syntaxique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SyntaxiqueActionPerformed(evt);
            }
        });

        Lixecal.setBackground(new java.awt.Color(153, 153, 153));
        Lixecal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Lixecal.setText("A.Lixecal");
        Lixecal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Lixecal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Lixecal.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        Lixecal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LixecalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Lixecal, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(669, 669, 669)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Syntaxique, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                .addGap(37, 37, 37))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 23, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1024, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 23, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 565, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Syntaxique, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Lixecal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 85, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 85, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 690));

        jMenuBar1.setAutoscrolls(true);

        jMenu1.setText("File");

        jMenuItem1.setIcon(new javax.swing.ImageIcon("C:\\Users\\B_arkat\\Desktop\\compilateur\\Com_2\\src\\icons8_new_copy_24px.png")); // NOI18N
        jMenuItem1.setText("New");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon("C:\\Users\\B_arkat\\Desktop\\compilateur\\Com_2\\src\\icons8_save_as_24px.png")); // NOI18N
        jMenuItem2.setText("Save");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon("C:\\Users\\B_arkat\\Desktop\\compilateur\\Com_2\\src\\icons8_opened_folder_24px_1.png")); // NOI18N
        jMenuItem3.setText("Open");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem7.setIcon(new javax.swing.ImageIcon("C:\\Users\\B_arkat\\Desktop\\compilateur\\Com_2\\src\\icons8_exit_24px_1_1.png")); // NOI18N
        jMenuItem7.setText("Exit");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem4.setIcon(new javax.swing.ImageIcon("C:\\Users\\B_arkat\\Desktop\\compilateur\\Com_2\\src\\icons8_copy_24px.png")); // NOI18N
        jMenuItem4.setText("Copy");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setIcon(new javax.swing.ImageIcon("C:\\Users\\B_arkat\\Desktop\\compilateur\\Com_2\\src\\icons8_cut_24px.png")); // NOI18N
        jMenuItem5.setText("Cut");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setIcon(new javax.swing.ImageIcon("C:\\Users\\B_arkat\\Desktop\\compilateur\\Com_2\\src\\icons8_paste_24px.png")); // NOI18N
        jMenuItem6.setText("Paste");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SyntaxiqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SyntaxiqueActionPerformed

           String str = txt.getText(); 
           writeinfile("fichier.txt",str,false);
           
           int n=0;
           JTextField txtf= new JTextField();
        txtf.setSize(40,40);
           
            int h=0;
           
            for(int i=0; i<str.length(); i++) {
               char ch = str.charAt(i);
                    if (ch == '\n'){
                           n=n+1;
                       }
            }
        for(int j=0; j<n; j++) 
        { 
                        
                                    String line;
                            try { 
                                line = Files.readAllLines(Paths.get("fichier.txt")).get(j);
                           
                                    System.out.println(line);
                                   System.out.println(j+1);
                                   boolean b30=Pattern.matches("\n*[\\s]*[:import:][^0-9]+[:;:]{1}[\\s]*\n*",line);
                                   boolean b31=Pattern.matches("\n*[\\s]*public{1}[\\s]+Class{1}[\\s]+[A-Z]{1}[a-zA-Z0-9]*[\\s]+[:{:]{1}\n*",line);//\n*[\\s]*[:public:]{1}[\\s]+[:Class:]{1}[\\s]+[\\w]*[\\s]+[:{:]{1}\n*
                                   boolean b32=Pattern.matches("\n*[\\s]*[:/:]{2}[\\s]*[\\w|\\W|\\s|\\S]*\n*",line);//comentaire
                                   boolean b33 =Pattern.matches("\n*[\\s]*public{1}[\\s]+static{1}[\\s]+void{1}[\\s]+main{1}[\\s]+[:(:]{1}[\\s]*String{1}[\\s]+[a-zA-Z]+[\\s]*[:,:]?[\\s]*[:):]{1}[\\s]*[:{:]{1}[\\s]*\n*",line);//public static void main ( String a)
                                  boolean b34 =Pattern.matches("\n*[\\s]*public{1}[\\s]+static{1}[\\s]+void{1}[\\s]+main{1}[\\s]+[:(:]{1}[\\s]*int{1}[\\s]+[a-zA-Z]+[\\s]*[:,:]?[\\s]*[:):]{1}[\\s]*[:{:]{1}[\\s]*\n*",line);
                                  boolean b35 =Pattern.matches("\n*[\\s]*public{1}[\\s]+static{1}[\\s]+void{1}[\\s]+main{1}[\\s]+[:(:]{1}[\\s]*double{1}[\\s]+[a-zA-Z]+[\\s]*[:,:]?[\\s]*[:):]{1}[\\s]*[:{:]{1}[\\s]*\n*",line);
                                 //déclaration
                                  boolean b36 =Pattern.matches("\n*[\\s]*int{1}[\\s]+[:,:]?[\\s]*[[a-zA-Z][:,:]?]+[\\s]*[:;:]{1}\n*",line);//static[\\s]*
                                 boolean b37 =Pattern.matches("\n*[\\s]*String{1}[\\s]+[:,:]?[\\s]*[[a-zA-Z][:,:]?]+[\\s]*[:;:]{1}\n*",line);//static[\\s]*
                                boolean b38 =Pattern.matches("\n*[\\s]*boolean{1}[\\s]+[:,:]?[\\s]*[[a-zA-Z][:,:]?]+[\\s]*[:;:]{1}\n*",line);//static[\\s]*
                                boolean b39 =Pattern.matches("\n*[\\s]*double{1}[\\s]+[:,:]?[\\s]*[[a-zA-Z][:,:]?]+[\\s]*[:;:]{1}\n*",line);//static[\\s]*
                                boolean b51 =Pattern.matches("\n*[\\s]*float{1}[\\s]+[:,:]?[\\s]*[[a-zA-Z][:,:]?]+[\\s]*[:;:]{1}\n*",line);//static[\\s]*
                                  //scanner
                                  boolean b40 =Pattern.matches("\n*[\\s]*Scanner{1}[\\s]+[a-zA-Z]+[\\s]+[:=:]{1}[\\s]*new{1}[\\s]+Scanner{1}[:(:]{1}[\\s]*System{1}[.]{1}in{1}[\\s]*[:):]{1}[\\s]*[:;:]{1}\n*",line);//Scanner  Scan =new Scanner(System.in);
                                  //affichage 
                                 boolean b41 =Pattern.matches("\n*[\\s]*System{1}[.]{1}out{1}[.]{1}println{1}[:(:]{1}[\\s]*\\W{1}[\\s]*[[a-zA-Z0-9][\\s]*]*[\\s]*\\W{1}[[+]{1}[\\s]*[a-zA-Z0-9]+]*[\\s]*[:):]{1}[\\s]*[:;:]{1}\n*",line);
                                //d'ffictation  
                                boolean b42 =Pattern.matches("\n*[\\s]*int{1}[\\s]+[a-zA-Z0-9]+[\\s]*[:=:]{1}[a-zA-Z0-9]+[\\s]*[[-|*|+|^]{1}[\\s]*[a-zA-Z0-9]+]+[\\s]*[:;:]{1}\n*",line);//ina a=a+b-true !!
                                boolean b43 =Pattern.matches("\n*[\\s]*double{1}[\\s]+[a-zA-Z0-9]+[\\s]*[:=:]{1}[a-zA-Z0-9]+[\\s]*[[-|*|+|^]{1}[\\s]*[a-zA-Z0-9]+]+[\\s]*[:;:]{1}\n*",line); 
                                boolean b44 =Pattern.matches("\n*[\\s]*[a-zA-Z0-9]+[\\s]*[:=:]{1}[a-zA-Z0-9]+[\\s]*[[-|*|+|^]{1}[\\s]*[a-zA-Z0-9]+]{1}[[-|*|+|^]{1}[\\s]*[a-zA-Z0-9]{1}[a-zA-Z0-9]*]*[\\s]*[:;:]{1}\n*",line);
                               //lecture
                                boolean b45 =Pattern.matches("\n*[\\s]*int{1}[\\s]+[a-zA-Z0-9]+[\\s]*[:=:]{1}[a-zA-Z0-9]+[.]{1}nextInt{1}[:(:]{1}[:):]{1}[\\s]*[:;:]{1}\n*",line);
                                boolean b46 =Pattern.matches("\n*[\\s]*float{1}[\\s]+[a-zA-Z0-9]+[\\s]*[:=:]{1}[a-zA-Z0-9]+[.]{1}nextFloat{1}[:(:]{1}[:):]{1}[\\s]*[:;:]{1}\n*",line);
                                boolean b47 =Pattern.matches("\n*[\\s]*String{1}[\\s]+[a-zA-Z0-9]+[\\s]*[:=:]{1}[a-zA-Z0-9]+[.]{1}nextLine{1}[:(:]{1}[:):]{1}[\\s]*[:;:]{1}\n*",line);
                                boolean b48 =Pattern.matches("\n*[\\s]*[a-zA-Z0-9]+[\\s]*[:=:]{1}[a-zA-Z0-9]+[.]{1}nextInt{1}[:(:]{1}[:):]{1}[\\s]*[:;:]{1}\n*",line);
                                boolean b49 =Pattern.matches("\n*[\\s]*[a-zA-Z0-9]+[\\s]*[:=:]{1}[a-zA-Z0-9]+[.]{1}nextFloat{1}[:(:]{1}[:):]{1}[\\s]*[:;:]{1}\n*",line);
                                boolean b50 =Pattern.matches("\n*[\\s]*[a-zA-Z0-9]+[\\s]*[:=:]{1}[a-zA-Z0-9]+[.]{1}nextLine{1}[:(:]{1}[:):]{1}[\\s]*[:;:]{1}\n*",line);
                                
                                boolean b52 =Pattern.matches("\n*[\\s]*if{1}[\\s]*[:(:]{1}[\\s]*[\\w|\\W|\\s|\\S]+[\\s]*[:):]{1}[\\s]*[:{:]?[\\s]*\n*",line);//cas instruction mem line il a faux et condition ne pas virifier
                                boolean b53 =Pattern.matches("\n*[\\s]*[:}:]?else{1}[\\s]*[:{:]?[\\w|\\W|\\s|\\S]*[:}:]?\n*",line);//les instriction mem line en else ne pas virifier
                                
                                boolean b54 =Pattern.matches("\n*[\\s]*[:}:]{1}[\\w|\\W|\\s|\\S]*\n*",line);
                                boolean b55 =Pattern.matches("\n*[\\s]*[:{:]{1}[\\w|\\W|\\s|\\S]*\n*",line);
                                boolean b56 =Pattern.matches("\n*[\\s]*\n*",line);// nimport quel ligne vide 
                                System.out.println(b56);
                                
                                 if(b30 ||b31 ||b32 ||b33 ||b34 ||b35 ||b36 ||b37 ||b38 ||b39 ||b40 ||b41 ||b42 ||b43 ||b44 ||b45 ||b46 ||b47 ||b48 ||b49 ||b50 ||b51 ||b52 ||b53 ||b54 ||b55 ||b56  ){
                                
                                  }else{
                                     
                                     int d=j+1;
                                     txtf.setText("<"+line+">"+"\n Erreur : \n avec line:["+d+"]\n");
                                     h=1;
                                 } 
                                     
                                    } catch (IOException ex) {
                                Logger.getLogger(Compilation.class.getName()).log(Level.SEVERE, null, ex);
                  }
                               
        }
        JOptionPane pane =new JOptionPane(txtf);
        if(h==1){
        
        pane.showMessageDialog(this,txtf.getText(),"ERREUR",JOptionPane.CANCEL_OPTION);
        }else pane.showMessageDialog(this,"il n'y a pas d'erreur");
    }//GEN-LAST:event_SyntaxiqueActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
         JFileChooser fileChooser = new JFileChooser();
            int option = fileChooser.showSaveDialog(this);
            if(option == JFileChooser.APPROVE_OPTION){
               File file = fileChooser.getSelectedFile();
               label.setText("File Saved as: " + file.getName());
             try {
                 FileWriter fw=new FileWriter(file);
                 String text=txt.getText();
                 fw.write(text);
                 fw.close();
             } catch (IOException ex) {
                 Logger.getLogger(Compilation.class.getName()).log(Level.SEVERE, null, ex);
             }
            }else{
               label.setText("Save command canceled");
            }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
     new Compilation().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
           JFileChooser selcteur =new JFileChooser();
          int var =selcteur.showOpenDialog(null);
          if(var == 0){
              redfile(selcteur.getSelectedFile().getAbsolutePath());
          }
                   
    }//GEN-LAST:event_jMenuItem3ActionPerformed
    public static void redfile(String filepath) {
        BufferedReader reader;
        FileReader in ;
        String ligne;
        try{
            in = new FileReader(new File(filepath));
            reader =new BufferedReader(in);
            do{
                ligne =reader.readLine();
                if(ligne != null)
                txt.setText(txt.getText()+ligne+"\n");
            }while(ligne != null);
        }catch(FileNotFoundException ex){
            Logger.getLogger(Compilation.class.getName()).log(Level.SEVERE,null,ex);
        } catch (IOException ex) {
            Logger.getLogger(Compilation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
          txt.copy();
       
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void LixecalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LixecalActionPerformed
        String str = txt.getText();
       writeinfile("fichier.txt",str,false);
        T_lexical lex = new T_lexical();
        lex.setVisible(true);
        int v=0,v2=0;
           String line1;
           int m1=0;
           //clculer le nombre de ligne...........................
           for(int i=0; i<str.length(); i++) {
               char ch = str.charAt(i);
                    if (ch == '\n'){
                           m1=m1+1;
                       }
            }
           //.......................................................
            for(int i1=0; i1<m1; i1++){
           try {
               line1 = Files.readAllLines(Paths.get("fichier.txt")).get(i1);
           
            
        for(int i=0; i< line1.length(); i++) 
        { 
            int x=0,x2=0;
           
            char chr = line1.charAt(i);
            String c;
            c = String.valueOf(chr);
           // constant
            boolean b1=Pattern.matches("[0-9]",c);
                    if(b1) T_lexical.addRowtotable(new Object []{ "const",chr}); // lex objet d'un frame T_lexical && sellmonet le chifre les nombre no correct 
                        
            //les operateur        
                        
                       boolean b2=Pattern.matches("[:*:]{1}",c);//**
                       boolean b3=Pattern.matches("[:+:]{1}",c);//+
                       boolean b4=Pattern.matches("-{1}",c);
                       boolean b5=Pattern.matches("/{1}",c);                              
                          if(c.equals("*")) {
                                                                
                                  v =v+1;
                                  if(v==1) x = 1;
                                  if(v==2) x = 2;
                                  if(v>2) v=0;
                             }
                          System.out.println(b5);
                          if(b5) {
                                                                
                                  v2 =v2+1;
                                  if(v2==1) x2 = 1;
                                  if(v2==2) x2 = 2;
                                  if(v2>2) v2=0;
                             }
                            
                 
                     if( b3 || b4 ){
                     //if( c.equals("*"))
                      T_lexical.addRowtotable(new Object []{ "L'opirateur",chr});
                     }
                     if (v2==1 && x2!=1) {T_lexical.addRowtotable(new Object []{ "L'opirateur","/"} ); v2=0; }
                     if (v==1 && x!=1) {T_lexical.addRowtotable(new Object []{ "L'opirateur","*"} ); v=0; }
                     if (v==2 && x==2){ T_lexical.addRowtotable(new Object []{ "L'opirateur","**"});}
                    
                 //}
           // }  
            boolean b7= false;
             boolean b8= false;
                   boolean b9 = false;
                    //boolean b11 = false;
           
           boolean b6=Pattern.matches("={1}",c);
            if(c.equals("(")) b7=true;
             if(c.equals(")")) b8=true;
               if(c.equals('"')) b9=true;
               boolean b10=Pattern.matches(";{1}",c);
              //  boolean b11=Pattern.matches("{1}",c);
                
                
                    if(b6 || b7 || b8 || b9 || b10 ){
                    T_lexical.addRowtotable(new Object []{ "Séparateur",chr}); // lex objet d'un frame T_lexical 
                      
                }
        }
                  } catch (IOException ex) {
               Logger.getLogger(Compilation.class.getName()).log(Level.SEVERE, null, ex);
           }
                  
        }
        
                    
          /* boolean b12=Pattern.matches("for",txt.getText());  
          */
          boolean b12 = txt.getText().contains("for"); 
          // System.out.println(b12);
           if(b12){
                    T_lexical.addRowtotable(new Object []{ "Moclé","for"});  
                    
           }
            boolean b13 = txt.getText().contains("if"); 
          // System.out.println(b12);
           if(b13) T_lexical.addRowtotable(new Object []{ "Moclé","if"}); 
           
            boolean b14 = txt.getText().contains("else"); 
            if(b14) T_lexical.addRowtotable(new Object []{ "Moclé","else"}); 
            
             boolean b15 = txt.getText().contains("while"); 
            if(b15) T_lexical.addRowtotable(new Object []{ "Moclé","while"}); 
            
             boolean b16 = txt.getText().contains("this"); 
            if(b16) T_lexical.addRowtotable(new Object []{ "Moclé","this"}); 
            
             boolean b17 = txt.getText().contains("else"); 
            if(b17) T_lexical.addRowtotable(new Object []{ "Moclé","else"}); 
            
             boolean b18 = txt.getText().contains("boolean"); 
            if(b18) T_lexical.addRowtotable(new Object []{ "Moclé","boolean"}); 
            
             boolean b19 = txt.getText().contains("char"); 
            if(b19) T_lexical.addRowtotable(new Object []{ "Moclé","char"}); 
             
             boolean b20 = txt.getText().contains("int"); 
            if(b20) T_lexical.addRowtotable(new Object []{ "Moclé","int"}); 
            
             boolean b21 = txt.getText().contains("String"); 
            if(b21) T_lexical.addRowtotable(new Object []{ "Moclé","String"}); 
            
             boolean b22 = txt.getText().contains("float"); 
            if(b22) T_lexical.addRowtotable(new Object []{ "Moclé","float"}); 
            
             boolean b23 = txt.getText().contains("double"); 
            if(b23) T_lexical.addRowtotable(new Object []{ "Moclé","double"}); 
            
             boolean b24 = txt.getText().contains("static"); 
            if(b24) T_lexical.addRowtotable(new Object []{ "Moclé","static"}); 
            
             boolean b25 = txt.getText().contains("void"); 
            if(b25) T_lexical.addRowtotable(new Object []{ "Moclé","void"}); 
            
            //identificateur
             
           writeinfile("fichier.txt",str,false);
           String line;
           int m=0;
           //clculer le nombre de ligne...........................
           for(int i=0; i<str.length(); i++) {
               char ch = str.charAt(i);
                    if (ch == '\n'){
                           m=m+1;
                       }
            }
           //.......................................................
           int L=0;
           for (int w=0;w<m; w++){
           try {
               line = Files.readAllLines(Paths.get("fichier.txt")).get(w);
               boolean b26=Pattern.matches("\n*[\\s]*int{1}[\\s]+[\\w|\\W|\\s|\\S]*\n*",line);
               boolean b26_1=Pattern.matches("\n*[\\s]*String{1}[\\s]+[\\w|\\W|\\s|\\S]*\n*",line);
               boolean b26_2=Pattern.matches("\n*[\\s]*float{1}[\\s]+[\\w|\\W|\\s|\\S]*\n*",line);
               boolean b26_3=Pattern.matches("\n*[\\s]*double{1}[\\s]+[\\w|\\W|\\s|\\S]*\n*",line);
               boolean b26_4=Pattern.matches("\n*[\\s]*char{1}[\\s]+[\\w|\\W|\\s|\\S]*\n*",line);
               int y;
               if(b26){
                   y=3;
               }else{
                   if(b26_1 || b26_3){
                       y=6;
                   }else{
                       if(b26_2){
                           y=5;
                       }else{
                           y=4;
                       }
                   }
               }
               if(b26 || b26_1|| b26_2 || b26_3 || b26_4){
                   int u=0;
                   char chrln1 ;
                   String cln1;
                   for (int r=0;r<line.length(); r++){
                        chrln1 = line.charAt(r);
                             cln1 = String.valueOf(chrln1);
                             boolean b28=Pattern.matches("[\\s]{1}",cln1);
                             if(b28){
                                 u=u+1;
                             }else{
                                 r=line.length();
                             }
                      
                   }
                  
                   for (int p=u+y;p<line.length(); p++){
                      char chrln = line.charAt(p);
                      if (chrln !='\t'|| chrln!='\n'){
                      String cln;
                             cln = String.valueOf(chrln);
                             
                             boolean b27=Pattern.matches("[\\s]*[a-zA-Z]+",cln);
                            if(b27) T_lexical.addRowtotable(new Object []{"identificateur",cln}); 
                      }
                   }
                   
               }
           } catch (IOException ex) {
               Logger.getLogger(Compilation.class.getName()).log(Level.SEVERE, null, ex);
           }
           }
        
    }//GEN-LAST:event_LixecalActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        
        txt.cut();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
         
         txt.paste();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // NIGHT MODE
        if (jButton1.getText()=="") {
            jPanel1.setBackground(Color.DARK_GRAY);
            jLabel1.setForeground(Color.WHITE);
            Lixecal.setBackground(Color.LIGHT_GRAY);
            Lixecal.setForeground(Color.black);
            
            Syntaxique.setBackground(Color.LIGHT_GRAY);
            Syntaxique.setForeground(Color.black);
            jButton1.setText("Normal Mode");
            jButton1.setForeground( Color.WHITE);
           // jButton1.setBackground(Color.DARK_GRAY);
            
        } else {
            jButton1.setText("");
            jPanel1.setBackground(Color.WHITE);
            jLabel1.setForeground(Color.black); 
             Lixecal.setBackground(Color.DARK_GRAY);
            Lixecal.setForeground(Color.WHITE);
            
            Syntaxique.setBackground(Color.DARK_GRAY);
            Syntaxique.setForeground(Color.WHITE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {
         
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new Compilation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Lixecal;
    private javax.swing.JButton Syntaxique;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane2;
    private static javax.swing.JLabel label;
    private static javax.swing.JTextArea txt;
    // End of variables declaration//GEN-END:variables

 
}
