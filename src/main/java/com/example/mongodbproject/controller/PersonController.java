package com.example.mongodbproject.controller;

import com.example.mongodbproject.entity.Person;
import com.example.mongodbproject.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
@AllArgsConstructor
public class PersonController {

    private final PersonRepository personRepository;

    @GetMapping
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    @PostMapping
    public Person createPerson(@RequestBody Person person) {
        return personRepository.save(person);
    }

    @GetMapping("/{id}")
    public Person getPersonById(@PathVariable String id) {
        return personRepository.findById(id).orElse(null);
    }

    @GetMapping("/name")
    public Person getPersonByName(@RequestParam("name") String name) {
        return personRepository.findByName(name).orElse(null);
    }

    @PutMapping("/{id}")
    public Person updatePerson(@PathVariable String id, @RequestBody Person person) {
        Person existingPerson = personRepository.findById(id).orElse(null);
        if (existingPerson != null) {
            existingPerson.setName(person.getName());
            existingPerson.setAge(person.getAge());
            return personRepository.save(existingPerson);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable String id) {
        personRepository.deleteById(id);
    }
}