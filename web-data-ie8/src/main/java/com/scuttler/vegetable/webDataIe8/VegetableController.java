package com.scuttler.vegetable.webDataIe8;

import com.scuttler.vegetable.common.Vegetable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class VegetableController {

    @Autowired
    VegetableService vegetableService;

    @RequestMapping("/")
    public List<Vegetable> getAllVegetables() {
        return vegetableService.getAllVegetables();
    }

    @RequestMapping(value="/{name}")
    public Vegetable getVegetableByName(@PathVariable String name) {
        return vegetableService.getVegetableByName(name);
    }

    @RequestMapping(value = "/{name}", method = DELETE)
    public void deleteVegetableByName(@PathVariable String name) {
        vegetableService.deleteVegetableByName(name);
    }

    @RequestMapping(value = "/", method = POST)
    public void addVegetable(@Valid @RequestBody Vegetable vegetable, Errors errors) {
        if (errors.hasErrors()) {
            // do something
            System.out.println("Error here");
        }
        vegetableService.addVegetable(vegetable);
    }
}
