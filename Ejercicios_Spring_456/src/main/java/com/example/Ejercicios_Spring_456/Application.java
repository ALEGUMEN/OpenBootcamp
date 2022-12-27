package com.example.Ejercicios_Spring_456;

import com.example.Ejercicios_Spring_456.Entities.*;
import com.example.Ejercicios_Spring_456.Repositories.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.*;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
            //contexto y repositorio
			ApplicationContext context = SpringApplication.run(Application.class, args);
			LaptopRepository repository = context.getBean(LaptopRepository.class);

		    /**Desde LaptopController crear un método que devuelva una lista de objetos Laptop.
		     * Probar que funciona desde Postman.
		     * Los objetos Laptop se pueden insertar desde el método main de la clase principal.
		     */

             /** Agregamos 2 Laptop */
			 Laptop lap1 = new Laptop(null, "HP", "sj15'5/256/8bg", 565.53d, 8);
			 Laptop lap2 = new Laptop(null, "Asus", "aspire14'5/512/16", 622.10d, 16);

			/** Guardamos en el repositorio */
			repository.save(lap1);
			repository.save(lap2);

			System.out.println("Nº Laptops en base de datos: "+ repository.findAll().size());
			/**Ejercicio 3
			 *Crear un método en LaptopController que reciba un objeto Laptop enviado en formato JSON desde Postman y persistirlo en la base de datos.
			 *Comprobar que al obtener de nuevo los laptops aparece el nuevo ordenador creado.
			 **/
		}
	}