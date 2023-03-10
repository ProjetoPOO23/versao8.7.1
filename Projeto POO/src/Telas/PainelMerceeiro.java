package Telas;

import Aplicação.ProjetoPOO;
import Classes.Produto;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class PainelMerceeiro extends javax.swing.JFrame {

    
        private final DefaultTableModel modelo;

    public PainelMerceeiro() {
        initComponents();
        
        PainelPrincipal.setVisible(true);
        PainelCompra.setVisible(false);
        MinhaConta.setVisible(false);
        Ajuda.setVisible(false);
                
        modelo = (DefaultTableModel) jProd.getModel();
        modelo.addColumn("Nome");
        modelo.addColumn("Categoria");
        modelo.addColumn("Valor");
        modelo.addColumn("Quantidade");

    }
    
    
        @SuppressWarnings("empty-statement")
    private void prodT() {
            for (Produto PD: ProjetoPOO.produtos) {
                modelo.addRow(new Object[]{PD.getNomePD(), PD.getCategoria(), PD.getValor(), PD.getQuant()});
             };                      
    }
    
    
    private void Menu() {
        new MenuInicial().setVisible(true);
        this.dispose();
        JOptionPane.showMessageDialog(null,"Sessao encerrada com sucesso.");           
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bDeslogar = new javax.swing.JButton();
        PainelPrincipal = new javax.swing.JPanel();
        MinhaConta = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        bExcluirConta = new javax.swing.JButton();
        tSenha = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tMail = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tTel = new javax.swing.JFormattedTextField();
        tEnd = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        tNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tRS = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        bAlterar = new javax.swing.JButton();
        fundo1 = new javax.swing.JLabel();
        Ajuda = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        fundo2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        bSair = new javax.swing.JButton();
        tMerceeiro = new javax.swing.JLabel();
        bComprar = new javax.swing.JButton();
        bResumo = new javax.swing.JButton();
        bMinhaConta = new javax.swing.JButton();
        bAjuda = new javax.swing.JButton();
        fundoP = new javax.swing.JLabel();
        PainelCompra = new javax.swing.JPanel();
        bResumo1 = new javax.swing.JButton();
        bGerar1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jProd = new javax.swing.JTable();
        bLimpar = new javax.swing.JButton();
        tSaldo = new javax.swing.JLabel();
        fundocompra = new javax.swing.JLabel();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Painel - Projeto POO");
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
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

        PainelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MinhaConta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        jLabel9.setText("Excluir conta");
        MinhaConta.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 580, 134, -1));

        bExcluirConta.setText("Excluir");
        bExcluirConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExcluirContaActionPerformed(evt);
            }
        });
        MinhaConta.add(bExcluirConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 590, -1, -1));
        MinhaConta.add(tSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, 452, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Senha");
        MinhaConta.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setText("E-mail");
        MinhaConta.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, -1, -1));

        tMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tMailActionPerformed(evt);
            }
        });
        MinhaConta.add(tMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 452, -1));

        jLabel13.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        jLabel13.setText("Dados de Acesso");
        MinhaConta.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, -1, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setText("Endereço");
        MinhaConta.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, -1, -1));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setText("Telefone");
        MinhaConta.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, -1));

        try {
            tTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        MinhaConta.add(tTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 452, -1));

        tEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tEndActionPerformed(evt);
            }
        });
        MinhaConta.add(tEnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 452, -1));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel16.setText("Nome");
        MinhaConta.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, -1, -1));

        tNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNomeActionPerformed(evt);
            }
        });
        MinhaConta.add(tNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 452, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Razão Social");
        MinhaConta.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, -1));

        tRS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tRSActionPerformed(evt);
            }
        });
        MinhaConta.add(tRS, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 452, -1));

        jLabel17.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        jLabel17.setText("Dados Cadastrais");
        MinhaConta.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, -1));

        bAlterar.setText("Alterar");
        bAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAlterarActionPerformed(evt);
            }
        });
        MinhaConta.add(bAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 570, -1, -1));

        fundo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundo3s.png"))); // NOI18N
        MinhaConta.add(fundo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 720));

        PainelPrincipal.add(MinhaConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 970, 710));

        jLabel10.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 24)); // NOI18N
        jLabel10.setText("Ajuda");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Para maiores informações/eventuais ajuda mande 0.50 BTC para endereço ox65bf28saj124521hudc1238vur4x233b7");

        fundo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundo3s.png"))); // NOI18N

        javax.swing.GroupLayout AjudaLayout = new javax.swing.GroupLayout(Ajuda);
        Ajuda.setLayout(AjudaLayout);
        AjudaLayout.setHorizontalGroup(
            AjudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AjudaLayout.createSequentialGroup()
                .addGroup(AjudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AjudaLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AjudaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 945, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(AjudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(AjudaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(fundo2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        AjudaLayout.setVerticalGroup(
            AjudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AjudaLayout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(242, Short.MAX_VALUE))
            .addGroup(AjudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(AjudaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(fundo2, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        PainelPrincipal.add(Ajuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 970, 710));

        jLabel6.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 20)); // NOI18N
        jLabel6.setText("Produtos comprados:");
        PainelPrincipal.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 20)); // NOI18N
        jLabel5.setText("Histórico de compra:");
        PainelPrincipal.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, -1, -1));

        jLabel4.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 20)); // NOI18N
        jLabel4.setText("Ultima compra:");
        PainelPrincipal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, -1, -1));

        jLabel7.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 20)); // NOI18N
        jLabel7.setText("Saldo:");
        PainelPrincipal.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, -1, -1));

        bSair.setBackground(new java.awt.Color(0, 153, 153));
        bSair.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        bSair.setForeground(new java.awt.Color(255, 255, 255));
        bSair.setText("Sair");
        bSair.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSairActionPerformed(evt);
            }
        });
        PainelPrincipal.add(bSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 240, 60));

        tMerceeiro.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tMerceeiro.setText("MERCEEIRO");
        PainelPrincipal.add(tMerceeiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 240, 90));

        bComprar.setBackground(new java.awt.Color(0, 153, 153));
        bComprar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        bComprar.setForeground(new java.awt.Color(255, 255, 255));
        bComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3s.png"))); // NOI18N
        bComprar.setText("Comprar");
        bComprar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bComprarActionPerformed(evt);
            }
        });
        PainelPrincipal.add(bComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 240, 60));

        bResumo.setBackground(new java.awt.Color(0, 153, 153));
        bResumo.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        bResumo.setForeground(new java.awt.Color(255, 255, 255));
        bResumo.setText("Resumo");
        bResumo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bResumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bResumoActionPerformed(evt);
            }
        });
        PainelPrincipal.add(bResumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 240, 60));

        bMinhaConta.setBackground(new java.awt.Color(0, 153, 153));
        bMinhaConta.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        bMinhaConta.setForeground(new java.awt.Color(255, 255, 255));
        bMinhaConta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2s.png"))); // NOI18N
        bMinhaConta.setText(" Minha conta");
        bMinhaConta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bMinhaConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMinhaContaActionPerformed(evt);
            }
        });
        PainelPrincipal.add(bMinhaConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 240, 60));

        bAjuda.setBackground(new java.awt.Color(0, 153, 153));
        bAjuda.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        bAjuda.setForeground(new java.awt.Color(255, 255, 255));
        bAjuda.setText("Ajuda");
        bAjuda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAjudaActionPerformed(evt);
            }
        });
        PainelPrincipal.add(bAjuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 240, 60));

        fundoP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundo1.png"))); // NOI18N
        PainelPrincipal.add(fundoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 720));

        getContentPane().add(PainelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        PainelCompra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bResumo1.setBackground(new java.awt.Color(0, 153, 153));
        bResumo1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        bResumo1.setForeground(new java.awt.Color(255, 255, 255));
        bResumo1.setText("Resumo");
        bResumo1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bResumo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bResumo1ActionPerformed(evt);
            }
        });
        PainelCompra.add(bResumo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 240, 240, 60));

        bGerar1.setText("Atualizar");
        bGerar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bGerar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGerar1ActionPerformed(evt);
            }
        });
        PainelCompra.add(bGerar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Produtos disponiveis:");
        PainelCompra.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

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

        PainelCompra.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 670, 520));

        bLimpar.setText("Limpar");
        bLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLimparActionPerformed(evt);
            }
        });
        PainelCompra.add(bLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));

        tSaldo.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        tSaldo.setForeground(new java.awt.Color(255, 255, 255));
        tSaldo.setText("Meu saldo: R$");
        PainelCompra.add(tSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 160, -1, -1));

        fundocompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundo2.png"))); // NOI18N
        fundocompra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fundocompraFocusGained(evt);
            }
        });
        PainelCompra.add(fundocompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(PainelCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 740));

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundo0.png"))); // NOI18N
        getContentPane().add(fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bDeslogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeslogarActionPerformed
        Menu();
    }//GEN-LAST:event_bDeslogarActionPerformed

    private void bSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSairActionPerformed
        Menu();
    }//GEN-LAST:event_bSairActionPerformed

    private void bComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bComprarActionPerformed
        PainelCompra.setVisible(true);
        PainelPrincipal.setVisible(false);
        MinhaConta.setVisible(false);
        Ajuda.setVisible(false);
    }//GEN-LAST:event_bComprarActionPerformed

    private void bResumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResumoActionPerformed
        PainelPrincipal.setVisible(true);
        PainelCompra.setVisible(false);
        MinhaConta.setVisible(false);
        Ajuda.setVisible(false);
    }//GEN-LAST:event_bResumoActionPerformed

    private void bMinhaContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMinhaContaActionPerformed
        MinhaConta.setVisible(true);
        PainelPrincipal.setVisible(true);
        PainelCompra.setVisible(false);
        Ajuda.setVisible(false);
    }//GEN-LAST:event_bMinhaContaActionPerformed

    private void bAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAjudaActionPerformed
        PainelPrincipal.setVisible(true);
        Ajuda.setVisible(true);
        MinhaConta.setVisible(false);
        PainelCompra.setVisible(false);
    }//GEN-LAST:event_bAjudaActionPerformed

    private void bResumo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResumo1ActionPerformed
        PainelPrincipal.setVisible(true);
        PainelCompra.setVisible(false);
        MinhaConta.setVisible(false);
        Ajuda.setVisible(false);
    }//GEN-LAST:event_bResumo1ActionPerformed

    private void bGerar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGerar1ActionPerformed
        prodT();
    }//GEN-LAST:event_bGerar1ActionPerformed

    private void bExcluirContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExcluirContaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bExcluirContaActionPerformed

    private void fundocompraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fundocompraFocusGained
