package br.com.inacio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {
    private String name;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private  Set<Conteudo> conteudosComcluidos = new LinkedHashSet<>();

    void inscreverBootcamp(Bootcamp bootcamp){}

    void progredir(){}

    void calcularTotalXp(){}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosComcluidos() {
        return conteudosComcluidos;
    }

    public void setConteudosComcluidos(Set<Conteudo> conteudosComcluidos) {
        this.conteudosComcluidos = conteudosComcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosComcluidos, dev.conteudosComcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, conteudosInscritos, conteudosComcluidos);
    }
}
