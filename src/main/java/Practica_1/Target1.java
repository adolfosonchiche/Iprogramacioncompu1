/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_1;

import java.util.Scanner;

/**
 *
 * @author hectoradolfo
 */
public class Target1 {
    //declaracion de variables

    Scanner in = new Scanner(System.in);
    public static final int PUNTEO_TOTAL = 200;
    int numeroJugadores;
    String jugador1 = "", jugador2 = "", jugador3 = "", jugador4 = "";
    int punteoA = 0, punteoB = 0, punteoC = 0, punteoD = 0;
    int tiro = 0, turnos, turnos3, turnos4;
    String persona;

    public static void main(String args[]) {
        Target1 nuevo = new Target1();
        Scanner in = new Scanner(System.in);

        int a = 1;
        while (a == 1) {
            nuevo.Target1();
            System.out.println("\nSeleccione una opción:  \n 1. jugar nuevo Target (presione 1)"
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

    public void Target1() {
        Scanner en = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de jugadores que van a jugar: \n1.un jugador"
                + "\n2.dos jugadores \n3.tres jugadores \n4.cuatro jugadores\n");
        numeroJugadores = en.nextInt();
        if (numeroJugadores == 1) {
            System.out.println("Escribe el nombre del jugador: ");
            jugador1 = in.nextLine();
          //  for (int i = 0; i < 200; i++) {
                Jugar1();
                
                if (punteoA >= 200) {
                    System.out.println();
                    System.out.println(jugador1 + " tiene " + punteoA + " puntos, ha ganado el juego");
                    jugador1 = "";
                    punteoA = 0;
                    //i = 210;
                    JugarNuevo();
                }
           // }
            
        }
      //  JugarNuevo();

        System.out.println("Escribir nombre del segundo jugador: ");
        jugador2 = in.nextLine();
        for (int i = 0; i < 200; i++) {
            Jugar1();
            Jugar2();

            if (punteoB >= 200 || punteoA >= 200) {
                System.out.println();
                if (punteoA > punteoB) {
                    System.out.println(jugador1 + " tiene " + punteoA + " puntos, ha ganado el juego");
                    System.out.println(jugador2 + " tiene " + punteoB + " puntos");
                } else if (punteoA < punteoB) {
                    System.out.println(jugador1 + " tiene " + punteoA + " puntos");
                    System.out.println(jugador2 + " tiene " + punteoB + " puntos, ha ganado el juego");
                } else {
                    System.out.println(jugador1 + " tiene " + punteoA + " puntos");
                    System.out.println(jugador2 + " tiene " + punteoB + " puntos");
                    System.out.println(jugador2 + " y " + jugador1 + "Empataron");
                }
                jugador1 = "";
                jugador2 = "";
                punteoA = 0;
                punteoB = 0;
            }
            if (punteoB >= 200) {
                i = 200;
            } else if (punteoA >= 200) {
                i = 200;
            }
        }
    }

    public void Jugar1() {

        System.out.println("\n Jugador(a) " + jugador1 + " seleccione el tipo de tiro que quiere hacer: ");
        System.out.println("para darle al centro del tablero:  |(((())))|");
        System.out.println();
        System.out.println("1. Tiro rapido con el dardo arriba del brazo (presione 1)");
        System.out.println("2. Tiro controlado con el dardo arriba del brazo (presione 2)");
        System.out.println("3. Tiro con el dardo bajo el brazo (presione 3)");
        System.out.println("Si quiere Salir del juego (presione un numero mayor a 3)");
        tiro = in.nextInt();

//cuando el  jugador eliga el tiro 1
        if (tiro == 1) {
            int aleatorio = (int) (Math.random() * 2 + 1);
            if (aleatorio == 1) {
                punteoA += 40;
                System.out.println("Buen tiro, ((((°)))) dio en el  centro, en la parte de 40 puntos");
                System.out.println(jugador1 + " tiene " + punteoA + " puntos");

            } else if (aleatorio == 2) {
                System.out.println("Tiro fallado!!   °(((())))" + "\n intenete nuevamente");
                System.out.println(jugador1 + " tiene " + punteoA + " puntos");
            }

//cuando el  jugador eliga el tiro 2                    
        } else if (tiro == 2) {
            int aleatorio = (int) (Math.random() * 3 + 1);

            if (aleatorio == 1) {
                punteoA += 10;
                System.out.println("Buen tiro, (°((()))) dio en la parte de 10 puntos");
                System.out.println(jugador1 + " tiene " + punteoA + " puntos");

            } else if (aleatorio == 2) {
                punteoA += 20;
                System.out.println("Buen tiro, ((°(()))) dio en la parte de 20 puntos");
                System.out.println(jugador1 + " tiene " + punteoA + " puntos");

            } else if (aleatorio == 3) {
                punteoA += 30;
                System.out.println("Buen tiro, (((°()))) dio en la parte de 30 puntos");
                System.out.println(jugador1 + " tiene " + punteoA + " puntos");
            }

//cuando el  jugador eliga el tiro 3                     
        } else if (tiro == 3) {
            int aleatorio = (int) (Math.random() * 5 + 1);

            if (aleatorio == 1) {
                punteoA += 10;
                System.out.println("Buen tiro, (°((()))) dio en la parte de 10 puntos");
                System.out.println(jugador1 + " tiene " + punteoA + " puntos");

            } else if (aleatorio == 2) {
                punteoA += 20;
                System.out.println("Buen tiro, ((°(()))) dio en la parte de 20 puntos");
                System.out.println(jugador1 + " tiene " + punteoA + " puntos");

            } else if (aleatorio == 3) {
                punteoA += 30;
                System.out.println("Buen tiro, (((°()))) dio en la parte de 30 puntos");
                System.out.println(jugador1 + " tiene " + punteoA + " puntos");

            } else if (aleatorio == 4) {
                punteoA += 40;
                System.out.println("Buen tiro, ((((°)))) dio en el  centro, en la parte de 40 puntos");
                System.out.println(jugador1 + " tiene " + punteoA + " puntos");

            } else if (aleatorio == 5) {
                System.out.println("Tiro fallado!!   °(((())))" + "\n intenete nuevamente");
                System.out.println(jugador1 + " tiene " + punteoA + " puntos");
            }

//cuando el jugador queira terminar el juego                    
        } else {
            System.out.println("Fin del juego!!");
            // i = 200;
            jugador1 = "";
            punteoA = 0;

        }

//condiciones para terminar el juego y dar el punteo del jugador y decir que gano
        if (punteoA >= 200) {
            //  i = 200;
        }

        if (punteoA
                >= 200) {
            System.out.println();
            System.out.println(jugador1 + " tiene " + punteoA + " puntos, ha ganado el juego");
            jugador1 = "";
            punteoA = 0;
        }

    }

    public void Jugar2() {
        turnos = 0;
        while (turnos == 0) {

            System.out.println("\n Jugador(a) " + jugador2 + " seleccione el tipo de tiro que quiere hacer: ");
            System.out.println("para darle al centro del tablero:  (((())))");
            System.out.println();
            System.out.println("1. Tiro rapido con el dardo arriba del brazo (presione 1)");
            System.out.println("2. Tiro controlado con el dardo arriba del brazo (presione 2)");
            System.out.println("3. Tiro con el dardo bajo el brazo (presione 3)");
            System.out.println("Si quiere Salir del juego (presione 4)");
            tiro = in.nextInt();

//cuando el  jugador eliga el tiro 1
            if (tiro == 1) {
                int aleatorio = (int) (Math.random() * 2 + 1);
                if (aleatorio == 1) {
                    punteoB += 40;
                    System.out.println("Buen tiro, ((((°)))) dio en el  centro, en la parte de 40 puntos");
                    System.out.println(jugador2 + " tiene " + punteoB + " puntos");

                } else if (aleatorio == 2) {
                    System.out.println("Tiro fallado!!   °(((())))");
                    System.out.println(jugador2 + " tiene " + punteoB + " puntos");
                }

//cuando el  jugador eliga el tiro 2                        
            } else if (tiro == 2) {
                int aleatorio = (int) (Math.random() * 3 + 1);

                if (aleatorio == 1) {
                    punteoB += 10;
                    System.out.println("Buen tiro, (°((()))) dio en la parte de 10 puntos");
                    System.out.println(jugador2 + " tiene " + punteoB + " puntos");

                } else if (aleatorio == 2) {
                    punteoB += 20;
                    System.out.println("Buen tiro, ((°(()))) dio en la parte de 20 puntos");
                    System.out.println(jugador2 + " tiene " + punteoB + " puntos");

                } else if (aleatorio == 3) {
                    punteoB += 30;
                    System.out.println("Buen tiro, (((°()))) dio en la parte de 30 puntos");
                    System.out.println(jugador2 + " tiene " + punteoB + " puntos");
                }

//cuando el  jugador eliga el tiro 3                         
            } else if (tiro == 3) {
                int aleatorio = (int) (Math.random() * 5 + 1);

                if (aleatorio == 1) {
                    punteoB += 10;
                    System.out.println("Buen tiro, (°((()))) dio en la parte de 10 puntos");
                    System.out.println(jugador2 + " tiene " + punteoB + " puntos");

                } else if (aleatorio == 2) {
                    punteoB += 20;
                    System.out.println("Buen tiro, ((°(()))) dio en la parte de 20 puntos");
                    System.out.println(jugador2 + " tiene " + punteoB + " puntos");

                } else if (aleatorio == 3) {
                    punteoB += 30;
                    System.out.println("Buen tiro, (((°()))) dio en la parte de 30 puntos");
                    System.out.println(jugador2 + " tiene " + punteoB + " puntos");

                } else if (aleatorio == 4) {
                    punteoB += 40;
                    System.out.println("Buen tiro, ((((°)))) dio en el  centro, en la parte de 40 puntos");
                    System.out.println(jugador2 + " tiene " + punteoB + " puntos");

                } else if (aleatorio == 5) {
                    System.out.println("Tiro fallado!!   °(((())))");
                    System.out.println(jugador2 + " tiene " + punteoB + " puntos");
                }

//cuando el  jugador eliga el tiro 4                        
            } else if (tiro == 4) {
                System.out.println("Fin del juego!!");
                turnos = 200;
                jugador1 = "";
                jugador2 = "";
                punteoA = 0;
                punteoB = 0;

            } else {
                System.out.println("Numero incorrecto! , perdio este turno!");
            }
            turnos = 1;

        }

//condiciones para terminar el juego y obtener el ganador            
        if (punteoB >= 200 || punteoA >= 200) {
            System.out.println();
            if (punteoA > punteoB) {
                System.out.println(jugador1 + " tiene " + punteoA + " puntos, ha ganado el juego");
                System.out.println(jugador2 + " tiene " + punteoB + " puntos");
            } else if (punteoA < punteoB) {
                System.out.println(jugador1 + " tiene " + punteoA + " puntos");
                System.out.println(jugador2 + " tiene " + punteoB + " puntos, ha ganado el juego");
            } else {
                System.out.println(jugador1 + " tiene " + punteoA + " puntos");
                System.out.println(jugador2 + " tiene " + punteoB + " puntos");
                System.out.println(jugador2 + " y " + jugador1 + "Empataron");
            }
            jugador1 = "";
            jugador2 = "";
            punteoA = 0;
            punteoB = 0;
        }
    }
    public void JugarNuevo(){
        int a = 1;
        while (a == 1) {
            System.out.println("\nSeleccione una opción:  \n 1. jugar nuevo Target (presione 1)"
                    + " \n 2. salir del juego e ir a menú principal (presione 2)"
                    + "\n 3. salir del programa (presione un numero igual o mayor a 3)");
            a = in.nextInt();
            if(a == 1){
                Target1();
                
            } else if (a == 2) {
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
