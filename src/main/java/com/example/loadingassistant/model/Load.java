package com.example.loadingassistant.model;

import com.example.loadingassistant.model.util.Dimension;

public class Load {
    private Dimension dimension;

    public Load(Dimension dimension) {
        this.dimension = dimension;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }
}
