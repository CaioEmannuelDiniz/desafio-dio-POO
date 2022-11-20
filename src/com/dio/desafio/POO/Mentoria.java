package com.dio.desafio.POO;

import java.time.LocalDate;

public class Mentoria {
   private String titulo;
   private String descricao;
   private LocalDate data;

   //CONSTRUTORS

    public Mentoria() {
    }

    public Mentoria(String titulo, String descricao, LocalDate data) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
    }

    //SETES
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    //GETS
    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", data=" + data +
                '}';
    }
}