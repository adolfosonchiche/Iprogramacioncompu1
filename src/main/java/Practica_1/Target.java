package Practica_1;

import java.util.Scanner;

public class Target {

//declaracion de variables
    Scanner en = new Scanner(System.in);
    public static final int PUNTEO_TOTAL = 200;
    int numeroJugadores;
    String jugador1 = "", jugador2 = "", jugador3 = "", jugador4 = "";
    int punteoA = 0, punteoB = 0, punteoC = 0, punteoD = 0;
    int tiro = 0, turnos, turnos3, turnos4;

//constructor del  juego, donde esta el diseño y la funcionalidad
    public void Target() {

        Scanner in = new Scanner(System.in);
        System.out.println("\nBIENVENIDOS AL JUEGO TARJET");
        System.out.println("\nen este juego puede jugar de 1 jugador hasta  4 jugadores");
        System.out.println("deben lanzar dardos apuntando a un tablero, tienen tres tipos de tiros"
                + "\nsi dan en el centro vale 40 puntos, en el segundo casilla vale 30 puntos"
                + "\nen el tercero casilla vale 20 puntos, en el ultima casilla vale 10 puntos"
                + "\ny afuera de las casillas vale 0 puntos, gana el que llegue 200 o mas puntos");
        System.out.println();

//seleccion de la canatidad de jugadores que van a participar
        System.out.println("Ingrese la cantidad de jugadores que van a jugar: \n1.un jugador"
                + "\n2.dos jugadores \n3.tres jugadores \n4.cuatro jugadores\n");
        numeroJugadores = en.nextInt();

//codigo para un jugador
        if (numeroJugadores == 1) {
            System.out.println("Escribe el nombre del jugador: ");
            jugador1 = in.nextLine();

            for (int i = 0; i < 200; i++) {
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
                    i = 200;
                    jugador1 = "";
                    punteoA = 0;

                }

//condiciones para terminar el juego y dar el punteo del jugador y decir que gano
                if (punteoA >= 200) {
                    i = 200;
                }
            }
            if (punteoA >= 200) {
                System.out.println();
                System.out.println(jugador1 + " tiene " + punteoA + " puntos, ha ganado el juego");
                jugador1 = "";
                punteoA = 0;
            }

//codigo  para dos jugadores por turnos
        } else if (numeroJugadores == 2) {
            System.out.println("Escribir nombre del primer jugador: ");
            jugador1 = in.nextLine();
            System.out.println("Escribir nombre del segundo jugador: ");
            jugador2 = in.nextLine();

//funcion para el primer jugador
            for (int i = 0; i < PUNTEO_TOTAL; i++) {
                System.out.println("\n Jugador(a) " + jugador1 + " seleccione el tipo de tiro que quiere hacer: ");
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
                        punteoA += 40;
                        System.out.println("Buen tiro, ((((°)))) dio en el  centro, en la parte de 40 puntos");
                        System.out.println(jugador1 + " tiene " + punteoA + " puntos");

                    } else if (aleatorio == 2) {
                        System.out.println("Tiro fallado!!   °(((())))");
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
                        System.out.println("Tiro fallado!!   °(((())))");
                        System.out.println(jugador1 + " tiene " + punteoA + " puntos");
                    }

//cuando el  jugador eliga el tiro 4                    
                } else if (tiro == 4) {
                    System.out.println("Fin del juego!!");
                    i = 200;
                    jugador1 = "";
                    jugador2 = "";
                    punteoA = 0;
                    punteoB = 0;
                    turnos = 1;

                } else {
                    System.out.println("Numero incorrecto! , perdio este turno!");
                }

//funcion para el segundo jugador
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
                        i = 200;
                        jugador1 = "";
                        jugador2 = "";
                        punteoA = 0;
                        punteoB = 0;

                    } else {
                        System.out.println("Numero incorrecto! , perdio este turno!");
                    }
                    turnos = 1;
                    if (punteoB >= 200) {
                        i = 200;
                    } else if (punteoA >= 200) {
                        i = 200;
                    }
                }
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

