/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package my.note;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static my.note.TEACHER.addRowtotable;
import static my.note.TEACHER.jTable1;

/**
 *
 * @author Yahia Benotmane
 */
public class DEP extends javax.swing.JFrame {

    public DEP() {
        initComponents();
        
        this.setLocationRelativeTo(this);
        
        /*HOMEPanel.setVisible(true);
        PanelCHOIS.setVisible(false);
        PanelGENERAL.setVisible(true);
        PanelSECOND.setVisible(false);
        PanelSETTING.setVisible(false);
        
        //Tools panel colors
        THOMEPanel.setBackground(new java.awt.Color(255,255,255));
        TSETTINGLabel.setBackground(new java.awt.Color(204,204,255));
        TSECONDPanel.setBackground(new java.awt.Color(204,204,255));
        //Panel4.setBackground(new java.awt.Color(204,204,255));
        TEXITPanel.setBackground(new java.awt.Color(204,204,255));*/
        
        
        THOMEPanel.setBackground(new java.awt.Color(255,255,255));
        PanelCHOIS.setVisible(true);
        PanelGENERAL.setVisible(false);
        
    }
     public  boolean trouver(String exp,String txt){
        Pattern verification =Pattern.compile(exp);
        Matcher expmatcher =verification.matcher(txt);
        

      while(expmatcher.find()){

     if(expmatcher.group().length()!=0){
return true;
      // T_lexical.addRowtotable(new Object []{ type,expmatcher.group().trim()});
       // break;
     }
     }
      return false;
      }
static  DefaultTableModel model;
public static void addRowtotable (Object[] D_row){
         model =(DefaultTableModel) GHOMETable.getModel();
            model.addRow(D_row);
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelGENERAL = new javax.swing.JPanel();
        TOOLSPanel = new javax.swing.JPanel();
        THOMEPanel = new javax.swing.JPanel();
        THOMELabel = new javax.swing.JLabel();
        TEXITPanel = new javax.swing.JPanel();
        TEXITLabel = new javax.swing.JLabel();
        TSECONDPanel = new javax.swing.JPanel();
        TSECONDLabel = new javax.swing.JLabel();
        TSETTINGPanel = new javax.swing.JPanel();
        TSETTINGLabel = new javax.swing.JLabel();
        HOMEPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        GHOMETable = new javax.swing.JTable();
        INPUTSOMEONE = new javax.swing.JTextField();
        INPUTCLASS = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LabelFULLNAME = new javax.swing.JLabel();
        LabelMOYENNE = new javax.swing.JLabel();
        LabelREMARK = new javax.swing.JLabel();
        LabelSAVE = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        PanelSETTING = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        PanelSECOND = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        BTNsaveM = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableTM = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        BTNsave = new javax.swing.JButton();
        INPUTteacher = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabelMODULE = new javax.swing.JLabel();
        jLabelCLASS = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableTC = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        BTNsavegeneral = new javax.swing.JButton();
        BTNget = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabelREMARKS = new javax.swing.JLabel();
        PanelCHOIS = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPasswordField1 = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelGENERAL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TOOLSPanel.setBackground(new java.awt.Color(204, 204, 255));
        TOOLSPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        THOMEPanel.setBackground(new java.awt.Color(204, 204, 255));
        THOMEPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                THOMEPanelMouseClicked(evt);
            }
        });

        THOMELabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/note/home_25px.png"))); // NOI18N

        javax.swing.GroupLayout THOMEPanelLayout = new javax.swing.GroupLayout(THOMEPanel);
        THOMEPanel.setLayout(THOMEPanelLayout);
        THOMEPanelLayout.setHorizontalGroup(
            THOMEPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(THOMEPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(THOMELabel)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        THOMEPanelLayout.setVerticalGroup(
            THOMEPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(THOMEPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(THOMELabel)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        TOOLSPanel.add(THOMEPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 60, 60));

        TEXITPanel.setBackground(new java.awt.Color(204, 204, 255));

        TEXITLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/note/enter_25px.png"))); // NOI18N
        TEXITLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TEXITLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout TEXITPanelLayout = new javax.swing.GroupLayout(TEXITPanel);
        TEXITPanel.setLayout(TEXITPanelLayout);
        TEXITPanelLayout.setHorizontalGroup(
            TEXITPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TEXITPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(TEXITLabel)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        TEXITPanelLayout.setVerticalGroup(
            TEXITPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TEXITPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(TEXITLabel)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        TOOLSPanel.add(TEXITPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 700, 60, 60));

        TSECONDPanel.setBackground(new java.awt.Color(204, 204, 255));
        TSECONDPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TSECONDPanelMouseClicked(evt);
            }
        });

        TSECONDLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/note/new_document_20px.png"))); // NOI18N

        javax.swing.GroupLayout TSECONDPanelLayout = new javax.swing.GroupLayout(TSECONDPanel);
        TSECONDPanel.setLayout(TSECONDPanelLayout);
        TSECONDPanelLayout.setHorizontalGroup(
            TSECONDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TSECONDPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(TSECONDLabel)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        TSECONDPanelLayout.setVerticalGroup(
            TSECONDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TSECONDPanelLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(TSECONDLabel)
                .addGap(17, 17, 17))
        );

        TOOLSPanel.add(TSECONDPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 60, 60));

        TSETTINGPanel.setBackground(new java.awt.Color(204, 204, 255));
        TSETTINGPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TSETTINGPanelMouseClicked(evt);
            }
        });

        TSETTINGLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/note/service_20px.png"))); // NOI18N

        javax.swing.GroupLayout TSETTINGPanelLayout = new javax.swing.GroupLayout(TSETTINGPanel);
        TSETTINGPanel.setLayout(TSETTINGPanelLayout);
        TSETTINGPanelLayout.setHorizontalGroup(
            TSETTINGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TSETTINGPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(TSETTINGLabel)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        TSETTINGPanelLayout.setVerticalGroup(
            TSETTINGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TSETTINGPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(TSETTINGLabel)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        TOOLSPanel.add(TSETTINGPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 60, 60));

        PanelGENERAL.add(TOOLSPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 781));

        HOMEPanel.setBackground(new java.awt.Color(255, 255, 255));

        GHOMETable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Fullname", "Module1", "Module 2", "Module 3", "Module 4", "Module 5", "Module 6", "Module 7", "Moyenne"
            }
        ));
        GHOMETable.setRowHeight(30);
        jScrollPane1.setViewportView(GHOMETable);

        jLabel1.setText("Search smeone");

        jLabel2.setText("Class :");

        LabelFULLNAME.setText("Fullname");

        LabelMOYENNE.setText("Moyenne");

        LabelREMARK.setText("Remark :");

        LabelSAVE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/note/bookmark_20px.png"))); // NOI18N
        LabelSAVE.setText("Save");

        jButton1.setText("Refrech");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HOMEPanelLayout = new javax.swing.GroupLayout(HOMEPanel);
        HOMEPanel.setLayout(HOMEPanelLayout);
        HOMEPanelLayout.setHorizontalGroup(
            HOMEPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HOMEPanelLayout.createSequentialGroup()
                .addGroup(HOMEPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HOMEPanelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(INPUTCLASS, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HOMEPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(HOMEPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(HOMEPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(HOMEPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HOMEPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(LabelFULLNAME)
                        .addGap(167, 167, 167)
                        .addComponent(LabelMOYENNE)
                        .addGap(106, 106, 106)
                        .addComponent(LabelREMARK)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(HOMEPanelLayout.createSequentialGroup()
                        .addComponent(INPUTSOMEONE, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelSAVE)
                        .addGap(86, 86, 86))))
        );
        HOMEPanelLayout.setVerticalGroup(
            HOMEPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HOMEPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(HOMEPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(INPUTSOMEONE, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(LabelSAVE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(HOMEPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelFULLNAME)
                    .addComponent(LabelMOYENNE)
                    .addComponent(LabelREMARK))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(27, 27, 27)
                .addGroup(HOMEPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(INPUTCLASS, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        PanelGENERAL.add(HOMEPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 0, 1280, 780));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1263, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 768, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelSETTINGLayout = new javax.swing.GroupLayout(PanelSETTING);
        PanelSETTING.setLayout(PanelSETTINGLayout);
        PanelSETTINGLayout.setHorizontalGroup(
            PanelSETTINGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSETTINGLayout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelSETTINGLayout.setVerticalGroup(
            PanelSETTINGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        PanelGENERAL.add(PanelSETTING, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        PanelSECOND.setBackground(new java.awt.Color(255, 255, 255));

        BTNsaveM.setBackground(new java.awt.Color(204, 204, 204));
        BTNsaveM.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BTNsaveM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/note/bookmark_20px.png"))); // NOI18N
        BTNsaveM.setText("Save");

        TableTM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Teacher", "Module"
            }
        ));
        jScrollPane3.setViewportView(TableTM);

        jLabel11.setText("Module table");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BTNsaveM, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(BTNsaveM, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        BTNsave.setBackground(new java.awt.Color(204, 204, 204));
        BTNsave.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BTNsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/note/bookmark_20px.png"))); // NOI18N
        BTNsave.setText("Save");

        jLabel7.setText("Search teacher :");

        jLabelMODULE.setText("Result 01 :");

        jLabelCLASS.setText("Result 02 :");

        TableTC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Teacher", "Class"
            }
        ));
        jScrollPane2.setViewportView(TableTC);

        jLabel10.setText("Class table :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(INPUTteacher, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(173, 173, 173)
                                .addComponent(BTNsave, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCLASS)
                                    .addComponent(jLabelMODULE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(INPUTteacher, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabelMODULE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelCLASS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTNsave, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        BTNsavegeneral.setBackground(new java.awt.Color(204, 204, 204));
        BTNsavegeneral.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BTNsavegeneral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/note/bookmark_20px.png"))); // NOI18N
        BTNsavegeneral.setText("Save");

        BTNget.setBackground(new java.awt.Color(204, 204, 204));
        BTNget.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BTNget.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/note/registration_20px.png"))); // NOI18N
        BTNget.setText("Get");

        jButton5.setBackground(new java.awt.Color(204, 204, 204));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/note/new_document_20px.png"))); // NOI18N
        jButton5.setText("New");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel12.setText("Remark :");

        jLabelREMARKS.setText("jLabel13");

        javax.swing.GroupLayout PanelSECONDLayout = new javax.swing.GroupLayout(PanelSECOND);
        PanelSECOND.setLayout(PanelSECONDLayout);
        PanelSECONDLayout.setHorizontalGroup(
            PanelSECONDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSECONDLayout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addGroup(PanelSECONDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSECONDLayout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BTNget, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTNsavegeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSECONDLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
            .addGroup(PanelSECONDLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(PanelSECONDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelREMARKS)
                    .addComponent(jLabel12))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelSECONDLayout.setVerticalGroup(
            PanelSECONDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSECONDLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PanelSECONDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelREMARKS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(PanelSECONDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNsavegeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNget, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        PanelGENERAL.add(PanelSECOND, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(PanelGENERAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        PanelCHOIS.setBackground(new java.awt.Color(255, 255, 255));

        jButton6.setBackground(new java.awt.Color(51, 51, 51));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("SUBMIT");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jComboBox1.setBackground(new java.awt.Color(102, 102, 102));
        jComboBox1.setEditable(true);
        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Department", "Teacher", "Student" }));

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Agree");

        jLabel3.setText("ID Code");

        jLabel4.setText("Who are you ?");

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/note/graduationhat.png"))); // NOI18N
        jLabel5.setText(" HI , Welcome ");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/note/school2.png"))); // NOI18N

        javax.swing.GroupLayout PanelCHOISLayout = new javax.swing.GroupLayout(PanelCHOIS);
        PanelCHOIS.setLayout(PanelCHOISLayout);
        PanelCHOISLayout.setHorizontalGroup(
            PanelCHOISLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCHOISLayout.createSequentialGroup()
                .addGroup(PanelCHOISLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCHOISLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(PanelCHOISLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelCHOISLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPasswordField1)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jCheckBox1)))
                    .addGroup(PanelCHOISLayout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 321, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(118, 118, 118))
        );
        PanelCHOISLayout.setVerticalGroup(
            PanelCHOISLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCHOISLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCHOISLayout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(127, 127, 127))
        );

        getContentPane().add(PanelCHOIS, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void clearTable2()
{
   
    DefaultTableModel dtm = (DefaultTableModel) GHOMETable.getModel();
dtm.setRowCount(0);
}

    private void TSECONDPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TSECONDPanelMouseClicked
        // TODO add your handling code here:
        PanelGENERAL.setVisible(true);
       
        PanelSECOND.setVisible(true);
        PanelCHOIS.setVisible(false);
        HOMEPanel.setVisible(false);
        PanelSETTING.setVisible(false);
        //Tools panel colors
        TSECONDPanel.setBackground(new java.awt.Color(255,255,255));
        TSETTINGPanel.setBackground(new java.awt.Color(204,204,255));
        THOMEPanel.setBackground(new java.awt.Color(204,204,255));
        TEXITPanel.setBackground(new java.awt.Color(204,204,255));

    }//GEN-LAST:event_TSECONDPanelMouseClicked

    private void TSETTINGPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TSETTINGPanelMouseClicked
        // TODO add your handling code here:
        PanelSETTING.setVisible(true);
        PanelCHOIS.setVisible(false);
        PanelGENERAL.setVisible(true);
        PanelSECOND.setVisible(false);
        HOMEPanel.setVisible(false);   
        //Tools panel colors
        TSETTINGPanel.setBackground(new java.awt.Color(255,255,255));
        THOMEPanel.setBackground(new java.awt.Color(204,204,255));
        TSECONDPanel.setBackground(new java.awt.Color(204,204,255));
        TEXITPanel.setBackground(new java.awt.Color(204,204,255));
    }//GEN-LAST:event_TSETTINGPanelMouseClicked

    private void THOMEPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_THOMEPanelMouseClicked
        // TODO add your handling code here:
         HOMEPanel.setVisible(true);
        PanelCHOIS.setVisible(false);
        PanelGENERAL.setVisible(true);
        PanelSECOND.setVisible(false);
        PanelSETTING.setVisible(false);
        //Tools panel colors
        THOMEPanel.setBackground(new java.awt.Color(255,255,255));
        TSETTINGPanel.setBackground(new java.awt.Color(204,204,255));
        TSECONDPanel.setBackground(new java.awt.Color(204,204,255));
        TEXITPanel.setBackground(new java.awt.Color(204,204,255));
    }//GEN-LAST:event_THOMEPanelMouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        // TODO add your handling code here:
        int t=0;
        boolean b1=false;
         boolean b3=false;
          boolean b2=false;
        String v1=jComboBox1.getSelectedItem().toString();
        ArrayList<Attribute> personlist = DB.getpersons();
        ArrayList<Attribute> personlist3 = DB.getpersons();
         //System.out.println(personlist);
         
        System.out.println(personlist.get(0).getPassword().toString());
        String pass=jPasswordField1.getText().toString();
       /* for(int i=0;i<=personlist3.size();i++){
        if(pass.equals(personlist3.get(i).getPassword())){
                b3=true;
            }*/
         if ("Student".equals(v1) /*&& trouver("[03]{1}[0-9]+", personlist.get(i).getPassword().toString())&& trouver("[03]{1}[0-9]+", pass) && b3*/){
         new STUDENT().setVisible(true);
        this.dispose();}
        //}
       
        /*for(int i=0;i<=personlist2.size();i++){
        if(pass.equals(personlist2.get(i).getPassword())){
                b2=true;
            }*/
         if ("Teacher".equals(v1)){
         new TEACHER().setVisible(true);
        this.dispose();}
                
        for(int i=0;i<=personlist.size();i++){
            if(pass.equals(personlist.get(i).getPassword())){
                b1=true;
            }
        if ("Department".equals(v1) && trouver("[01]{1}[0-9]+", personlist.get(i).getPassword().toString())&& trouver("[01]{1}[0-9]+", pass) && b1){
            t++;
        PanelGENERAL.setVisible(true);
        PanelCHOIS.setVisible(false);
            t=0;
        }
        }
        
       
        
       
        if(jCheckBox1.isSelected()){
              
        }
        
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void TEXITLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TEXITLabelMouseClicked
        // TODO add your handling code here:
        PanelCHOIS.setVisible(true);
        PanelGENERAL.setVisible(false);
    }//GEN-LAST:event_TEXITLabelMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           // public static ArrayList<Attribute> getpersons(){
             clearTable2();
        System.out.println("updating...........");
        DB db= new DB();
        db.getConnection();
        Connection conn= db.getConnection();
        Statement stmt;
       // ArrayList<Attribute>  personlist =new ArrayList();
      
        try{
            stmt=conn.createStatement();
            ResultSet rs =stmt.executeQuery("select id,student_name,arabic_average from arabic");
            while(rs.next()){//next() bcause other data going in rs(resultset)
               Attribute person =new Attribute();
               person.setId(rs.getInt("id"));
               person.setStudent_name(rs.getString("student_name"));
               person.setAverage(rs.getString("arabic_average"));
               //person.setAge(rs.getInt("age"));
             //  personlist.add(person);
               
               addRowtotable(new Object []{ person.getId() ,person.getStudent_name(),person.getAverage(), null ,null,null ,null,null ,null,null });
               STUDENT.addRowtotable(new Object []{ null,null,null ,person.getStudent_name(),person.getAverage() });
            }
            conn.close();
            //return personlist;
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        //return null;
        
        
   // }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(DEP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DEP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DEP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DEP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DEP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNget;
    private javax.swing.JButton BTNsave;
    private javax.swing.JButton BTNsaveM;
    private javax.swing.JButton BTNsavegeneral;
    public static javax.swing.JTable GHOMETable;
    private javax.swing.JPanel HOMEPanel;
    private javax.swing.JTextField INPUTCLASS;
    private javax.swing.JTextField INPUTSOMEONE;
    private javax.swing.JTextField INPUTteacher;
    private javax.swing.JLabel LabelFULLNAME;
    private javax.swing.JLabel LabelMOYENNE;
    private javax.swing.JLabel LabelREMARK;
    private javax.swing.JLabel LabelSAVE;
    private javax.swing.JPanel PanelCHOIS;
    private javax.swing.JPanel PanelGENERAL;
    private javax.swing.JPanel PanelSECOND;
    private javax.swing.JPanel PanelSETTING;
    private javax.swing.JLabel TEXITLabel;
    private javax.swing.JPanel TEXITPanel;
    private javax.swing.JLabel THOMELabel;
    private javax.swing.JPanel THOMEPanel;
    private javax.swing.JPanel TOOLSPanel;
    private javax.swing.JLabel TSECONDLabel;
    private javax.swing.JPanel TSECONDPanel;
    private javax.swing.JLabel TSETTINGLabel;
    private javax.swing.JPanel TSETTINGPanel;
    private javax.swing.JTable TableTC;
    private javax.swing.JTable TableTM;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelCLASS;
    private javax.swing.JLabel jLabelMODULE;
    private javax.swing.JLabel jLabelREMARKS;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
