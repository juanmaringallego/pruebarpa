
package ejerciciouno;

import java.util.Scanner;

/**
 *
 * @author Juan Esteban Marin G
 */
public class Ejerciciouno {
 
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
        int n=0,suma=0,y=0;
        String cadena="";
        System.out.println("Ingrese el numero para la serie: ");
        n=entrada.nextInt();
        System.out.println("ingrese el numero de terminos a sumar: ");
        y=entrada.nextInt();
        
        System.out.println("Los numero a sumar son: ");
        for (int i = 0; i < y; i++) {
            cadena+=n;
            System.out.println(" "+cadena);
            suma=suma+(Integer.parseInt(cadena));
        }
               
           System.out.println("Lasuma de los terminos es: "+suma);    
        
    

    }
}
