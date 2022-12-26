package Refactoring;

/**Actividad:
 * Aplicar refactoring a proyectos tratados en el curso y usar
 * patrones de diseño vistos en clase.
 *
 * se creó una clase FindOdd que devuelve el número que se repite de forma impar
 *
 */
public class Main {
    public static void main(String[] args) {
        System.out.println((Refactoring.FindOdd.findNumber(new int[]{8,7,6,8,7,6,3,3,3})));
        System.out.println((Refactoring.FindOdd.findNumber(new int[]{3,1,1,3,1,2,2})));
        System.out.println((Refactoring.FindOdd.findNumber(new int[]{6,5,4,6,5,4,4,7,7,9,9})));

    }

}