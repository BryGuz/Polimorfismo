/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Empresa {
    
    private ArrayList<Empleado> empleados;
    
    public Empresa(){
        this.empleados = new ArrayList<>();
    }
    
    public void AgregarEmpleado(Empleado e){
        this.empleados.add(e);
    }
    
    public double CalcularNomina(){
        double nomina=0;
        // Polimorfismo asignacion
        for(Empleado empleado : empleados){
            //Ligadura tardia, que version del metodo ejecuta
            nomina+=empleado.calcularsalario();
        }
        return nomina;
    }
    
    
    public double CalcularNominaProgramadores(){
       double nomina=0;
       for(Empleado empleado: empleados){
           if(empleado instanceof Programador){
               nomina+=empleado.calcularsalario();
           }
       }
       return nomina;
    }
    
    
    public ArrayList<Empleado> ListarEmpleado(){
        return this.empleados;
    }
    
    
}
