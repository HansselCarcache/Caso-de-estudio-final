/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author hanss
 */
public class Empleado {
    private int Id;
    private String nombre;
    private String apellidos;
    private String numCelular;
    private String codigo;
    private String pwd;
    

    public Empleado() {
    }

    public Empleado(int Id, String nombre, String apellidos, String numCelular, String codigo, String pwd) {
        this.Id = Id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numCelular = numCelular;
        this.codigo = codigo;
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "Empleado{" + "Id=" + Id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", numCelular=" + numCelular + ", codigo=" + codigo + ", pwd=" + pwd + '}';
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNumCelular() {
        return numCelular;
    }

    public void setNumCelular(String numCelular) {
        this.numCelular = numCelular;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    
    
    
}
