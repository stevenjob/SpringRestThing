package com.sjob.vegviewer.sharedService;

import com.sjob.vegviewer.common.Vegetable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VegetableRepository {

    List<Vegetable> getAllVegetables();

}
