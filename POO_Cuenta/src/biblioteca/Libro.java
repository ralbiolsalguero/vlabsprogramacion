package biblioteca;

public class Libro {
    //Atributos
    private String titulo;
    private String autor;
    private int ejemplares;
    private int prestados;


    //Constructores

    public Libro(){

    }

    public Libro(String titulo, String autor, int ejemplares, int prestados){
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }

    //Métodos

    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public int getEjemplares(){
        return ejemplares;
    }
    public int getPrestados(){
        return prestados;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setEjemplares(int ejemplares){
        this.ejemplares = ejemplares;
    }
    public void setPrestados(int prestados){
        this.prestados = prestados;
    }

    public boolean prestamo(){
        boolean resultado = false;
        if(prestados < ejemplares){
            prestados++;
            resultado = true;
        }
        return resultado;
    }

    public boolean devolucion(){
        boolean resultado = false;
        if(prestados != 0){
            prestados--;
            resultado = true;
        }
        return resultado;
    }

    public String toString(){
        return "Titulo: "+titulo+", Autor: "+autor+", Ejemplares: "+ejemplares+", Prestados: "+prestados;
    }


}
