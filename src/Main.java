import com.dio.desafio.POO.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("uma mentoria de java");
        mentoria1.setData(LocalDate.now());

        //Poliformismo criando objeto conteudo do tipo curso contido em Conteudo
        //Conteudo conteudo = new Curso();

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Develope");
        bootcamp.setDescricao("Descrição Bootcamp java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria1);

        System.out.println("\nDEV CAIO");
        Dev devcaio = new Dev();
        devcaio.setNome("CAIO");
        devcaio.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos"+devcaio.getConteudosInscritos());
        System.out.println("Conteudos concluidos"+devcaio.getConteudosConcluidos());

        System.out.println("------------");

        System.out.println("Conteudos Inscritos"+devcaio.getConteudosInscritos());
        devcaio.progredir();
        System.out.println("Conteudos concluidos"+devcaio.getConteudosConcluidos());
        System.out.println("XP:"+devcaio.calcularTotalXp());

        System.out.println("\nDEV JOAO");
        Dev devjoao = new Dev();
        devjoao.setNome("JOAO");
        devjoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos"+devjoao.getConteudosInscritos());
        System.out.println("Conteudos concluidos"+devjoao.getConteudosConcluidos());

        System.out.println("------------");

        System.out.println("Conteudos Inscritos"+devjoao.getConteudosInscritos());
        devjoao.progredir();
        devjoao.progredir();
        System.out.println("Conteudos concluidos"+devjoao.getConteudosConcluidos());
        System.out.println("XP:"+devjoao.calcularTotalXp());
    }
}