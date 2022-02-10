package com.garage.oficina.services;


import com.garage.oficina.model.GarageModel;
import com.garage.oficina.repositories.GarageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GarageServiceImpl implements GarageService{

    @Autowired
    private GarageRepository garageRepository;


    @Override
    public List<GarageModel> buscarTodos() {
        return garageRepository.findAll();
    }

    @Override
    public Optional<GarageModel> buscarPorId(Long id) {
        return garageRepository.findById(id);
    }

    @Override
    public GarageModel salvarGarage(GarageModel garage) {
        return garageRepository.save(garage);
    }

    @Override
    public GarageModel atualizarGarage(GarageModel garage) {
        Optional<GarageModel> garageEncontrada = garageRepository.findById(garage.getId());
        if(garageEncontrada.isPresent()){
            garageEncontrada.get().setId(garage.getId());
            garageEncontrada.get().setNome(garage.getNome());
            garageEncontrada.get().setEmail(garage.getEmail());
            garageEncontrada.get().setContato(garage.getContato());
            garageEncontrada.get().setMarcaDaMoto(garage.getMarcaDaMoto());
            garageEncontrada.get().setModeloDaMoto(garage.getModeloDaMoto());
            garageEncontrada.get().setAnoDaMoto(garage.getAnoDaMoto());
            garageEncontrada.get().setServico(garage.getServico());
                    }
        return garageEncontrada.orElse(null);
    }

    @Override
    public void excluir(Long id) {
         garageRepository.deleteById(id);

    }
}
