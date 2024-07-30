package com.portifolio.perguntador.controller;

import com.portifolio.perguntador.model.Pergunta;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PerguntaController {

    @GetMapping("/public")
    String publicRoute() {
        return "/public/public.html";
    }

    @GetMapping("/")
    public ModelAndView index() {

        String[] titulos = {
            "O céu é azul?",
            "A terra é redonda?"
        };

        List<Pergunta> perguntas = new ArrayList<>();

        for (int i = 0; i < titulos.length; i++) {
            Pergunta pergunta = new Pergunta();
            pergunta.setId((long) i);
            pergunta.setTitulo(titulos[i]);
            perguntas.add(pergunta);
        }

        ModelAndView viewIndex = new ModelAndView("index");
        viewIndex.addObject("perguntas", perguntas);

        return viewIndex;
    }
}
