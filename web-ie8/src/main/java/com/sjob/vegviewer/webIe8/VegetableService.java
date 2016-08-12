package com.sjob.vegviewer.webIe8;

import com.sjob.vegviewer.common.Vegetable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
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
}
