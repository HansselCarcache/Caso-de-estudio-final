/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registroproductos;

import Dao.TblBodegas;
import Dao.TblEmpleados;
import Dao.TblProductos;
import formularios.FrmLogin;
import java.util.List;
import java.util.ArrayList;
import modelos.Bodega;
import modelos.Empleado;
import modelos.Productos;

/**
 *
 * @author hanss
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Productos> productos = new ArrayList();
        List<Empleado> empleados = new ArrayList();
        List<Bodega> bodegas = new ArrayList();
        TblProductos tblproductos = new TblProductos(productos);
        TblEmpleados tblempleados = new TblEmpleados(empleados);
        TblBodegas tblbodegas = new TblBodegas(bodegas);
        FrmLogin frm = new FrmLogin(empleados);
        frm.setVisible(true);
        
    }
    
}
