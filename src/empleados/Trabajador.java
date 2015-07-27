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
public class Trabajador extends Padre{

    private String area;
    private int hortrab;

    public Trabajador() {
    }

    public Trabajador(String area, int hortrab, String nombre, int codigo, String apellidos, String direccion) {
        super(nombre, codigo, apellidos, direccion);
        this.area = area;
        this.hortrab = hortrab;
    }
    
    
    @Override
    public void imprimirsueldo() {
        System.out.println("Datos de empleado Trabajador: ");
        System.out.println("Codigo: "+this.getCodigo());
        System.out.println("Nomnbre: "+this.getNombre());        
        System.out.println("Codigo: "+this.getApellidos());
        System.out.println("Direccion: "+this.getDireccion());     
        System.out.println("Area: "+this.getArea());             
        System.out.println("Sueldo: "+(Global.SUELDOBASICO+this.getHortrab()*Global.horaextratr+Global.bonotrabajador));
        
    }

    /**
     * @return the area
     */
    public String getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(String area) {
        this.area = area;
    }

    public int getHortrab() {
        return hortrab;
    }

    public void setHortrab(int hortrab) {
        this.hortrab = hortrab;
    }
}
