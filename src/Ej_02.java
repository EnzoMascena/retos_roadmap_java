public class Ej_02 {
    /*EJERCICIO:
     * - Crea ejemplos de funciones básicas que representen las diferentes
     *   posibilidades del lenguaje:
     *   Sin parámetros ni retorno, con uno o varios parámetros, con retorno...
     * - Comprueba si puedes crear funciones dentro de funciones.
     * - Utiliza algún ejemplo de funciones ya creadas en el lenguaje.
     * - Pon a prueba el concepto de variable LOCAL y GLOBAL.
     * - Debes hacer print por consola del resultado de todos los ejemplos.
     *   (y tener en cuenta que cada lenguaje puede poseer más o menos posibilidades)*/

    static int variable_global = 10;
    public static void main(String[] args) {
    //funciones y procedimientos
        funcion_sin_parametros();
        funcion_con_paramtro(7);
        System.out.println("Funcion con retorno de la suma de 5 y 4 " + funcion_con_retorno(5,4));
    //funciones de funciones

        System.out.println("No se puede usar funciones de funciones dentro de Java");

    //ejemplo de funciones del lenguaje

        System.out.println("Número aleatorio entre 30,000 y 10,000,000: " + (30_000 + (int)(Math.random() * (10_000_001 - 30_000))));
    //ejemplo global y local

        System.out.println("Valor inicial de la variable global " + variable_global);
        modificar_global();
        System.out.println("Valor modificado de la variable global " + variable_global);

    }

    public static void funcion_sin_parametros() {
        System.out.println("Esa es funcion sin parametros");
    }

    public static void funcion_con_paramtro(int num) {
        System.out.println("Esa es funcion con parametro " + num);
    }

    public static int funcion_con_retorno(int num1, int num2) {
        return num1 + num2;
    }

    public static void modificar_global() {
        variable_global += 25;
        System.out.println("La variable global en esta funcion vale: "+ variable_global);
    }



}
