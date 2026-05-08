package com.example.loadingassistant.model;

import com.example.loadingassistant.enums.ContainerType;
import com.example.loadingassistant.model.util.Dimension;

public class Container {
    private Dimension dimension;
    private ContainerType type;

    public Dimension getDimension() {
        return dimension;
    }
}
