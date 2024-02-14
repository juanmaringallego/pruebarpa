package ejerciciocuatro;

import java.util.Scanner;

/**
 *
 * @author Juan Esteban Marin G
 */
public class Ejerciciocuatro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;

       

        String[] dairy_products = {"Fairlife Milk", "Alta Dena Milk", "Queensland Butter"};
        Integer[] dairy_stock = {28, 36, 50};
        int cantidad = 0;

        do {
        System.out.println("Sistema de inventario. Ingrese una opcion");
        System.out.println("-----------------------------------------");
        System.out.println("1. Agregar producto");
        System.out.println("2. Ver reporte de inventario");
        System.out.println("3. Salir ");
        System.out.println("Su opcion: ");
        opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("AGREGAR PRODUCTO, Para agregar productos seleccione \n 1.Fairlife Milk \n 2.Alta Dena Milk\n 3.Queensland Butter\n");
                    opcion = entrada.nextInt();
                    if (opcion == 1) {
                        System.out.println("Ingrese el numero de productos a agregar para Fairlife Milk");
                        cantidad = entrada.nextInt();
                        dairy_stock[0] = dairy_stock[0] + cantidad;
                    }
                    if (opcion == 2) {
                        System.out.println("Ingrese el numero de productos a agregar para Alta Dena Milk");
                        cantidad = entrada.nextInt();
                        dairy_stock[1] = dairy_stock[1] + cantidad;
                    }
                    if (opcion == 3) {
                        System.out.println("Ingrese el numero de productos a agregar para Queensland Butter");
                        cantidad = entrada.nextInt();
                        dairy_stock[2] = dairy_stock[2] + cantidad;
                    } else {
                        System.out.println("Ingrese una opcion valida");

                    }
                    Thread.sleep(3000);
                    break;
                case 2:

                    System.out.println("VER REPORTE DE INVENTARIO ");
                    System.out.println("Nombre" + "                   " + "Existencias");
                    System.out.println("----------------------------------------");
                    System.out.println("Fairlife Milk" + "            " + dairy_stock[0]);
                    System.out.println("Alta Dena Milk" + "           " + dairy_stock[1]);
                    System.out.println("Queensland Butter" + "        " + dairy_stock[2]);
                    Thread.sleep(3000);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Se ha terminado la ejecucion");
            }
        }while(true);
    }

}
