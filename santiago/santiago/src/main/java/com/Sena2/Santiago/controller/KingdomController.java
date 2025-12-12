package com.Sena2.Santiago.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.Sena2.Santiago.dto.KingdomDto;
import com.Sena2.Santiago.dto.response.KingdomResponseDto;
import com.Sena2.Santiago.service.Service.KingdomService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping ("/kingdom")
public class KingdomController {

    @Autowired
    private KingdomService service; 

    // ese me sirve para devolver todos los datos de una lista en este caso es todo lo de ( Reinos)
    @GetMapping("")
    public ResponseEntity<Object>findAll() {
        List<KingdomResponseDto> kingdom = service.findAll(); 
    return new ResponseEntity<>(kingdom, HttpStatus.OK); 


    }
// este es para pasar un cuerpo JSON y pasarlo a KingdomDto// llamanos un service y se devulve un mensaje
// osea guarda un nuevo curso usando DTO
    @PostMapping("")
    public ResponseEntity<Object>save( @RequestBody KingdomDto K) {

       KingdomResponseDto kingdom = service.save(K); 
        return new ResponseEntity<Object>(kingdom,HttpStatus.CREATED); 

    }
    // aqui se trae toda la informacion por id
    @GetMapping("{id}")
    public ResponseEntity<Object>findByid(@PathVariable int id) {
        KingdomResponseDto kingdom = service.findById(id);

        if (kingdom == null) {
            return null; 
        }
    
        return new ResponseEntity<Object>(kingdom, HttpStatus.OK); 
    }

    // traer una lista de nombre (Nombre del reino)
    @GetMapping("filterByName/{name}")
    public ResponseEntity<Object>filterByName(@PathVariable String name) {
        List<KingdomResponseDto> kingdoms= service.filterByName(name); 

        return new ResponseEntity<>(kingdoms, HttpStatus.OK); 
    }

     // Eliminaar por id
    @DeleteMapping("{id}") 
    public ResponseEntity<Object>delete(@PathVariable int id ) {
        service.delete(id); 
        return new ResponseEntity<Object>("Se elimina",HttpStatus.OK); 
    }

    @PutMapping ("/{id}")
    public ResponseEntity<?> update (@PathVariable int id, @RequestBody KingdomDto K) {
          KingdomResponseDto update = service.update(id, K); 
          if (update == null) {
            return null; 
          }  
          return ResponseEntity.ok(update); 
    }

    }
    

    
    
    
