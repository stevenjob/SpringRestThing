package com.scuttler.vegetable.webData;

import com.scuttler.vegetable.common.Vegetable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VegetableController {

    @Autowired
    VegetableService vegetableService;

    @RequestMapping("/")
    public List<Vegetable> getAllVegetables() {
        return vegetableService.getAllVegetables();
    }
}
