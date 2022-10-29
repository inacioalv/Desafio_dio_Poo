import br.com.inacio.dominio.Curso;
import br.com.inacio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("Primeiro curso");
        curso.setCargaHorario(1);

        System.out.println(curso);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("Descrição java");
        mentoria.setData(LocalDate.now());
        mentoria.calcularXp();

        System.out.println(mentoria);


    }
}