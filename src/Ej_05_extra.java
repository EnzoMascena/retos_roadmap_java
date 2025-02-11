public class Ej_05_extra {
    /*Crea dos programas que reciban dos parámetros (cada uno) definidos como
     * variables anteriormente.
     * - Cada programa recibe, en un caso, dos parámetros por valor, y en otro caso, por referencia.
     *   Estos parámetros los intercambia entre ellos en su interior, los retorna, y su retorno
     *   se asigna a dos variables diferentes a las originales. A continuación, imprime
     *   el valor de las variables originales y las nuevas, comprobando que se ha invertido
     *   su valor en las segundas.
     *   Comprueba también que se ha conservado el valor original en las primeras.
     */

    // Clase Wrapper para intercambio por referencia
    static class Wrapper {
        int value;
        Wrapper(int value) {
            this.value = value;
        }
    }

    // Metodo por valor (no afecta a las originales)
    public static int[] intercambiarPorValor(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        return new int[]{a, b};  // Retorna los valores intercambiados
    }

    // Metodo por referencia (modifica los valores originales)
    public static void intercambiarPorReferencia(Wrapper a, Wrapper b) {
        int temp = a.value;
        a.value = b.value;
        b.value = temp;
    }

    public static void main(String[] args) {
        // Variables originales para intercambio por valor
        int x = 10, y = 20;
        int[] resultado = intercambiarPorValor(x, y);

        // Variables originales para intercambio por referencia
        Wrapper objA = new Wrapper(30);
        Wrapper objB = new Wrapper(40);

        System.out.println("Antes del intercambio por valor:");
        System.out.println("x = " + x + ", y = " + y);

        System.out.println("Después del intercambio por valor:");
        System.out.println("nuevoX = " + resultado[0] + ", nuevoY = " + resultado[1]);

        System.out.println("Antes del intercambio por referencia:");
        System.out.println("objA.value = " + objA.value + ", objB.value = " + objB.value);

        // Intercambio por referencia
        intercambiarPorReferencia(objA, objB);

        System.out.println("Después del intercambio por referencia:");
        System.out.println("objA.value = " + objA.value + ", objB.value = " + objB.value);
    }
}
