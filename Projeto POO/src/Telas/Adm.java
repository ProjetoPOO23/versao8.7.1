package Telas;

import Aplicação.ProjetoPOO;
import Classes.Agropecuario;
import Classes.Merceeiro;
import Classes.Produto;
import javax.swing.table.DefaultTableModel;


public class Adm extends javax.swing.JFrame {
    
     private final DefaultTableModel modelo;
     private final DefaultTableModel modelo2;

    public Adm() {
        initComponents();
        modelo = (DefaultTableModel) jTab.getModel();
        modelo.addColumn("CNPJ");
        modelo.addColumn("RS");
        modelo.addColumn("Atividade");
        modelo.addColumn("Nome");
        modelo.addColumn("Endereco");
        modelo.addColumn("Telefone");
        modelo.addColumn("Email");
        modelo.addColumn("Senha");
        
        modelo2 = (DefaultTableModel) jProdd.getModel();
        modelo2.addColumn("Nome");
        modelo2.addColumn("Categoria");
        modelo2.addColumn("Valor");
        modelo2.addColumn("Quantidade");
        
        
        PainelUsers.setVisible(true);
        PainelProdutos.setVisible(false);
    }
    
    private void Menu() {
            new MenuInicial().setVisible(true);
            this.dispose();
        
    }
    
    
    
    @SuppressWarnings("empty-statement")
    
     private void agroT() {
            for (Agropecuario a: ProjetoPOO.agropecuarios) {
                modelo.addRow(new Object[]{a.getCNPJ(), a.getAtividade(), a.getRazao_Social(),
                    a.getNomeAP(), a.getEndereço(), a.getTelefone(), a.getEmail(), a.getSenha()});
             };        
                     
    }
     
     @SuppressWarnings("empty-statement")
     private void mT() {
            for (Merceeiro m: ProjetoPOO.merceeiros) {
                modelo.addRow(new Object[]{m.getCNPJ(), m.getRazao_Social(),
                    m.getNomeM(), m.getEndereço(), m.getTelefone(), m.getEmail(), m.getSenha()});
             };        
                     
    }
     
     @SuppressWarnings("empty-statement")
     private void prodT() {
            for (Produto PD: ProjetoPOO.produtos) {
                modelo2.addRow(new Object[]{PD.getNomePD(), PD.getCategoria(), PD.getValor(), PD.getQuant()});
             };        
                     
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jProd = new javax.swing.JTable();
        bDeslogar = new javax.swing.JButton();
        bMenu = new javax.swing.JButton();
        bM = new javax.swing.JButton();
        bA = new javax.swing.JButton();
        bP = new javax.swing.JButton();
        PainelProdutos = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jProdd = new javax.swing.JTable();
        PainelUsers = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTab = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bLimpar = new javax.swing.JButton();
        fundoinicial = new javax.swing.JLabel();

        jProd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jProd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jProdFocusGained(evt);
            }
        });
        jScrollPane3.setViewportView(jProd);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Projeto POO - Experimente");
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bDeslogar.setBackground(new java.awt.Color(204, 0, 0));
        bDeslogar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        bDeslogar.setForeground(new java.awt.Color(255, 255, 255));
        bDeslogar.setText("Deslogar");
        bDeslogar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bDeslogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeslogarActionPerformed(evt);
            }
        });
        getContentPane().add(bDeslogar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1167, 24, -1, -1));

        bMenu.setText("Menu");
        bMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMenuActionPerformed(evt);
            }
        });
        getContentPane().add(bMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        bM.setText("Gerar Merceeiros");
        bM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMActionPerformed(evt);
            }
        });
        getContentPane().add(bM, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        bA.setText("Gerar Agro");
        bA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAActionPerformed(evt);
            }
        });
        getContentPane().add(bA, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        bP.setText("Gerar Produtos");
        bP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPActionPerformed(evt);
            }
        });
        getContentPane().add(bP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        jProdd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jProdd);

        javax.swing.GroupLayout PainelProdutosLayout = new javax.swing.GroupLayout(PainelProdutos);
        PainelProdutos.setLayout(PainelProdutosLayout);
        PainelProdutosLayout.setHorizontalGroup(
            PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 940, Short.MAX_VALUE)
        );
        PainelProdutosLayout.setVerticalGroup(
            PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );

        getContentPane().add(PainelProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 940, 350));

        jTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTab);

        javax.swing.GroupLayout PainelUsersLayout = new javax.swing.GroupLayout(PainelUsers);
        PainelUsers.setLayout(PainelUsersLayout);
        PainelUsersLayout.setHorizontalGroup(
            PainelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 940, Short.MAX_VALUE)
        );
        PainelUsersLayout.setVerticalGroup(
            PainelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );

        getContentPane().add(PainelUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 940, 350));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("ADM");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 150, 90));

        jLabel6.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 20)); // NOI18N
        jLabel6.setText("Produtos cadastrados:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 20)); // NOI18N
        jLabel5.setText("Status:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, -1, -1));

        jLabel7.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 20)); // NOI18N
        jLabel7.setText("Agros cadastrados:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 20)); // NOI18N
        jLabel4.setText("Merceeiros cadastrados:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, -1, -1));

        bLimpar.setText("Limpar");
        bLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLimparActionPerformed(evt);
            }
        });
        getContentPane().add(bLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, -1, -1));

        fundoinicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundo1.png"))); // NOI18N
        getContentPane().add(fundoinicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMenuActionPerformed
        Menu();
    }//GEN-LAST:event_bMenuActionPerformed

    private void bAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAActionPerformed
    PainelUsers.setVisible(true);
    PainelProdutos.setVisible(false);
    agroT();
    }//GEN-LAST:event_bAActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
    agroT();
    }//GEN-LAST:event_formWindowGainedFocus

    private void bMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMActionPerformed
        PainelUsers.setVisible(true);
        PainelProdutos.setVisible(false);
        mT();
    }//GEN-LAST:event_bMActionPerformed

    private void bLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimparActionPerformed
        ((DefaultTableModel) jTab. getModel()). setRowCount(0);
        ((DefaultTableModel) jProdd. getModel()). setRowCount(0);
    }//GEN-LAST:event_bLimparActionPerformed

    private void bDeslogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeslogarActionPerformed
        Menu();
    }//GEN-LAST:event_bDeslogarActionPerformed

    private void bPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPActionPerformed
        PainelUsers.setVisible(false);
        PainelProdutos.setVisible(true);
        prodT();
    }//GEN-LAST:event_bPActionPerformed

    private void jProdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jProdFocusGained
        prodT();
    }//GEN-LAST:event_jProdFocusGained

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
            java.util.logging.Logger.getLogger(Adm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Adm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Adm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Adm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Adm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelProdutos;
    private javax.swing.JPanel PainelUsers;
    private javax.swing.JButton bA;
    private javax.swing.JButton bDeslogar;
    private javax.swing.JButton bLimpar;
    private javax.swing.JButton bM;
    private javax.swing.JButton bMenu;
    private javax.swing.JButton bP;
    private javax.swing.JLabel fundoinicial;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTable jProd;
    private javax.swing.JTable jProdd;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTab;
    // End of variables declaration//GEN-END:variables
}
