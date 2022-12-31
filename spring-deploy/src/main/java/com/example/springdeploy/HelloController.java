package com.example.springdeploy;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

/**Crear una clase HelloController que sea un controlador REST.
 *Dentro de la clase crear un método que retorne un saludo.
 *Probar que retorna el saludo desde el navegador y desde Postman.
**/

@RestController  //Un controlador tipo REST
public class HelloController {
    @Value("{app.message}")
    String message;
    @GetMapping("/hola") //Permite vincular una URL, al entrar con navegador en localhost:8080/hola accede a este controlador
    public String holaMundo(){ //Creamos una función que devuelva el String Hola mundo
        System.out.println(message);
        return "Hola a todos y todas";
    }
}
//java -version
