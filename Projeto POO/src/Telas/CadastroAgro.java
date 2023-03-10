package Telas;

import Aplicação.ProjetoPOO;
import Classes.Agropecuario;
import javax.swing.JOptionPane;


public class CadastroAgro extends javax.swing.JFrame {
    

    public CadastroAgro() {
        initComponents();
    }
    
        private void cadastrartAP() {
            
            
            Agropecuario tAP;
            
           tAP = new Agropecuario();
           tAP.setRazao_Social(tRS.getText());
           tAP.setCNPJ(tCNPJ.getText());
           tAP.setAtividade(tAT.getText());
           tAP.setNomeAP(tNome.getText());
           tAP.setEndereço(tEnd.getText());
           tAP.setTelefone(tTel.getText());
           tAP.setEmail(tMail.getText());
           tAP.setSenha(tSenha.getText());
           
            ProjetoPOO.agropecuarios.add(tAP);
           
           /*
           int linha = DAO.inserir(APInserido);
        if (linha > 0) {*/
            JOptionPane.showMessageDialog(this, "Cadastro efetuado com sucesso. Entre em sua conta.");
        /*} else {
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar.");
        }*/
        
        new LoginAgro().setVisible(true);
        this.dispose();
        }
        
        
    /*private void termos() {
        JOptionPane.showMessageDialog(null,"Blabla                               "
                + "\n\nAo utilizar nosso aplicativo você está de acordo com tudo aqui escrito e não escrito");
    }*/
    
    
    private void politica() {
        JOptionPane.showMessageDialog(null,"É política do ProjetoPOO respeitar a sua privacidade em relação a qualquer informação sua"
                + "\nque possamos coletar no programa Projeto POO, e outros programas que possuímos e operamos.\n"
                + "\nSolicitamos informações pessoais apenas quando realmente precisamos delas para lhe fornecer um serviço."
                + "\nFazemo-lo por meios justos e legais, com o seu conhecimento e consentimento."
                + "\nTambém informamos por que estamos coletando e como será usado.\n" 
                + "\nApenas retemos as informações coletadas pelo tempo necessário para fornecer o serviço solicitado."
                + "\nQuando armazenamos dados, protegemos dentro de meios comercialmente aceitáveis ​​para"
                + "\nevitar perdas e roubos, bem como acesso, divulgação, cópia, uso ou modificação não autorizados.\n"
                + "\nNão compartilhamos informações de identificação pessoal publicamente"
                + "\nou com terceiros, exceto quando exigido por lei.\n"
                + "\n\nVocê é livre para recusar a nossa solicitação de informações pessoais,"
                + "\nentendendo que talvez não possamos fornecer alguns dos serviços desejados.\n"
                + "\nO uso continuado de nosso programa será considerado como aceitação de nossas práticas"
                + "\nem torno de privacidade e informações pessoais. Se você tiver alguma dúvida"
                + "\nsobre como lidamos com dados do usuário e informações pessoais, entre em contato conosco."
                + "\n\nEsta política é efetiva a partir de Março/2023.");
        }
      
                
    
