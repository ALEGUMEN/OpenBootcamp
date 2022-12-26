import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        int[] array ={1,2,3,4,5,6};
        File fichero = null;
        FileReader fileR = null;
        /** no.1
         * Arithmetic exception tratando de hacer una división entre dos números, siendo el que divide 0.
         */
        try{
            System.out.println(dividir(5,0));
        }catch(ArithmeticException e){
            System.out.println("Arithmetic exception: "+ e.getMessage());
        }
        /** no.2
         * ArrayIndexOutOfBounds con un array de 6 elementos, tratando de alcanzar el noveno elemento.
         */
        try{
            System.out.println(array[9]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
        /** no.3
         * FileNotFound tratando de acceder a un fichero que no existe.
         */
        try{
            fichero = new File("Essay.txt");
            fileR= new FileReader(fichero);
        }catch(FileNotFoundException e){
            System.out.println(e);
        }finally{
            try{
                if(fileR != null){
                    fileR.close();
                }
            }catch (Exception e){
                System.out.println("FileNotFoundException: " + e.getMessage());
            }
        }
    }

    public static int dividir(int numerador, int denominador){
        return numerador/denominador;
    }
}
