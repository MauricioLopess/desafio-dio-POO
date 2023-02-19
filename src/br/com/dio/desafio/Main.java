package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
     
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Curso de JS");
        curso2.setCargaHoraria(7);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Mentoria de Java para auxílio");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp de Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev developer1 = new Dev();
        developer1.setNome("Mauricio");
        developer1.inscreverBootcamp(bootcamp);
        
        System.out.println();
        System.out.println("Conteúdos inscritos: " + developer1.getConteudosInscritos());
        developer1.progredir();
        System.out.println("Conteúdos concluidos: " + developer1.getConteudosConcluidos());
        System.out.println(developer1.calcularTotalXp());
        System.out.println();

        Dev developer2 = new Dev();
        developer2.setNome("João");
        developer2.inscreverBootcamp(bootcamp);

        System.out.println();
        System.out.println("----------------------");
        System.out.println();

        System.out.println("Conteúdos inscritos: " + developer2.getConteudosInscritos());
        System.out.println("----------------------");

        System.out.println("Progresso de " + developer2.getNome() + " ...");
        System.out.println("----------------------");

        developer2.progredir();
        developer2.progredir();
        developer2.progredir();
        System.out.println("Conteúdos inscritos: " + developer2.getConteudosInscritos());
        System.out.println("Conteúdos concluidos: " + developer2.getConteudosConcluidos());
        System.out.println(developer2.calcularTotalXp());

        System.out.println();

        
    }
}
