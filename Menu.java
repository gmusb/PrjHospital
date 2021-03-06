/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Aluno01
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
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
        BtnAddEnfermeiro = new javax.swing.JToggleButton();
        BtnAddMedico = new javax.swing.JToggleButton();
        BtnCadFuncionario = new javax.swing.JToggleButton();
        BtnCadProntoSocorro = new javax.swing.JToggleButton();
        BtnCadHospital = new javax.swing.JToggleButton();
        BtnCadPaciente = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Menu");

        BtnAddEnfermeiro.setText("Adicionar Enfermeiro");
        BtnAddEnfermeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddEnfermeiroActionPerformed(evt);
            }
        });

        BtnAddMedico.setText("Adicionar Médico");
        BtnAddMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddMedicoActionPerformed(evt);
            }
        });

        BtnCadFuncionario.setText("Cadastrar Funcionário");
        BtnCadFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCadFuncionarioActionPerformed(evt);
            }
        });

        BtnCadProntoSocorro.setText("Cadastrar Pronto Socorro");
        BtnCadProntoSocorro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCadProntoSocorroActionPerformed(evt);
            }
        });

        BtnCadHospital.setText("Cadastrar Hospital");
        BtnCadHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCadHospitalActionPerformed(evt);
            }
        });

        BtnCadPaciente.setText("Cadastar Paciente");
        BtnCadPaciente.setMaximumSize(new java.awt.Dimension(155, 23));
        BtnCadPaciente.setMinimumSize(new java.awt.Dimension(155, 23));
        BtnCadPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCadPacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnAddEnfermeiro)
                            .addComponent(BtnAddMedico)
                            .addComponent(BtnCadFuncionario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnCadHospital)
                            .addComponent(BtnCadProntoSocorro)
                            .addComponent(BtnCadPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnAddEnfermeiro)
                    .addComponent(BtnCadHospital))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnAddMedico)
                        .addGap(65, 65, 65)
                        .addComponent(BtnCadFuncionario))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnCadProntoSocorro)
                        .addGap(65, 65, 65)
                        .addComponent(BtnCadPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAddEnfermeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddEnfermeiroActionPerformed
        AddEnfermeiro AE = new AddEnfermeiro();
        AE.setVisible(true);
    }//GEN-LAST:event_BtnAddEnfermeiroActionPerformed

    private void BtnAddMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddMedicoActionPerformed
        AddMedico Addm = new AddMedico();
        Addm.setVisible(true);
    }//GEN-LAST:event_BtnAddMedicoActionPerformed

    private void BtnCadFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCadFuncionarioActionPerformed
        CadFuncionario CadF = new CadFuncionario();
        CadF.setVisible(true);
    }//GEN-LAST:event_BtnCadFuncionarioActionPerformed

    private void BtnCadHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCadHospitalActionPerformed
        CadHospital CadH = new CadHospital();
        CadH.setVisible(true);
    }//GEN-LAST:event_BtnCadHospitalActionPerformed

    private void BtnCadProntoSocorroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCadProntoSocorroActionPerformed
        CadProntoSocorro CadPS = new CadProntoSocorro();
        CadPS.setVisible(true);
    }//GEN-LAST:event_BtnCadProntoSocorroActionPerformed

    private void BtnCadPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCadPacienteActionPerformed
        CadPaciente CadP = new CadPaciente();
        CadP.setVisible(true);
    }//GEN-LAST:event_BtnCadPacienteActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BtnAddEnfermeiro;
    private javax.swing.JToggleButton BtnAddMedico;
    private javax.swing.JToggleButton BtnCadFuncionario;
    private javax.swing.JToggleButton BtnCadHospital;
    private javax.swing.JToggleButton BtnCadPaciente;
    private javax.swing.JToggleButton BtnCadProntoSocorro;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
