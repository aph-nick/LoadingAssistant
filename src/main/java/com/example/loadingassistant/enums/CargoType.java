package com.example.loadingassistant.enums;

import lombok.Getter;

@Getter
public enum CargoType {
    EURO_PALLET(120.0, 80.0, 144.0, "Euro Pallet (EPAL)"),
    HALF_PALLET(60.0, 80.0, 144.0, "Half Pallet"),
    CUSTOM(0.0, 0.0, 0.0, "Custom Dimensions");

    private final double length;
    private final double width;
    private final double height;
    private final String displayName;

    CargoType(double length, double width, double height, String displayName) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.displayName = displayName;
    }
}