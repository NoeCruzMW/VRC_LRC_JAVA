package VRC_LRC;

import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Noe cruz Lopez | Zurck'z  
 * @facebook https://www.facebook.com/zurckz2014/
 */
public class VRC_GUI extends javax.swing.JFrame {

    DefaultTableModel dataTableModel = new DefaultTableModel(new Object[][]{},
            new String[]{"", "CARACTER", "  ", " 7 Bits ", " ", "LRC"}) {
        Class[] types = new Class[]{java.lang.Boolean.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
        };
        boolean[] canEdit = new boolean[]{
            true, true, true, true, true, true
        };

        @Override
        public Class getColumnClass(int columnIndex) {
            return types[columnIndex];
        }

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit[columnIndex];
        }
    };

    private int index;
    private String dataInput;
    private boolean geLRC, geDato;
    private String sumLRC, colLRC;
    private String rebuild;

    public VRC_GUI() {
        initComponents();
        restart();
        txtChar.setEditable(false);
    }

    private void restart() {

        index = 0;
        dataInput = "";
        geLRC = false;
        geDato = false;
        sumLRC = "";
        tableView.setModel(dataTableModel);
        colLRC = "";
        rebuild = "";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PARIDAD = new javax.swing.ButtonGroup();
        SIGNIFICATIVO = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtInputString = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        txtChar = new javax.swing.JTextField();
        btnNext = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        Escritorio = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableView = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        txtLRC = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        txtOriginal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnGenerarDato = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuFile = new javax.swing.JMenu();
        itemNew = new javax.swing.JMenuItem();
        itemExit = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuSettings = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        chkPair = new javax.swing.JCheckBoxMenuItem();
        chkOdd = new javax.swing.JCheckBoxMenuItem();
        jMenu5 = new javax.swing.JMenu();
        chkRight = new javax.swing.JCheckBoxMenuItem();
        chkLeft = new javax.swing.JCheckBoxMenuItem();
        mnuEdit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Metodos de Dteccion de Errores");
        setMaximumSize(new java.awt.Dimension(567, 684));
        setMinimumSize(new java.awt.Dimension(567, 684));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 204, 204), null), "Captura de datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14), new java.awt.Color(255, 0, 0))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setText("Cadena:");

        txtInputString.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        txtInputString.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInputStringActionPerformed(evt);
            }
        });
        txtInputString.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtInputStringKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtInputString)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtInputString, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(0, 204, 204)), "Generador VRC", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 18), new java.awt.Color(255, 0, 0))); // NOI18N

        txtChar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N

        btnNext.setBackground(new java.awt.Color(255, 0, 51));
        btnNext.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iCons/Last.png"))); // NOI18N
        btnNext.setToolTipText("Siguiente caracter");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtChar, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnNext)
                    .addComponent(txtChar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 51, 102), new java.awt.Color(255, 51, 102)), "Bits de Paridad", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14), new java.awt.Color(255, 0, 51))); // NOI18N

        tableView.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tableView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableView);

        Escritorio.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 204, 204), new java.awt.Color(0, 204, 204)), "Generador LRC", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 0, 51))); // NOI18N

        txtLRC.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 153));
        jLabel2.setText("LRC:");

        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setText("  LRC      ->  Dirección de Transferencia");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLRC, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtLRC, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 204), new java.awt.Color(0, 153, 204), new java.awt.Color(0, 153, 204), new java.awt.Color(0, 153, 204)), "Datos originales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 18))); // NOI18N

        txtOriginal.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Dato");

        btnGenerarDato.setBackground(new java.awt.Color(255, 255, 255));
        btnGenerarDato.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGenerarDato.setText("GENERAR DATO ORIGINAL");
        btnGenerarDato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarDatoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnGenerarDato, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(btnGenerarDato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Realizado por: Zurck'z 2017 Programacion Basica en Java");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mnuFile.setText("Archivo");

        itemNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        itemNew.setText("Nuevo");
        itemNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNewActionPerformed(evt);
            }
        });
        mnuFile.add(itemNew);

        itemExit.setText("Salir");
        itemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemExitActionPerformed(evt);
            }
        });
        mnuFile.add(itemExit);
        mnuFile.add(jSeparator1);

        jMenuBar1.add(mnuFile);

        mnuSettings.setText("Configuraraciones");

        jMenu4.setText("Paridad");

        PARIDAD.add(chkPair);
        chkPair.setSelected(true);
        chkPair.setText("PAR");
        chkPair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPairActionPerformed(evt);
            }
        });
        jMenu4.add(chkPair);

        PARIDAD.add(chkOdd);
        chkOdd.setText("IMPAR");
        jMenu4.add(chkOdd);

        mnuSettings.add(jMenu4);

        jMenu5.setText("Bit significativo");

        SIGNIFICATIVO.add(chkRight);
        chkRight.setText("Derecha");
        chkRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkRightActionPerformed(evt);
            }
        });
        jMenu5.add(chkRight);

        SIGNIFICATIVO.add(chkLeft);
        chkLeft.setSelected(true);
        chkLeft.setText("Izquierda");
        jMenu5.add(chkLeft);

        mnuSettings.add(jMenu5);

        jMenuBar1.add(mnuSettings);

        mnuEdit.setText("About");
        mnuEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEditActionPerformed(evt);
            }
        });
        jMenuBar1.add(mnuEdit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkPairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkPairActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        txtInputString.setEditable(false);
        if (index < dataInput.length()) {
            this.next();
        } else if (!geLRC) {
            this.generatorLRC();
            geLRC = true;
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void chkRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkRightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkRightActionPerformed

    private void txtInputStringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInputStringActionPerformed
        dataInput = txtInputString.getText();
    }//GEN-LAST:event_txtInputStringActionPerformed

    private void txtInputStringKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInputStringKeyReleased
        dataInput = txtInputString.getText();
    }//GEN-LAST:event_txtInputStringKeyReleased

    private void btnGenerarDatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarDatoActionPerformed
        if (!geDato) {
            rebuildData();
            geDato = false;
        }
    }//GEN-LAST:event_btnGenerarDatoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setSize();
        goToSource();
    }//GEN-LAST:event_formWindowOpened

    private void itemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemExitActionPerformed
        dispose();
    }//GEN-LAST:event_itemExitActionPerformed

    private void itemNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNewActionPerformed
        txtInputString.setText("");
        txtChar.setText("");
        txtLRC.setText("");
        txtInputString.setEditable(true);
        txtOriginal.setText("");
        this.cleanTable();
        this.restart();
    }//GEN-LAST:event_itemNewActionPerformed

    private void mnuEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEditActionPerformed
        JOptionPane.showMessageDialog(null, "Realizado por:\t Noe Cruz Lopez ");
    }//GEN-LAST:event_mnuEditActionPerformed

    private void setSize() {
        tableView.getColumnModel().getColumn(0).setMaxWidth(25);
        tableView.getColumnModel().getColumn(0).setMinWidth(25);
        tableView.getColumnModel().getColumn(0).setPreferredWidth(25);
        tableView.getColumnModel().getColumn(2).setMaxWidth(25);
        tableView.getColumnModel().getColumn(2).setMinWidth(25);
        tableView.getColumnModel().getColumn(2).setPreferredWidth(25);
        tableView.getColumnModel().getColumn(4).setMaxWidth(25);
        tableView.getColumnModel().getColumn(4).setMinWidth(25);
        tableView.getColumnModel().getColumn(4).setPreferredWidth(25);
    }

    public void cleanTable() {

        try {
            DefaultTableModel tempModel = (DefaultTableModel) tableView.getModel();
            int rows = tableView.getRowCount();
            for (int i = 0; rows > i; i++) {
                tempModel.removeRow(0);
            }

        } catch (Exception e) {
            
        }

    }

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
            java.util.logging.Logger.getLogger(VRC_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VRC_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VRC_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VRC_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VRC_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.ButtonGroup PARIDAD;
    private javax.swing.ButtonGroup SIGNIFICATIVO;
    private javax.swing.JButton btnGenerarDato;
    private javax.swing.JButton btnNext;
    private javax.swing.JCheckBoxMenuItem chkLeft;
    private javax.swing.JCheckBoxMenuItem chkOdd;
    private javax.swing.JCheckBoxMenuItem chkPair;
    private javax.swing.JCheckBoxMenuItem chkRight;
    private javax.swing.JMenuItem itemExit;
    private javax.swing.JMenuItem itemNew;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu mnuEdit;
    private javax.swing.JMenu mnuFile;
    private javax.swing.JMenu mnuSettings;
    private javax.swing.JTable tableView;
    private javax.swing.JTextField txtChar;
    private javax.swing.JTextField txtInputString;
    private javax.swing.JTextField txtLRC;
    private javax.swing.JTextField txtOriginal;
    // End of variables declaration//GEN-END:variables

    private void next() {
        txtChar.setText(Generator.generator(Generator.toBinary(dataInput.charAt(index)), chkPair.isSelected(), chkRight.isSelected()));
        updateTable();
        sumLRC += txtChar.getText();
        index++;

    }

    private void updateTable() {
        String datos[] = new String[6];
        datos[1] = dataInput.substring(index, index + 1);
        datos[2] = "  ";
        String bitss = Generator.toBinary(dataInput.charAt(index));
        String aux = bitss;
        if (bitss.length() < 7) {
            bitss = "0" + aux;
        }
        rebuild += bitss;
        datos[3] = bitss;
        datos[4] = "  ";
        String te = getLRC();
        datos[5] = " " + te;
        colLRC += te;
        dataTableModel.addRow(datos);
        tableView.setModel(dataTableModel);
    }

    private String getLRC() {
        String temp = Generator.generator(Generator.toBinary(dataInput.charAt(index)), chkPair.isSelected(), chkRight.isSelected());
        if (chkRight.isSelected()) {
            return temp.substring(temp.length() - 1, temp.length());
        } else {
            return temp.substring(0, 1);
        }
    }

    private void generatorLRC() {
        int bits[][] = new int[index][7];
        String col_bits = "", CAD_LRC = "";
        for (int i = 0; i < index; i++) {
            String fila_bits = (tableView.getValueAt(i, 3).toString()).trim();
            for (int j = 0; j < 7; j++) {
                bits[i][j] = Integer.parseInt(fila_bits.substring(j, j + 1));
            }
        }

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < index; j++) {
                col_bits += bits[j][i];
            }
            if (chkPair.isSelected()) {
                CAD_LRC += Generator.isPair(Generator.counter(col_bits)) == true ? "0" : "1";
            } else {
                CAD_LRC += Generator.isPair(Generator.counter(col_bits)) == true ? "1" : "0";
            }

            col_bits = "";

        }
        String data[] = new String[6];
        data[1] = "-------";
        data[2] = "";
        data[3] = "-------";
        data[4] = "";
        data[5] = "-------";
        dataTableModel.addRow(data);
        tableView.setModel(dataTableModel);
        data[1] = " VRC ";
        data[2] = "  ";
        data[3] = " " + CAD_LRC + " ";
        data[4] = "  ";
        if (chkPair.isSelected()) {
            data[5] = Generator.isPair(Generator.counter(CAD_LRC)) == true ? "0" : "1";
        } else {
            data[5] = Generator.isPair(Generator.counter(colLRC)) == true ? "1" : "0";
        }
        dataTableModel.addRow(data);
        tableView.setModel(dataTableModel);
        txtLRC.setText(CAD_LRC + sumLRC);
    }

    private void rebuildData() {
        try {
            int totalChar = txtInputString.getText().length();
            String dataContent = "";
            for (int i = 0; i < totalChar; i++) {
                char p = (char) (Generator.toString(rebuild.substring(0, 7)));
                dataContent += p;
                rebuild = rebuild.substring(7);
            }
            txtOriginal.setText(dataContent);
        } catch (Exception p) {
        }

    }

    private void goToSource() {
        String urlSource = "http://www.linkbucks.com/AQxUj";
        try {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + urlSource);
        } catch (IOException err) {
        }
    }

}
