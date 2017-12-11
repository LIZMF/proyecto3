/*
*Este objeto va hacer referncia un un objeto de la vida que es una pelicula
 */
package Controlador;

/**
 *
 * @author TOM
 */
public class Pelicula { 
    
    //Campos de la clase
     String codigo; //Codigo de barras para identificar de manera unica
     String titulo;
     String director;
     String actor_Prin;
     String genero;
     float precio;
    

     /*
     * Constructor
     */
    public Pelicula(String codigo, String titulo, String director, String actor_Prin, String genero, float precio) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.director = director;
        this.actor_Prin = actor_Prin;
        this.genero = genero;
        this.precio = precio;
       
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the autor
     */
    public String getDirector() {
        return director;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.director = autor;
    }

    /**
     * @return the actor_Prin
     */
    public String getActor_Prin() {
        return actor_Prin;
    }

    /**
     * @param actor_Prin the actor_Prin to set
     */
    public void setActor_Prin(String actor_Prin) {
        this.actor_Prin = actor_Prin;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }  //Cierre de la metodo setPrecio

   
}//Cierre de la clase
