
package ejerciciodos;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Juan Esteban Marin G
 */
public class Ejerciciodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada= new Scanner (System.in);
        String cadena=" ";
        System.out.println("ingrese los numeros de la lista separados por coma ");
        cadena=entrada.next();
        
        
        System.out.println("Los elementos de la lista se imprimiran si cumplen las siguientes condiciones ");
        System.out.println("1. El numero debe ser divisible por cinco");
        System.out.println("2. Si el numero es mayor que 600, no se incluye en la salida");
        System.out.println("3. Si el numero es mayor que 1000, se detiene el procesamiento");
        
        String[] partes = cadena.split(",");
        Stack<Integer> pila = new Stack<>();
        for (int i = 0; i < partes.length; i++) {
            if (Integer.parseInt(partes[i])>=0){
                if(Integer.parseInt(partes[i])<600){
                    if(Integer.parseInt(partes[i])>=1000){
                        System.exit(0);
                    }else{
                        pila.push(Integer.parseInt(partes[i]));
                    } 
                }
            }
            
        }
        ArrayList<Integer> elementos = new ArrayList<>();
        Stack<Integer> pilaAuxiliar = new Stack<>();
        while (!pila.isEmpty()) {
        int elemento = pila.pop();
       
        elementos.add(elemento);
       }
        System.out.println(elementos);     
        
        
    }
    
    
    
    
}
