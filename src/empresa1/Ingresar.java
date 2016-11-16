package empresa1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Ingresar extends javax.swing.JFrame {

       public Ingresar() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cedula = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        textNom = new javax.swing.JTextField();
        textCed = new javax.swing.JTextField();
        textDir = new javax.swing.JTextField();
        textHor = new javax.swing.JTextField();
        textValor = new javax.swing.JTextField();
        nombres = new javax.swing.JLabel();
        telefono = new javax.swing.JLabel();
        valorhoras = new javax.swing.JLabel();
        horastrabjadas = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ingresar ");
        setIconImages(null);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cedula.setBackground(new java.awt.Color(0, 0, 0));
        cedula.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        cedula.setForeground(new java.awt.Color(255, 255, 255));
        cedula.setText("cedula");
        getContentPane().add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 57, 26));

        jButton1.setText("ok");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, -1, -1));

        volver.setText("volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, -1, -1));

        textNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNomActionPerformed(evt);
            }
        });
        getContentPane().add(textNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 160, 30));

        textCed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCedActionPerformed(evt);
            }
        });
        getContentPane().add(textCed, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 160, 30));
        getContentPane().add(textDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 160, 30));
        getContentPane().add(textHor, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 160, 30));
        getContentPane().add(textValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 160, 30));

        nombres.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        nombres.setForeground(new java.awt.Color(240, 240, 240));
        nombres.setText("nombres");
        getContentPane().add(nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 80, -1));

        telefono.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        telefono.setForeground(new java.awt.Color(240, 240, 240));
        telefono.setText("telefono");
        getContentPane().add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 20));

        valorhoras.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        valorhoras.setForeground(new java.awt.Color(240, 240, 240));
        valorhoras.setText("valor_horas");
        getContentPane().add(valorhoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        horastrabjadas.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        horastrabjadas.setForeground(new java.awt.Color(240, 240, 240));
        horastrabjadas.setText("horas_trabajadas");
        getContentPane().add(horastrabjadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logos/Geometric-Multicolor_www.FullHDWpp.com_.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 340));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        datos ob1=new datos();
        conexion con=new conexion ();
        Connection reg = con.conexion();
        String sql;
        ob1.setNombre(textNom.getText());
        ob1.setCedula(Integer.parseInt(textCed.getText()));
        ob1.setTelefono(Integer.parseInt(textDir.getText()));
        if(Integer.parseInt(textHor.getText())<=40){
            ob1.setHoras(Integer.parseInt(textHor.getText()));
        }else{
            if(Integer.parseInt(textHor.getText())<=48){
                ob1.setHoras(40);
                ob1.setHorasextras(Integer.parseInt(textHor.getText())-40);
            }else{
                if(Integer.parseInt(textHor.getText())>48){
                    ob1.setHoras(40);
                    ob1.setHorasextras(8);
                    ob1.setHorasextrasdobles(Integer.parseInt(textHor.getText())-48);
                }

            }
        }
        ob1.setValor(Integer.parseInt(textValor.getText()));
        ob1.setValorextras(Integer.parseInt(textValor.getText())*20/100+Integer.parseInt(textValor.getText()));
        ob1.setValorextrasdobles(Integer.parseInt(textValor.getText())*40/100+Integer.parseInt(textValor.getText()));
        if(Integer.parseInt(textHor.getText())<=40){
            ob1.setTotal(ob1.getHoras()*ob1.getValor());
        }else{
            if(Integer.parseInt(textHor.getText())<=48){
                ob1.setTotal(ob1.getHoras()*ob1.getValor()+ob1.getHorasextras()*ob1.getValorextras());
            }else{
                if(Integer.parseInt(textHor.getText())>48){
                    ob1.setTotal(ob1.getHoras()*ob1.getValor()+ob1.getHorasextras()*ob1.getValorextras()+ob1.getHorasextrasdobles()*ob1.getValorextrasdobles());
                }
            }
        }
        sql="INSERT INTO sueldo(CEDULA, NOMBRE, TELEFONO, horast,horase,horasd,valor,valore,valord, total)VALUES(?,?,?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement pst=reg.prepareStatement(sql);
            pst.setString(1, ob1.getCedula());
            pst.setString(2,ob1.getNombre());
            pst.setString(3,ob1.getTelefono());
            pst.setInt(4,ob1.getHoras());
            pst.setInt(5,ob1.getHorasextras());
            pst.setInt(6,ob1.getHorasextrasdobles());
            pst.setInt(7,ob1.getValor());
            pst.setInt(8,ob1.getValorextras());
            pst.setInt(9,ob1.getValorextrasdobles());
            pst.setInt(10,ob1.getTotal());
            int n=pst.executeUpdate();
            if(n>0){
                JOptionPane.showMessageDialog(null,"DATOS ALMACENADOS CON EXITO");
            }else{
                JOptionPane.showMessageDialog(null,"error");
            }
        }catch(SQLException ex){
            Logger.getLogger(Ingresar.class.getName()).log(Level.SEVERE, null, ex);
        }                          
    }//GEN-LAST:event_jButton1ActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
    principal ob = new principal();
    ob.setVisible(true);
     this.dispose();
    }//GEN-LAST:event_volverActionPerformed

    private void textNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNomActionPerformed

    }//GEN-LAST:event_textNomActionPerformed

    private void textCedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCedActionPerformed
  
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingresar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cedula;
    private javax.swing.JLabel horastrabjadas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nombres;
    private javax.swing.JLabel telefono;
    private javax.swing.JTextField textCed;
    private javax.swing.JTextField textDir;
    private javax.swing.JTextField textHor;
    private javax.swing.JTextField textNom;
    private javax.swing.JTextField textValor;
    private javax.swing.JLabel valorhoras;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
