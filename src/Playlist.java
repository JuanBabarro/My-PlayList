import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Playlist {

    private ArrayList<Cancion> listaCanciones;

    public Playlist(int maximaCantidadPermitida) {

        this.listaCanciones = new ArrayList<Cancion>(maximaCantidadPermitida);

    }

    public int cantidadDeCanciones() {

        return this.listaCanciones.size();
    }

    public String agregarCancion(String interprete, String titulo, int duracion) {

        this.listaCanciones.add(new Cancion(titulo, interprete, duracion));

        return "La cancion se agrego correctamente";
    }

    public Cancion cancionEnLaPisicion(int posicion) {

        if (posicion > 0 && posicion <= listaCanciones.size()) {
            return listaCanciones.get(posicion - 1);
        } else {
            return null;
        }
    }

    public String cancionDeMayorDuracion() {

        if (!this.listaCanciones.isEmpty()) {
            Cancion cancionMax = null;

            for (Cancion c : listaCanciones) {
                if (cancionMax == null) {
                    cancionMax = c;
                } else {
                    if (cancionMax.getDuracion() < c.getDuracion()) {
                        cancionMax = c;
                    }
                }

            }
            return cancionMax.getTitulo();
        } else {
            return null;
        }
    }

    public int cancionDelInterprete(String interprete){

        int contador = 0;

        for(Cancion c : this.listaCanciones){
            if(c.getInterprete().equals(interprete)){
                contador++;

            }
        }

        return contador;

    }

    public int duracionTotal(){

        int duracionTotal = 0;

        for(Cancion c : listaCanciones){
            duracionTotal += c.getDuracion();
        }

        return duracionTotal;
    }
}