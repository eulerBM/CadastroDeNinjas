package dev.java10x.cadastroDeNinjas.Controller;

import dev.java10x.cadastroDeNinjas.DTO.CreateNinjaDTO;
import dev.java10x.cadastroDeNinjas.DTO.IdNinjaDTO;
import dev.java10x.cadastroDeNinjas.Entity.NinjaEntity;
import dev.java10x.cadastroDeNinjas.Service.NinjaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/ninja/v1/")
public class NinjaController {

    @Autowired
    private NinjaService ninjaService;

    @PostMapping(path = "create", consumes = "application/json", produces = "application/json")
    public ResponseEntity<NinjaEntity> createNinjaController(@Valid @RequestBody CreateNinjaDTO data){

        return ninjaService.createNinjaService(data);

    }

    @GetMapping(path = "get/{id}", produces = "application/json")
    public ResponseEntity<NinjaEntity> getNinjaController(@PathVariable Long id){

        return ninjaService.getNinjaService(new IdNinjaDTO(id));

    }

    @DeleteMapping(path = "delete/{id}", produces = "application/json")
    public ResponseEntity<Void> deleteNinjaController(@PathVariable Long id){

        return ninjaService.deleteNinjaService(id);

    }
}