//codigo para tres jugadores por turnos
        } else if (numeroJugadores == 3) {
            System.out.println("Escribir nombre del primer jugador: ");
            jugador1 = in.nextLine();
            System.out.println("Escribir nombre del segundo jugador: ");
            jugador2 = in.nextLine();
            System.out.println("Escribir nombre del tercer jugador: ");
            jugador3 = in.nextLine();

//funcion para el primer jugador
            for (int i = 0; i < PUNTEO_TOTAL; i++) {
                System.out.println("\n Jugador(a) " + jugador1 + " seleccione el tipo de tiro que quiere hacer: ");
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
                        punteoA += 40;
                        System.out.println("Buen tiro, ((((°)))) dio en el  centro, en la parte de 40 puntos");
                        System.out.println(jugador1 + " tiene " + punteoA + " puntos");

                    } else if (aleatorio == 2) {
                        System.out.println("Tiro fallado!!   °(((())))");
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
                        System.out.println("Tiro fallado!!   °(((())))");
                        System.out.println(jugador1 + " tiene " + punteoA + " puntos");
                    }

//cuando el  jugador eliga el tiro 4                    
                } else if (tiro == 4) {
                    System.out.println("Fin del juego!!");
                    i = 200;
                    jugador1 = "";
                    jugador2 = "";
                    jugador3 = "";
                    punteoA = 0;
                    punteoB = 0;
                    punteoC = 0;
                    turnos = 1;

                } else {
                    System.out.println("Numero incorrecto! , perdio este turno!");
                }

//funcion para el jugador 2                
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
                        i = 200;
                        jugador1 = "";
                        jugador2 = "";
                        jugador3 = "";
                        punteoA = 0;
                        punteoB = 0;
                        punteoC = 0;
                        turnos3 = 1;

                    } else {
                        System.out.println("Numero incorrecto! , perdio este turno!");
                    }

//funcion para el tercer jugador                    
                    turnos3 = 0;
                    while (turnos3 == 0) {

                        System.out.println("\n Jugador(a) " + jugador3 + " seleccione el tipo de tiro que quiere hacer: ");
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
                                punteoC += 40;
                                System.out.println("Buen tiro, ((((°)))) dio en el  centro, en la parte de 40 puntos");
                                System.out.println(jugador3 + " tiene " + punteoC + " puntos");

                            } else if (aleatorio == 2) {
                                System.out.println("Tiro fallado!!   °(((())))");
                                System.out.println(jugador3 + " tiene " + punteoC + " puntos");
                            }

