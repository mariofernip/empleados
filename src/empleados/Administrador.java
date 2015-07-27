/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package empleados;

/**
 *
 * @author mario
 */
public class Administrador extends Padre{

     private String seguroSocial;
     private int hortrab;

    public Administrador() {
        //super("No","","","");
        
    }

    public Administrador(String seguroSocial, int hortrab, String nombre, int codigo, String apellidos, String direccion) {
        super(nombre, codigo, apellidos, direccion);
        this.seguroSocial = seguroSocial;
        this.hortrab = hortrab;
    }

  
    
     
    
     @Override
    public void imprimirsueldo() {
        System.out.println("Datos de empleado: Administrador");
        System.out.println("Codigo: "+this.getCodigo());
        System.out.println("Nombre: "+this.getNombre());        
        System.out.println("Apellido: "+this.getApellidos());
        System.out.println("Direccion: "+this.getDireccion()); 
        System.out.println("Seguro Social: "+this.getSeguroSocial());         
        System.out.println("Sueldo: "+(Global.SUELDOBASICO+Global.bonoadministrador+Global.horaextraad*getHortrab()));
        
    }

    public String getSeguroSocial() {
        return seguroSocial;
    }

    public void setSeguroSocial(String seguroSocial) {
        this.seguroSocial = seguroSocial;
    }

    public int getHortrab() {
        return hortrab;
    }

    public void setHortrab(int hortrab) {
        this.hortrab = hortrab;
    }

    
    
}
