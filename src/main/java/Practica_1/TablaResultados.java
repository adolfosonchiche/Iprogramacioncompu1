package Practica_1;

public class TablaResultados {

    String jugadores[] = new String[12];
    int juegosGanados[] = new int[12];

    public void TablaResultados() {

        System.out.println("\nBIENVENIDO A LA TABLA DE PUNTUACIONES.");
        System.out.println("\nAqui podra ver la cantidad de juegos que a ganado cada jugador.\n");

        SopaLetras nuevo = new SopaLetras();
        jugadores[0] = nuevo.jugadoresSL[0];
        juegosGanados[0] = nuevo.punteoSL[0];
        jugadores[1] = nuevo.jugadoresSL[1];
        juegosGanados[1] = nuevo.punteoSL[1];
        System.out.println("\nNombre jugador           |  juegos ganados");
        System.out.println(jugadores[0] + "                   |    " + juegosGanados[0]);
        System.out.println(jugadores[1] + "                   |    " + juegosGanados[1]);
    }

    public static void main(String args[]) {
        TablaResultados estadistica = new TablaResultados();
        estadistica.TablaResultados();

    }

}
