package com.sjob.vegviewer.shared;

import com.sjob.vegviewer.common.Vegetable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VegetableRepository {

    List<Vegetable> getAllVegetables();

    Vegetable getVegetableByName(String name);

}
