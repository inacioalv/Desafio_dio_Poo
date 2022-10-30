import br.com.inacio.dominio.Bootcamp;
import br.com.inacio.dominio.Curso;
import br.com.inacio.dominio.Dev;
import br.com.inacio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("Curso de Poo");
        curso.setCargaHorario(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Curso de dados");
        curso2.setCargaHorario(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("Descrição java");
        mentoria.setData(LocalDate.now());
        mentoria.calcularXp();

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);


        Dev dev = new Dev();
        dev.setName("Inácio");
        dev.inscreverBootcamp(bootcamp);

        System.out.println("\u001B[33m"
                + "<===================>"
                + "\u001B[0m");

        System.out.println("Dev Inscrito:"+dev.getName());
        System.out.println("Conteúdos Inscritos"+dev.getConteudosInscritos());

        System.out.println("\u001B[47m"
                + "-----------------"
                + "\u001B[0m");

        dev.progredir();
        dev.progredir();
        System.out.println("Conteúdos Inscritos"+dev.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos"+dev.getConteudosConcluidos());
        System.out.println("XP:"+dev.calcularTotalXp());


        System.out.println("\u001B[33m"
                + "<===================>"
                + "\u001B[0m");

        System.out.println("\u001B[34m"
                + "<===================>"
                + "\u001B[0m");

        Dev dev2 = new Dev();
        dev2.setName("Lucas");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Dev Inscrito:"+dev2.getName());
        System.out.println("Conteúdos Inscritos"+dev2.getConteudosInscritos());

        System.out.println("\u001B[47m"
                + "-----------------"
                + "\u001B[0m");

        dev2.progredir();
        System.out.println("Conteúdos Inscritos"+dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos"+dev2.getConteudosConcluidos());
        System.out.println("XP:"+dev2.calcularTotalXp());

        System.out.println("\u001B[34m"
                + "<===================>"
                + "\u001B[0m");




    }
}