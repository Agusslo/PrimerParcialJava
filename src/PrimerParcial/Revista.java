package PrimerParcial;

import java.util.Objects;

public class Revista extends Publicacion {
    private int numeroEdicion;

    public Revista(String titulo, int anioPublicacion, int numeroEdicion) {
        super(titulo, anioPublicacion);
        this.numeroEdicion = numeroEdicion;
    }

    public void leer() {
        System.out.println("Leyendo revista: " + titulo);
    }

    @Override
    public String toString() {
        return "Revista [titulo=" + titulo + ", anioPublicacion=" + anioPublicacion + ", numeroEdicion=" + numeroEdicion + "]";
    }
}
