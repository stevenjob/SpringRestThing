package com.scuttler.vegetable.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonView;

@JsonInclude(Include.NON_NULL)
public class Vegetable {

    public interface VegetableViewSummary {}

    @JsonView(VegetableViewSummary.class)
    String name;

    String description = "This is a vegetable. " +
            "A vegetable is any part of a plant that is consumed by humans as food as part of a savory meal. The term vegetable is somewhat arbitrary, " +
            "and largely defined through culinary and cultural tradition. It normally excludes other food derived from plants such as fruits, nuts and " +
            "cereal grains, but includes seeds such as pulses. The original meaning of the word vegetable, still used in biology, was to describe all " +
            "types of plant, as in the terms \"vegetable kingdom\" and \"vegetable matter\".";

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
