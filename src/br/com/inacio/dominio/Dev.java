package br.com.inacio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String name;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private  Set<Conteudo> conteudosComcluidos = new LinkedHashSet<>();

   public void inscreverBootcamp(Bootcamp bootcamp){
        //Add conteudos inscritos
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        //Add o dev como inscrito
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir(){
        //Pegar conteudos inscritos em ordem
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        //Colocar conteudo nos concluidos
        if (conteudo.isPresent()){
            this.conteudosComcluidos.add(conteudo.get());
            //Remover o conteudo do inscrito
            this.conteudosInscritos.remove(conteudo.get());
        }else {
            System.err.println("Você não está matriculado en nenhum conteúdo!");
        }
    }

    public double calcularTotalXp(){
        //Somar os conteudos concluidos
        return this.conteudosComcluidos
                .stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();
    }


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

    public Set<Conteudo> getConteudosConcluidos() {
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

    public void inscreverBootcamp() {
    }
}
