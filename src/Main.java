import com.dio.desafio.POO.Curso;
import com.dio.desafio.POO.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("uma mentoria de java");
        mentoria1.setData(LocalDate.now());


        System.out.println(curso1);
        System.out.println(mentoria1);
    }
}