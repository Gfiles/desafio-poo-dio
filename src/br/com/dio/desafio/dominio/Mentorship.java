package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentorship extends Contents {
    private LocalDate mentorDate;

    @Override
    public double calculateXp() {
        return DEFAULT_XP + 20d;
    }

    public LocalDate getMentorDate() {
        return mentorDate;
    }

    public void setMentorDate(LocalDate mentorDate) {
        this.mentorDate = mentorDate;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitle() + '\'' +
                ", descricao='" + getDescription() + '\'' +
                ", data=" + mentorDate +
                '}';
    }
}
