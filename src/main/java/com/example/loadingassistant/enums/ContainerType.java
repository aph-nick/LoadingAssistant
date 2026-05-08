package com.example.loadingassistant.enums;

import lombok.Getter;

@Getter
public enum ContainerType {
    BUS_4M(420.0, 210.0, 220.0, "Van 4.2m"),
    BUS_5M(480.0, 220.0, 230.0, "Van 4.8m"),
    SOLO_9M(950.0, 245.0, 250.0, "Solo Truck 9m"),
    TRUCK_13M(1360.0, 248.0, 275.0, "Standard Trailer 13.6m"),
    CONTAINER_10HC(280.0, 235.0, 269.0, "10' High Cube Container"),
    CONTAINER_20HC(590.0, 235.0, 269.0, "20' High Cube Container"),
    CONTAINER_40HC(1200.0, 235.0, 269.0, "40' High Cube Container");

    private final double length;
    private final double width;
    private final double height;
    private final String displayName;

    ContainerType(double length, double width, double height, String displayName) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.displayName = displayName;
    }
}