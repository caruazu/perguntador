package com.portifolio.perguntador.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Pergunta {

    public Pergunta(Long id, String titulo, String resposta) {
        this.id = id;
        this.titulo = titulo;
        this.resposta = resposta;
    }


    private Long id;
    private String titulo;
    private String resposta;

    public Pergunta() {

    }
}
