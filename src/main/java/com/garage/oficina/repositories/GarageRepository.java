package com.garage.oficina.repositories;

import com.garage.oficina.model.GarageModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GarageRepository extends JpaRepository <GarageModel, Long> {
}
