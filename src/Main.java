import br.com.brendon.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("desafios de POO");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso("Curso c#", "Desafios de POO", 5);

        Curso curso3 = new Curso("Curso c", "Desafios de POO", 10);

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(curso3);

        Mentoria mentoria = new Mentoria("Mentoria java", "Mentoria para java", LocalDate.now());
        System.out.println(mentoria);
        System.out.println();

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java developer");
        bootcamp.setDescricao("Desafio POO com bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devBrendon = new Dev();
        devBrendon.setNome("Brendon");
        devBrendon.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos que o dev " + devBrendon.getNome() + " esta inscrito " + devBrendon.getConteudosInscritos());
        devBrendon.progredir();
        devBrendon.progredir();
        System.out.println("--");
        System.out.println("Conteudos que o dev " + devBrendon.getNome() + " esta inscrito " + devBrendon.getConteudosInscritos());
        System.out.println("Conteudos que o dev " + devBrendon.getNome() + " esta concluido " + devBrendon.getConteudosConcluidos());
        System.out.println("XP: " + devBrendon.calcularTotalXp());

        System.out.println("------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos que dev " + devJoao.getNome() + " está inscrito " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("--");
        System.out.println("Conteudos que dev " + devJoao.getNome() + " está inscrito " + devJoao.getConteudosInscritos());
        System.out.println("Conteudos que dev " + devJoao.getNome() + " está concluido " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());


    }
}