
import DAL.Comment;
import DAL.Spel;
import Services.AdminSpelServices;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author FxA
 */
public class frmStart extends javax.swing.JFrame {

    //tblComments wordt opgebouwd vanuit deze list
    public List<Comment> comments = new ArrayList<>();

    public frmStart() {
        initComponents();
        UpdateList();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTitel = new javax.swing.JTextField();
        txtCounter = new javax.swing.JTextField();
        txtBenodigdheden = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSpelletjes = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        lblMessage = new javax.swing.JLabel();
        btnComments = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblComments = new javax.swing.JTable();
        btnCommentVerwijderen = new javax.swing.JButton();
        lblMessageComments = new javax.swing.JLabel();
        btnOngepasteComments = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPersonenVanaf = new javax.swing.JTextField();
        txtPersonenTot = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtOmschrijving = new javax.swing.JTextArea();
        btnNegeerComment = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Titel:");

        jLabel2.setText("Counter:");

        jLabel3.setText("Benodigdheden");

        tblSpelletjes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Titel", "Counter", "Benodigdheden"
            }
        ));
        tblSpelletjes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSpelletjesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSpelletjes);

        jLabel4.setText("Id");

        txtId.setEnabled(false);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        lblMessage.setForeground(new java.awt.Color(255, 0, 0));
        lblMessage.setText("jLabel5");

        btnComments.setText("View comments");
        btnComments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommentsActionPerformed(evt);
            }
        });

        tblComments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Comment", "Id", "Verwijderen"
            }
        ));
        jScrollPane3.setViewportView(tblComments);

        btnCommentVerwijderen.setText("Comment verwijderen");
        btnCommentVerwijderen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommentVerwijderenActionPerformed(evt);
            }
        });

        lblMessageComments.setForeground(new java.awt.Color(255, 0, 0));
        lblMessageComments.setText("jLabel5");

        btnOngepasteComments.setText("Ongepaste comments");
        btnOngepasteComments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOngepasteCommentsActionPerformed(evt);
            }
        });

        jLabel5.setText("Spelomschrijving:");

        jLabel6.setText("Vanaf");

        jLabel7.setText("Tot");

        txtOmschrijving.setColumns(20);
        txtOmschrijving.setLineWrap(true);
        txtOmschrijving.setRows(5);
        jScrollPane2.setViewportView(txtOmschrijving);

        btnNegeerComment.setText("Reactie negeren");
        btnNegeerComment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNegeerCommentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMessage)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(btnDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnComments))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtBenodigdheden)
                                        .addComponent(txtCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtTitel, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtPersonenVanaf, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPersonenTot, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCommentVerwijderen)
                                .addGap(18, 18, 18)
                                .addComponent(btnOngepasteComments)
                                .addGap(31, 31, 31)
                                .addComponent(btnNegeerComment))
                            .addComponent(lblMessageComments)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTitel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtCounter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtBenodigdheden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtPersonenVanaf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtPersonenTot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnUpdate)
                    .addComponent(btnComments))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMessage)
                    .addComponent(lblMessageComments))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCommentVerwijderen)
                    .addComponent(btnOngepasteComments)
                    .addComponent(btnNegeerComment)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblSpelletjesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSpelletjesMouseClicked
        ViewSelectedSpel();
        ViewComments();
        lblMessage.setText("");
        lblMessageComments.setText("");
    }//GEN-LAST:event_tblSpelletjesMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblSpelletjes.getModel();
        if (tblSpelletjes.getSelectedRow() == -1) {
            if (tblSpelletjes.getRowCount() == 0) {
                lblMessage.setText("Table is empty");
            } else {
                lblMessage.setText("Selecteer een spel");
            }
        } else {
            String spelId = model.getValueAt(tblSpelletjes.getSelectedRow(), 0).toString();
            String spelTitel = model.getValueAt(tblSpelletjes.getSelectedRow(), 1).toString();
            int result = JOptionPane.showConfirmDialog(null, "U staat op het punt om het spel " + spelTitel + " te verwijderen, wilt u doorgaan?", null, JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                //Hier komt de code om een spel te verwijderen
                AdminSpelServices.deleteSpel(spelId);
                UpdateList();
                lblMessage.setText("Het spel is verwijderd");
            }
        }
        emptyTextfields();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        if (tblSpelletjes.getSelectedRow() == -1) {
            if (tblSpelletjes.getRowCount() == 0) {
                lblMessage.setText("Table is empty");
            } else {
                lblMessage.setText("Selecteer een spel");
            }
        } else {
            Spel spel = new Spel();
            spel.setTitel(txtTitel.getText());
            spel.setBenodigdheden(txtBenodigdheden.getText());
            spel.setCounter(Integer.parseInt(txtCounter.getText()));
            spel.setId(Integer.parseInt(txtId.getText()));
            spel.setOmschrijvingSpel(txtOmschrijving.getText());
            spel.setAantalPersonenVanaf(Integer.parseInt(txtPersonenVanaf.getText()));
            spel.setAantalPersonenTot(Integer.parseInt(txtPersonenTot.getText()));
            AdminSpelServices.saveSpel(spel);
        }
        UpdateList();

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCommentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommentsActionPerformed
//        comments.clear();
//
//        DefaultTableModel model = (DefaultTableModel) tblSpelletjes.getModel();
//        if (tblSpelletjes.getSelectedRow() == -1) {
//            if (tblSpelletjes.getRowCount() == 0) {
//                lblMessage.setText("Table is empty");
//            } else {
//                lblMessage.setText("Selecteer een spel");
//            }
//        } else {
//            String spel = model.getValueAt(tblSpelletjes.getSelectedRow(), 3).toString();
//            DefaultTableModel modelComments = (DefaultTableModel) tblComments.getModel();
//            modelComments.setRowCount(0);
//            comments = AdminSpelServices.getAllComments(Integer.parseInt(spel));
//            for (Comment comment : comments) {
//                modelComments.addRow(new Object[]{comment.getComment(), comment.getId(), comment.getReactieVerwijderen()});
//            }
//        }
    }//GEN-LAST:event_btnCommentsActionPerformed

    private void btnCommentVerwijderenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommentVerwijderenActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblComments.getModel();
        if (tblComments.getSelectedRow() == -1) {
            if (tblComments.getRowCount() == 0) {
                lblMessageComments.setText("Table is empty");
            } else {
                lblMessageComments.setText("Selecteer een reactie");
            }
        } else {
            String commentId = model.getValueAt(tblComments.getSelectedRow(), 1).toString();
            int result = JOptionPane.showConfirmDialog(null, "U staat op het punt om geselecteerde comment te verwijderen, wilt u doorgaan?", null, JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                //Hier komt de code om een spel te verwijderen
                AdminSpelServices.deleteComment(Integer.parseInt(commentId));
                showOngepasteComments();
                lblMessageComments.setText("De comment is verwijderd uit de database!");
            }
        }
    }//GEN-LAST:event_btnCommentVerwijderenActionPerformed

    private void btnOngepasteCommentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOngepasteCommentsActionPerformed
        showOngepasteComments();
    }//GEN-LAST:event_btnOngepasteCommentsActionPerformed

    private void btnNegeerCommentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNegeerCommentActionPerformed

        if (tblComments.getSelectedColumn() == -1) {
            if (tblComments.getRowCount() == 0) {
                lblMessageComments.setText("Table is empty");
            } else {
                lblMessageComments.setText("Selecteer een comment");
            }
        } else {
            comments.clear();
            DefaultTableModel modelComments = (DefaultTableModel) tblComments.getModel();
            String commentId = modelComments.getValueAt(tblComments.getSelectedRow(), 1).toString();
            modelComments.setRowCount(0);
            AdminSpelServices.negeerOngepasteReactie(Integer.parseInt(commentId));

            comments = AdminSpelServices.getOngepasteReacties();
            int aantal = comments.size();
            if (aantal <= 0) {
                lblMessageComments.setText("Er zijn geen ongepaste reacties");
                btnOngepasteComments.setBackground(null);
            } else {
                for (Comment comment : comments) {
                    modelComments.addRow(new Object[]{comment.getComment(), comment.getId(), comment.getReactieVerwijderen()});
                }
            }
            lblMessageComments.setText("Reactie uit ongepaste lijst gewist!");
        }
    }//GEN-LAST:event_btnNegeerCommentActionPerformed

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
            java.util.logging.Logger.getLogger(frmStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmStart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCommentVerwijderen;
    private javax.swing.JButton btnComments;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNegeerComment;
    private javax.swing.JButton btnOngepasteComments;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblMessageComments;
    private javax.swing.JTable tblComments;
    private javax.swing.JTable tblSpelletjes;
    private javax.swing.JTextField txtBenodigdheden;
    private javax.swing.JTextField txtCounter;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextArea txtOmschrijving;
    private javax.swing.JTextField txtPersonenTot;
    private javax.swing.JTextField txtPersonenVanaf;
    private javax.swing.JTextField txtTitel;
    // End of variables declaration//GEN-END:variables

    private void UpdateList() {
        comments.clear();
        comments = AdminSpelServices.getOngepasteReacties();
        int aantal = comments.size();

        if (aantal == 1) {
            lblMessageComments.setText("Er is " + aantal + " ongepaste reactie die u dient te negeren, of verwijderen!");
            btnOngepasteComments.setBackground(Color.red);

        } else if (aantal >= 2) {
            lblMessageComments.setText("Er zijn " + aantal + " ongepaste reacties die u dient te negeren, of verwijderen!");
            btnOngepasteComments.setBackground(Color.red);

        } else {
            lblMessageComments.setText("");
            btnOngepasteComments.setBackground(null);
        }

        comments.clear();
        lblMessage.setText("");

        DefaultTableModel model = (DefaultTableModel) tblSpelletjes.getModel();
        model.setRowCount(0);
        for (Spel spel : AdminSpelServices.getAllSpelletjes()) {
            model.addRow(new Object[]{spel.getId(), spel.getTitel(), spel.getCounter(), spel.getBenodigdheden()});
        }
    }

    private void ViewComments() {
        lblMessageComments.setText("");
        comments.clear();

        DefaultTableModel model = (DefaultTableModel) tblSpelletjes.getModel();

        if (tblSpelletjes.getSelectedRow() == -1) {
            if (tblSpelletjes.getRowCount() == 0) {
                lblMessage.setText("Table is empty");
            } else {
                lblMessage.setText("Selecteer een spel");
            }
        } else {
            String spel = model.getValueAt(tblSpelletjes.getSelectedRow(), 0).toString();
            DefaultTableModel modelComments = (DefaultTableModel) tblComments.getModel();
            modelComments.setRowCount(0);
            comments = AdminSpelServices.getAllComments(Integer.parseInt(spel));
            for (Comment comment : comments) {
                modelComments.addRow(new Object[]{comment.getComment(), comment.getId(), comment.getReactieVerwijderen()});
            }
        }
    }

    private void ViewSelectedSpel() {
        DefaultTableModel model2 = (DefaultTableModel) tblSpelletjes.getModel();
        txtId.setText(model2.getValueAt(tblSpelletjes.getSelectedRow(), 0).toString());
        txtTitel.setText(model2.getValueAt(tblSpelletjes.getSelectedRow(), 1).toString());
        txtCounter.setText(model2.getValueAt(tblSpelletjes.getSelectedRow(), 2).toString());
        txtBenodigdheden.setText(model2.getValueAt(tblSpelletjes.getSelectedRow(), 3).toString());
        int getSpelId = Integer.parseInt(model2.getValueAt(tblSpelletjes.getSelectedRow(), 0).toString());
        for (Spel spel : AdminSpelServices.getAllSpelletjes()) {
            if (spel.getId() == getSpelId) {
                txtOmschrijving.setText(spel.getOmschrijvingSpel());
                txtPersonenVanaf.setText("" + spel.getAantalPersonenVanaf());
                txtPersonenTot.setText("" + spel.getAantalPersonenTot());
            }
        }
    }

    private void emptyTextfields() {
        txtBenodigdheden.setText("");
        txtCounter.setText("");
        txtId.setText("");
        txtOmschrijving.setText("");
        txtPersonenTot.setText("");
        txtPersonenVanaf.setText("");
        txtTitel.setText("");
    }
    
    private void showOngepasteComments(){
        comments.clear();
        lblMessageComments.setText("Deze reacties zijn als ongepast aangegeven");

        DefaultTableModel modelComments = (DefaultTableModel) tblComments.getModel();
        modelComments.setRowCount(0);
        comments = AdminSpelServices.getOngepasteReacties();
        int aantal = comments.size();
        if (aantal == 0) {
            lblMessageComments.setText("Er zijn geen ongepaste reacties");
            btnOngepasteComments.setBackground(null);
        } else {
            for (Comment comment : comments) {
                modelComments.addRow(new Object[]{comment.getComment(), comment.getId(), comment.getReactieVerwijderen()});
            }
        }
    }
}
