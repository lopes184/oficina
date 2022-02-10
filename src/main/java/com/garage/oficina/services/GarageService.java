package com.garage.oficina.services;

import com.garage.oficina.model.GarageModel;

import java.util.List;
import java.util.Optional;

public interface GarageService {

    List<GarageModel>buscarTodos();
    Optional<GarageModel>buscarPorId(Long id);
    GarageModel salvarGarage(GarageModel garage);
    GarageModel atualizarGarage(GarageModel garage);
    void excluir(Long id);
}
