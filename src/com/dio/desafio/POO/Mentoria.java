package com.dio.desafio.POO;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

   private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

   //CONSTRUTORS
    public Mentoria() {
    }

    public Mentoria(String titulo, String descricao, LocalDate data) {
        super(titulo, descricao);
        this.data = data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    //GETS
    public LocalDate getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }


}
