/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Main {

    /**Scanner lee = new Scanner(System.in);
     * @param args the command line arguments
     */
    public static int menu(){
        int opcion=0;
        Scanner lee = new Scanner(System.in);
        System.out.println(" 1. Agregar  ");
        System.out.println(" 2. Listar ");
        System.out.println(" 3. Nomina ");
        System.out.println(" 4. Nomina Programador ");
        System.out.println(" 5. Salir ");
        System.out.println(" 6. Eliminar Empleado");
        opcion=lee.nextInt();
        return(opcion);
    }
    public static void main(String[] args) {
           Scanner lee = new Scanner(System.in);
        int opcion=-1;
       Empresa empresa = new Empresa();
        do{
         opcion = menu();
         switch(opcion){
             case 1:
                 
                 System.out.println("Nombre del empleado");
                 String name = lee.next();
                 System.out.println(" Tipo de empleado; 1. Programador   2. Arquitecto");
                 int tipo = lee.nextInt();
                 Empleado empleado=null;
                 //
                 if(tipo==1){
                      empleado= new Programador(name);
                 }else if(tipo==2){
                     empleado = new Arquitecto(name);
                 }
                 empresa.AgregarEmpleado(empleado);
                 break;
                
             case 2:
                 
                 ArrayList<Empleado> empleados = empresa.ListarEmpleado();
                 for(int i=0; i<empleados.size();i++){
                     Empleado e = empleados.get(i);
                     if(e instanceof Programador)
                         System.out.println(e.getNombre() + " Programador ");
                 else
                 System.out.println(e.getNombre() + " Arquitecto");
                 }
                 
                 break;
                 
             case 3:
                 double nomina = empresa.CalcularNomina();
                 System.out.println(" Nomina " + nomina);
                 break;
                 
                 
             case 4:
                 
                 double nominap = empresa.CalcularNominaProgramadores();
                 System.out.println(" Nomina programadores " + nominap);
                 break;
             case 5:
                 
                 
                 
             case 6:
                 System.out.println("Saliendo");
                 break;
                 
             default:
                 
                
                 
         }
         
        }while(opcion !=5);
        

    
    
        
}
}
