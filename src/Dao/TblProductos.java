/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelos.Productos;

/**
 *
 * @author hanss
 */
public class TblProductos {
    private Conexion conex;
    private Connection conn;
    private PreparedStatement mostrarProductos;
    private List<Productos> productos = new ArrayList();
    
    public TblProductos(List<Productos> lista){
        this.conex = new Conexion();
        this.productos = lista;
        conn = conex.obtenerConexion();
        try{
            mostrarProductos = conn.prepareStatement("Select * from Productos where Estado=1");
        }
         catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", 0);
        }
        listarRegistro();
    }
    
    public void listarRegistro(){
        ResultSet rs = null;
        try{
            rs = mostrarProductos.executeQuery();
            productos.clear();
            while(rs.next()){
                productos.add(new Productos(rs.getInt("Id"),
                        rs.getInt("Codigo"),rs.getString("Nombre"),rs.getString("Descripcion"),rs.getInt("Precio"),
                rs.getInt("Estado"), rs.getInt("idBodega")));
            }
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
    }
}
