package com.example.Ejercicios_Spring_789.Controladores;
import com.example.Ejercicios_Spring_789.Entities.Laptop;
import com.example.Ejercicios_Spring_789.Repositories.LaptopRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.List;
import java.util.Optional;

/**
 * Dentro de la misma app crear las clases necesarias para trabajar con "ordenadores":
 * - LaptopController (controlador)
 * **/

@RestController
public class LaptopController {
    //Atributos              lr
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
    //@GetMapping("/api/laptops")

    @GetMapping("/api/allLaptops/{id}")
    public ResponseEntity<Laptop> findOneById(@PathVariable("id") Long id){
        Optional<Laptop> lap= laptopRepository.findById(id);
        if (lap.isPresent()){
            return ResponseEntity.ok(lap.get());
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/api/create")
    public ResponseEntity<Laptop> create(@RequestBody Laptop laptop){

        if (laptop.getId()!=null){
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(laptopRepository.save(laptop));
    }
    @PutMapping("/api/allLaptops/{id}")
    public ResponseEntity<Laptop> update(@PathVariable Long id,@RequestBody Laptop laptop){
        if (id== laptop.getId()){
            return ResponseEntity.ok(laptopRepository.save(laptop));
        }

        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/api/allLaptops/{id}")
    public ResponseEntity<Laptop> deleteById(@PathVariable("id") Long id){
        if (!laptopRepository.existsById(id)){
            return ResponseEntity.notFound().build();
        }
        laptopRepository.deleteById(id);
        return  ResponseEntity.noContent().build();

    }
    @DeleteMapping("/api/allLaptops")
    public void deleteAll(){
        laptopRepository.deleteAll();
    }

}