    private void cancelar() {
        Object[] opcao = {"Sim", "Não"};
        int opcaoSelecionada = JOptionPane.showOptionDialog(this, "Deseja realmente voltar ao menu principal?\n(todos os dados preenchidos serão perdidos)", "Aviso",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, opcao, opcao[0]);
        if (opcaoSelecionada == 0) {            
            new MenuInicial().setVisible(true);
            this.dispose();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bCancelar = new javax.swing.JButton();
        bCancelar1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        tEntrar = new javax.swing.JLabel();
        bCadastrar = new javax.swing.JButton();
        tPolitica = new javax.swing.JLabel();
        tTermos = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tRS = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tNome = new javax.swing.JTextField();
        tAT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tMail = new javax.swing.JTextField();
        tEnd = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tSenha = new javax.swing.JPasswordField();
        tCNPJ = new javax.swing.JFormattedTextField();
        tTel = new javax.swing.JFormattedTextField();
        titulocadastro1 = new javax.swing.JLabel();
        fundo = new javax.swing.JLabel();

        bCancelar.setText("Cancelar");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Projeto POO");
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bCancelar1.setText("Voltar");
        bCancelar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelar1ActionPerformed(evt);
            }
        });
        getContentPane().add(bCancelar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 620, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setText("Já possui uma conta?");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 170, -1, 20));

        tEntrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tEntrar.setText("Entrar");
        tEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tEntrarMouseClicked(evt);
            }
        });
        getContentPane().add(tEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 190, -1, 20));

        bCadastrar.setText("Cadastrar");
        bCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(bCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 620, -1, -1));

        tPolitica.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tPolitica.setText("e Política de Privacidade.");
        tPolitica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tPolitica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tPoliticaMouseClicked(evt);
            }
        });
        getContentPane().add(tPolitica, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 610, 180, 20));

        tTermos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tTermos.setText("Termos");
        tTermos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tTermos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tTermosMouseClicked(evt);
            }
        });
        getContentPane().add(tTermos, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 610, -1, 20));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("Ao clicar em Cadastrar, você concorda com nossos");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 610, -1, 20));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Razão Social");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, -1, -1));

        tRS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tRSActionPerformed(evt);
            }
        });
        getContentPane().add(tRS, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 452, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("CNPJ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Atividade");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Nome");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, -1, -1));

        tNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNomeActionPerformed(evt);
            }
        });
        getContentPane().add(tNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, 452, -1));

        tAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tATActionPerformed(evt);
            }
        });
        getContentPane().add(tAT, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 452, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("E-mail");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 530, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Senha");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 560, -1, -1));

        tMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tMailActionPerformed(evt);
            }
        });
        getContentPane().add(tMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 530, 452, -1));

        tEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tEndActionPerformed(evt);
            }
        });
        getContentPane().add(tEnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, 452, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Endereço");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("Telefone");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Dados Cadastrais");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Dados de Acesso");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 480, -1, -1));
        getContentPane().add(tSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 560, 452, -1));

        try {
            tCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(tCNPJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 452, -1));

        try {
            tTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(tTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 452, -1));

        titulocadastro1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 36)); // NOI18N
        titulocadastro1.setForeground(new java.awt.Color(255, 255, 255));
        titulocadastro1.setText("Cadastro Agropecuário");
        getContentPane().add(titulocadastro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundo3m.png"))); // NOI18N
        getContentPane().add(fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCadastrarActionPerformed
        cadastrartAP();
    }//GEN-LAST:event_bCadastrarActionPerformed

    private void bCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelar1ActionPerformed
        cancelar();
    }//GEN-LAST:event_bCancelar1ActionPerformed

    private void tRSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tRSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tRSActionPerformed

    private void tNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNomeActionPerformed

    private void tATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tATActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tATActionPerformed

    private void tMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tMailActionPerformed

    private void tEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tEndActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tEndActionPerformed

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
     
    }//GEN-LAST:event_formMouseReleased

    private void tTermosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tTermosMouseClicked
        politica();
    }//GEN-LAST:event_tTermosMouseClicked

    private void tPoliticaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tPoliticaMouseClicked
        politica();
    }//GEN-LAST:event_tPoliticaMouseClicked

    private void tEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tEntrarMouseClicked
        new LoginAgro().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tEntrarMouseClicked

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
            java.util.logging.Logger.getLogger(CadastroAgro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroAgro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroAgro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroAgro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroAgro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCadastrar;
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bCancelar1;
    private javax.swing.JLabel fundo;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField tAT;
    private javax.swing.JFormattedTextField tCNPJ;
    private javax.swing.JTextField tEnd;
    private javax.swing.JLabel tEntrar;
    private javax.swing.JTextField tMail;
    private javax.swing.JTextField tNome;
    private javax.swing.JLabel tPolitica;
    private javax.swing.JTextField tRS;
    private javax.swing.JPasswordField tSenha;
    private javax.swing.JFormattedTextField tTel;
    private javax.swing.JLabel tTermos;
    private javax.swing.JLabel titulocadastro1;
    // End of variables declaration//GEN-END:variables
}
