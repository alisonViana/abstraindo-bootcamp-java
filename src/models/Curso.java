package models;

public class Curso extends Conteudo {

    private int cargaHoraria;

    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return String.format("Título: %s - Descrição: %s - Carga Horária: %d",
                getTitulo(), getDescricao(), cargaHoraria);
    }
}
