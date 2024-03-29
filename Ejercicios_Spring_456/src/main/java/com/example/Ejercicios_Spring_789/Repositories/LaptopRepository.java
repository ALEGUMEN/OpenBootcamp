package com.example.Ejercicios_Spring_789.Repositories;


import com.example.Ejercicios_Spring_789.Entities.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/***********Dentro de la misma app crear las clases necesarias para trabajar con "ordenadores":
 - LaptopRepository (repositorio)*********/
@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Long> {
}