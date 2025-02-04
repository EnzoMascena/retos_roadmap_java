public class EJ_00 {
    //00 - SINTAXIS, VARIABLES, TIPOS DE DATOS Y HOLA MUNDO
    /*EJERCICIO:
     * - Crea un comentario en el código y coloca la URL del sitio web oficial del
     *   lenguaje de programación que has seleccionado.
     * - Representa las diferentes sintaxis que existen de crear comentarios
     *   en el lenguaje (en una línea, varias...).
     * - Crea una variable (y una constante si el lenguaje lo soporta).
     * - Crea variables representando todos los tipos de datos primitivos
     *   del lenguaje (cadenas de texto, enteros, booleanos...).
     * - Imprime por terminal el texto: "¡Hola, [y el nombre de tu lenguaje]!"*/
    public static void main(String[] args) {
        //https://www.java.com/es/
        //comentario
        /*
        *
        *
        *
        *
        */
        final String constante = "Soy una constante";
        String variable = "Soy una variable";

        byte byte_variable = 127;
        short short_variable = 32767;
        long long_variable = 4294967295L;
        float float_variable = 3.14159265f;
        double double_variable = 3.14159265;
        char char_variable = 'A';
        boolean bool_variable = true;

        System.out.println("Hola Java");
    }
}
