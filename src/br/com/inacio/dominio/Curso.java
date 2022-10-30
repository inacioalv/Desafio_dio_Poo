package br.com.inacio.dominio;

public class Curso extends  Conteudo {
    private int cargaHorario;

    public Curso(int cargaHorario) {
        this.cargaHorario = cargaHorario;
    }
    public Curso() {
    }

    public int getCargaHorario() {
        return cargaHorario;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHorario;
    }

    public void setCargaHorario(int cargaHorario) {
        this.cargaHorario = cargaHorario;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHorario=" + cargaHorario +
                '}';
    }


}