//cuando el  jugador eliga el tiro 2                            
                        } else if (tiro == 2) {
                            int aleatorio = (int) (Math.random() * 3 + 1);

                            if (aleatorio == 1) {
                                punteoC += 10;
                                System.out.println("Buen tiro, (°((()))) dio en la parte de 10 puntos");
                                System.out.println(jugador3 + " tiene " + punteoC + " puntos");

                            } else if (aleatorio == 2) {
                                punteoC += 20;
                                System.out.println("Buen tiro, ((°(()))) dio en la parte de 20 puntos");
                                System.out.println(jugador3 + " tiene " + punteoC + " puntos");

                            } else if (aleatorio == 3) {
                                punteoC += 30;
                                System.out.println("Buen tiro, (((°()))) dio en la parte de 30 puntos");
                                System.out.println(jugador3 + " tiene " + punteoC + " puntos");
                            }

//cuando el  jugador eliga el tiro 3                            
                        } else if (tiro == 3) {
                            int aleatorio = (int) (Math.random() * 5 + 1);

                            if (aleatorio == 1) {
                                punteoC += 10;
                                System.out.println("Buen tiro, (°((()))) dio en la parte de 10 puntos");
                                System.out.println(jugador3 + " tiene " + punteoC + " puntos");

                            } else if (aleatorio == 2) {
                                punteoC += 20;
                                System.out.println("Buen tiro, ((°(()))) dio en la parte de 20 puntos");
                                System.out.println(jugador3 + " tiene " + punteoC + " puntos");

                            } else if (aleatorio == 3) {
                                punteoC += 30;
                                System.out.println("Buen tiro, (((°()))) dio en la parte de 30 puntos");
                                System.out.println(jugador3 + " tiene " + punteoC + " puntos");

                            } else if (aleatorio == 4) {
                                punteoC += 40;
                                System.out.println("Buen tiro, ((((°)))) dio en el  centro, en la parte de 40 puntos");
                                System.out.println(jugador3 + " tiene " + punteoC + " puntos");

                            } else if (aleatorio == 5) {
                                System.out.println("Tiro fallado!!   °(((())))");
                                System.out.println(jugador3 + " tiene " + punteoC + " puntos");
                            }

                            //cuando el tiro del jugado es 4                          
                        } else if (tiro == 4) {
                            System.out.println("Fin del juego!!");
                            i = 200;
                            jugador1 = "";
                            jugador2 = "";
                            jugador3 = "";
                            punteoA = 0;
                            punteoB = 0;
                            punteoC = 0;
                            turnos3 = 1;

                            // cuando el usuario ingrese un numero incorrecto                           
                        } else {
                            System.out.println("Numero incorrecto! , perdio este turno!");
                        }
                        turnos3 = 1;
                    }
                    turnos = 1;
                }

                if (punteoB >= 200) {
                    i = 200;
                } else if (punteoA >= 200) {
                    i = 200;
                } else if (punteoC >= 200) {
                    i = 200;
                }
            }

//condiciones para que termine el juego y presente el ganador            
            if (punteoB >= 200 || punteoA >= 200 || punteoC >= 200) {
                System.out.println();
                if (punteoA > punteoB && punteoA > punteoC) {
                    System.out.println(jugador1 + " tiene " + punteoA + " puntos, ha ganado el juego");
                    System.out.println(jugador2 + " tiene " + punteoB + " puntos");
                    System.out.println(jugador3 + " tiene " + punteoC + " puntos");
                } else if (punteoB > punteoA && punteoB > punteoC) {
                    System.out.println(jugador2 + " tiene " + punteoB + " puntos, ha ganado el juego");
                    System.out.println(jugador3 + " tiene " + punteoC + " puntos");
                    System.out.println(jugador1 + " tiene " + punteoA + " puntos");
                } else if (punteoC > punteoA && punteoC > punteoB) {
                    System.out.println(jugador3 + " tiene " + punteoC + " puntos, ha ganado el juego");
                    System.out.println(jugador2 + " tiene " + punteoB + " puntos");
                    System.out.println(jugador1 + " tiene " + punteoA + " puntos");
                } else {
                    System.out.println(jugador1 + " tiene " + punteoA + " puntos");
                    System.out.println(jugador2 + " tiene " + punteoB + " puntos");
                    System.out.println(jugador3 + " tiene " + punteoC + " puntos");
                    System.out.println("Empataron con los mismos puntos!");
                }
                jugador1 = "";
                jugador2 = "";
                jugador3 = "";
                punteoA = 0;
                punteoB = 0;
                punteoC = 0;
            }

