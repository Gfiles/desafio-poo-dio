import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Course course1 = new Course();
        course1.setTitle("Curso Java");
        course1.setDescription("descrição curso java");
        course1.setStudyHours(8);

        Course course2 = new Course();
        course2.setTitle("Curso Java");
        course2.setDescription("descrição curso java");
        course2.setStudyHours(8);

        Mentorship mentorship1 = new Mentorship();
        mentorship1.setTitle("mentoria de java");
        mentorship1.setDescription("decrição mentoria de java");
        mentorship1.setMentorDate(LocalDate.now());
        /*
        System.out.println(course1);
        System.out.println(course2);
        System.out.println(mentorship1);
         */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("Descriçãp Bootcamp Java Developer");
        bootcamp.getContents().add(course1);
        bootcamp.getContents().add(course2);
        bootcamp.getContents().add(mentorship1);

        Dev devGavin = new Dev();
        devGavin.setName("Gavin");
        devGavin.registerBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Gavin" + devGavin.getContentsRegistered());
        devGavin.progress();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Gavin" + devGavin.getContentsRegistered());
        System.out.println("Conteúdos Concluidos Gavin" + devGavin.getContentsFinished());
        System.out.println("XP:" + devGavin.calculateTotalXp());

        System.out.println("----------");

        Dev devJoao = new Dev();
        devJoao.setName("João");
        devJoao.registerBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João" + devJoao.getContentsRegistered());
        devJoao.progress();
        devJoao.progress();
        devJoao.progress();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João" + devJoao.getContentsRegistered());
        System.out.println("Conteúdos Concluidos João" + devJoao.getContentsFinished());
        System.out.println("XP:" + devJoao.calculateTotalXp());

    }
}
