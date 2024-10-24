package PrimerParcial;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Publicacion> publicaciones; // almacenamos las publicaciones

    public Biblioteca() {
        publicaciones = new ArrayList<>();
    }

    public void agregarPublicacion(Publicacion publicacion) throws PublicacionYaExisteException {
        if (publicacion == null) {
            throw new IllegalArgumentException("La publicación no puede ser nula."); // aseguro que la publicación no sea nula
        }
        if (publicaciones.contains(publicacion)) {
            throw new PublicacionYaExisteException("La publicacion ya existe en la biblioteca: " + publicacion.getTitulo());
        }
        publicaciones.add(publicacion);
    }

    public void mostrarPublicaciones() {
        for (Publicacion publicacion : publicaciones) { // for para mostrar recorrer TODA la lista
            System.out.println(publicacion);
        }
    }

    public void leerPublicaciones() {
        for (Publicacion publicacion : publicaciones) {
            if (publicacion instanceof Libro) {
                ((Libro) publicacion).leer();
            } else if (publicacion instanceof Revista) {
                ((Revista) publicacion).leer();
            } else {
                System.out.println("No se puede leer la publicacion (Ilustracion): " + publicacion.getTitulo());
            }
        }
    }

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        
        // Lista de publicaciones a agregar
        Publicacion[] publicacionesParaAgregar = {
            new Libro("La Odisea", 2012, "Homero", Genero.FICCION),
            new Ilustracion("El puerto de Buenos Aires", 1930, "Quinquela Martin", 125, 105),
            new Revista("Ciencia Hoy", 2023, 345),
            new Libro("La Odisea", 2012, "Homero", Genero.FICCION), // DUPLICADA 
            new Revista("Ciencia Hoy", 2023, 345) // DUPLICADA 
        };

        for (Publicacion publicacion : publicacionesParaAgregar) { // itero para  agregar cada publicación y si hay +2 excepciones se muestre por consola
            try {
                biblioteca.agregarPublicacion(publicacion);
            } catch (PublicacionYaExisteException e) {
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) { // no nulo
                System.out.println(e.getMessage());
            }
        }

        biblioteca.mostrarPublicaciones();
        System.out.println("------------");
        biblioteca.leerPublicaciones();
    }
}
