package one.digitalinnovation.personapi.controller;

import one.digitalinnovation.personapi.model.Person;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    @GetMapping("")
    public ResponseEntity<String> getBook(){
        return ResponseEntity.ok().body("foo");
    }
}
