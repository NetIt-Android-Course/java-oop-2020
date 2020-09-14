package com.netit;

import java.util.ArrayList;
import java.util.List;

public class BarRepository {

    private static BarRepository instance;
    private List<Bar> bars;

    public static BarRepository getInstance() {
        if(instance == null) instance = new BarRepository();
        return instance;
    }

    private BarRepository() {
        this.bars = new ArrayList<>();
        populateBars();
    }

    private void populateBars() {
        bars.add(new Bar("Little Tequila", 10, 5, 23, 0, 5, 0));
        bars.add(new Bar("One More", 4, 5, 11, 0, 23, 30));
        bars.add(new Bar("Bar-dak", 1, 5, 18, 0, 24, 0));
        bars.add(new Bar("Rockbar", 2, 3, 21, 0, 4, 0));
    }

    public List<Bar> getBars() {
        return bars;
    }
}