//codigo para  cuatro jugadores por turnos
        } else if (numeroJugadores == 4) {
            System.out.println("Escribir nombre del primer jugador: ");
            jugador1 = in.nextLine();
            System.out.println("Escribir nombre del segundo jugador: ");
            jugador2 = in.nextLine();
            System.out.println("Escribir nombre del tercer jugador: ");
            jugador3 = in.nextLine();
            System.out.println("Escribir nombre del cuarto jugador: ");
            jugador4 = in.nextLine();

//funcion para el primer jugador
            for (int i = 0; i < PUNTEO_TOTAL; i++) {
                System.out.println("\n Jugador(a) " + jugador1 + " seleccione el tipo de tiro que quiere hacer: ");
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
                        punteoA += 40;
                        System.out.println("Buen tiro, ((((°)))) dio en el  centro, en la parte de 40 puntos");
                        System.out.println(jugador1 + " tiene " + punteoA + " puntos");

                    } else if (aleatorio == 2) {
                        System.out.println("Tiro fallado!!   °(((())))");
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
                        System.out.println("Tiro fallado!!   °(((())))");
                        System.out.println(jugador1 + " tiene " + punteoA + " puntos");
                    }

//cuando el  jugador eliga el tiro 4 salir                    
                } else if (tiro == 4) {
                    System.out.println("Fin del juego!!");
                    i = 200;
                    jugador1 = "";
                    jugador2 = "";
                    jugador3 = "";
                    jugador4 = "";
                    punteoA = 0;
                    punteoB = 0;
                    punteoC = 0;
                    punteoD = 0;
                    turnos = 1;

                } else {
                    System.out.println("Numero incorrecto! , perdio este turno!");
                }

//funcion para el segundo jugador juegue                
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
                        i = 200;
                        jugador1 = "";
                        jugador2 = "";
                        jugador3 = "";
                        jugador4 = "";
                        punteoA = 0;
                        punteoB = 0;
                        punteoC = 0;
                        punteoD = 0;
                        turnos3 = 1;

                    } else {
                        System.out.println("Numero incorrecto! , perdio este turno!");
                    }

//funcion para que juegue el tercer jugador                    
                    turnos3 = 0;
                    while (turnos3 == 0) {

                        System.out.println("\n Jugador(a) " + jugador3 + " seleccione el tipo de tiro que quiere hacer: ");
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
                                punteoC += 40;
                                System.out.println("Buen tiro, ((((°)))) dio en el  centro, en la parte de 40 puntos");
                                System.out.println(jugador3 + " tiene " + punteoC + " puntos");

                            } else if (aleatorio == 2) {
                                System.out.println("Tiro fallado!!   °(((())))");
                                System.out.println(jugador3 + " tiene " + punteoC + " puntos");
                            }

//cuando el  jugador eliga el tiro 2                            
                        } else if (tiro == 2) {
                            int aleatorio = (int) (Math.random() * 3 + 1);

                            if (aleatorio == 1) {
                                punteoC += 10;
                                System.out.println("Buen tiro, (°((()))) dio en la parte de 10 puntos");
                                System.out.println(jugador3 + " tiene " + punteoC + " puntos");

                            } else if (aleatorio == 2) {
                                punteoC += 20;
                                System.out.println("Buen tiro, ((°(()))) dio en la parte de 20 puntos");
                                System.out.println(jugador3 + " tiene " + punteoC + " puntos");

                            } else if (aleatorio == 3) {
                                punteoC += 30;
                                System.out.println("Buen tiro, (((°()))) dio en la parte de 30 puntos");
                                System.out.println(jugador3 + " tiene " + punteoC + " puntos");
                            }

//cuando el  jugador eliga el tiro 3                            
                        } else if (tiro == 3) {
                            int aleatorio = (int) (Math.random() * 5 + 1);

                            if (aleatorio == 1) {
                                punteoC += 10;
                                System.out.println("Buen tiro, (°((()))) dio en la parte de 10 puntos");
                                System.out.println(jugador3 + " tiene " + punteoC + " puntos");

                            } else if (aleatorio == 2) {
                                punteoC += 20;
                                System.out.println("Buen tiro, ((°(()))) dio en la parte de 20 puntos");
                                System.out.println(jugador3 + " tiene " + punteoC + " puntos");

                            } else if (aleatorio == 3) {
                                punteoC += 30;
                                System.out.println("Buen tiro, (((°()))) dio en la parte de 30 puntos");
                                System.out.println(jugador3 + " tiene " + punteoC + " puntos");

                            } else if (aleatorio == 4) {
                                punteoC += 40;
                                System.out.println("Buen tiro, ((((°)))) dio en el  centro, en la parte de 40 puntos");
                                System.out.println(jugador3 + " tiene " + punteoC + " puntos");

                            } else if (aleatorio == 5) {
                                System.out.println("Tiro fallado!!   °(((())))");
                                System.out.println(jugador3 + " tiene " + punteoC + " puntos");
                            }

//cuando el  jugador eliga el tiro 4                            
                        } else if (tiro == 4) {
                            System.out.println("Fin del juego!!");
                            i = 200;
                            jugador1 = "";
                            jugador2 = "";
                            jugador3 = "";
                            jugador4 = "";
                            punteoA = 0;
                            punteoB = 0;
                            punteoC = 0;
                            punteoD = 0;
                            turnos4 = 1;

                        } else {
                            System.out.println("Numero incorrecto! , perdio este turno!");
                        }

