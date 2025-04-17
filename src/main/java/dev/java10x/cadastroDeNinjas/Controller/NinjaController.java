package dev.java10x.cadastroDeNinjas.Controller;

import dev.java10x.cadastroDeNinjas.DTO.CreateNinjaDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/ninja/v1/")
public class NinjaController {

    /*
    Here's how you'll develop the logic...
    NOTE: If you want to make it more organized, create a service and put the logic inside.
*/
    @PostMapping(path = "create", consumes = "application/json", produces = "application/json")
    public ResponseEntity<String> createNinja(@RequestBody CreateNinjaDTO data){

        return ResponseEntity.ok().body("Return some message");

    }
}
