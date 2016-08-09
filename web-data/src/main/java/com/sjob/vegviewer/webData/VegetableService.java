package com.sjob.vegviewer.webData;

import com.sjob.vegviewer.common.Vegetable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class VegetableService {

    public List<Vegetable> getAllVegetables() {
        RestTemplate restTemplate = new RestTemplate();
        new Vegetable();
        Vegetable[] vegetables = restTemplate.getForObject("http://localhost:8001", Vegetable[].class);

        return Arrays.asList(vegetables);
    }
}
