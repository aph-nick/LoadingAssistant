package com.example.loadingassistant.model;

import com.example.loadingassistant.enums.CargoType;
import com.example.loadingassistant.model.util.Dimension;

public class Cargo {
    private Dimension dimension;
    private CargoType type;

    public Cargo(Dimension dimension) {
        this.dimension = dimension;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }
}
