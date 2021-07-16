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
import modelos.Empleado;

/**
 *
 * @author hanss
 */
public class TblEmpleados {
    private Conexion conex;
    private Connection conn;
    private PreparedStatement mostrarEmpleados;
    private List<Empleado> empleados = new ArrayList();
    
    public TblEmpleados(List<Empleado> lista){
        this.conex = new Conexion();
        this.empleados = lista;
        conn = conex.obtenerConexion();
        try{
            mostrarEmpleados = conn.prepareStatement("Select * from Empleado");
        }
         catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", 0);
        }
        listarEmpleado();
    }
    
   public void listarEmpleado(){
       ResultSet rs = null;
       try{
            rs = mostrarEmpleados.executeQuery();
            empleados.clear();
            while(rs.next()){
                empleados.add(new Empleado(rs.getInt("Id"),rs.getString("nombre"),rs.getString("apellidos"),rs.getString("numCelular"),rs.getString("codigoemp"),rs.getString("clave")));
            }
       }catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
   }
}
