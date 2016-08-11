package com.sjob.vegviewer.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonView;

@JsonInclude(Include.NON_NULL)
public class Vegetable {

    public interface VegetableViewSummary {}

    @JsonView(VegetableViewSummary.class)
    String name;

    String description = "hello";

    public Vegetable() {

    }

    public Vegetable(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
