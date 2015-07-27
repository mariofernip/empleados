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
public class Inspector extends Padre{
     private String especialidad;
     private int hortrab;

    public Inspector() {
    }

    public Inspector(String especialidad, int hortrab, String nombre, int codigo, String apellidos, String direccion) {
        super(nombre, codigo, apellidos, direccion);
        this.especialidad = especialidad;
        this.hortrab = hortrab;
    }

         
    
@Override
    public void imprimirsueldo() {
        System.out.println("Datos de empleado: Inspector");
        System.out.println("Codigo: "+this.getCodigo());
        System.out.println("Nombre: "+this.getNombre());        
        System.out.println("Apellido: "+this.getApellidos());
        System.out.println("Direccion: "+this.getDireccion());   
        System.out.println("Especialidad: "+this.getEspecialidad());             
        System.out.println("Sueldo: "+(Global.SUELDOBASICO+Global.bonoinspector+Global.horaextrain*getHortrab()));
        
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getHortrab() {
        return hortrab;
    }

    public void setHortrab(int hortrab) {
        this.hortrab = hortrab;
    }
     
     
     
}
