package PrimerParcial;

public class Libro extends Publicacion {
    private String autor;
    private Genero genero;

    public Libro(String titulo, int anioPublicacion, String autor, Genero genero) {
        super(titulo, anioPublicacion);
        this.autor = autor;
        this.genero = genero;
    }

    public void leer() {
        System.out.println("Leyendo libro: " + titulo);
    }

    @Override
    public String toString() {
        return "Libro [autor=" + autor + ", genero=" + genero + "]";
    }
}
