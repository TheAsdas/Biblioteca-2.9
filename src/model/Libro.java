package model;

import java.util.ArrayList;

/**
 * Refers to a book from the DB.
 *
 * @author Gabriel, Gustavo
 * @version 1.2 - 11/6/2020
 */
public class Libro
{
    //variables
    private Integer isbn;
    private final String titulo;
    private final int paginas;
    private final int año;
    private final int precio;
    private Editorial editorial;
    private final Integer idEditorial;
    //lists
    private ArrayList<Idioma> idiomas = new ArrayList<> ();
    private ArrayList<Autor> autores = new ArrayList<> ();
    private ArrayList<Categoria> categorias = new ArrayList<> ();

    public Libro (
      int isbn,
      String titulo,
      int paginas,
      int año,
      int precio,
      Integer idEditorial)
    {
        this.isbn = isbn;
        this.titulo = titulo;
        this.paginas = paginas;
        this.año = año;
        this.precio = precio;
        this.idEditorial = idEditorial;
    }

    public Libro (
      String titulo,
      int paginas,
      int año,
      int precio,
      Editorial editorial,
      ArrayList idiomas,
      ArrayList autores,
      ArrayList categorias)
    {
        this.isbn = null;
        this.titulo = titulo;
        this.paginas = paginas;
        this.año = año;
        this.precio = precio;
        this.editorial = editorial;
        this.idiomas = idiomas;
        this.autores = autores;
        this.categorias = categorias;
        this.idEditorial = null;
    }

    //<editor-fold defaultstate="collapsed" desc="getters">
    public int isbn ()
    {
        return isbn;
    }

    public String titulo ()
    {
        return titulo;
    }

    public int paginas ()
    {
        return paginas;
    }

    public int año ()
    {
        return año;
    }

    public int precio ()
    {
        return precio;
    }

    public ArrayList<Idioma> listaIdiomas ()
    {
        return idiomas;
    }

    public ArrayList<Autor> listaAutores ()
    {
        return autores;
    }

    public ArrayList<Categoria> listaCategorias ()
    {
        return categorias;
    }

    public Editorial editorial ()
    {
        return editorial;
    }

    public Integer idEditorial ()
    {
        return idEditorial;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="adders">
    public void addIdioma (Idioma i)
    {
        idiomas.add ( i );
    }

    public void addAutor (Autor a)
    {
        autores.add ( a );
    }

    public void addCategoria (Categoria c)
    {
        categorias.add ( c );
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="removers">
    public void removeIdioma (Idioma i)
    {
        idiomas.remove ( i );
    }

    public void removeAutor (Autor a)
    {
        autores.remove ( a );
    }

    public void removeCategoria (Categoria c)
    {
        categorias.remove ( c );
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="setters">
    public void setEditorial (Editorial e)
    {
        this.editorial = e;
    }

    public void setIdiomas (ArrayList<Idioma> list)
    {
        this.idiomas = list;
    }

    public void setAutores (ArrayList<Autor> list)
    {
        this.autores = list;
    }

    public void setCategorias (ArrayList<Categoria> list)
    {
        this.categorias = list;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }
    
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="extra methods">
    /**
     * Returns the entity's ISBN whenever it's called as a String.
     *
     * @return String with the entity's ISBN.
     */
    @Override
    public String toString ()
    {
        return titulo;
    }

    /**
     * Return every author as a String.
     */
    public String autores ()
    {
        String authors = "";

        if ( autores.isEmpty () )
        {
            authors = "Anónimo";
        }
        else
        {
            int iterations = 0;
            for ( Autor a : autores )
            {
                authors += a;
                /* if there is another author, add a comma */
                if ( iterations + 1 < autores.size () )
                {
                    authors += ", ";
                }
            }
        }

        return authors;
    }
    //</editor-fold>

}
