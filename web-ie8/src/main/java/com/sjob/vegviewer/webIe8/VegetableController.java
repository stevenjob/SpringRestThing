package com.sjob.vegviewer.webIe8;

import com.sjob.vegviewer.common.Vegetable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class VegetableController {

    @Autowired
    VegetableService vegetableService;

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Vegetables");
        List<Vegetable> vegetables = vegetableService.getAllVegetables();
        model.addAttribute("vegetables", vegetables);
        return "home";
    }

    @RequestMapping(value="/{name}")
    public String getVegetableByName(@PathVariable String name, Model model) {

        Vegetable vegetable = vegetableService.getVegetableByName(name);
        if (vegetable == null) {
            return null;
        }

        model.addAttribute("title", "Vegetables");
        model.addAttribute("vegetable", vegetable);
        return "veg";
    }
}
