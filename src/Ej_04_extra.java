import java.util.Arrays;
import java.util.Scanner;

public class Ej_04_extra {
    /*DIFICULTAD EXTRA (opcional):
     * Crea un programa que analice dos palabras diferentes y realice comprobaciones
     * para descubrir si son:
     * - Palíndromos
     * - Anagramas
     * - Isogramas
     */
    public static void main(String[] args) {
        System.out.println("----Ingrese 2 palabras----");
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la primera palabra: ");
        String palabra1 = sc.nextLine().toLowerCase();
        System.out.print("Ingrese la segunda palabra: ");
        String palabra2 = sc.nextLine().toLowerCase();

        System.out.println("\nResultados:");
        System.out.println("¿La primera palabra es palíndromo? " + esPalindromo(palabra1));
        System.out.println("¿La segunda palabra es palíndromo? " + esPalindromo(palabra2));
        System.out.println("¿Son anagramas entre sí? " + esAnagrama(palabra1, palabra2));
        System.out.println("¿La primera palabra es isograma? " + esIsograma(palabra1));
        System.out.println("¿La segunda palabra es isograma? " + esIsograma(palabra2));
    }

    public static boolean esPalindromo(String palabra) {
        String inversa = new StringBuilder(palabra).reverse().toString();
        return palabra.equals(inversa);
    }

    public static boolean esAnagrama(String palabra1, String palabra2) {
        if (palabra1.length() != palabra2.length()) {
            return false;
        }
        char[] letras1 = palabra1.toCharArray();
        char[] letras2 = palabra2.toCharArray();
        Arrays.sort(letras1);
        Arrays.sort(letras2);
        return Arrays.equals(letras1, letras2);
    }

    public static boolean esIsograma(String palabra) {
        palabra = palabra.replaceAll("[^a-zA-Z]", "");
        boolean[] letrasUsadas = new boolean[26];
        for (char letra : palabra.toCharArray()) {
            int index = letra - 'a';
            if (letrasUsadas[index]) {
                return false;
            }
            letrasUsadas[index] = true;
        }
        return true;
    }
}
