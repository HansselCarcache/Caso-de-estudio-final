/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelos.Bodega;

/**
 *
 * @author hanss
 */
public class TblBodegas {
    private Conexion conex;
    private Connection conn; 
    private PreparedStatement mostrarbodega;
    private List<Bodega> bodegas = new ArrayList();
    
    public TblBodegas(List<Bodega> lista){
        this.conex = new Conexion();
        this.bodegas = lista;
        conn = conex.obtenerConexion();
        try{
            mostrarbodega = conn.prepareStatement("Select * from Bodega");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", 0);
        }
        listarBodega();
    }
    
    public void listarBodega(){
        ResultSet rs = null;
        try{
            rs = mostrarbodega.executeQuery();
            bodegas.clear();
            while(rs.next()){
                bodegas.add(new Bodega(rs.getInt("Id"), rs.getString("nombre"), rs.getString("descripcion")));
                
            }
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}
