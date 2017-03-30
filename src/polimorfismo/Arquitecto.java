/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author Estudiante
 */
public class Arquitecto extends Empleado{

    public Arquitecto(String n) {
        super(n);
    }

    @Override
    public double calcularsalario() {
        return 399.60; 
    }
    
    
    
    
}
