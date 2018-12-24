package workflow.persons.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import workflow.persons.Person;
import workflow.persons.PersonRepository;

@Service
public class PersonService {
    @Autowired
    private PersonRepository repository;
    public Person findByName (String name){
        Person p = repository.findByName(name);
        return p;
    }

    public void create(Person person) {
        repository.insert(person);
    }
}