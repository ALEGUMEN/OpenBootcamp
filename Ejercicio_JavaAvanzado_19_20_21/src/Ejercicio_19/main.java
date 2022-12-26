package Ejercicio_19;

/**
 * Implementa Args en uno de los proyectos que se han ido trabajando y aplica las buenas prácticas
 * que se han visto en la sesión 19.
 * El siguiente programa capitaliza la primara letra de una palabra,
 * se usa un hashmap para guardar por clave los argumentos, toma como argumento la palabra que inicie con '-'
 * Los argumentos que paso para realizar la prueba:
 * -Nombre1  pedro -Nombre2 damian -Nombre3 alejandro
 */


import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        OptionsParser OptionsParser = new OptionsParser(args);
        ArrayList<String> idNombres = new ArrayList();

        OptionsParser.idNombre(args); //Registramos todos los identificadores de frase que nos pasen como argumento.

        //parseamos los argumentos
        OptionsParser.parse();

        //Obtenemos los identificadores de frases por separado y ejecutamos el método toJadenCase(frase)
        for(String idNombre : OptionsParser.getIdNombre()){
            System.out.println("\n*Nombre orignal: " + idNombre.replace("-", "") + "\n-> " + OptionsParser.getNombre(idNombre));
            System.out.println("*Nombre capitalizado: " + idNombre.replace("-", "") + "\n-> " + toJadenCase(OptionsParser.getNombre(idNombre)));
        }
    }


    //Método que capitaliza la primera letra de cada palabra y elimina espacios sobrantes
    public static String toJadenCase(String nombre) {
        String resultado = "";

        if ((nombre == null) || (nombre.length() < 1)) { //Comprobamos si el nombre está vacía
            return null;
        }else {
            String buffer;
            buffer = nombre.toUpperCase();

            resultado += buffer.charAt(0); //1º caracter a mayúsculas

            for (int i = 1; i < nombre.length(); i++) {
                if (nombre.charAt(i) == ' ') {
                    resultado+=' ';
                    do {
                        i++;
                    }while (nombre.charAt(i) == ' ');
                    resultado += buffer.charAt(i);
                } else {
                    resultado += nombre.charAt(i);
                }
            }
        }
        return resultado;
    }
}
