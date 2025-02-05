import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ej_03_ArrayList {
    /*EJERCICIO:
     * - Muestra ejemplos de creación de todas las estructuras soportadas por defecto
     *   en tu lenguaje.
     * - Utiliza operaciones de inserción, borrado, actualización y ordenación.
     */
    public static void main(String[] args){
        ArrayList<Integer> lista = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.println("\n----Menú ArrayLista----");
            System.out.println("1. Mostrar lista");
            System.out.println("2. Agregar elemento");
            System.out.println("3. Eliminar elemento");
            System.out.println("4. Ordenar los elementos del lista");
            System.out.println("5. Salir");
            System.out.println("Ingrese una opción:");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Contenido de la lista: ");
                    imprimir(lista);
                    break;
                case 2:
                    agregar_valor(lista, scanner);
                    break;
                case 3:
                    eliminar(lista, scanner);
                    break;
                case 4:
                    Collections.sort(lista);
                    System.out.println("Orden los elementos del lista: "+ Arrays.toString(lista.toArray()));
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }

        scanner.close();

    }
    private static void imprimir(ArrayList<Integer> lista){
        if(lista.isEmpty()){
            System.out.println("Lista vacia");
        } else {
            for(int num : lista){
                System.out.println(num + " ");
            }
            System.out.println();
        }
    }
    private static void agregar_valor(ArrayList<Integer> lista, Scanner sc){
        System.out.println("Ingrese el valor, [0/para salir]: ");
        int valor = sc.nextInt();
        if(valor == 0){
            return;
        }else {
            lista.add(valor);
        }
        agregar_valor(lista, sc);
    }
    private static void eliminar(ArrayList<Integer> lista, Scanner sc){
        System.out.println("Ingrese el valor, [0/para salir]: ");
        int valor = sc.nextInt();
        if(valor == 0){
            return;
        }
        boolean eliminado = lista.remove(Integer.valueOf(valor));

        if(eliminado){
            System.out.println("El valor " + valor + " se eliminado");
        } else {
            System.out.println("El valor " + valor + " no se a encontrado");
        }
    }


}
