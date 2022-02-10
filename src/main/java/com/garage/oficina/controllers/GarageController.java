package com.garage.oficina.controllers;

import com.garage.oficina.model.GarageModel;
import com.garage.oficina.services.GarageService;
import com.garage.oficina.services.GarageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/garage")
public class GarageController {

    @Autowired
    private GarageService garageService;

    @GetMapping
    public List<GarageModel> buscarTodos(){
        return garageService.buscarTodos();
    }

    @GetMapping("/{id}")
    public Optional<GarageModel> buscarPorId(@PathVariable long id){
        return garageService.buscarPorId(id);
    }

    @PostMapping
    public GarageModel cadastrarGarage(@RequestBody GarageModel garage){
        return garageService.salvarGarage(garage);
    }
    @PutMapping("/{id}")
    public GarageModel atualizarGarage(@RequestBody GarageModel garage,@PathVariable Long id){
        return garageService.atualizarGarage(garage);
    }

    @DeleteMapping("/{id}")
    public void delatarGarage(@PathVariable Long id){
        garageService.excluir(id);
    }
}

