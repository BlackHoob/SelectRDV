package com.alltour.selectour.repository;

import com.alltour.selectour.model.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgentVoyageRepository extends JpaRepository<RendezVous, Long> {}
