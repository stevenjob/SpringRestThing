package com.scuttler.vegetable.webIe8;

import com.scuttler.vegetable.common.Vegetable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class VegetableService {

    String url = "http://localhost:8003";

    public List<Vegetable> getAllVegetables() {
        RestTemplate restTemplate = new RestTemplate();
        Vegetable[] vegetables = restTemplate.getForObject(url, Vegetable[].class);

        return Arrays.asList(vegetables);
    }

    public Vegetable getVegetableByName(String name) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url + "/" + name, Vegetable.class);
    }

    public void deleteVegetableByName(String name) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete(url + "/" + name);
    }

    public void addVegetable(Vegetable vegetable) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.postForObject(url, vegetable, Vegetable.class);
    }
}
