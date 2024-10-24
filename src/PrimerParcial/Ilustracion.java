package PrimerParcial;

public class Ilustracion extends Publicacion {
    private String ilustrador;
    private int ancho;
    private int alto;

    public Ilustracion(String titulo, int anioPublicacion, String ilustrador, int ancho, int alto) {
        super(titulo, anioPublicacion);
        this.ilustrador = ilustrador;
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public String toString() {
        return "Ilustracion [ilustrador=" + ilustrador + ", ancho=" + ancho + ", alto=" + alto + "]";
    }
}
