package com.sa62.controllers;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sa62.DTO.AtividadeDTO;
import com.sa62.models.Atividade;
import com.sa62.repository.AtividadeRepository;



@Controller
//@RequestMapping("/uc9sa4")
public class AtividadeController {

    private final AtividadeRepository atividadeRepository;

    public AtividadeController(AtividadeRepository atividadeRepository) {
        this.atividadeRepository = atividadeRepository;
    }
    
    @GetMapping("/atividades")
    public ModelAndView listAtividades() {
        Iterable<Atividade> atividades = atividadeRepository.findAll();
        ModelAndView modelAndView = new ModelAndView("atividades");
        modelAndView.addObject("atividades", atividades);
        modelAndView.addObject("atividadeDTO", new AtividadeDTO());
        return modelAndView;
    }

    @PostMapping("/atividades/create")
    public String createAtividade(@ModelAttribute AtividadeDTO atividadeDTO) {
    	Atividade atividade = new Atividade();
    	atividade.setAtividade(atividadeDTO.getAtividade());
    	atividade.setResponsavel(atividadeDTO.getResponsavel());
    	atividade.setInicio(atividadeDTO.getInicio());
    	atividade.setFim(atividadeDTO.getFim());
    	atividade.setDependencia(atividadeDTO.getDependencia());
        atividadeRepository.save(atividade);
        return "redirect:/atividades";
    }

    @GetMapping("/atividades/edit/{id}")
    public ModelAndView editAtividade(@PathVariable Long id) {
    	Atividade atividade = atividadeRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("Invalid atvidade Id: " + id));
    	AtividadeDTO atividadeDTO = new AtividadeDTO();
        atividadeDTO.setId(atividade.getId());
        atividade.setAtividade(atividade.getAtividade());
    	atividade.setResponsavel(atividade.getResponsavel());
    	atividade.setInicio(atividade.getInicio());
    	atividade.setFim(atividade.getFim());
    	atividade.setDependencia(atividade.getDependencia());

        ModelAndView modelAndView = new ModelAndView("edit-form");
        modelAndView.addObject("atividadeDTO", atividadeDTO);
        return modelAndView;
    }
    
   
    @PostMapping("/atividades/edit/{id}")
    public String editAtividade(@PathVariable Long id, @ModelAttribute AtividadeDTO atividadeDTO) {
    	Atividade atividade = atividadeRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("Invalid atividade Id: " + id));
    	atividade.setAtividade(atividadeDTO.getAtividade());
    	atividade.setResponsavel(atividadeDTO.getResponsavel());
    	atividade.setInicio(atividadeDTO.getInicio());
    	atividade.setFim(atividadeDTO.getFim());
    	atividade.setDependencia(atividadeDTO.getDependencia());
        atividadeRepository.save(atividade);
        return "redirect:/atividades";
    }

    @GetMapping("/atividades/delete/{id}")
    public String deleteAtividade(@PathVariable Long id) {
    	atividadeRepository.deleteById(id);
        return "redirect:/atividades";
    }
}
