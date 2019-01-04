package workflow.persons.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import workflow.persons.Person;
import workflow.persons.service.PersonService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("persons")
public class PersonController {
    @Autowired
    PersonService personService;

    @GetMapping("/{name}")
    public Person findByName(@PathVariable String name) {
        return personService.findByName(name);
    }

    @PostMapping("/create")
    public void create(@RequestBody Person person) {
        personService.create(person);
    }

}