package com.example.loadingassistant.service;

import com.example.loadingassistant.model.Cargo;
import com.example.loadingassistant.model.LoadingSpace;

import java.util.List;

public class LoadingAlgorithm {
    private List<Cargo> cargos;
    private LoadingSpace loadingSpace;

    public LoadingAlgorithm(List<Cargo> cargos) {
        this.cargos = cargos;
    }
}
