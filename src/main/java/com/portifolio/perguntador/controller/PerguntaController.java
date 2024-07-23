package com.portifolio.perguntador.controller;

import com.portifolio.perguntador.model.Pergunta;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PerguntaController {

    @GetMapping("/")
    public ModelAndView index() {


        List<Pergunta> perguntas = new ArrayList<>();

        Pergunta pergunta1 = new Pergunta();
        pergunta1.setId(1L);
        pergunta1.setTitulo("Há suspeita ou confirmação de que a ocorrência do óbito foi devido negligência do profissional de saúde responsável?");
        perguntas.add(pergunta1);

        Pergunta pergunta2 = new Pergunta();
        pergunta2.setId(2L);
        pergunta2.setTitulo("A declaração de óbito está feita?");
        perguntas.add(pergunta2);

        ModelAndView viewIndex = new ModelAndView("index");
        viewIndex.addObject("perguntas", perguntas);

        return viewIndex;
    }
}