//funcion para que juegue el cuarto jugador
                        turnos4 = 0;
                        while (turnos4 == 0) {

                            System.out.println("\n Jugador(a) " + jugador4 + " seleccione el tipo de tiro que quiere hacer: ");
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
                                    punteoD += 40;
                                    System.out.println("Buen tiro, ((((°)))) dio en el  centro, en la parte de 40 puntos");
                                    System.out.println(jugador4 + " tiene " + punteoD + " puntos");

                                } else if (aleatorio == 2) {
                                    System.out.println("Tiro fallado!!   °(((())))");
                                    System.out.println(jugador4 + " tiene " + punteoD + " puntos");
                                }

//cuando el  jugador eliga el tiro 2                                
                            } else if (tiro == 2) {
                                int aleatorio = (int) (Math.random() * 3 + 1);

                                if (aleatorio == 1) {
                                    punteoD += 10;
                                    System.out.println("Buen tiro, (°((()))) dio en la parte de 10 puntos");
                                    System.out.println(jugador4 + " tiene " + punteoD + " puntos");

                                } else if (aleatorio == 2) {
                                    punteoD += 20;
                                    System.out.println("Buen tiro, ((°(()))) dio en la parte de 20 puntos");
                                    System.out.println(jugador4 + " tiene " + punteoD + " puntos");

                                } else if (aleatorio == 3) {
                                    punteoD += 30;
                                    System.out.println("Buen tiro, (((°()))) dio en la parte de 30 puntos");
                                    System.out.println(jugador4 + " tiene " + punteoD + " puntos");
                                }

//cuando el  jugador eliga el tiro 3                                
                            } else if (tiro == 3) {
                                int aleatorio = (int) (Math.random() * 5 + 1);

                                if (aleatorio == 1) {
                                    punteoD += 10;
                                    System.out.println("Buen tiro, (°((()))) dio en la parte de 10 puntos");
                                    System.out.println(jugador4 + " tiene " + punteoD + " puntos");

                                } else if (aleatorio == 2) {
                                    punteoD += 20;
                                    System.out.println("Buen tiro, ((°(()))) dio en la parte de 20 puntos");
                                    System.out.println(jugador4 + " tiene " + punteoD + " puntos");

                                } else if (aleatorio == 3) {
                                    punteoD += 30;
                                    System.out.println("Buen tiro, (((°()))) dio en la parte de 30 puntos");
                                    System.out.println(jugador4 + " tiene " + punteoD + " puntos");

                                } else if (aleatorio == 4) {
                                    punteoD += 40;
                                    System.out.println("Buen tiro, ((((°)))) dio en el  centro, en la parte de 40 puntos");
                                    System.out.println(jugador4 + " tiene " + punteoD + " puntos");

                                } else if (aleatorio == 5) {
                                    System.out.println("Tiro fallado!!   °(((())))");
                                    System.out.println(jugador4 + " tiene " + punteoD + " puntos");
                                }

//si el jugador 4 sale del juego                                
                            } else if (tiro == 4) {
                                System.out.println("Fin del juego!!");
                                i = 200;
                                jugador1 = "";
                                jugador2 = "";
                                jugador3 = "";
                                jugador4 = "";
                                punteoA = 0;
                                punteoB = 0;
                                punteoC = 0;
                                punteoD = 0;
                                turnos4 = 1;

//cuando el cuarto jugador no ingresa un numero correcto pierde su turno
                            } else {
                                System.out.println("Numero incorrecto! , perdio este turno!");
                            }
                            turnos4 = 1;
                        }
                        turnos3 = 1;
                    }
                    turnos = 1;
                }

                if (punteoB >= 200) {
                    i = 200;
                } else if (punteoA >= 200) {
                    i = 200;
                } else if (punteoC >= 200) {
                    i = 200;
                } else if (punteoD >= 200) {
                    i = 200;
                }
            }

