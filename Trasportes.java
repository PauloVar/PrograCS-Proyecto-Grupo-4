/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FVvisual;

/**
 *
 * @author computadora
 */
public class Trasportes extends javax.swing.JFrame {

    /**
     * Creates new form Trasportes
     */
    public Trasportes() {
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
        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn2Trasportes = new javax.swing.JButton();
        btn2Inventario = new javax.swing.JButton();
        btn2Suscripcion = new javax.swing.JButton();
        btn2Registrarse = new javax.swing.JButton();
        btn2Login = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        btn1Incio = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Registrarse");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Titulo.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        Titulo.setText("FVGames");

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\computadora\\Desktop\\logo2.png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Bienvenido a la tienda FVGames ");

        btn2Trasportes.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn2Trasportes.setText("Trasportes");

        btn2Inventario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn2Inventario.setText("Inventario");
        btn2Inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2InventarioActionPerformed(evt);
            }
        });

        btn2Suscripcion.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn2Suscripcion.setText("Suscripcion");

        btn2Registrarse.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn2Registrarse.setText("Registrarse");
        btn2Registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2RegistrarseActionPerformed(evt);
            }
        });

        btn2Login.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn2Login.setText("Login");
        btn2Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2LoginActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setText("Trasportes");

        jLabel5.setText("Ver pedido en curso");

        jButton1.setText("EnCurso");

        jLabel6.setText("Ver pedidos Listos");

        jButton2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton2.setText("Listos");

        btn1Incio.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn1Incio.setText("Inicio");
        btn1Incio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1IncioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(btn1Incio)
                .addGap(18, 18, 18)
                .addComponent(btn2Trasportes)
                .addGap(18, 18, 18)
                .addComponent(btn2Inventario)
                .addGap(18, 18, 18)
                .addComponent(btn2Suscripcion)
                .addGap(18, 18, 18)
                .addComponent(btn2Registrarse)
                .addGap(18, 18, 18)
                .addComponent(btn2Login)
                .addGap(14, 14, 14))
            .addComponent(jSeparator2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Titulo)
                        .addComponent(btn2Registrarse)
                        .addComponent(btn2Login)
                        .addComponent(btn2Inventario)
                        .addComponent(btn2Suscripcion)
                        .addComponent(btn2Trasportes)
                        .addComponent(btn1Incio)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jButton2))
                .addGap(0, 352, Short.MAX_VALUE))
        );

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

    private void btn2InventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2InventarioActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btn2InventarioActionPerformed

    private void btn2RegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2RegistrarseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn2RegistrarseActionPerformed

    private void btn2LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2LoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn2LoginActionPerformed

    private void btn1IncioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1IncioActionPerformed
        // TODO add your handling code here:
        Pantalla princ=new Pantalla();
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);
    }//GEN-LAST:event_btn1IncioActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btn1Incio;
    private javax.swing.JButton btn2Inventario;
    private javax.swing.JButton btn2Login;
    private javax.swing.JButton btn2Registrarse;
    private javax.swing.JButton btn2Suscripcion;
    private javax.swing.JButton btn2Trasportes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}