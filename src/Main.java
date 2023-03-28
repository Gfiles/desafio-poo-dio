import br.com.dio.desafio.dominio.Contents;
import br.com.dio.desafio.dominio.Course;
import br.com.dio.desafio.dominio.Mentorship;

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

        System.out.println(course1);
        System.out.println(course2);
        System.out.println(mentorship1);
    }
}