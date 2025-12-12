package com.Sena2.Santiago.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Sena2.Santiago.dto.AnimalDto;
import com.Sena2.Santiago.dto.response.AnimalResponseDto;
import com.Sena2.Santiago.service.Service.AnimalService;

@RestController
@RequestMapping("/Animal")
public class AnimalController {

    @Autowired
    private AnimalService service;

    // Obtener todos
    @GetMapping("")
    public ResponseEntity<Object> findAll() {
        List<AnimalResponseDto> animales = service.findAll();
        return ResponseEntity.ok(animales);
    }

    // Guardar nuevo
    @PostMapping("")
    public ResponseEntity<Object> save(@RequestBody AnimalDto A) {
        AnimalResponseDto animal = service.save(A);
        return new ResponseEntity<>(animal, HttpStatus.CREATED);
    }

    // Buscar por ID
    @GetMapping("/{id}")
    public ResponseEntity<Object> findById(@PathVariable int id) {
        AnimalResponseDto animal = service.findByid(id);

        if (animal == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Animal no encontrado");
        }

        return ResponseEntity.ok(animal);
    }

    // Buscar por nombre
    @GetMapping("/findByName/{name}")
    public ResponseEntity<Object> findByName(@PathVariable String name) {
        List<AnimalResponseDto> animals = service.findByName(name);
        return ResponseEntity.ok(animals);
    }

    // Eliminar por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable int id) {
        service.delete(id);
        return ResponseEntity.ok("Animal eliminado correctamente");
    }

    // Actualizar
    @PutMapping("/{id}")
    public ResponseEntity<Object> update(@PathVariable int id, @RequestBody AnimalDto A) {
        AnimalResponseDto updated = service.update(id, A);

        if (updated == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Animal no encontrado para actualizar");
        }

        return ResponseEntity.ok(updated);
    }
}
