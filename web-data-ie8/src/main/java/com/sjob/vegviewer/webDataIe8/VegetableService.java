package com.sjob.vegviewer.webDataIe8;

import com.sjob.vegviewer.common.Vegetable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class VegetableService {
    String url = "http://localhost:8001";

    public List<Vegetable> getAllVegetables() {
        RestTemplate restTemplate = new RestTemplate();
        new Vegetable();
        Vegetable[] vegetables = restTemplate.getForObject(url, Vegetable[].class);

        return Arrays.asList(vegetables);
    }

    public Vegetable getVegetableByName(String name) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url + "/" + name, Vegetable.class);
    }
}
