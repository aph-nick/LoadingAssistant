package com.example.loadingassistant.service;

import com.example.loadingassistant.model.Load;
import com.example.loadingassistant.model.LoadingSpace;

import java.util.List;

public class LoadingAlgorithm {
    private List<Load>  loads;
    private LoadingSpace loadingSpace;

    public LoadingAlgorithm(List<Load> loads) {
        this.loads = loads;
    }
}
