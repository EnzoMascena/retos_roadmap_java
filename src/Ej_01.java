public class Ej_01 {
    /*
     * EJERCICIO:
     * - Crea ejemplos utilizando todos los tipos de operadores de tu lenguaje:
     *   Aritméticos, lógicos, de comparación, asignación, identidad, pertenencia, bits...
     *   (Ten en cuenta que cada lenguaje puede poseer unos diferentes)
     * - Utilizando las operaciones con operadores que tú quieras, crea ejemplos
     *   que representen todos los tipos de estructuras de control que existan
     *   en tu lenguaje:
     *   Condicionales, iterativas, excepciones...
     * - Debes hacer print por consola del resultado de todos los ejemplos.
     * DIFICULTAD EXTRA (opcional):
     * Crea un programa que imprima por consola todos los números comprendidos
     * entre 10 y 55 (incluidos), pares, y que no son ni el 16 ni múltiplos de 3.
     * Seguro que al revisar detenidamente las posibilidades has descubierto algo nuevo.
     */
    public static void main(String[] args) {
        //Operadores aritmeticos
        int a = 1;
        int b = 2;
        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        int division = a / b;
        int modulo = a % b;

        System.out.println("a = "+ a +", b = "+ b);
        System.out.println("La suma de los numeros es: " + suma);
        System.out.println("Resta de los numeros es: " + resta);
        System.out.println("Multiplicacion de los numeros es: " + multiplicacion);
        System.out.println("Division de los numeros es: " + division);
        System.out.println("Modulo de los numeros es: " + modulo);

        //Operadores de asignacion
        int asignacion_simple = (a = 10);
        int asignacion_suma_y_asignacion = (a+= 5);
        int asignacion_resta_y_asignacion = (a-5);
        int asignacion_multiplicacion_y_asignacion = (a*5);
        int asignacion_division_y_asignacion = (a/=5);
        int asignacion_modulo_y_asignacion = (a%=10);

        System.out.println("La asignacion simple es:" + asignacion_simple);
        System.out.println("La asignacion suma y_asignacion es:" + asignacion_suma_y_asignacion);
        System.out.println("La asignacion resta es: " + asignacion_resta_y_asignacion);
        System.out.println("La asignacion multiplacion es: " + asignacion_multiplicacion_y_asignacion);
        System.out.println("La asignacion division es: " + asignacion_division_y_asignacion);
        System.out.println("La asignacion modulo es: " + asignacion_modulo_y_asignacion);

        //Operadores logicos

        int compuerta_AND = a & b;
        int compuerta_OR = a | b;
        int compuerta_XOR = a ^ b;
        int compuerta_NOT = ~a ;

        System.out.println("La compuerta AND: " + compuerta_AND);
        System.out.println("La compuerta OR: " + compuerta_OR);
        System.out.println("La compuerta XOR: " + compuerta_XOR);
        System.out.println("La compuerta NOT: " + compuerta_NOT);

    }
}
