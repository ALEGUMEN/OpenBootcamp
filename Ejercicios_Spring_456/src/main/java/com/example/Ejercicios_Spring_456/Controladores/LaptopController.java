package com.example.Ejercicios_Spring_456.Controladores;
import com.example.Ejercicios_Spring_456.Entities.Laptop;
import com.example.Ejercicios_Spring_456.Repositories.LaptopRepository;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * Dentro de la misma app crear las clases necesarias para trabajar con "ordenadores":
 * - LaptopController (controlador)
 * **/

@RestController
public class LaptopController {
    //Atributos
    private LaptopRepository laptopRepository;

    //Constructores
    public LaptopController(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    /**Ejercicio 2
     *Desde LaptopController crear un método que devuelva una lista de objetos Laptop.
     */
    @GetMapping("/api/allLaptops")
    public List<Laptop> findAll() {
        return laptopRepository.findAll();
    }

    /**Ejercicio 3
     *Crear un método en LaptopController que reciba un objeto Laptop enviado en formato JSON desde Postman y
     * persistirlo en la base de datos.
     */

    @PostMapping("/api/addLaptop")
    public Laptop create(@RequestBody Laptop laptop) {
        return laptopRepository.save(laptop);//Guardar el libro recibido, en la base de datos y mostrar el libro en pantalla
    }
}