
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

import com.Sena2.Santiago.dto.ClassEntityDto;
import com.Sena2.Santiago.dto.response.ClassEntityResponseDto;
import com.Sena2.Santiago.service.Service.ClassEntityService;

@RestController
@RequestMapping("/ClassEntity")
public class ClassEntityController {

   @Autowired
    public ClassEntityService service;


/// quiro  devolver todos los datos
    @GetMapping("")
    public ResponseEntity<Object>findAll() {
        List<ClassEntityResponseDto> classEntity = service.findAll(); 
        return new ResponseEntity<>(classEntity, HttpStatus.OK); 

    }
    // pasa de cuerdo JSON Y pasarlo a un DTO de especies (muestra un mensaje)
    @PostMapping("")
    public ResponseEntity<Object>save(@RequestBody ClassEntityDto C ) {
       ClassEntityResponseDto classEntity = service.save(C); 
        return new ResponseEntity<Object>(classEntity, HttpStatus.CREATED); 

    }
    // traer infirmacion porr id
@GetMapping("{id}") 
public ResponseEntity<Object>findByid( @PathVariable int id) {
    ClassEntityResponseDto classEntity = service.findByid(id); 
    if (classEntity == null ) {
        return null; 
    }
    return new ResponseEntity<Object>(classEntity, HttpStatus.OK);
}
// Traer una lista de nombre ( en este caso de una especie)

@GetMapping("findByName/{name}") 
public ResponseEntity<Object>findByName ( @PathVariable String name ) {
    List<ClassEntityResponseDto> classEntity = service.findByName(name);
    return new ResponseEntity<>(classEntity, HttpStatus.OK); 
}

@DeleteMapping ("{id}") 
public ResponseEntity<Object>delete(@PathVariable int id  ) {
    service.delete(id); 
    return new ResponseEntity<Object>(" Se elimina la especie con el id", HttpStatus.OK); 
}
@PutMapping ("{id}") 
public ResponseEntity<?> update (@PathVariable int id , @RequestBody ClassEntityDto C) {
    ClassEntityResponseDto update = service.update(id, C); 
    if (update == null) {
        return null; 


    }
    return ResponseEntity.ok(update); 
}
}

    
    
   
    
