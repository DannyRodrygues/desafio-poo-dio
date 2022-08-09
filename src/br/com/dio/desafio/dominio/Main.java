package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargahoraria(8);



        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição Curso JavaScript");
        curso2.setCargahoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp JAVA Developer.");
        bootcamp.setDescricao("Descrição do Bootcamp de JAVA Developer !!");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDaniella = new Dev();
        devDaniella.setNome("Daniella.");
        devDaniella.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos: "+devDaniella.getNome() + devDaniella.getConteudosInscritos());
        devDaniella.progredir();
        devDaniella.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos: "+devDaniella.getNome() + devDaniella.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: "+devDaniella.getNome() + devDaniella.getConteudosConcluidos());
        System.out.println("XP:" + devDaniella.getNome() + devDaniella.calcularTotalXp());

        System.out.println("----------");

        Dev devMarcelo = new Dev();
        devMarcelo.setNome("Marcelo.");
        devMarcelo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos: " +devMarcelo.getNome() + devMarcelo.getConteudosInscritos());

        devMarcelo.progredir();
        devMarcelo.progredir();
        devMarcelo.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos: " +devMarcelo.getNome() + devMarcelo.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: "+devMarcelo.getNome() + devMarcelo.getConteudosConcluidos());
        System.out.println("XP:" + devMarcelo.getNome() + devMarcelo.calcularTotalXp());

        System.out.println("----------");



    }
}
