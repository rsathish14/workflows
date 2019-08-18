package workflow.persons.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import workflow.persons.Person;
import workflow.persons.PersonRepository;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonRepository repository;

    public List<Person> findAll () {
        return repository.findAll();
    }

    public void create(Person person) {
        repository.insert(person);
    }
}