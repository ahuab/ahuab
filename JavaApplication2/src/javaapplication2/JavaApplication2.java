/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Ashley
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         OperationType operation = OperationType.MULTIPLY;
        double result = operation.calculate(1,2);
        System.out.println(result);
    }
    
}
enum OperationType {
    ADD,
    SUBTRACT,
    MULTIPLY,
    DIVIDE;
    
    double calculate(double a, double b) {
        switch (this) {
            case ADD:   
                return a + b;
                
            case SUBTRACT:   
                return a - b;
                
            case MULTIPLY:   
                return a * b;
                
            case DIVIDE:   
                return a / b;
                
            default:   
                throw new ArithmeticException("Unknown operation");
        }
    }
    
}
