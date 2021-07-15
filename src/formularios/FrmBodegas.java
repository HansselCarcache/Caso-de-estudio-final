/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import Dao.Conexion;
import Dao.TblBodegas;
import Dao.TblProductos;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.Bodega;
import modelos.Productos;

/**
 *
 * @author hanss
 */
public class FrmBodegas extends javax.swing.JFrame {
    Conexion conex = new Conexion();
    Connection conn = conex.obtenerConexion();
    List<Productos> productos = new ArrayList();
    List<Bodega> bodegas = new ArrayList();
    TblBodegas tblbodegas = new TblBodegas(bodegas);
    DefaultTableModel tbl = new DefaultTableModel();
    TblProductos tblproductos = new TblProductos(productos);
    List<Productos> bodega1 = new ArrayList();
    Iterator<Productos> itrproductos = productos.iterator();
    /**
     * Creates new form FrmBodegas
     */
    public FrmBodegas() {
        initComponents();
        mostrarTabla();
       cbxBodega.removeAllItems();
        for(int i=0; i<bodegas.size(); i++){
            cbxBodega.addItem(bodegas.get(i).getNombre());
        }
        
         this.setLocationRelativeTo(null);
    }
    
    public FrmBodegas(List<Productos> lista, List<Bodega> lista2) {
        initComponents();
        productos = lista;
        bodegas = lista2;
         
        mostrarTabla();
       
        cbxBodega.removeAllItems();
        for(int i=0; i<bodegas.size(); i++){
            cbxBodega.addItem(bodegas.get(i).getNombre());
            
        }
         this.setLocationRelativeTo(null);
    }
    
    private void mostrarTabla(){
        String[] titulos = {"Id","Codigo","Nombre","Descripcion","Precio","Estado","Id de la bodega"};
        tbl.setColumnIdentifiers(titulos);
        this.tblProductos.setModel(tbl);
        for (Productos producto: productos){
            Object[] datos = new Object[7];
            datos[0] = producto.getId();
            datos[1] = producto.getCodigo();
            datos[2] = producto.getNombre();
            datos[3] = producto.getDescripcion();
            datos[4] = producto.getPrecio();
            datos[5] = producto.getEstado();
            datos[6] = producto.getIdBodega();
            tbl.addRow(datos);
            
        }
            
    }
    private void listarProductosBodega(){
         try{
         
        for(int i=0;i<bodegas.size(); i++){
            if(cbxBodega.getSelectedItem() == bodegas.get(i).getNombre()){
              System.out.println("se parece el "+cbxBodega.getSelectedItem()+" y "+bodegas.get(i).getNombre());
               
                for(int f = 0; i<productos.size(); f++){
                    if(productos.get(f).getIdBodega() == bodegas.get(i).getId()){
                        bodega1.add(productos.get(f));
                        System.out.println(bodega1);
                        System.out.println(bodega1.size());
                        
                      
                        
                    }

                }
            }else{
              System.out.println("nel");
            }
        }

    
     }catch (Exception ex){
         System.out.println("Error");
     }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cbxBodega = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblProductos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLabel1.setText("Bodega:");

        cbxBodega.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bodega Principal", "Bodega secundaria", " " }));
        cbxBodega.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxBodegaItemStateChanged(evt);
            }
        });

        jButton1.setText("Mostrar en tabla");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Mostrar cantidad de productos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cbxBodega, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbxBodega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(7, 7, 7)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        listarProductosBodega();
        if(bodega1.isEmpty() == true){
            tbl.setNumRows(0);   
            JOptionPane.showMessageDialog(null, "No existen productos en la bodega: "+ cbxBodega.getSelectedItem());
        }else{
            tbl.setNumRows(0);
            for(Productos producto: bodega1){
                Object[] datos = new Object[7];
                datos[0] = producto.getId();
                datos[1] = producto.getCodigo();
                datos[2] = producto.getNombre();
                datos[3] = producto.getDescripcion();
                datos[4] = producto.getPrecio();
                datos[5] = producto.getEstado();
                datos[6] = producto.getIdBodega();
                tbl.addRow(datos);
            } 
        }
        

     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbxBodegaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxBodegaItemStateChanged
        // TODO add your handling code here:
      
        
        if(bodega1.isEmpty() == false){
          bodega1.clear();
          System.out.println("se limpio");
            
      }

    }//GEN-LAST:event_cbxBodegaItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        listarProductosBodega();
        JOptionPane.showMessageDialog(null, "La cantidad de productos en la bodega: "
                +cbxBodega.getSelectedItem()+ " es de: "+bodega1.size() );
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmBodegas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmBodegas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmBodegas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmBodegas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmBodegas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxBodega;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProductos;
    // End of variables declaration//GEN-END:variables
}
