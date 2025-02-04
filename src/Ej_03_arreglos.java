import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ej_03_arreglos {
    /*EJERCICIO:
     * - Muestra ejemplos de creación de todas las estructuras soportadas por defecto
     *   en tu lenguaje.
     * - Utiliza operaciones de inserción, borrado, actualización y ordenación.
     */
    public static void main(String[] args) {
        int[] arreglo = new int[5];
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("El arreglo tiene " + arreglo.length + " elementos");

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = rand.nextInt(10) + 1;
            System.out.println("El valor " + i + " va en la posición " + arreglo[i]);
        }

        boolean continuar = true;

        while (continuar) {
            System.out.println("\n----Menú Arreglo----");
            System.out.println("1. Mostrar arreglo");
            System.out.println("2. Cambiar un valor del arreglo");
            System.out.println("3. Eliminar elemento");
            System.out.println("4. Ordenar los elementos del arreglo");
            System.out.println("5. Salir");
            System.out.println("Ingrese una opción:");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Contenido del arreglo: ");
                    imprimir(arreglo);
                    break;
                case 2:
                    cambiarValor(arreglo, scanner);
                    break;
                case 3:
                    arreglo = eliminar(arreglo, scanner); // Actualiza el arreglo después de eliminar
                    break;
                case 4:
                    Arrays.sort(arreglo);
                    System.out.println("Orden los elementos del arreglo: "+ Arrays.toString(arreglo));
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

    public static void imprimir(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println(); // Salto de línea
    }

    public static void cambiarValor(int[] arreglo, Scanner scanner) {
        System.out.println("El arreglo tiene " + arreglo.length + " elementos.");
        System.out.print("Ingrese la posición del arreglo que desea cambiar (0 a " + (arreglo.length - 1) + "): ");
        int posicion = scanner.nextInt();

        if (posicion >= 0 && posicion < arreglo.length) {
            System.out.print("Ingrese el nuevo valor para la posición " + posicion + ": ");
            int nuevoValor = scanner.nextInt();
            arreglo[posicion] = nuevoValor;
            System.out.println("El valor en la posición " + posicion + " ha sido cambiado a " + nuevoValor + ".");
        } else {
            System.out.println("Posición inválida. Intente nuevamente.");
        }
    }

    public static int[] eliminar(int[] arreglo, Scanner scanner) {
        System.out.println("El arreglo tiene " + arreglo.length + " elementos.");
        System.out.print("Ingrese la posición del arreglo que desea eliminar (0 a " + (arreglo.length - 1) + "): ");
        int posicion = scanner.nextInt();

        if (posicion >= 0 && posicion < arreglo.length) {
            int[] nuevoArreglo = new int[arreglo.length - 1];
            for (int i = 0, j = 0; i < arreglo.length; i++) {
                if (i != posicion) {
                    nuevoArreglo[j] = arreglo[i];
                    j++;
                }
            }
            System.out.println("El valor en la posición " + posicion + " ha sido eliminado.");
            return nuevoArreglo;
        } else {
            System.out.println("Posición inválida. Intente nuevamente.");
            return arreglo; // Devuelve el arreglo sin cambios
        }
    }
}
