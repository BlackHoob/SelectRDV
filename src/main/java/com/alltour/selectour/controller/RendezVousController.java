package com.alltour.selectour.controller;

import com.alltour.selectour.model.RendezVous;
import com.alltour.selectour.service.RendezVousService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/RendezVous")

public class RendezVousController {
    private final RendezVousService rendezVousService;

    public RendezVousController(RendezVousService rendezVousService) {
        this.rendezVousService = rendezVousService;
    }

    @GetMapping
    public List<RendezVous> getAllRendezVous() {
        return rendezVousService.getAllRendezVous();
    }
}
