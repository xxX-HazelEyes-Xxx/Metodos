/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos.TercerDepartamental;

import java.math.BigDecimal;
import java.util.Objects;
import javax.swing.table.DefaultTableModel;
import metodos.Funcion;
import org.math.plot.Plot2DPanel;

/**
 *
 * @author Eduardo
 */
public class EulierMejorado extends javax.swing.JFrame {
        DefaultTableModel eulierMejTabla;
    /**
     * Creates new form EulierMejorado
     */
    public EulierMejorado() {
        initComponents();
        creaColumna();
    }
    
     public void creaColumna(){
         eulierMejTabla = (DefaultTableModel) eulierMejTab.getModel();
         eulierMejTabla.addColumn("X");
         eulierMejTabla.addColumn("Y");
    }
    
    public void creaFila(Double x, Double y){
        eulierMejTabla = (DefaultTableModel) eulierMejTab.getModel();
        
        Double[] fila = {x, y};
        eulierMejTabla.addRow(fila);
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        eulierMejTab = new javax.swing.JTable();
        eulierMejBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        eulierMejX0 = new javax.swing.JTextField();
        eulierMejY0 = new javax.swing.JTextField();
        eulierMejH = new javax.swing.JTextField();
        eulierMejXFin = new javax.swing.JTextField();
        eulierMejFunc = new javax.swing.JTextField();
        eulierMejCalc = new javax.swing.JButton();
        eulierMejGraf = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(102, 0, 0));
        setLocationByPlatform(true);
        setName("EULIERMEJORADO"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));
        setType(java.awt.Window.Type.POPUP);

        eulierMejTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(eulierMejTab);

        eulierMejBack.setText("Regresar");
        eulierMejBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eulierMejBackActionPerformed(evt);
            }
        });

        jLabel1.setText("Eulier Mejorado");

        jLabel2.setText("Dame \"x\"");

        jLabel3.setText("Dame \"y\"");

        jLabel4.setText("Dame \"h\"");

        jLabel5.setText("Dame \"x\" final");

        jLabel6.setText("Dame función");

        eulierMejX0.setName(""); // NOI18N

        eulierMejCalc.setText("Calcular");
        eulierMejCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eulierMejCalcActionPerformed(evt);
            }
        });

        eulierMejGraf.setText("Graficar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(eulierMejX0, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(eulierMejXFin, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(97, 97, 97)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel3)
                                                    .addComponent(eulierMejY0, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(53, 53, 53)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(10, 10, 10)
                                                        .addComponent(eulierMejH, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jLabel4)))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(107, 107, 107)
                                        .addComponent(eulierMejFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(eulierMejCalc)
                                .addGap(98, 98, 98)
                                .addComponent(eulierMejGraf)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(eulierMejBack)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(21, 21, 21)
                                .addComponent(jLabel2))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eulierMejX0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eulierMejY0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eulierMejH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eulierMejXFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eulierMejFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eulierMejCalc)
                            .addComponent(eulierMejGraf)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(eulierMejBack)
                .addGap(275, 275, 275))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eulierMejBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eulierMejBackActionPerformed
        this.dispose();
    }//GEN-LAST:event_eulierMejBackActionPerformed

    private void eulierMejCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eulierMejCalcActionPerformed
        String fun = eulierMejFunc.getText();
        Double h = redondeo(Double.parseDouble(eulierMejH.getText()),4);
        Double xfin = redondeo(Double.parseDouble(eulierMejXFin.getText()),4);
        Double[] yp = new Double[50];
        Double[] yc = new Double[50];
        Double x  = redondeo(Double.parseDouble(eulierMejX0.getText()),4);
        //Double[] y = new Double[50];
        int i = 1;
        yc[1] = Double.parseDouble(eulierMejY0.getText());
        Funcion fx = new Funcion(fun);
        creaFila(x, yc[1]);
        do{
            
            System.out.println("DO " +i);
            yp[i+1] = redondeo(yc[i] + h * fx.evaluar(x, yc[i]),4);
            yc[i+1] = redondeo(yc[i] + (h/2) *((fx.evaluar(x, yc[i]))+(fx.evaluar((x+h), yp[i+1]))),4);
            x = redondeo(x + h, 4);
            i++;
            creaFila(x, yc[i]);
            System.out.println("x; " + x);
            System.out.println("yp: " + yp[i]);
            System.out.println("yc: " + yc[i]);
        }while(x<xfin);
  
  
    }//GEN-LAST:event_eulierMejCalcActionPerformed

     public double redondeo(double n, int d){
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
            java.util.logging.Logger.getLogger(EulierMejorado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EulierMejorado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EulierMejorado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EulierMejorado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EulierMejorado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton eulierMejBack;
    private javax.swing.JButton eulierMejCalc;
    private javax.swing.JTextField eulierMejFunc;
    private javax.swing.JButton eulierMejGraf;
    private javax.swing.JTextField eulierMejH;
    private javax.swing.JTable eulierMejTab;
    private javax.swing.JTextField eulierMejX0;
    private javax.swing.JTextField eulierMejXFin;
    private javax.swing.JTextField eulierMejY0;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
