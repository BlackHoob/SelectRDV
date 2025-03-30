package com.alltour.selectour.service;

import com.alltour.selectour.model.RendezVous;
import com.alltour.selectour.repository.RendezVousRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class RendezVousService {

    private final RendezVousRepository rendezVousRepository;

    public RendezVousService(RendezVousRepository rendezVousRepository) {
        this.rendezVousRepository = rendezVousRepository;
    }

    public List<RendezVous> getAllRendezVous() {
        return rendezVousRepository.findAll();
    }
}
