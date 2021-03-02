/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorespromedio60326;

/**
 *
 * @author Jun
 */
public class OperadoresPromedio60326 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     //Calcularemos el promedio de 5 valores, en este caso usaremos como ejemplo calificaciones de un alumno.  
     float calif1 = 8;
     float calif2 = 9;
     float calif3 = 5;
     float calif4 = 10;
     float calif5 = 7;
     //procedemos a calcular el promedio.
     float promedio = ((calif1 + calif2 + calif3 + calif4 + calif5) /5);
     //Imprimimos el resultado:
     System.out.println(" El promedio del alumno es de: " + promedio);
    }
    
}
