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

import com.Sena2.Santiago.dto.HabitatDto;
import com.Sena2.Santiago.dto.response.HabitatResponseDto;
import com.Sena2.Santiago.service.Service.HabitatService;

@RestController
@RequestMapping("/Habitat")
public class HabitatController {

    @Autowired
    public HabitatService service;


/// quiro  devolver todos los datos
    @GetMapping("")
    public ResponseEntity<Object>findAll() {
    List<HabitatResponseDto> habitat =service.findAll(); 
        return new ResponseEntity<>(habitat, HttpStatus.OK); 

    }
    // pasa de cuerdo JSON Y pasarlo a un DTO de especies (muestra un mensaje)
    @PostMapping("")
    public ResponseEntity<Object>save(@RequestBody HabitatDto H ) {
         HabitatResponseDto habitat = service.save(H); 
        return new ResponseEntity<Object>(habitat, HttpStatus.CREATED); 

    }
    // traer infirmacion porr id
@GetMapping("{id}") 
public ResponseEntity<Object>findById( @PathVariable int id) {
    HabitatResponseDto habitat = service.findByid(id); 

    if ( habitat == null) {
        return null; 
    }
    return new ResponseEntity<Object>(habitat, HttpStatus.OK);
}
// Traer una lista de nombre ( en este caso de una especie)

@GetMapping("findByType/{name}") 
public ResponseEntity<Object>findByType (@PathVariable String type) {
    List<HabitatResponseDto> habitat= service.findByType(type);
    return new ResponseEntity<Object>(habitat, HttpStatus.OK); 
}
@GetMapping ("findByLocation/{location}")
public ResponseEntity<Object>findByLocation (@PathVariable String location) {
    List<HabitatResponseDto> habitat = service.findByLocation(location); 
    return new ResponseEntity<Object>(habitat, HttpStatus.OK); 


}@GetMapping ("findByClimate/{climate}")
public ResponseEntity<Object>findByClimate (@PathVariable String climate) {
    List<HabitatResponseDto> habitat = service.findByLocation(climate); 
    return new ResponseEntity<Object>(habitat, HttpStatus.OK); 
}
@DeleteMapping ("{id}") 
public ResponseEntity<Object>delete(@PathVariable int id  ) {
    service.delete(id); 
    return new ResponseEntity<Object>(" Se elimina la especie con el id", HttpStatus.OK); 
}
@PutMapping ("/{id}")

public ResponseEntity<?> update (@PathVariable int id, @RequestBody HabitatDto H) {
    HabitatResponseDto update = service.update(id, H); 
    if (update == null) {
        return null; 
    }
    return ResponseEntity.ok(update); 
}
}
