package cong.example.demojpa.controller;

import cong.example.demojpa.entity.Person;
import cong.example.demojpa.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping()
    public List<Person> getAll () {
        return personRepository.findAll();
    }

    @GetMapping("/{value}")
    public List<Person> getAllByName (@PathVariable String value) {
        return personRepository.findAllByNameContaining(value);
    }

    @GetMapping("/age/{value}")
    public List<Person> getAllByAge (@PathVariable int value) {
        return personRepository.findAllByAgeGreaterThan(value);
    }
}
