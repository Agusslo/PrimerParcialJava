package PrimerParcial;

/*
Lopez Agustin
PrimerExamen Baus
Programacion II
*/

public abstract class Publicacion {
    protected String titulo;
    protected int anioPublicacion;

    public Publicacion(String titulo, int anioPublicacion) {
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false; // nulo o otra clase
        Publicacion that = (Publicacion) obj;
        return anioPublicacion == that.anioPublicacion && titulo.equals(that.titulo);
    }
    
    @Override
    public abstract String toString(); // metodo abstracto ya que lo utilizan los hijos y cada uno pone su "informacion"
}
