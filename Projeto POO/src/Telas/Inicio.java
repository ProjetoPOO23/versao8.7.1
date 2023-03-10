package Telas;

import javax.swing.JOptionPane;


public class Inicio extends javax.swing.JFrame {


    public Inicio() {
        initComponents();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        loading = new javax.swing.JProgressBar();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Inicializando . . .");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 660, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Projeto POO - Bem Vindo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, -1, -1));
        getContentPane().add(loading, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 630, -1, 10));

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundo0i.png"))); // NOI18N
        getContentPane().add(fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    public static void main(String args[]) {
       
        Inicio in = new Inicio();
        in.setVisible(true);
        MenuInicial mi = new MenuInicial();
        
        try {
            for (int i = 0; i < 100; i++) {
                Thread.sleep(50);
                in.loading.setValue(i);
                
                if(i==20){
                    in.jLabel2.setText("Inicializando . . . 20%");
                }if(i==50){
                    in.jLabel2.setText("Inicializando . . . 50%");
                }
                if(i==80){
                    in.jLabel2.setText("Inicializando . . . 80%");
                }
            }
        
        
        in.setVisible(false);
        mi.setVisible(true);        
        in.dispose();
            
        } catch (InterruptedException e) {            
            JOptionPane.showMessageDialog(null,"Erro");

        }
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fundo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JProgressBar loading;
    // End of variables declaration//GEN-END:variables
}
