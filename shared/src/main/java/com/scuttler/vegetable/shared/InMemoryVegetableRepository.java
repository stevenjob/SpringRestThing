package com.scuttler.vegetable.shared;

import com.scuttler.vegetable.common.Vegetable;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository("InMemVeg")
public class InMemoryVegetableRepository implements VegetableRepository {

    Map<String, Vegetable> vegetables = new HashMap<>();

    public InMemoryVegetableRepository() {
        createVegetables();
    }

    private void createVegetables() {
        vegetables.put("Artichoke", new Vegetable("Artichoke"));
        vegetables.put("Arugula", new Vegetable("Arugula"));
        vegetables.put("Asparagus", new Vegetable("Asparagus"));
        vegetables.put("Aubergine", new Vegetable("Aubergine"));
        vegetables.put("Amaranth", new Vegetable("Amaranth"));
        vegetables.put("Legumes", new Vegetable("Legumes"));
        vegetables.put("Bok choy", new Vegetable("Bok choy"));
        vegetables.put("Broccoflower", new Vegetable("Broccoflower"));
        vegetables.put("Broccoli", new Vegetable("Broccoli"));
        vegetables.put("Brussels sprouts", new Vegetable("Brussels sprouts"));
        vegetables.put("Cabbage", new Vegetable("Cabbage"));
        vegetables.put("Calabrese", new Vegetable("Calabrese"));
        vegetables.put("Carrots", new Vegetable("Carrots"));
        vegetables.put("Cauliflower", new Vegetable("Cauliflower"));
        vegetables.put("Celery", new Vegetable("Celery"));
        vegetables.put("Chard", new Vegetable("Chard"));
        vegetables.put("Collard greens", new Vegetable("Collard greens"));
        vegetables.put("Corn salad", new Vegetable("Corn salad"));
        vegetables.put("Endive", new Vegetable("Endive"));
        vegetables.put("Fiddleheads", new Vegetable("Fiddleheads"));
        vegetables.put("Frisee", new Vegetable("Frisee"));
        vegetables.put("Fennel", new Vegetable("Fennel"));
        vegetables.put("Kale", new Vegetable("Kale"));
        vegetables.put("Kohlrabi", new Vegetable("Kohlrabi"));
        vegetables.put("Lettuce Lactuca sativa", new Vegetable("Lettuce Lactuca sativa"));
        vegetables.put("Mustard greens", new Vegetable("Mustard greens"));
        vegetables.put("Nettles", new Vegetable("Nettles"));
        vegetables.put("New Zealand spinach", new Vegetable("New Zealand spinach"));
        vegetables.put("Okra", new Vegetable("Okra"));
        vegetables.put("Chives", new Vegetable("Chives"));
        vegetables.put("Garlic", new Vegetable("Garlic"));
        vegetables.put("Leek Allium porrum", new Vegetable("Leek Allium porrum"));
        vegetables.put("Onion", new Vegetable("Onion"));
        vegetables.put("Shallot", new Vegetable("Shallot"));
        vegetables.put("Spring onion", new Vegetable("Spring onion"));
        vegetables.put("Parsley", new Vegetable("Parsley"));
        vegetables.put("Radicchio", new Vegetable("Radicchio"));
        vegetables.put("Rhubarb", new Vegetable("Rhubarb"));
        vegetables.put("Beetroot", new Vegetable("Beetroot"));
        vegetables.put("Carrot", new Vegetable("Carrot"));
        vegetables.put("Celeriac", new Vegetable("Celeriac"));
        vegetables.put("Daikon", new Vegetable("Daikon"));
        vegetables.put("Ginger", new Vegetable("Ginger"));
        vegetables.put("Parsnip", new Vegetable("Parsnip"));
        vegetables.put("Rutabaga", new Vegetable("Rutabaga"));
        vegetables.put("Turnip", new Vegetable("Turnip"));
        vegetables.put("Radish", new Vegetable("Radish"));
        vegetables.put("Swede", new Vegetable("Swede"));
        vegetables.put("Turnip", new Vegetable("Turnip"));
        vegetables.put("Wasabi", new Vegetable("Wasabi"));
        vegetables.put("Horseradish", new Vegetable("Horseradish"));
        vegetables.put("White radish", new Vegetable("White radish"));
        vegetables.put("Skirret", new Vegetable("Skirret"));
        vegetables.put("Spinach", new Vegetable("Spinach"));
        vegetables.put("Topinambur", new Vegetable("Topinambur"));
        vegetables.put("Tat soi", new Vegetable("Tat soi"));
        vegetables.put("Potato", new Vegetable("Potato"));
        vegetables.put("Sweet Potato", new Vegetable("Sweet Potato"));
        vegetables.put("Yam", new Vegetable("Yam"));
        vegetables.put("Water chestnut", new Vegetable("Water chestnut"));
        vegetables.put("Watercress", new Vegetable("Watercress"));
        vegetables.put("Zucchini", new Vegetable("Zucchini"));
    }

    @Override
    public List<Vegetable> getAllVegetables() {
        return new ArrayList<>(vegetables.values());
    }

    @Override
    public Vegetable getVegetableByName(String name) {
        return vegetables.get(name);
    }

    @Override
    public void deleteVegetableByName(String name) {

    }

    @Override
    public void addVegetable(Vegetable vegetable) {

    }
}
