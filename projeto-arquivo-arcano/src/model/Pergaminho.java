/**
 * @author jawc
 */
package model;

public class Pergaminho {
    private int id;
    private String titulo;
    private String categoria;
    private int poderMistico;

    public Pergaminho(int id, String titulo, String categoria, int poderMistico){
        this.id = id;
        this.titulo = titulo;
        this.categoria = categoria;
        this.poderMistico = poderMistico;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getPoderMistico() {
        return poderMistico;
    }

    @Override
    public String toString() {
        return "Pergaminho{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", categoria='" + categoria + '\'' +
                ", poderMistico=" + poderMistico +
                '}';
    }
}
