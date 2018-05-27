/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework_manager;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author doilhan
 */
public class ViewController extends javax.swing.JFrame {
    Model model;
    int index;
    ListSelectionListener listlisten = new ListSelectionListener() {
        @Override
        public void valueChanged(ListSelectionEvent e) {
            lblTask.setVisible(true);
            lblDescriptions.setVisible(true);
            lblPriority.setVisible(true);
            lblDeadline.setVisible(true);
            txtDescriptionScroll.setVisible(true);
            if(lstTasks.isSelectionEmpty()){
            index = lstTasks.getSelectedIndex();
            txtTasklb.setText("");
            txtDescription.setText("");
            txtPrioritylb.setText("");
            txtDeadlinelb.setText("");
            }else{
            index = lstTasks.getSelectedIndex();
            txtTasklb.setText(model.getSpecificContent(index, "title"));
            txtDescription.setText(model.getSpecificContent(index, "description"));
            txtPrioritylb.setText(model.getSpecificContent(index, "priority"));
            txtDeadlinelb.setText(model.getSpecificContent(index, "deadline"));
            }
        }
    };
    public ViewController(Model model) {
        initComponents();
        this.model = model;
        lstTasks.setListData(model.getTasks());
        lstTasks.addListSelectionListener(listlisten);
        lblTask.setVisible(false);
        txtDescriptionScroll.setVisible(false);
        lblDescriptions.setVisible(false);
        lblPriority.setVisible(false);
        lblDeadline.setVisible(false);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstTasks = new javax.swing.JList<>();
        lblTask = new javax.swing.JLabel();
        txtTasklb = new javax.swing.JLabel();
        lblDescriptions = new javax.swing.JLabel();
        lblPriority = new javax.swing.JLabel();
        lblDeadline = new javax.swing.JLabel();
        txtDescriptionlb = new javax.swing.JLabel();
        txtPrioritylb = new javax.swing.JLabel();
        txtDeadlinelb = new javax.swing.JLabel();
        txtDescriptionScroll = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        Addbtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        RemoveBtn = new javax.swing.JButton();
        QuitBtn = new javax.swing.JButton();
        Timerbtn = new javax.swing.JButton();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homework_manager/images/logo_50x50.png"))); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homework_manager/images/logo_50x50.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Krungthep", 0, 18)); // NOI18N
        jLabel3.setText("Homework Manager");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Homeworks Due", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Silom", 0, 13))); // NOI18N
        jPanel2.setMaximumSize(new java.awt.Dimension(429, 210));
        jPanel2.setMinimumSize(new java.awt.Dimension(429, 210));
        jPanel2.setPreferredSize(new java.awt.Dimension(429, 210));
        jPanel2.setPreferredSize(new java.awt.Dimension(429, 210));

        jScrollPane1.setViewportView(lstTasks);

        lblTask.setFont(new java.awt.Font("Silom", 0, 13)); // NOI18N
        lblTask.setText("Task :");
        if(lstTasks.isSelectionEmpty()){
            lblTask.setVisible(false);
        }

        txtTasklb.setText(" ");

        lblDescriptions.setFont(new java.awt.Font("Silom", 0, 10)); // NOI18N
        lblDescriptions.setText("Descriptions");
        if(lstTasks.isSelectionEmpty()){
            lblDescriptions.setVisible(false);
        }

        lblPriority.setFont(new java.awt.Font("Silom", 0, 10)); // NOI18N
        lblPriority.setText("Priority  :");
        if(lstTasks.isSelectionEmpty()){
            lblPriority.setVisible(false);
        }

        lblDeadline.setFont(new java.awt.Font("Silom", 0, 10)); // NOI18N
        lblDeadline.setText("Due Date :");
        if(lstTasks.isSelectionEmpty()){
            lblDeadline.setVisible(false);
        }

        txtDescriptionlb.setText(" ");

        txtPrioritylb.setText(" ");

        txtDeadlinelb.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtDeadlinelb.setText(" ");

        txtDescription.setColumns(20);
        txtDescription.setRows(5);
        txtDescriptionScroll.setViewportView(txtDescription);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblTask)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTasklb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblDescriptions)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblDeadline)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDeadlinelb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblPriority)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPrioritylb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(txtDescriptionScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(75, 75, 75)))
                        .addComponent(txtDescriptionlb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTask)
                            .addComponent(txtTasklb))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDescriptions)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(txtDescriptionlb, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDescriptionScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrioritylb, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPriority))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDeadline)
                            .addComponent(txtDeadlinelb, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Addbtn.setText("Add");
        Addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddbtnActionPerformed(evt);
            }
        });

        EditBtn.setText("Edit");
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });

        RemoveBtn.setText("Remove");
        RemoveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveBtnActionPerformed(evt);
            }
        });

        QuitBtn.setText("Quit");
        QuitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitBtnActionPerformed(evt);
            }
        });

        Timerbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homework_manager/images/다운로드 (5)_20x20.png"))); // NOI18N
        Timerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimerbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RemoveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(QuitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Timerbtn))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Timerbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Addbtn)
                    .addComponent(EditBtn)
                    .addComponent(RemoveBtn)
                    .addComponent(QuitBtn))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void QuitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitBtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_QuitBtnActionPerformed

    private void TimerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimerbtnActionPerformed
        // TODO add your handling code here:
        TimerSetup timer = new TimerSetup(this, true, model);
        timer.setVisible(true);
        
    }//GEN-LAST:event_TimerbtnActionPerformed

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        // TODO add your handling code here:
        DlgAddEdit dlg = new DlgAddEdit(this, true);
        int selectedIndex = lstTasks.getSelectedIndex();
        if (selectedIndex == -1) {
            return;
        } else {
            String[] values = model.getTaskValues(selectedIndex);            
            dlg.setFieldValues(values);
            dlg.setVisible(true);
            if (!dlg.wascancelled()) {
                values = dlg.getFieldValues();
                model.edit(selectedIndex, values[0], values[1],values[2],values[3],values[4]);
                lstTasks.setListData(model.getTasks());
            }
        }
        
    }//GEN-LAST:event_EditBtnActionPerformed

    private void AddbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddbtnActionPerformed
        // TODO add your handling code here:
        DlgAddEdit dlg = new DlgAddEdit(this, true);
        dlg.setVisible(true);

        if (!dlg.wascancelled()) {
            String[] values = dlg.getFieldValues();
            model.add(values[0], values[1],values[2],values[3],values[4]);
            lstTasks.setListData(model.getTasks());
        }
    }//GEN-LAST:event_AddbtnActionPerformed

    private void RemoveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveBtnActionPerformed
        // TODO add your handling code here:
        int selectedIndex = lstTasks.getSelectedIndex();
        System.out.println(selectedIndex);
        if (selectedIndex != -1) {
            model.remove(selectedIndex);
            lstTasks.setListData(model.getTasks());
        }
    }//GEN-LAST:event_RemoveBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addbtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JButton QuitBtn;
    private javax.swing.JButton RemoveBtn;
    private javax.swing.JButton Timerbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblDeadline;
    private javax.swing.JLabel lblDescriptions;
    private javax.swing.JLabel lblPriority;
    private javax.swing.JLabel lblTask;
    private javax.swing.JList<String> lstTasks;
    private javax.swing.JLabel txtDeadlinelb;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JScrollPane txtDescriptionScroll;
    private javax.swing.JLabel txtDescriptionlb;
    private javax.swing.JLabel txtPrioritylb;
    private javax.swing.JLabel txtTasklb;
    // End of variables declaration//GEN-END:variables
}