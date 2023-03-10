package Telas;

import static Aplicação.ProjetoPOO.merceeiros;
import Classes.Merceeiro;
import javax.swing.JOptionPane;


public class LoginMerceeiro extends javax.swing.JFrame {


    public LoginMerceeiro() {
        initComponents();
        
        tOcultar.setVisible(false);
    }
    
    public void loginM(String email,String senha)
    {        
        
        Merceeiro m = pesquisarM(email);
            if(m == null){
                JOptionPane.showMessageDialog(null,"Email inexistente");
         }else{
              if(m.getSenha().equals(senha)){
                   JOptionPane.showMessageDialog(null,"Seja bem vindo "+m.getRazao_Social());
                   new PainelMerceeiro().setVisible(true);
                   this.dispose();
           }else{
              JOptionPane.showMessageDialog(null,"Senha incorreta.");
           }
        }
    }
    
    public static Merceeiro pesquisarM(String email)
    {
     
    Merceeiro m = null;
        
        for(Merceeiro c: merceeiros)
        {
            if(c.getEmail().equals(email))
            {
                m = c;
            }
        }
        return m;
    }
    
    
    
    public static void RecuperarSenhaM(String email)
    {               
        
        for(Merceeiro senha: merceeiros)
        {
            
            if(senha.getEmail().equals(email))
            {
            JOptionPane.showMessageDialog(null,"Senha informada no momento do cadastro: "+senha.getSenha());            
            }
        }            
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jSenha = new javax.swing.JPasswordField();
        jMail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bMenu = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        bEntrar = new javax.swing.JButton();
        jredefinir = new javax.swing.JLabel();
        jcadastrese = new javax.swing.JLabel();
        tOcultar = new javax.swing.JLabel();
        tMostrar = new javax.swing.JLabel();
        titulo1 = new javax.swing.JLabel();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login - Projeto POO");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Painel A");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, -1, -1));
        getContentPane().add(jSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 373, 247, -1));
        getContentPane().add(jMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 288, 247, -1));

        jLabel2.setText("Email:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 260, -1, -1));

        jLabel3.setText("Senha:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 339, -1, -1));

        bMenu.setText("Menu");
        bMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMenuActionPerformed(evt);
            }
        });
        getContentPane().add(bMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

        jButton2.setText("Painel M");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bEntrar.setText("Entrar");
        bEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(bEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 311, -1, -1));

        jredefinir.setText("esqueceu sua senha? redefinir");
        jredefinir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jredefinir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jredefinirMouseClicked(evt);
            }
        });
        jPanel1.add(jredefinir, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 252, -1, -1));

        jcadastrese.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 16)); // NOI18N
        jcadastrese.setForeground(new java.awt.Color(0, 153, 153));
        jcadastrese.setText("Não tem um conta? Cadastre-se");
        jcadastrese.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jcadastrese.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcadastreseMouseClicked(evt);
            }
        });
        jPanel1.add(jcadastrese, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 433, -1, -1));

        tOcultar.setText("Ocultar");
        tOcultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tOcultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tOcultarMouseClicked(evt);
            }
        });
        jPanel1.add(tOcultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, -1, -1));

        tMostrar.setText("Mostrar");
        tMostrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tMostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tMostrarMouseClicked(evt);
            }
        });
        jPanel1.add(tMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 230, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 440, 500));

        titulo1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 36)); // NOI18N
        titulo1.setForeground(new java.awt.Color(255, 255, 255));
        titulo1.setText("Login Merceeiro");
        getContentPane().add(titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        fundo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundo0.png"))); // NOI18N
        getContentPane().add(fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 730));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new PainelAgro().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMenuActionPerformed
        new MenuInicial().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bMenuActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new PainelMerceeiro().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jcadastreseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcadastreseMouseClicked
        new CadastroMerceeiro().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jcadastreseMouseClicked

    private void jredefinirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jredefinirMouseClicked
        RecuperarSenhaM(jMail.getText());
    }//GEN-LAST:event_jredefinirMouseClicked

    private void bEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEntrarActionPerformed
        loginM(jMail.getText(),jSenha.getText());
    }//GEN-LAST:event_bEntrarActionPerformed

    private void tOcultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tOcultarMouseClicked
        jSenha.setEchoChar('•');
        tOcultar.setVisible(false);
        tMostrar.setVisible(true);

    }//GEN-LAST:event_tOcultarMouseClicked

    private void tMostrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tMostrarMouseClicked
        jSenha.setEchoChar((char)0);
        tMostrar.setVisible(false);
        tOcultar.setVisible(true);
    }//GEN-LAST:event_tMostrarMouseClicked

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
            java.util.logging.Logger.getLogger(LoginMerceeiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginMerceeiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginMerceeiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginMerceeiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginMerceeiro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bEntrar;
    private javax.swing.JButton bMenu;
    private javax.swing.JLabel fundo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jMail;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jSenha;
    private javax.swing.JLabel jcadastrese;
    private javax.swing.JLabel jredefinir;
    private javax.swing.JLabel tMostrar;
    private javax.swing.JLabel tOcultar;
    private javax.swing.JLabel titulo1;
    // End of variables declaration//GEN-END:variables
}
