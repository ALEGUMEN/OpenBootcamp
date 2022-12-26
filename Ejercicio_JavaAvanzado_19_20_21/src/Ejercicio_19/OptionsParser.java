package Ejercicio_19;

import java.util.HashMap;
import java.util.Set;

/**
 * Implementa Args en uno de los proyectos que se han ido trabajando y aplica
 * las buenas prácticas que se han visto en la sesión 19.
 */

public class OptionsParser {
    private HashMap<String, String> argumentos = new HashMap();
    private String []args;

    private OptionsParser(){}

    //Constructor con argumentos
    public OptionsParser(String []args){
        this.args = args;
    }

    //Función que registra todos los identificadores de los nombres
    public void idNombre(String []args){
        for(String argumento : args) {
            if(argumento.startsWith("-")){
                argumentos.put(argumento, "");
            }
        }
    }

    //Función que devuelve Set<String> con las claves
    public Set<String> getIdNombre(){
        return argumentos.keySet();
    }

    //Función que obtiene el nombre según el identificador
    public String getNombre(String identificadorNombre){
        return argumentos.get(identificadorNombre);
    }

    //Función que asigna cada nombre con su identificador
    public void setIdValor(String identificadorNombre, String nombre){
        argumentos.replace(identificadorNombre, nombre);
    }

    public void parse(){
        for(int i=0; i<args.length; i++){

            String identificadorNombre = args[i];

            if(argumentos.containsKey(identificadorNombre)){
                String nombreActual = "";
                for(int j= i+1;  j<args.length && !args[j].startsWith("-"); j++){
                    nombreActual += args[j];
                    nombreActual += " ";
                }
                //se asigna(identificador, nombre)
                setIdValor(identificadorNombre, nombreActual.trim());
            }
        }
    }
}