// TODO add your handling code here:
    }//GEN-LAST:event_fundocompraFocusGained

    private void jProdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jProdFocusGained
        prodT();
    }//GEN-LAST:event_jProdFocusGained

    private void bLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimparActionPerformed
        ((DefaultTableModel) jProd. getModel()). setRowCount(0);
    }//GEN-LAST:event_bLimparActionPerformed

    private void tMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tMailActionPerformed

    private void tEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tEndActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tEndActionPerformed

    private void tNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNomeActionPerformed

    private void tRSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tRSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tRSActionPerformed

    private void bAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAlterarActionPerformed
        
        // TODO add your handling code here:
    }//GEN-LAST:event_bAlterarActionPerformed

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
            java.util.logging.Logger.getLogger(PainelMerceeiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PainelMerceeiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PainelMerceeiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PainelMerceeiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PainelMerceeiro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Ajuda;
    private javax.swing.JPanel MinhaConta;
    private javax.swing.JPanel PainelCompra;
    private javax.swing.JPanel PainelPrincipal;
    private javax.swing.JButton bAjuda;
    private javax.swing.JButton bAlterar;
    private javax.swing.JButton bComprar;
    private javax.swing.JButton bDeslogar;
    private javax.swing.JButton bExcluirConta;
    private javax.swing.JButton bGerar1;
    private javax.swing.JButton bLimpar;
    private javax.swing.JButton bMinhaConta;
    private javax.swing.JButton bResumo;
    private javax.swing.JButton bResumo1;
    private javax.swing.JButton bSair;
    private javax.swing.JLabel fundo;
    private javax.swing.JLabel fundo1;
    private javax.swing.JLabel fundo2;
    private javax.swing.JLabel fundoP;
    private javax.swing.JLabel fundocompra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTable jProd;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField tEnd;
    private javax.swing.JTextField tMail;
    private javax.swing.JLabel tMerceeiro;
    private javax.swing.JTextField tNome;
    private javax.swing.JTextField tRS;
    private javax.swing.JLabel tSaldo;
    private javax.swing.JPasswordField tSenha;
    private javax.swing.JFormattedTextField tTel;
    // End of variables declaration//GEN-END:variables
}
