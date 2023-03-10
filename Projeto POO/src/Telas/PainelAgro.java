package Telas;

import Aplicação.ProjetoPOO;
import Classes.Produto;
import javax.swing.JOptionPane;


public class PainelAgro extends javax.swing.JFrame {


    public PainelAgro() {
        initComponents();
        
        PainelCadastrarProduto.setVisible(false);
        MinhaConta.setVisible(false);
        Ajuda.setVisible(false);
    }
    
    
    private void cadastrartP() {
            
            Produto PD = new Produto();
            
            
            
           PD.setNomePD(tNome.getText());
           PD.setCategoria(Integer.parseInt(tCategoria.getText()));
           PD.setValor(Float.parseFloat(tValor.getText()));
           PD.setQuant(Integer.parseInt(tQuant.getText()));
           
           ProjetoPOO.produtos.add(PD);
           
           /*
           int linha = DAO.inserir(APInserido);
        if (linha > 0) {*/
            JOptionPane.showMessageDialog(this, "Produto cadastrado com sucesso.");
        /*} else {
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar.");
        }*/
        
        
        } 
      
     
    
    private void Menu() {
        new MenuInicial().setVisible(true);
        this.dispose();
        JOptionPane.showMessageDialog(null,"Sessao encerrada com sucesso.");                   
    }
    
    
    private void cancelar() {
        Object[] opcao = {"Sim", "Não"};
        int opcaoSelecionada = JOptionPane.showOptionDialog(this, "Deseja realmente sair do programa?", "Aviso",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, opcao, opcao[0]);
        if (opcaoSelecionada == 0) {
            this.dispose();
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bDeslogar = new javax.swing.JButton();
        Ajuda = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        fundo2 = new javax.swing.JLabel();
        MinhaConta = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        tRS = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        tNome1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        tTel = new javax.swing.JFormattedTextField();
        tEnd = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        tMail = new javax.swing.JTextField();
        tSenha = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        bExcluirConta = new javax.swing.JButton();
        bAlterar = new javax.swing.JButton();
        fundo1 = new javax.swing.JLabel();
        PainelCadastrarProduto = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tCategoria = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tValor = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tQuant = new javax.swing.JTextField();
        bCadastrar1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        tNome = new javax.swing.JTextField();
        fundo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bSair = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        bCadastrar = new javax.swing.JButton();
        bResumo = new javax.swing.JButton();
        bMinhaConta = new javax.swing.JButton();
        bAjuda = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        fundoinicial = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Painel - Projeto POO");
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

        getContentPane().add(Ajuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 970, 710));

        MinhaConta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Razão Social");
        MinhaConta.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, -1));

        jLabel17.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        jLabel17.setText("Dados Cadastrais");
        MinhaConta.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, -1));

        tRS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tRSActionPerformed(evt);
            }
        });
        MinhaConta.add(tRS, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 452, -1));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel16.setText("Nome");
        MinhaConta.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, -1, -1));

        tNome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNome1ActionPerformed(evt);
            }
        });
        MinhaConta.add(tNome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 452, -1));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setText("Telefone");
        MinhaConta.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, -1));

        jLabel18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel18.setText("Endereço");
        MinhaConta.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, -1, -1));

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

        jLabel19.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        jLabel19.setText("Dados de Acesso");
        MinhaConta.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, -1, -1));

        jLabel20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel20.setText("Senha");
        MinhaConta.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, -1, -1));

        jLabel21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel21.setText("E-mail");
        MinhaConta.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, -1, -1));

        tMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tMailActionPerformed(evt);
            }
        });
        MinhaConta.add(tMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 452, -1));
        MinhaConta.add(tSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, 452, -1));

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

        bAlterar.setText("Alterar");
        bAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAlterarActionPerformed(evt);
            }
        });
        MinhaConta.add(bAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 570, -1, -1));

        fundo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundo3s.png"))); // NOI18N
        MinhaConta.add(fundo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(MinhaConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 970, 710));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setText("Categoria (1 ou 2)");

        jLabel3.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 24)); // NOI18N
        jLabel3.setText("Cadastro de produto");

        tCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tCategoriaActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setText("Preço");

        tValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tValorActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setText("Quantidade");

        tQuant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tQuantActionPerformed(evt);
            }
        });

        bCadastrar1.setText("Cadastrar");
        bCadastrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCadastrar1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Nome");

        tNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNomeActionPerformed(evt);
            }
        });

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundo3s.png"))); // NOI18N

        javax.swing.GroupLayout PainelCadastrarProdutoLayout = new javax.swing.GroupLayout(PainelCadastrarProduto);
        PainelCadastrarProduto.setLayout(PainelCadastrarProdutoLayout);
        PainelCadastrarProdutoLayout.setHorizontalGroup(
            PainelCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCadastrarProdutoLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(602, Short.MAX_VALUE))
            .addGroup(PainelCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PainelCadastrarProdutoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(PainelCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PainelCadastrarProdutoLayout.createSequentialGroup()
                            .addGap(296, 296, 296)
                            .addComponent(tCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PainelCadastrarProdutoLayout.createSequentialGroup()
                            .addGap(297, 297, 297)
                            .addComponent(tValor, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PainelCadastrarProdutoLayout.createSequentialGroup()
                            .addGap(92, 92, 92)
                            .addComponent(jLabel14))
                        .addGroup(PainelCadastrarProdutoLayout.createSequentialGroup()
                            .addGap(92, 92, 92)
                            .addComponent(jLabel12))
                        .addGroup(PainelCadastrarProdutoLayout.createSequentialGroup()
                            .addGap(297, 297, 297)
                            .addComponent(tQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PainelCadastrarProdutoLayout.createSequentialGroup()
                            .addGap(92, 92, 92)
                            .addComponent(jLabel8))
                        .addGroup(PainelCadastrarProdutoLayout.createSequentialGroup()
                            .addGap(92, 92, 92)
                            .addComponent(jLabel13))
                        .addGroup(PainelCadastrarProdutoLayout.createSequentialGroup()
                            .addGap(711, 711, 711)
                            .addComponent(bCadastrar1))
                        .addGroup(PainelCadastrarProdutoLayout.createSequentialGroup()
                            .addGap(297, 297, 297)
                            .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(fundo))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        PainelCadastrarProdutoLayout.setVerticalGroup(
            PainelCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCadastrarProdutoLayout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(480, Short.MAX_VALUE))
            .addGroup(PainelCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PainelCadastrarProdutoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(PainelCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PainelCadastrarProdutoLayout.createSequentialGroup()
                            .addGap(376, 376, 376)
                            .addComponent(tCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel14))
                        .addGroup(PainelCadastrarProdutoLayout.createSequentialGroup()
                            .addGap(379, 379, 379)
                            .addComponent(jLabel12))
                        .addGroup(PainelCadastrarProdutoLayout.createSequentialGroup()
                            .addGap(456, 456, 456)
                            .addComponent(tQuant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PainelCadastrarProdutoLayout.createSequentialGroup()
                            .addGap(339, 339, 339)
                            .addComponent(jLabel8))
                        .addGroup(PainelCadastrarProdutoLayout.createSequentialGroup()
                            .addGap(419, 419, 419)
                            .addComponent(jLabel13))
                        .addGroup(PainelCadastrarProdutoLayout.createSequentialGroup()
                            .addGap(550, 550, 550)
                            .addComponent(bCadastrar1))
                        .addGroup(PainelCadastrarProdutoLayout.createSequentialGroup()
                            .addGap(336, 336, 336)
                            .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(fundo, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(PainelCadastrarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 970, 710));

        jLabel4.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 20)); // NOI18N
        jLabel4.setText("Ultimas vendas:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 20)); // NOI18N
        jLabel5.setText("Minhas vendas:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, -1, -1));

        jLabel6.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 20)); // NOI18N
        jLabel6.setText("Estoque:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 130, -1, -1));

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
        getContentPane().add(bSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 240, 60));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("AGRO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 150, 90));

        bCadastrar.setBackground(new java.awt.Color(0, 153, 153));
        bCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        bCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        bCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3s.png"))); // NOI18N
        bCadastrar.setText("Cadastrar");
        bCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(bCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 240, 60));

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
        getContentPane().add(bResumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 240, 60));

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
        getContentPane().add(bMinhaConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 240, 60));

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
        getContentPane().add(bAjuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 240, 60));

        jLabel7.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 20)); // NOI18N
        jLabel7.setText("Saldo:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, -1, -1));

        fundoinicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundo1.png"))); // NOI18N
        getContentPane().add(fundoinicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bDeslogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeslogarActionPerformed
        Menu();
    }//GEN-LAST:event_bDeslogarActionPerformed

    private void bSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSairActionPerformed
        Menu();
    }//GEN-LAST:event_bSairActionPerformed

    private void bCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCadastrarActionPerformed
        PainelCadastrarProduto.setVisible(true);
        MinhaConta.setVisible(false);
        Ajuda.setVisible(false);
    }//GEN-LAST:event_bCadastrarActionPerformed

    private void bResumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResumoActionPerformed
        PainelCadastrarProduto.setVisible(false);
        MinhaConta.setVisible(false);
        Ajuda.setVisible(false);
    }//GEN-LAST:event_bResumoActionPerformed

    private void bMinhaContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMinhaContaActionPerformed
        MinhaConta.setVisible(true);
        PainelCadastrarProduto.setVisible(false);
        Ajuda.setVisible(false);
    }//GEN-LAST:event_bMinhaContaActionPerformed

    private void bAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAjudaActionPerformed
        Ajuda.setVisible(true);
        MinhaConta.setVisible(false);
        PainelCadastrarProduto.setVisible(false);
    }//GEN-LAST:event_bAjudaActionPerformed

    private void tCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tCategoriaActionPerformed
        
    }//GEN-LAST:event_tCategoriaActionPerformed

    private void tValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tValorActionPerformed

    private void bCadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCadastrar1ActionPerformed
        cadastrartP();
    }//GEN-LAST:event_bCadastrar1ActionPerformed

    private void tNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNomeActionPerformed

    private void tQuantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tQuantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tQuantActionPerformed

    private void tRSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tRSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tRSActionPerformed

    private void tNome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNome1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNome1ActionPerformed

    private void tEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tEndActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tEndActionPerformed

    private void tMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tMailActionPerformed

    private void bExcluirContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExcluirContaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bExcluirContaActionPerformed

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
            java.util.logging.Logger.getLogger(PainelAgro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PainelAgro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PainelAgro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PainelAgro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PainelAgro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Ajuda;
    private javax.swing.JPanel MinhaConta;
    private javax.swing.JPanel PainelCadastrarProduto;
    private javax.swing.JButton bAjuda;
    private javax.swing.JButton bAlterar;
    private javax.swing.JButton bCadastrar;
    private javax.swing.JButton bCadastrar1;
    private javax.swing.JButton bDeslogar;
    private javax.swing.JButton bExcluirConta;
    private javax.swing.JButton bMinhaConta;
    private javax.swing.JButton bResumo;
    private javax.swing.JButton bSair;
    private javax.swing.JLabel fundo;
    private javax.swing.JLabel fundo1;
    private javax.swing.JLabel fundo2;
    private javax.swing.JLabel fundoinicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField tCategoria;
    private javax.swing.JTextField tEnd;
    private javax.swing.JTextField tMail;
    private javax.swing.JTextField tNome;
    private javax.swing.JTextField tNome1;
    private javax.swing.JTextField tQuant;
    private javax.swing.JTextField tRS;
    private javax.swing.JPasswordField tSenha;
    private javax.swing.JFormattedTextField tTel;
    private javax.swing.JTextField tValor;
    // End of variables declaration//GEN-END:variables
}
