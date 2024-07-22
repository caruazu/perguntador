package com.portifolio.perguntador.model;

public class Pergunta {

    public Pergunta(Long id, String titulo, String resposta) {
        this.id = id;
        this.titulo = titulo;
        this.resposta = resposta;
    }

    private Long id;
    private String titulo;
    private String resposta;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }
}
