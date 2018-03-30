package SpringMVC.controller;

import SpringMVC.model.Person;
import SpringMVC.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("persons")
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping("/{id}")
    public Person get (@PathVariable("id") long id) {
        return personService.get(id);
    }

}
