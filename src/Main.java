import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main 
{
    public static void main(String[] args) 
    {
        //Cursos, mentoria e bootcamp
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso básico de programação Java");
        curso1.setCargaHoraria(20);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Curso básico de programação Javascript");
        curso2.setCargaHoraria(15);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("JUnit");
        mentoria.setDescricao("Explicação do framework JUnit");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Banco PAN Java Developer");
        bootcamp.setDescricao("Trilha completa em Java Spring Boot oferecido pelo banco PAN em parceria com a DIO");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        //DEVS
        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Lucas:" + devLucas.getConteudosInscritos());
        devLucas.progredir();
        devLucas.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Lucas:" + devLucas.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Lucas:" + devLucas.getConteudosConcluidos());
        System.out.println("XP:" + devLucas.calcularTotalXp());

        System.out.println("-------");

        Dev devLuisa = new Dev();
        devLuisa.setNome("Luisa");
        devLuisa.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Luisa:" + devLuisa.getConteudosInscritos());
        devLuisa.progredir();
        devLuisa.progredir();
        devLuisa.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Luisa:" + devLuisa.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Luisa:" + devLuisa.getConteudosConcluidos());
        System.out.println("XP:" + devLuisa.calcularTotalXp());

    }

}
