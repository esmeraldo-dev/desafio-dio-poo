import br.com.br.desafio.dominio.Bootcamp;
import br.com.br.desafio.dominio.Curso;
import br.com.br.desafio.dominio.Dev;
import br.com.br.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição do Curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devVinicius = new Dev();
        devVinicius.setNome("VINICIUS");
        devVinicius.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Vinicius: " + devVinicius.getConteudosInscritos());
        devVinicius.progredir();
        devVinicius.progredir();
        System.out.println("-->");
        System.out.println("Conteúdos Inscritos Vinicius: " + devVinicius.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Vinicius: " + devVinicius.getConteudosConcluidos());
        System.out.println("XP: " + devVinicius.calcularXp());

        System.out.println("###############\n");

        Dev devDante = new Dev();
        devDante.setNome("DANTE");
        devDante.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Dante: " + devDante.getConteudosInscritos());
        devDante.progredir();
        devDante.progredir();
        devDante.progredir();
        System.out.println("-->");
        System.out.println("Conteúdos Inscritos Dante: " + devDante.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Dante: " + devDante.getConteudosConcluidos());
        System.out.println("XP: " + devVinicius.calcularXp());
    }
}
