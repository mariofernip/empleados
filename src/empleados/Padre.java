/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;


public abstract class Padre {
    private String nombre;
    private  int codigo;
    private String apellidos;
    private String direccion;
   

    public Padre() {
        nombre="SN";
        codigo=0;
                
    }

    public Padre(String nombre, int codigo, String apellidos, String direccion) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.apellidos = apellidos;
        this.direccion = direccion;
        
    }
    
    
    
    abstract  public void imprimirsueldo();

    
    public String getNombre() {
        return nombre;
    }

   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

   
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
