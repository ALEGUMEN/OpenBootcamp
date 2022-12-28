package com.example.Ejercicios_Spring_789.Controladores;

import org.springframework.web.bind.annotation.*;

/**Crear una clase HelloController que sea un controlador REST.
 *Dentro de la clase crear un método que retorne un saludo.
 *Probar que retorna el saludo desde el navegador y desde Postman.
**/

@RestController  //Un controlador tipo REST
public class HelloController {
    @GetMapping("/saludo")
    public String saludo(){
        return "HelloController";
    }
}