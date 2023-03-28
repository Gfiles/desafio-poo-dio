package br.com.dio.desafio.dominio;

public class Course extends Contents{
    private int studyHours;

    @Override
    public double calculateXp() {
        return DEFAULT_XP * studyHours;
    }
    public int getStudyHours() {
        return studyHours;
    }

    public void setStudyHours(int studyHours) {
        this.studyHours = studyHours;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitle() + '\'' +
                ", descricao='" + getDescription() + '\'' +
                ", cargaHoraria=" + studyHours +
                '}';
    }
}
