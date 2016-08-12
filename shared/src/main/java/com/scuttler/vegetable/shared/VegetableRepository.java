package com.scuttler.vegetable.shared;

import com.scuttler.vegetable.common.Vegetable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VegetableRepository {

    List<Vegetable> getAllVegetables();

    Vegetable getVegetableByName(String name);

}
