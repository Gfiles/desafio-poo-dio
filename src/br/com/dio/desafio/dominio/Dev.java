package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String name;
    private Set<Contents> contentsRegistered = new LinkedHashSet<>();
    private Set<Contents> contentsFinished = new LinkedHashSet<>();

    public void registerBootcamp(Bootcamp bootcamp) {
        this.contentsRegistered.addAll(bootcamp.getContents());
        bootcamp.getRegisteredDevs().add(this);
    }

    public void progress() {
        Optional<Contents> contents = this.contentsRegistered.stream().findFirst();
        if(contents.isPresent()){
            this.contentsFinished.add(contents.get());
            this.contentsRegistered.remove(contents.get());
        } else {
            System.err.println("Voce não esta matriculado em nenhum conteúdo!");
        }
    }

    public double calculateTotalXp(){
        return this.contentsFinished.stream().mapToDouble(contents -> contents.calculateXp()).sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Contents> getContentsRegistered() {
        return contentsRegistered;
    }

    public void setContentsRegistered(Set<Contents> contentsRegistered) {
        this.contentsRegistered = contentsRegistered;
    }

    public Set<Contents> getContentsFinished() {
        return contentsFinished;
    }

    public void setContentsFinished(Set<Contents> contentsFinished) {
        this.contentsFinished = contentsFinished;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return name.equals(dev.name) && contentsRegistered.equals(dev.contentsRegistered) && contentsFinished.equals(dev.contentsFinished);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, contentsRegistered, contentsFinished);
    }
}
