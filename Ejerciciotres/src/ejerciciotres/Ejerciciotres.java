
package ejerciciotres;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Juan Esteban Marin G
 */


public class Ejerciciotres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] listaEntrada = new int[n];
        for (int i = 0; i < n; i++) {
            listaEntrada[i] = scanner.nextInt();
        }

        int[] matrizSalida = agruparElementosSimilaresUnArregloSinMap(listaEntrada);

        for (int elemento : matrizSalida) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }

    public static int[] agruparElementosSimilaresUnArregloSinMap(int[] listaEntrada) {

        List<Integer> listaSalida = new ArrayList<>();

        for (int elemento : listaEntrada) {
            if (!listaSalida.contains(elemento)) {
                listaSalida.add(elemento);
            }
        }

        int[] conteoElementos = new int[listaSalida.size()];
        for (int i = 0; i < listaEntrada.length; i++) {
            int elementoActual = listaEntrada[i];
            int indice = listaSalida.indexOf(elementoActual);
            conteoElementos[indice]++;
        }

        int[] matrizSalida = new int[listaSalida.size()];

        int posActual = 0;

        for (int i = 0; i < listaSalida.size(); i++) {
            int elemento = listaSalida.get(i);
            int cantidad = conteoElementos[i];

            for (int j = 0; j < cantidad; j++) {
                matrizSalida[posActual++] = elemento;
            }
        }

        return matrizSalida;
    }
}
