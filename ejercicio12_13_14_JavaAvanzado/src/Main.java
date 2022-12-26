package FuncionesLimpias;

import java.util.Arrays;
/**
 *
 * Siguiendo las normas de nombrado de la sesión 12, diseña dos funciones limpias.
 *
 * Teniendo en cuenta lo visto en la sesión 14,
 * comenta uno de los proyectos sobre los que hayas trabajado en el curso,
 * si ya contenían comentarios y has detectado algún comentario
 * sobrante, confuso, redundante o mal descrito, indícalo
 * */

public class Main {
    public static void main(String[] args) {
        int[] numeros ={ 7, 11 ,88, -130, 768, 25, 0, 9};
        System.out.println("El número mayor es: " + findMax(numeros));
        System.out.print("Imprimir sólo los nº pares: ");
        printEven(numeros);
    }

    /**int findMax(int[] numbers)
     * esta función determinará que elemento del array es mayor
     */
    public static int findMax(int[] numeros) {
        return Arrays.stream(numeros).reduce(0, (a, b) -> (a > b) ? a:b);
    }

    /**void printEven(int[] numeros)
     * Esta función recorre el array de números uno por uno y evalúa si es par o no
     * Si es un número par, lo muestra en una nueva línea.
     */
    public static void printEven(int[] numeros){
        for (int numero: numeros){
            if(numero %2 ==0){
                System.out.println(numero);
            }
        }
    }
}