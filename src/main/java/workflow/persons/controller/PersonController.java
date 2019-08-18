package workflow.persons.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import workflow.persons.Person;
import workflow.persons.service.PersonService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("persons")
public class PersonController {
    @Autowired
    PersonService personService;

    @GetMapping("/list")
    public List<Person> findAll() {
        return personService.findAll();
    }

    @PostMapping("/create")
    public void create(@RequestBody Person person) {
        personService.create(person);
    }

}