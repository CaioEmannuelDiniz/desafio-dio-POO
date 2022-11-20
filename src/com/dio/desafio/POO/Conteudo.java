package com.dio.desafio.POO;

//Instanciando uma class do tipo abstrada que nao pode
//ser instanciada um new dessa classe
public abstract class Conteudo {

    private String titulo;
    private String descricao;

    // protectd static pode ser acessado por outra classe
    protected static final double XP_PADRAO = 10d;

    //abstract obrigatorio o inicio
    public abstract double calcularXp();

    //CONSTRUTORS
    public Conteudo() {
    }

    public Conteudo(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    //SETS
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    //GETS
    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }
}
