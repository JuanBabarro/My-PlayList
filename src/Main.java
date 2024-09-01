public class Main {
    public static void main(String[] args) {

        Playlist MiMusica = new Playlist(8);

        MiMusica.agregarCancion("Kid Rock","Roll On",8);
        MiMusica.agregarCancion("Kid Rock","Po-Dunk",7);
        MiMusica.agregarCancion("Kid Rock","First Kiss",6);
        MiMusica.agregarCancion("Eminem","Beautiful",8);
        MiMusica.agregarCancion("Eminem","Space Bound",9);


        System.out.println("La cancion de mayor duracion es: "+MiMusica.cancionDeMayorDuracion());
        System.out.println("Total de canciones en tu lista: "+MiMusica.cantidadDeCanciones());
        System.out.println("Duracion total de tu PlayList: "+MiMusica.duracionTotal());
        System.out.println("Canciones del interprete: "+MiMusica.cancionDelInterprete("Kid Rock"));

    }
}