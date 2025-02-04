public class Ej_02_extra {
    /*Crea una función que reciba dos parámetros de tipo cadena de texto y retorne un número.
     * - La función imprime todos los números del 1 al 100. Teniendo en cuenta que:
     *   - Si el número es múltiplo de 3, muestra la cadena de texto del primer parámetro.
     *   - Si el número es múltiplo de 5, muestra la cadena de texto del segundo parámetro.
     *   - Si el número es múltiplo de 3 y de 5, muestra las dos cadenas de texto concatenadas.
     *   - La función retorna el número de veces que se ha impreso el número en lugar de los textos.
     */
    static int contador_global_numeros = 0;
    public static void main(String[] args) {
        imprimir_parametros("enzo", "maxi");
        System.out.println("La cantidad de veces que se imprimio un numero en pantalla fueron: "+ contador_global_numeros + " veces");
    }
    public static void imprimir_parametros(String cadena1, String cadena2){

        for(int i = 1 ; i <= 100 ; i++)
        {
            if(i % 3 == 0 && i % 5 == 0)
            {
                System.out.println(cadena1 + cadena2);
            } else if (i % 3 == 0 ){
                System.out.println(cadena1);
            } else if (i % 5 == 0){
                System.out.println(cadena2);
            } else {
                System.out.println(i);
                contador_global_numeros ++;
            }
        }
    }
}
