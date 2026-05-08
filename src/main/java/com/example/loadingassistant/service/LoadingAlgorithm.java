package com.example.loadingassistant.service;

import com.example.loadingassistant.model.Cargo;
import com.example.loadingassistant.model.Container;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class LoadingAlgorithm {
    private List<Cargo> cargos;
    private Container container;

    public LoadingAlgorithm(List<Cargo> cargos) {
        this.cargos = new ArrayList<>(cargos);
    }
}
