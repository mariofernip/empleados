/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Empleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        int encontro = 0;
        String numerolibros = "0";
        String deseos = "";
        System.out.println("***** BIENVENIDO *****");
        do {
            System.out.println("INGRESE EL NUMERO DE EMPLEADOS QUE DESEA REGISTRAR");

            numerolibros = lector.nextLine();
            for (int i = 0; i < numerolibros.length(); i++) {
                if (Character.isDigit(numerolibros.charAt(i)) == false) {
                    System.out.println("No es un número, entrada no válida");
                    numerolibros = "0";

                }
            }
            if (Integer.parseInt(numerolibros) < 1) {
                System.out.println("Sea coherente");
            }
        } while (Integer.parseInt(numerolibros) < 1);

       //Padre[] coleccion= new Padre[Integer.parseInt(numerolibros)];     
        ArrayList<Padre> coleccion = new ArrayList<Padre>();

        //lector.nextLine();
        for (int i = 0; i < Integer.parseInt(numerolibros); i++) {
            int j = i + 1;
            System.out.println("Ingrese 1 administrador, 2 obrero, 3 inspector, 4 trabajador");

            int deseo = lector.nextInt();
            switch (deseo) {
                case 1: {
                    System.out.println("***** EMPLEADO Nro. *****");
                    Administrador a = new Administrador();
                    System.out.println("Ingrese el CODIGO");
                    a.setCodigo(lector.nextInt());
                    lector.nextLine();
                    System.out.println("Ingrese el NOMBRE ");
                    a.setNombre(lector.nextLine());
                    System.out.println("Ingrese el APELLIDO");
                    a.setApellidos(lector.nextLine());
                    System.out.println("Ingrese el DIRECCION ");
                    a.setDireccion(lector.nextLine());
                    System.out.println("Ingrese el SEGURO SOCIAL ");
                    a.setSeguroSocial(lector.nextLine());
                    System.out.println("Ingrese las horas extras ");
                    a.setHortrab(lector.nextInt());
                    //coleccion[i] = a;               
                    coleccion.add(a);
                }
                break;
                case 2: {
                    System.out.println("***** EMPLEADO Nro.*****");
                    Obrero o = new Obrero();
                    System.out.println("Ingrese el CODIGO");
                    o.setCodigo(lector.nextInt());
                    lector.nextLine();
                    System.out.println("Ingrese el NOMBRE ");
                    o.setNombre(lector.nextLine());
                    System.out.println("Ingrese el APELLIDO");
                    o.setApellidos(lector.nextLine());
                    System.out.println("Ingrese el DIRECCION ");
                    o.setDireccion(lector.nextLine());
                    System.out.println("Ingrese el TELEFONO ");
                    o.setTelefono(lector.nextLine());
                    System.out.println("Ingrese el DEPENDENCIA ");
                    o.setDependencia(lector.nextLine());
                    //coleccion[i] = o;               
                    coleccion.add(o);

                }
                break;

                case 3: {
                    System.out.println("***** EMPLEADO Nro. " + j + "*****");
                    Inspector in = new Inspector();
                    System.out.println("Ingrese el CODIGO");
                    in.setCodigo(lector.nextInt());
                    lector.nextLine();
                    System.out.println("Ingrese el NOMBRE ");
                    in.setNombre(lector.nextLine());
                    System.out.println("Ingrese el APELLIDO");
                    in.setApellidos(lector.nextLine());
                    System.out.println("Ingrese el DIRECCION ");
                    in.setDireccion(lector.nextLine());

                    System.out.println("Ingrese el ESPECIALIDAD ");
                    in.setEspecialidad(lector.nextLine());
                    System.out.println("Ingrese las horas extras ");
                    in.setHortrab(lector.nextInt());
                    //coleccion[i] = in;               
                    coleccion.add(in);

                }
                break;

                case 4: {
                    System.out.println("***** EMPLEADO Nro. *****");
                    Trabajador t = new Trabajador();
                    System.out.println("Ingrese el CODIGO");
                    t.setCodigo(lector.nextInt());
                    lector.nextLine();
                    System.out.println("Ingrese el NOMBRE ");
                    t.setNombre(lector.nextLine());
                    System.out.println("Ingrese el APELLIDO");
                    t.setApellidos(lector.nextLine());
                    System.out.println("Ingrese el DIRECCION ");
                    t.setDireccion(lector.nextLine());
                    System.out.println("Ingrese el AREA ");
                    t.setArea(lector.nextLine());
                    System.out.println("Ingrese las horas extras ");
                    t.setHortrab(lector.nextInt());
                    //coleccion[i] = t;               
                    coleccion.add(t);
                }
                break;

            }
        }
        lector.nextLine();
        System.out.println("***** BUSQUEDA DE EMPLEADO *****");
        System.out.println("Ingrese 1 Adminisrador, 2 Obrero, 3 Inspector, 4 Trabajador, para listar segun tipo de Empleado");
        String busqueda = lector.nextLine();

        for (Padre lib : coleccion) {

            System.out.println("**EMPLEADO**");
            if (lib instanceof Administrador && busqueda.equals("1")) {
                ((Administrador) lib).imprimirsueldo();
            }
            if (lib instanceof Obrero && busqueda.equals("2")) {
                ((Obrero) lib).imprimirsueldo();
            }
            if (lib instanceof Inspector && busqueda.equals("3")) {
                ((Inspector) lib).imprimirsueldo();
            }
            if (lib instanceof Trabajador && busqueda.equals("4")) {
                ((Trabajador) lib).imprimirsueldo();
            }
        }

        System.out.println("");

        System.out.println("");
        System.out.println("Desea ver la lista completa de EMPLEADOS s/n ");
        String deseoverlista = lector.nextLine();

        if (deseoverlista.equalsIgnoreCase("S")) {
            System.out.println("***** LISTADO *****");
            for (Padre lib : coleccion) {
                System.out.println("**EMPLEADO**");
                if (lib instanceof Administrador) {
                    ((Administrador) lib).imprimirsueldo();
                }
                if (lib instanceof Obrero) {
                    ((Obrero) lib).imprimirsueldo();
                }
                if (lib instanceof Inspector) {
                    ((Inspector) lib).imprimirsueldo();
                }
                if (lib instanceof Trabajador) {
                    ((Trabajador) lib).imprimirsueldo();
                }

            }
        }
        System.out.println("*****Hasta Pronto*****");

    }

}
