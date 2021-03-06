/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos.PrimerDepartamental;

import java.math.BigDecimal;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eduardo
 */
public class Biseccion extends javax.swing.JFrame {

    DefaultTableModel biseccionTabla;
   Integer redon = 0;

    /**
     * Creates new form Eulier
     */
    public Biseccion() {

        initComponents();
        creaColumna();

    }

    public void creaColumna() {
        biseccionTabla = (DefaultTableModel) biseccionTab.getModel();
        biseccionTabla.addColumn("i");
        biseccionTabla.addColumn("a");
        biseccionTabla.addColumn("x(i)");
        biseccionTabla.addColumn("b");
        biseccionTabla.addColumn("f(a)");
        biseccionTabla.addColumn("f(x(i))");
        biseccionTabla.addColumn("f(b)");
        biseccionTabla.addColumn("Error");
    }

    public void creaFila(Double i, Double a, Double x, Double b, Double fa, Double xi, Double fb, Double err) {
        biseccionTabla = (DefaultTableModel) biseccionTab.getModel();

        Double[] fila = {i, a, x, b, fa, xi, fb, err};
        biseccionTabla.addRow(fila);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        biseccionBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        biseccionA = new javax.swing.JTextField();
        biseccionB = new javax.swing.JTextField();
        biseccionC = new javax.swing.JTextField();
        biseccionCalc = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        biseccionTab = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("EULIER"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));
        setType(java.awt.Window.Type.POPUP);

        biseccionBack.setText("Regresar");
        biseccionBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                biseccionBackActionPerformed(evt);
            }
        });

        jLabel1.setText("Bisección");

        jLabel2.setText("Dame \"a\"");

        jLabel3.setText("Dame \"b\"");

        jLabel4.setText("Dame \"c\"");

        biseccionA.setName(""); // NOI18N

        biseccionCalc.setText("Calcular");
        biseccionCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                biseccionCalcActionPerformed(evt);
            }
        });

        biseccionTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(biseccionTab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(biseccionA, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(biseccionB, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(biseccionC, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(biseccionCalc)
                                .addGap(78, 78, 78)
                                .addComponent(biseccionBack)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(biseccionA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(biseccionB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(biseccionC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(biseccionBack)
                    .addComponent(biseccionCalc))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void biseccionBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_biseccionBackActionPerformed
        this.dispose();
    }//GEN-LAST:event_biseccionBackActionPerformed

    private void biseccionCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_biseccionCalcActionPerformed
        Double[] x = new Double[50];
        Double[] err = new Double[50];
        Double id;
        Double a = Double.parseDouble(biseccionA.getText());
        Double b = Double.parseDouble(biseccionB.getText());
        Integer c = Integer.parseInt(biseccionC.getText());
        redon = (c + 2);
        Double aux = (Math.pow(10, -c));
        Double ec =  redondeo((0.5 * aux), redon);
        Integer i = 0;
        err[i] = 1.0;
        x[i] = redondeo(((a + b) / 2),redon);
        id = i*1.0;
        creaFila(id, a, x[i], b, f(a), f(x[i]), f(b), err[i]);
        while ((err[i] > ec)) {
            if (((f(x[i]) * f(a)) < 0)) {
                b = redondeo(x[i],redon);
            }
            else {
                a = redondeo(x[i],redon);
            }
            i++;
            x[i] = redondeo(((a + b) / 2),redon);
            err[i] = redondeo(Math.abs((((x[i]-x[i-1]) / x[i]))),redon);
            id = i*1.0;
            creaFila(id, a, x[i], b, f(a), f(x[i]), f(b), err[i]);
        }
    }//GEN-LAST:event_biseccionCalcActionPerformed

     Double f(Double x) {
        double f = redondeo(((Math.pow(x, 3))- (4 * x) + 1),redon);
        return (Double) f;
    }
    public double redondeo(double n, int d) {
        BigDecimal bigDecimal = new BigDecimal(n);
        bigDecimal = bigDecimal.setScale(d, BigDecimal.ROUND_HALF_EVEN);
        return bigDecimal.doubleValue();
    }

    //<>
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
            java.util.logging.Logger.getLogger(Biseccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Biseccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Biseccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Biseccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Biseccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField biseccionA;
    private javax.swing.JTextField biseccionB;
    private javax.swing.JButton biseccionBack;
    private javax.swing.JTextField biseccionC;
    private javax.swing.JButton biseccionCalc;
    private javax.swing.JTable biseccionTab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
