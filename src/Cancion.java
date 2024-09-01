public class Cancion {

    private String interprete;
    private String titulo;
    private int duracion;

    public Cancion(String titulo, String interprete, int duracion) {
        this.titulo = titulo;
        this.interprete = interprete;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getInterprete() {
        return interprete;
    }

    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }
}