//condiciones para que el juego termine y diga quien es el ganador            
            if (punteoB >= 200 || punteoA >= 200 || punteoC >= 200 || punteoD >= 200) {
                System.out.println();
                if (punteoA > punteoB && punteoA > punteoC && punteoA > punteoD) {
                    System.out.println(jugador1 + " tiene " + punteoA + " puntos, ha ganado el juego");
                    System.out.println(jugador2 + " tiene " + punteoB + " puntos");
                    System.out.println(jugador3 + " tiene " + punteoC + " puntos");
                    System.out.println(jugador4 + " tiene " + punteoD + " puntos");
                } else if (punteoB > punteoA && punteoB > punteoC && punteoB > punteoD) {
                    System.out.println(jugador2 + " tiene " + punteoB + " puntos, ha ganado el juego");
                    System.out.println(jugador3 + " tiene " + punteoC + " puntos");
                    System.out.println(jugador1 + " tiene " + punteoA + " puntos");
                    System.out.println(jugador4 + " tiene " + punteoD + " puntos");
                } else if (punteoC > punteoA && punteoC > punteoB && punteoC > punteoD) {
                    System.out.println(jugador3 + " tiene " + punteoC + " puntos, ha ganado el juego");
                    System.out.println(jugador2 + " tiene " + punteoB + " puntos");
                    System.out.println(jugador1 + " tiene " + punteoA + " puntos");
                    System.out.println(jugador4 + " tiene " + punteoD + " puntos");
                } else if (punteoD > punteoA && punteoD > punteoB && punteoD > punteoC) {
                    System.out.println(jugador3 + " tiene " + punteoC + " puntos, ha ganado el juego");
                    System.out.println(jugador2 + " tiene " + punteoB + " puntos");
                    System.out.println(jugador1 + " tiene " + punteoA + " puntos");
                    System.out.println(jugador4 + " tiene " + punteoD + " puntos");
                } else {
                    System.out.println(jugador1 + " tiene " + punteoA + " puntos");
                    System.out.println(jugador2 + " tiene " + punteoB + " puntos");
                    System.out.println(jugador3 + " tiene " + punteoC + " puntos");
                    System.out.println(jugador4 + " tiene " + punteoD + " puntos");
                    System.out.println("Empataron con los mismos puntos!");
                }
                jugador1 = "";
                jugador2 = "";
                jugador3 = "";
                jugador4 = "";
                punteoA = 0;
                punteoB = 0;
                punteoC = 0;
                punteoD = 0;
            }

//cuando el usuario ingresa un numero de jugadores incorrecto
        } else {
            System.out.println("El numero ingresado es  incorrecto, intente de nuevo.");
        }
    }

//metodo main para arrancar el programa
    public static void main(String args[]) {
        Target nuevo = new Target();
        Scanner in = new Scanner(System.in);

        int a = 1;
        while (a == 1) {
            nuevo.Target();
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
}
