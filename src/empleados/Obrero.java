/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;


public class Obrero extends Padre{
      
    private String dependencia;
    private String telefono;
    
    
//    public Obrero()
//    {
//        super("Luis",4656);
//        setHorasext(50);
//        
//    }
//    
//    public Obrero(String valor, int cod){ //Asigna un valor que yo defina
//        super(valor,cod);
//        horasext=50;
//    }
    public Obrero() {
    }

    public Obrero(String dependencia, String telefono) {
        this.dependencia = dependencia;
        this.telefono = telefono;
    }
    
     @Override
    public void imprimirsueldo() {
        System.out.println("Datos del empleado: Obrero");
        System.out.println("Codigo: "+this.getCodigo());
        System.out.println("Nomnbre: "+this.getNombre());
        System.out.println("Codigo: "+this.getApellidos());
        System.out.println("Codigo: "+this.getDireccion());
        System.out.println("Dependencia: "+this.getDependencia());        
        System.out.println("Telefono: "+this.getTelefono());
        
        System.out.println("Sueldo: "+(Global.SUELDOBASICO+Global.bonoobrero));
        
    }    

    /**
     * @return the dependencia
     */
    public String getDependencia() {
        return dependencia;
    }

    /**
     * @param dependencia the dependencia to set
     */
    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    

}
