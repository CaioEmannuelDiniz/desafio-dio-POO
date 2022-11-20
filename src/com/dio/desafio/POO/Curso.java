package com.dio.desafio.POO;

public class Curso extends Conteudo{
    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    //CONSTRUTOR
    public Curso() {
    }

    public Curso(String titulo, String descricao, int cargaHoraria) {
        super(titulo,descricao);
        this.cargaHoraria = cargaHoraria;
    }

    //SETS
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    //GETS
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
