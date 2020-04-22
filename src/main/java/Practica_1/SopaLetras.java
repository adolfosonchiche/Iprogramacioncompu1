package Practica_1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class SopaLetras {

//declaracion de variables de la clase
    String personaJugador = "";
    String palabra = "", adivinarPalabra = "", salirJuego = "V";
    int longitud = 0, nuevo = 0, intentos = 0;
    int jugar = 0;
    int nuevoJugador = 0;
    int cambiarJugador = 0;
    public static String jugadoresSL[] = new String[10];
    public static int punteoSL[] = new int[10];

//constructor del juego, donde tiene el diseño y la funcionalidad
    public void SopaLetras() {
        Scanner in = new Scanner(System.in);

        System.out.println("\nBienvenido al  juego de Sopa de letras. ");
        System.out.println("\n en este juego una persona que no es el jugador (usuario) debe ingresar"
                + "\nuna palabra que tenga de 3 caracteres a 15 para que el jugador lo adivine.\n");

        System.out.println("\nIngrese el nombre del jugador(a), que va adivinar la  palabra: ");
        personaJugador = in.nextLine();

//metodo para preguntar una palabra y verificar la longitud 
        while (jugar == 0) {
            palabra = (JOptionPane.showInputDialog("Un usuario ingrese la palabra que " + personaJugador + " va adivinar: "));

            longitud = palabra.length();

            if (nuevoJugador == 1) {
                if (personaJugador.equalsIgnoreCase(jugadoresSL[0])) {
                    cambiarJugador = 0;

                } else {
                    cambiarJugador = 1;
                }
            }

            if (longitud >= 3 && longitud <= 15) {
                jugar = 1;
            } else {
                System.out.println("la palabra ingresada no tiene la cantidad de caracteres establecidos, intente de nuevo!");
            }
        }

// guardar las letras de la palabra en un vector
        String[] letras = new String[longitud];

        for (intentos = 1; intentos <= 3; intentos++) {
            System.out.println("\nLas letras de la palabra que ingreso el usuario para que usted adivine son: \n");

//imprime las letras de la palabra de forma desordenada            
            if (longitud == 3) {
                letras[0] = palabra.substring(0, 1);
                letras[1] = palabra.substring(1, 2);
                letras[2] = palabra.substring(2, 3);

                System.out.println(letras[2] + "  " + letras[0] + "  " + letras[1]);

            } else if (longitud == 4) {
                letras[0] = palabra.substring(0, 1);
                letras[1] = palabra.substring(1, 2);
                letras[2] = palabra.substring(2, 3);
                letras[3] = palabra.substring(3, 4);

                System.out.println(letras[3] + " " + letras[0] + " " + letras[2] + " " + letras[1]);

            } else if (longitud == 5) {
                letras[0] = palabra.substring(0, 1);
                letras[1] = palabra.substring(1, 2);
                letras[2] = palabra.substring(2, 3);
                letras[3] = palabra.substring(3, 4);
                letras[4] = palabra.substring(4, 5);

                System.out.println(letras[4] + " " + letras[0] + " " + letras[3] + " " + letras[1] + " " + letras[2]);

            } else if (longitud == 6) {
                letras[0] = palabra.substring(0, 1);
                letras[1] = palabra.substring(1, 2);
                letras[2] = palabra.substring(2, 3);
                letras[3] = palabra.substring(3, 4);
                letras[4] = palabra.substring(4, 5);
                letras[5] = palabra.substring(5, 6);

                System.out.println(letras[5] + " " + letras[0] + " " + letras[4]);
                System.out.println(letras[3] + " " + letras[2] + " " + letras[1]);

            } else if (longitud == 7) {
                letras[0] = palabra.substring(0, 1);
                letras[1] = palabra.substring(1, 2);
                letras[2] = palabra.substring(2, 3);
                letras[3] = palabra.substring(3, 4);
                letras[4] = palabra.substring(4, 5);
                letras[5] = palabra.substring(5, 6);
                letras[6] = palabra.substring(6, 7);

                System.out.println(letras[6] + " " + letras[0] + " " + letras[5] + " " + letras[1]);
                System.out.println(letras[4] + " " + letras[3] + " " + letras[2]);

            } else if (longitud == 8) {
                letras[0] = palabra.substring(0, 1);
                letras[1] = palabra.substring(1, 2);
                letras[2] = palabra.substring(2, 3);
                letras[3] = palabra.substring(3, 4);
                letras[4] = palabra.substring(4, 5);
                letras[5] = palabra.substring(5, 6);
                letras[6] = palabra.substring(6, 7);
                letras[7] = palabra.substring(7, 8);

                System.out.println(letras[7] + " " + letras[0] + " " + letras[6] + " " + letras[1]);
                System.out.println(letras[5] + " " + letras[2] + " " + letras[4] + " " + letras[3]);

            } else if (longitud == 9) {
                letras[0] = palabra.substring(0, 1);
                letras[1] = palabra.substring(1, 2);
                letras[2] = palabra.substring(2, 3);
                letras[3] = palabra.substring(3, 4);
                letras[4] = palabra.substring(4, 5);
                letras[5] = palabra.substring(5, 6);
                letras[6] = palabra.substring(6, 7);
                letras[7] = palabra.substring(7, 8);
                letras[8] = palabra.substring(8, 9);

                System.out.println(letras[8] + " " + letras[0] + " " + letras[7] + " " + letras[1] + " " + letras[6]);
                System.out.println(letras[2] + " " + letras[5] + " " + letras[3] + " " + letras[4]);

            } else if (longitud == 10) {
                letras[0] = palabra.substring(0, 1);
                letras[1] = palabra.substring(1, 2);
                letras[2] = palabra.substring(2, 3);
                letras[3] = palabra.substring(3, 4);
                letras[4] = palabra.substring(4, 5);
                letras[5] = palabra.substring(5, 6);
                letras[6] = palabra.substring(6, 7);
                letras[7] = palabra.substring(7, 8);
                letras[8] = palabra.substring(8, 9);
                letras[9] = palabra.substring(9, 10);

                System.out.println(letras[9] + " " + letras[0] + " " + letras[8] + " " + letras[1] + " " + letras[7]);
                System.out.println(letras[2] + " " + letras[6] + " " + letras[3] + " " + letras[5] + " " + letras[4]);

            } else if (longitud == 11) {
                letras[0] = palabra.substring(0, 1);
                letras[1] = palabra.substring(1, 2);
                letras[2] = palabra.substring(2, 3);
                letras[3] = palabra.substring(3, 4);
                letras[4] = palabra.substring(4, 5);
                letras[5] = palabra.substring(5, 6);
                letras[6] = palabra.substring(6, 7);
                letras[7] = palabra.substring(7, 8);
                letras[8] = palabra.substring(8, 9);
                letras[9] = palabra.substring(9, 10);
                letras[10] = palabra.substring(10, 11);

                System.out.println(letras[10] + " " + letras[0] + " " + letras[9] + " " + letras[1] + " " + letras[8]);
                System.out.println(letras[2] + " " + letras[7] + " " + letras[3] + " " + letras[6] + " " + letras[4]);
                System.out.println(letras[5]);

            } else if (longitud == 12) {
                letras[0] = palabra.substring(0, 1);
                letras[1] = palabra.substring(1, 2);
                letras[2] = palabra.substring(2, 3);
                letras[3] = palabra.substring(3, 4);
                letras[4] = palabra.substring(4, 5);
                letras[5] = palabra.substring(5, 6);
                letras[6] = palabra.substring(6, 7);
                letras[7] = palabra.substring(7, 8);
                letras[8] = palabra.substring(8, 9);
                letras[9] = palabra.substring(9, 10);
                letras[10] = palabra.substring(10, 11);
                letras[11] = palabra.substring(11, 12);

                System.out.println(letras[11] + " " + letras[0] + " " + letras[10] + " " + letras[1] + " " + letras[9]);
                System.out.println(letras[2] + " " + letras[8] + " " + letras[3] + " " + letras[7] + " " + letras[4]);
                System.out.println(letras[6] + " " + letras[5]);

            } else if (longitud == 13) {
                letras[0] = palabra.substring(0, 1);
                letras[1] = palabra.substring(1, 2);
                letras[2] = palabra.substring(2, 3);
                letras[3] = palabra.substring(3, 4);
                letras[4] = palabra.substring(4, 5);
                letras[5] = palabra.substring(5, 6);
                letras[6] = palabra.substring(6, 7);
                letras[7] = palabra.substring(7, 8);
                letras[8] = palabra.substring(8, 9);
                letras[9] = palabra.substring(9, 10);
                letras[10] = palabra.substring(10, 11);
                letras[11] = palabra.substring(11, 12);
                letras[12] = palabra.substring(12, 13);

                System.out.println(letras[12] + " " + letras[0] + " " + letras[11] + " " + letras[1] + " " + letras[10]);
                System.out.println(letras[2] + " " + letras[9] + " " + letras[3] + " " + letras[8] + " " + letras[4]);
                System.out.println(letras[7] + " " + letras[5] + " " + letras[6]);

            } else if (longitud == 14) {
                letras[0] = palabra.substring(0, 1);
                letras[1] = palabra.substring(1, 2);
                letras[2] = palabra.substring(2, 3);
                letras[3] = palabra.substring(3, 4);
                letras[4] = palabra.substring(4, 5);
                letras[5] = palabra.substring(5, 6);
                letras[6] = palabra.substring(6, 7);
                letras[7] = palabra.substring(7, 8);
                letras[8] = palabra.substring(8, 9);
                letras[9] = palabra.substring(9, 10);
                letras[10] = palabra.substring(10, 11);
                letras[11] = palabra.substring(11, 12);
                letras[12] = palabra.substring(12, 13);
                letras[13] = palabra.substring(13, 14);

                System.out.println(letras[13] + " " + letras[0] + " " + letras[12] + " " + letras[1] + " " + letras[11]);
                System.out.println(letras[2] + " " + letras[10] + " " + letras[3] + " " + letras[9] + " " + letras[4]);
                System.out.println(letras[8] + " " + letras[5] + " " + letras[7] + " " + letras[6]);

            } else if (longitud == 15) {
                letras[0] = palabra.substring(0, 1);
                letras[1] = palabra.substring(1, 2);
                letras[2] = palabra.substring(2, 3);
                letras[3] = palabra.substring(3, 4);
                letras[4] = palabra.substring(4, 5);
                letras[5] = palabra.substring(5, 6);
                letras[6] = palabra.substring(6, 7);
                letras[7] = palabra.substring(7, 8);
                letras[8] = palabra.substring(8, 9);
                letras[9] = palabra.substring(9, 10);
                letras[10] = palabra.substring(10, 11);
                letras[11] = palabra.substring(11, 12);
                letras[12] = palabra.substring(12, 13);
                letras[13] = palabra.substring(13, 14);
                letras[14] = palabra.substring(14, 15);

                System.out.println(letras[14] + " " + letras[0] + " " + letras[13] + " " + letras[1] + " " + letras[12]);
                System.out.println(letras[2] + " " + letras[11] + " " + letras[3] + " " + letras[10] + " " + letras[4]);
                System.out.println(letras[9] + " " + letras[5] + " " + letras[8] + " " + letras[6] + " " + letras[7]);
            }

//preguntar al jugador que adivine la palabra
            System.out.println("\njugador(a) " + personaJugador + " ingrese una palabra, usando las letras que le aparece en la parte superior:"
                    + "\n o si quiere Salir del juego (presione V)");
            adivinarPalabra = in.nextLine();

//el jugador quiere salir del juego
            if (adivinarPalabra.equalsIgnoreCase(salirJuego)) {
                System.out.println("Fin del juego!!");
                intentos += 4;
                palabra = "";
                jugar = 0;

//condicion para que el jugador gane el juego
            } else if (palabra.equalsIgnoreCase(adivinarPalabra)) {
                System.out.println("\nFelicidades " + personaJugador + " usted ganó el  juego, adivino la palabra que es: " + palabra);

                if (cambiarJugador == 0) {
                    jugadoresSL[0] = personaJugador;
                    punteoSL[0] = 1;
                    nuevoJugador = 1;
                } else if (cambiarJugador == 1) {
                    jugadoresSL[1] = personaJugador;
                    punteoSL[1] = 1;
                }
                intentos += 4;
                palabra = "";
                jugar = 0;

            } else {
                if (intentos < 3) {
                    System.out.println("\nLa palabra ingresada es incorrecto!!, intente de nuevo");
                }
            }

            //el jugador pierde           
            if (intentos == 3) {
                System.out.println("\n" + personaJugador + "\nHa fallado sus 3 intentos, usted ha perdido el juego!!");
                System.out.println("La palabra es: " + palabra);
                intentos += 4;
                palabra = "";
                jugar = 0;
            }
        }
    }

//metodo main para arrancar el programa
    public static void main(String args[]) {
        SopaLetras nuevo = new SopaLetras();
        Scanner in = new Scanner(System.in);

        int a = 1;
        while (a == 1) {
            nuevo.SopaLetras();
            System.out.println("\nSeleccione una opción:  \n 1. jugar nuevo Sopa de letras (presione 1)"
                    + " \n 2. salir del juego e ir a menú principal (presione 2)"
                    + "\n 3. salir del programa (presione un numero igual o mayor a 3)");
            a = in.nextInt();

            if (a == 2) {
                System.out.println("Fin del juego.");
                a = 2;
                a++;
                Juegos inicio = new Juegos();
                inicio.Juegos();

            } else if (a >= 3) {
                System.out.println("Fin del Programa.");
                a = 2;
            }
        }
    }
}
