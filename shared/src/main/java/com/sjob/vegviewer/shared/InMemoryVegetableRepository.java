package com.sjob.vegviewer.shared;

import com.sjob.vegviewer.common.Vegetable;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryVegetableRepository implements VegetableRepository {

    List<Vegetable> vegetables = new ArrayList<>();

    public InMemoryVegetableRepository() {
        createVegetables();
    }

    private void createVegetables() {
        vegetables.add(new Vegetable("Artichoke"));
        vegetables.add(new Vegetable("Arugula"));
        vegetables.add(new Vegetable("Asparagus"));
        vegetables.add(new Vegetable("Aubergine"));
        vegetables.add(new Vegetable("Amaranth"));
        vegetables.add(new Vegetable("Legumes"));
        vegetables.add(new Vegetable("Bok choy"));
        vegetables.add(new Vegetable("Broccoflower"));
        vegetables.add(new Vegetable("Broccoli"));
        vegetables.add(new Vegetable("Brussels sprouts"));
        vegetables.add(new Vegetable("Cabbage"));
        vegetables.add(new Vegetable("Calabrese"));
        vegetables.add(new Vegetable("Carrots"));
        vegetables.add(new Vegetable("Cauliflower"));
        vegetables.add(new Vegetable("Celery"));
        vegetables.add(new Vegetable("Chard"));
        vegetables.add(new Vegetable("Collard greens"));
        vegetables.add(new Vegetable("Corn salad"));
        vegetables.add(new Vegetable("Endive"));
        vegetables.add(new Vegetable("Fiddleheads"));
        vegetables.add(new Vegetable("Frisee"));
        vegetables.add(new Vegetable("Fennel"));
        vegetables.add(new Vegetable("Kale"));
        vegetables.add(new Vegetable("Kohlrabi"));
        vegetables.add(new Vegetable("Lettuce Lactuca sativa"));
        vegetables.add(new Vegetable("Mustard greens"));
        vegetables.add(new Vegetable("Nettles"));
        vegetables.add(new Vegetable("New Zealand spinach"));
        vegetables.add(new Vegetable("Okra"));
        vegetables.add(new Vegetable("Chives"));
        vegetables.add(new Vegetable("Garlic"));
        vegetables.add(new Vegetable("Leek Allium porrum"));
        vegetables.add(new Vegetable("Onion"));
        vegetables.add(new Vegetable("Shallot"));
        vegetables.add(new Vegetable("Spring onion"));
        vegetables.add(new Vegetable("Parsley"));
        vegetables.add(new Vegetable("Radicchio"));
        vegetables.add(new Vegetable("Rhubarb"));
        vegetables.add(new Vegetable("Beetroot"));
        vegetables.add(new Vegetable("Carrot"));
        vegetables.add(new Vegetable("Celeriac"));
        vegetables.add(new Vegetable("Daikon"));
        vegetables.add(new Vegetable("Ginger"));
        vegetables.add(new Vegetable("Parsnip"));
        vegetables.add(new Vegetable("Rutabaga"));
        vegetables.add(new Vegetable("Turnip"));
        vegetables.add(new Vegetable("Radish"));
        vegetables.add(new Vegetable("Swede"));
        vegetables.add(new Vegetable("Turnip"));
        vegetables.add(new Vegetable("Wasabi"));
        vegetables.add(new Vegetable("Horseradish"));
        vegetables.add(new Vegetable("White radish"));
        vegetables.add(new Vegetable("Skirret"));
        vegetables.add(new Vegetable("Spinach"));
        vegetables.add(new Vegetable("Topinambur"));
        vegetables.add(new Vegetable("Tat soi"));
        vegetables.add(new Vegetable("Potato"));
        vegetables.add(new Vegetable("Sweet Potato"));
        vegetables.add(new Vegetable("Yam"));
        vegetables.add(new Vegetable("Water chestnut"));
        vegetables.add(new Vegetable("Watercress"));
        vegetables.add(new Vegetable("Zucchini"));
    }

    @Override
    public List<Vegetable> getAllVegetables() {
        return vegetables;
    }

}
