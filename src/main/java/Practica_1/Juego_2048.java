package Practica_1;

import java.util.Scanner;

public class Juego_2048 {

//declaracion de variables
    Scanner en = new Scanner(System.in);
    String nombreJugador = "";
    String movimientoTablero;
    public static final String MOVIMIENTO_ARRIBA = "E", MOVIMIENTO_ABAJO = "D", MOVIMIENTO_DERECHA = "F",
            MOVIMIENTO_IZQUIERDA = "S", SALIR_JUEGO = "V";
    int punteoJugador;

//constructor del juego, diseño y funcionalida.
    public void Juego_2048() {
        Scanner in = new Scanner(System.in);
        int imprimirMatriz = 0;
        int jugar = 0;
        int matriz[][] = new int[4][4];

        System.out.println("\nBienvenido al juego 2048");
        System.out.println("\nAcontinuacion se muestra en pantalla un cuadro de 4*4 con numeros iniciale"
                + "\n donde podra mover la tabla en el lugar que quiere. Primero: ");

        System.out.println("\nIngrese el nombre del jugador: ");
        nombreJugador = in.nextLine();
        System.out.println("");

//impresion de la matriz inicial 
        int aleatorio = (int) (Math.random() * 4 + 1);

        if (aleatorio == 1) {
            matriz[0][0] = 2;
            matriz[1][0] = 2;

        } else if (aleatorio == 2) {
            matriz[2][2] = 2;
            matriz[3][3] = 2;

        } else if (aleatorio == 3) {
            matriz[0][0] = 2;
            matriz[3][3] = 2;

        } else if (aleatorio == 4) {
            matriz[0][0] = 2;
            matriz[1][2] = 2;
        }

//impresion de la matriz en pantalla        
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                System.out.print("|   " + matriz[j][i] + "   |");
            }
            System.out.println();
        }

        while (jugar == 0) {

            System.out.println("\n" + nombreJugador + "\n"
                    + "\nEliga una direccion para mover el tablero ingresando la letra indicada:   \n1.Derecha (presione F)  "
                    + "\n2.Izquierda (presione S) \n3.Arriba (presione E) \n4.Abajo (presione D) \n5.Salir del juego (presione V)\n");
            movimientoTablero = in.nextLine();
            System.out.println();

//Movimiento hacia Arriba
            if (movimientoTablero.equalsIgnoreCase(MOVIMIENTO_ARRIBA)) {

//codigo para columna 0 y todas las filas cuando el jugador seleccione la opcion arriba
                if (matriz[0][0] == matriz[1][0]) {
                    if (matriz[0][0] == 0 || matriz[0][0] != 0) {
                        matriz[0][0] += matriz[1][0];
                        matriz[1][0] = matriz[2][0];
                        matriz[2][0] = matriz[3][0];
                        matriz[3][0] = 0;
                    }
                }
                if (matriz[1][0] == matriz[2][0]) {

                    if (matriz[1][0] != 0 && matriz[2][0] != 0) {
                        if (matriz[0][0] == 0) {
                            matriz[0][0] = matriz[1][0] + matriz[2][0];
                            matriz[1][0] = matriz[3][0];
                            matriz[2][0] = 0;
                            matriz[3][0] = 0;
                        } else {
                            matriz[1][0] += matriz[2][0];
                            matriz[2][0] = matriz[3][0];
                            matriz[3][0] = 0;
                        }
                    } else {
                        if (matriz[0][0] != matriz[3][0]) {
                            matriz[1][0] = matriz[3][0];
                            matriz[3][0] = 0;
                        }
                    }
                }

                if (matriz[0][0] == matriz[3][0] && matriz[1][0] == 0 && matriz[2][0] == 0) {
                    matriz[0][0] += matriz[3][0];
                    matriz[3][0] = 0;
                }
                if (matriz[1][0] == matriz[3][0] && matriz[2][0] == 0) {
                    if (matriz[0][0] == 0) {
                        matriz[0][0] = matriz[1][0] + matriz[3][0];
                        matriz[1][0] = 0;
                        matriz[3][0] = 0;
                    } else {
                        matriz[1][0] += matriz[3][0];
                        matriz[3][0] = 0;
                    }
                }
                if (matriz[0][0] == matriz[2][0] && matriz[1][0] == 0) {
                    matriz[0][0] += matriz[2][0];
                    matriz[1][0] = matriz[3][0];
                    matriz[2][0] = 0;
                    matriz[3][0] = 0;
                }

                if ((matriz[0][0] == 0 || matriz[1][0] != matriz[2][0]) && (matriz[2][0] == 0 || matriz[2][0] == matriz[3][0])) {

                    if (matriz[0][0] == 0 && matriz[1][0] == 0) {
                        matriz[0][0] = matriz[2][0] + matriz[3][0];
                        matriz[1][0] = 0;
                        matriz[2][0] = 0;
                        matriz[3][0] = 0;

                    } else if (matriz[0][0] != 0 && matriz[1][0] == 0) {
                        matriz[1][0] = matriz[2][0] + matriz[3][0];
                        matriz[2][0] = 0;
                        matriz[3][0] = 0;

                    } else if (matriz[0][0] == 0 && matriz[1][0] != 0) {
                        matriz[0][0] = matriz[1][0];
                        matriz[1][0] = matriz[2][0] + matriz[3][0];
                        matriz[2][0] = 0;
                        matriz[3][0] = 0;

                    } else if (matriz[0][0] != 0 && matriz[1][0] != 0) {
                        matriz[2][0] += matriz[3][0];
                        matriz[3][0] = 0;
                    }
                }

                if (matriz[2][0] != matriz[3][0]) {
                    if (matriz[0][0] == 0 && matriz[1][0] == 0) {
                        matriz[0][0] = matriz[2][0];
                        matriz[1][0] = matriz[3][0];
                        matriz[2][0] = 0;
                        matriz[3][0] = 0;

                    } else if (matriz[0][0] != 0 && matriz[1][0] == 0) {
                        matriz[1][0] = matriz[2][0];
                        matriz[2][0] = matriz[3][0];
                        matriz[3][0] = 0;

                    } else if (matriz[0][0] == 0 && matriz[1][0] != 0) {
                        matriz[0][0] = matriz[1][0];
                        matriz[1][0] = matriz[2][0];
                        matriz[2][0] = matriz[3][0];
                        matriz[3][0] = 0;
                    }
                }

//codigo para columna 1 y todas las filas cuando el jugador seleccione la opcion arriba
                if (matriz[0][1] == matriz[1][1]) {
                    if (matriz[0][1] == 0 || matriz[0][1] != 0) {
                        matriz[0][1] += matriz[1][1];
                        matriz[1][1] = matriz[2][1];
                        matriz[2][1] = matriz[3][1];
                        matriz[3][1] = 0;
                    }
                }
                if (matriz[1][1] == matriz[2][1]) {
                    if (matriz[1][1] != 0 && matriz[2][1] != 0) {
                        if (matriz[0][1] == 0) {
                            matriz[0][1] = matriz[1][1] + matriz[2][1];
                            matriz[1][1] = matriz[3][1];
                            matriz[2][1] = 0;
                            matriz[3][1] = 0;
                        } else {
                            matriz[1][1] += matriz[2][1];
                            matriz[2][1] = matriz[3][1];
                            matriz[3][1] = 0;
                        }
                    } else {
                        if (matriz[0][1] != matriz[3][1]) {
                            matriz[1][1] = matriz[3][1];
                            matriz[3][1] = 0;
                        }
                    }
                }

                if (matriz[0][1] == matriz[3][1] && matriz[1][1] == 0 && matriz[2][1] == 0) {
                    matriz[0][1] += matriz[3][1];
                    matriz[3][1] = 0;
                }
                if (matriz[1][1] == matriz[3][1] && matriz[2][1] == 0) {
                    if (matriz[0][1] == 0) {
                        matriz[0][1] = matriz[1][1] + matriz[3][1];
                        matriz[1][1] = 0;
                        matriz[3][1] = 0;
                    } else {
                        matriz[1][1] += matriz[3][1];
                        matriz[3][1] = 0;
                    }
                }
                if (matriz[0][1] == matriz[2][1] && matriz[1][1] == 0) {
                    matriz[0][1] += matriz[2][1];
                    matriz[1][1] = matriz[3][1];
                    matriz[2][1] = 0;
                    matriz[3][1] = 0;
                }

                if ((matriz[0][1] == 0 || matriz[1][1] != matriz[2][1]) && (matriz[2][1] == 0 || matriz[2][1] == matriz[3][1])) {

                    if (matriz[0][1] == 0 && matriz[1][1] == 0) {
                        matriz[0][1] = matriz[2][1] + matriz[3][1];
                        matriz[1][1] = 0;
                        matriz[2][1] = 0;
                        matriz[3][1] = 0;

                    } else if (matriz[0][1] != 0 && matriz[1][1] == 0) {
                        matriz[1][1] = matriz[2][1] + matriz[3][1];
                        matriz[2][1] = 0;
                        matriz[3][1] = 0;

                    } else if (matriz[0][1] == 0 && matriz[1][1] != 0) {
                        matriz[0][1] = matriz[1][1];
                        matriz[1][1] = matriz[2][1] + matriz[3][1];
                        matriz[2][1] = 0;
                        matriz[3][1] = 0;

                    } else if (matriz[0][1] != 0 && matriz[1][1] != 0) {
                        matriz[2][1] += matriz[3][1];
                        matriz[3][1] = 0;
                    }
                }

                if (matriz[2][1] != matriz[3][1]) {
                    if (matriz[0][1] == 0 && matriz[1][1] == 0) {
                        matriz[0][1] = matriz[2][1];
                        matriz[1][1] = matriz[3][1];
                        matriz[2][1] = 0;
                        matriz[3][1] = 0;

                    } else if (matriz[0][1] != 0 && matriz[1][1] == 0) {
                        matriz[1][1] = matriz[2][1];
                        matriz[2][1] = matriz[3][1];
                        matriz[3][1] = 0;

                    } else if (matriz[0][1] == 0 && matriz[1][1] != 0) {
                        matriz[0][1] = matriz[1][1];
                        matriz[1][1] = matriz[2][1];
                        matriz[2][1] = matriz[3][1];
                        matriz[3][1] = 0;
                    }
                }

//codigo para columna 2 y todas las filas cuando el jugador seleccione la opcion arriba
                if (matriz[0][2] == matriz[1][2]) {
                    if (matriz[0][2] == 0 || matriz[0][2] != 0) {
                        matriz[0][2] += matriz[1][2];
                        matriz[1][2] = matriz[2][2];
                        matriz[2][2] = matriz[3][2];
                        matriz[3][2] = 0;
                    }
                }
                if (matriz[1][2] == matriz[2][2]) {
                    if (matriz[1][2] != 0 && matriz[2][2] != 0) {
                        if (matriz[0][2] == 0) {
                            matriz[0][2] = matriz[1][2] + matriz[2][2];
                            matriz[1][2] = matriz[3][2];
                            matriz[2][2] = 0;
                            matriz[3][2] = 0;
                        } else {
                            matriz[1][2] += matriz[2][2];
                            matriz[2][2] = matriz[3][2];
                            matriz[3][2] = 0;
                        }
                    } else {
                        if (matriz[0][2] != matriz[3][2]) {
                            matriz[1][2] = matriz[3][2];
                            matriz[3][2] = 0;
                        }
                    }
                }

                if (matriz[0][2] == matriz[3][2] && matriz[1][2] == 0 && matriz[2][2] == 0) {
                    matriz[0][2] += matriz[3][2];
                    matriz[3][2] = 0;
                }
                if (matriz[1][2] == matriz[3][2] && matriz[2][2] == 0) {
                    if (matriz[0][2] == 0) {
                        matriz[0][2] = matriz[1][2] + matriz[3][2];
                        matriz[1][2] = 0;
                        matriz[3][2] = 0;
                    } else {
                        matriz[1][2] += matriz[3][2];
                        matriz[3][2] = 0;
                    }
                }
                if (matriz[0][2] == matriz[2][2] && matriz[1][2] == 0) {
                    matriz[0][2] += matriz[2][2];
                    matriz[1][2] = matriz[3][2];
                    matriz[2][2] = 0;
                    matriz[3][2] = 0;
                }

                if ((matriz[0][2] == 0 || matriz[1][2] != matriz[2][2]) && (matriz[2][2] == 0 || matriz[2][2] == matriz[3][2])) {

                    if (matriz[0][2] == 0 && matriz[1][2] == 0) {
                        matriz[0][2] = matriz[2][2] + matriz[3][2];
                        matriz[1][2] = 0;
                        matriz[2][2] = 0;
                        matriz[3][2] = 0;

                    } else if (matriz[0][2] != 0 && matriz[1][2] == 0) {
                        matriz[1][2] = matriz[2][2] + matriz[3][2];
                        matriz[2][2] = 0;
                        matriz[3][2] = 0;

                    } else if (matriz[0][2] == 0 && matriz[1][2] != 0) {
                        matriz[0][2] = matriz[1][2];
                        matriz[1][2] = matriz[2][2] + matriz[3][2];
                        matriz[2][2] = 0;
                        matriz[3][2] = 0;

                    } else if (matriz[0][2] != 0 && matriz[1][2] != 0) {
                        matriz[2][2] += matriz[3][2];
                        matriz[3][2] = 0;
                    }
                }

                if (matriz[2][2] != matriz[3][2]) {
                    if (matriz[0][2] == 0 && matriz[1][2] == 0) {
                        matriz[0][2] = matriz[2][2];
                        matriz[1][2] = matriz[3][2];
                        matriz[2][2] = 0;
                        matriz[3][2] = 0;

                    } else if (matriz[0][2] != 0 && matriz[1][2] == 0) {
                        matriz[1][2] = matriz[2][2];
                        matriz[2][2] = matriz[3][2];
                        matriz[3][2] = 0;

                    } else if (matriz[0][2] == 0 && matriz[1][2] != 0) {
                        matriz[0][2] = matriz[1][2];
                        matriz[1][2] = matriz[2][2];
                        matriz[2][2] = matriz[3][2];
                        matriz[3][2] = 0;
                    }
                }

//codigo para columna 3 y todas las filas cuando el jugador seleccione la opcion arriba
                if (matriz[0][3] == matriz[1][3]) {
                    if (matriz[0][3] == 0 || matriz[0][3] != 0) {
                        matriz[0][3] += matriz[1][3];
                        matriz[1][3] = matriz[2][3];
                        matriz[2][3] = matriz[3][3];
                        matriz[3][3] = 0;
                    }
                }
                if (matriz[1][3] == matriz[2][3]) {
                    if (matriz[1][3] != 0 && matriz[2][3] != 0) {
                        if (matriz[0][3] == 0) {
                            matriz[0][3] = matriz[1][3] + matriz[2][3];
                            matriz[1][3] = matriz[3][3];
                            matriz[2][3] = 0;
                            matriz[3][3] = 0;
                        } else {
                            matriz[1][3] += matriz[2][3];
                            matriz[2][3] = matriz[3][3];
                            matriz[3][3] = 0;
                        }
                    } else {
                        if (matriz[0][3] != matriz[3][3]) {
                            matriz[1][3] = matriz[3][3];
                            matriz[3][3] = 0;
                        }
                    }
                }

                if (matriz[0][3] == matriz[3][3] && matriz[1][3] == 0 && matriz[2][3] == 0) {
                    matriz[0][3] += matriz[3][3];
                    matriz[3][3] = 0;
                }
                if (matriz[1][3] == matriz[3][3] && matriz[2][3] == 0) {
                    if (matriz[0][3] == 0) {
                        matriz[0][3] = matriz[1][3] + matriz[3][3];
                        matriz[1][3] = 0;
                        matriz[3][3] = 0;
                    } else {
                        matriz[1][3] += matriz[3][3];
                        matriz[3][3] = 0;
                    }
                }
                if (matriz[0][3] == matriz[2][3] && matriz[1][3] == 0) {
                    matriz[0][3] += matriz[2][3];
                    matriz[1][3] = matriz[3][3];
                    matriz[2][3] = 0;
                    matriz[3][3] = 0;
                }

                if ((matriz[0][3] == 0 || matriz[1][3] != matriz[2][3]) && (matriz[2][3] == 0 || matriz[2][3] == matriz[3][3])) {

                    if (matriz[0][3] == 0 && matriz[1][3] == 0) {
                        matriz[0][3] = matriz[2][3] + matriz[3][3];
                        matriz[1][3] = 0;
                        matriz[2][3] = 0;
                        matriz[3][3] = 0;

                    } else if (matriz[0][3] != 0 && matriz[1][3] == 0) {
                        matriz[1][3] = matriz[2][3] + matriz[3][3];
                        matriz[2][3] = 0;
                        matriz[3][3] = 0;

                    } else if (matriz[0][3] == 0 && matriz[1][3] != 0) {
                        matriz[0][3] = matriz[1][3];
                        matriz[1][3] = matriz[2][3] + matriz[3][3];
                        matriz[2][3] = 0;
                        matriz[3][3] = 0;

                    } else if (matriz[0][3] != 0 && matriz[1][3] != 0) {
                        matriz[2][3] += matriz[3][3];
                        matriz[3][3] = 0;
                    }
                }

                if (matriz[2][3] != matriz[3][3]) {
                    if (matriz[0][3] == 0 && matriz[1][3] == 0) {
                        matriz[0][3] = matriz[2][3];
                        matriz[1][3] = matriz[3][3];
                        matriz[2][3] = 0;
                        matriz[3][3] = 0;

                    } else if (matriz[0][3] != 0 && matriz[1][3] == 0) {
                        matriz[1][3] = matriz[2][3];
                        matriz[2][3] = matriz[3][3];
                        matriz[3][3] = 0;

                    } else if (matriz[0][3] == 0 && matriz[1][3] != 0) {
                        matriz[0][3] = matriz[1][3];
                        matriz[1][3] = matriz[2][3];
                        matriz[2][3] = matriz[3][3];
                        matriz[3][3] = 0;
                    }
                }

                //Insertar un numero 2 o 4 en la matriz resultante                
                int aleatorio1 = (int) (Math.random() * 3 + 1);
                if (aleatorio1 == 1) {
                    if (matriz[3][2] == 0) {
                        matriz[3][2] = 4;
                    } else if (matriz[3][1] == 0) {
                        matriz[3][1] = 4;
                    } else if (matriz[3][0] == 0) {
                        matriz[3][0] = 4;
                    } else {
                        matriz[3][3] = 2;
                    }
                } else if (aleatorio1 == 2) {
                    if (matriz[3][3] == 0) {
                        matriz[3][3] = 4;
                    } else if (matriz[3][1] == 0) {
                        matriz[3][1] = 2;
                    } else if (matriz[3][2] == 0) {
                        matriz[3][2] = 4;
                    } else {
                        matriz[3][0] = 2;
                    }
                } else {
                    if (matriz[3][0] == 0) {
                        matriz[3][0] = 2;
                    } else if (matriz[3][1] == 0) {
                        matriz[3][1] = 4;
                    } else if (matriz[3][2] == 0) {
                        matriz[3][2] = 2;
                    } else {
                        matriz[3][3] = 2;
                    }
                }

//Movimiento hacia abajo
            } else if (movimientoTablero.equalsIgnoreCase(MOVIMIENTO_ABAJO)) {

//codigo para columna 0 y todas las filas cuando el jugador seleccione la opcion abajo
                if (matriz[3][0] == matriz[2][0]) {
                    if (matriz[3][0] == 0 || matriz[3][0] != 0) {
                        matriz[3][0] += matriz[2][0];
                        matriz[2][0] = matriz[1][0];
                        matriz[1][0] = matriz[0][0];
                        matriz[0][0] = 0;
                    }
                }
                if (matriz[2][0] == matriz[1][0]) {
                    if (matriz[2][0] != 0 && matriz[1][0] != 0) {
                        if (matriz[3][0] == 0) {
                            matriz[3][0] = matriz[2][0] + matriz[1][0];
                            matriz[2][0] = matriz[0][0];
                            matriz[1][0] = 0;
                            matriz[0][0] = 0;
                        } else {
                            matriz[2][0] += matriz[1][0];
                            matriz[1][0] = matriz[0][0];
                            matriz[0][0] = 0;
                        }
                    } else {
                        if (matriz[3][0] != matriz[0][0]) {
                            matriz[2][0] = matriz[0][0];
                            matriz[0][0] = 0;
                        }
                    }
                }

                if (matriz[3][0] == matriz[0][0] && matriz[2][0] == 0 && matriz[1][0] == 0) {
                    matriz[3][0] += matriz[0][0];
                    matriz[0][0] = 0;
                }

                if (matriz[2][0] == matriz[0][0] && matriz[1][0] == 0) {
                    if (matriz[3][0] == 0) {
                        matriz[3][0] = matriz[2][0] + matriz[0][0];
                        matriz[2][0] = 0;
                        matriz[0][0] = 0;

                    } else {
                        matriz[2][0] += matriz[0][0];
                        matriz[0][0] = 0;
                    }
                }
                if (matriz[3][0] == matriz[1][0] && matriz[2][0] == 0) {
                    matriz[3][0] += matriz[1][0];
                    matriz[2][0] = matriz[0][0];
                    matriz[1][0] = 0;
                    matriz[0][0] = 0;
                }

                if ((matriz[3][0] == 0 || matriz[2][0] != matriz[1][0]) && (matriz[1][0] == 0 || matriz[1][0] == matriz[0][0])) {

                    if (matriz[3][0] == 0 && matriz[2][0] == 0) {
                        matriz[3][0] = matriz[1][0] + matriz[0][0];
                        matriz[2][0] = 0;
                        matriz[1][0] = 0;
                        matriz[0][0] = 0;

                    } else if (matriz[3][0] != 0 && matriz[2][0] == 0) {
                        matriz[2][0] = matriz[1][0] + matriz[0][0];
                        matriz[1][0] = 0;
                        matriz[0][0] = 0;

                    } else if (matriz[3][0] == 0 && matriz[2][0] != 0) {
                        matriz[3][0] = matriz[2][0];
                        matriz[2][0] = matriz[1][0] + matriz[0][0];
                        matriz[1][0] = 0;
                        matriz[0][0] = 0;

                    } else if (matriz[3][0] != 0 && matriz[2][0] != 0) {
                        matriz[1][0] += matriz[0][0];
                        matriz[0][0] = 0;
                    }
                }

                if (matriz[1][0] != matriz[0][0]) {
                    if (matriz[3][0] == 0 && matriz[2][0] == 0) {
                        matriz[3][0] = matriz[1][0];
                        matriz[2][0] = matriz[0][0];
                        matriz[1][0] = 0;
                        matriz[0][0] = 0;

                    } else if (matriz[3][0] != 0 && matriz[2][0] == 0) {
                        matriz[2][0] = matriz[1][0];
                        matriz[1][0] = matriz[0][0];
                        matriz[0][0] = 0;

                    } else if (matriz[3][0] == 0 && matriz[2][0] != 0) {
                        matriz[3][0] = matriz[2][0];
                        matriz[2][0] = matriz[1][0];
                        matriz[1][0] = matriz[0][0];
                        matriz[0][0] = 0;
                    }
                }

//codigo para columna 1 y todas las filas cuando el jugador seleccione la opcion abajo
                if (matriz[3][1] == matriz[2][1]) {
                    if (matriz[3][1] == 0 || matriz[3][1] != 0) {
                        matriz[3][1] += matriz[2][1];
                        matriz[2][1] = matriz[1][1];
                        matriz[1][1] = matriz[0][1];
                        matriz[0][1] = 0;
                    }
                }
                if (matriz[2][1] == matriz[1][1]) {
                    if (matriz[2][1] != 0 && matriz[1][1] != 0) {
                        if (matriz[3][1] == 0) {
                            matriz[3][1] = matriz[2][1] + matriz[1][1];
                            matriz[2][1] = matriz[0][1];
                            matriz[1][1] = 0;
                            matriz[0][1] = 0;
                        } else {
                            matriz[2][1] += matriz[1][1];
                            matriz[1][1] = matriz[0][1];
                            matriz[0][1] = 0;
                        }
                    } else {
                        if (matriz[3][1] != matriz[0][1]) {
                            matriz[2][1] = matriz[0][1];
                            matriz[0][1] = 0;
                        }
                    }
                }
                if (matriz[3][1] == matriz[0][1] && matriz[2][1] == 0 && matriz[1][1] == 0) {
                    matriz[3][1] += matriz[0][1];
                    matriz[0][1] = 0;

                }
                if (matriz[2][1] == matriz[0][1] && matriz[1][1] == 0) {
                    if (matriz[3][1] == 0) {
                        matriz[3][1] = matriz[2][1] + matriz[0][1];
                        matriz[2][1] = 0;
                        matriz[0][1] = 0;
                    } else {
                        matriz[2][1] += matriz[0][1];
                        matriz[0][1] = 0;
                    }
                }
                if (matriz[3][1] == matriz[1][1] && matriz[2][1] == 0) {
                    matriz[3][1] += matriz[1][1];
                    matriz[2][1] = matriz[0][1];
                    matriz[1][1] = 0;
                    matriz[0][1] = 0;
                }

                if ((matriz[3][1] == 0 || matriz[2][1] != matriz[1][1]) && (matriz[1][1] == 0 || matriz[1][1] == matriz[0][1])) {

                    if (matriz[3][1] == 0 && matriz[2][1] == 0) {
                        matriz[3][1] = matriz[1][1] + matriz[0][1];
                        matriz[2][1] = 0;
                        matriz[1][1] = 0;
                        matriz[0][1] = 0;

                    } else if (matriz[3][1] != 0 && matriz[2][1] == 0) {
                        matriz[2][1] = matriz[1][1] + matriz[0][1];
                        matriz[1][1] = 0;
                        matriz[0][1] = 0;

                    } else if (matriz[3][1] == 0 && matriz[2][1] != 0) {
                        matriz[3][1] = matriz[2][1];
                        matriz[2][1] = matriz[1][1] + matriz[0][1];
                        matriz[1][1] = 0;
                        matriz[0][1] = 0;

                    } else if (matriz[3][1] != 0 && matriz[2][1] != 0) {
                        matriz[1][1] += matriz[0][1];
                        matriz[0][1] = 0;
                    }
                }

                if (matriz[1][1] != matriz[0][1]) {
                    if (matriz[3][1] == 0 && matriz[2][1] == 0) {
                        matriz[3][1] = matriz[1][1];
                        matriz[2][1] = matriz[0][1];
                        matriz[1][1] = 0;
                        matriz[0][1] = 0;

                    } else if (matriz[3][1] != 0 && matriz[2][1] == 0) {
                        matriz[2][1] = matriz[1][1];
                        matriz[1][1] = matriz[0][1];
                        matriz[0][1] = 0;

                    } else if (matriz[3][1] == 0 && matriz[2][1] != 0) {
                        matriz[3][1] = matriz[2][1];
                        matriz[2][1] = matriz[1][1];
                        matriz[1][1] = matriz[0][1];
                        matriz[0][1] = 0;
                    }
                }

//codigo para columna 2 y todas las filas cuando el jugador seleccione la opcion abajo
                if (matriz[3][2] == matriz[2][2]) {
                    if (matriz[3][2] == 0 || matriz[3][2] != 0) {
                        matriz[3][2] += matriz[2][2];
                        matriz[2][2] = matriz[1][2];
                        matriz[1][2] = matriz[0][2];
                        matriz[0][2] = 0;
                    }
                }
                if (matriz[2][2] == matriz[1][2]) {
                    if (matriz[2][2] != 0 && matriz[1][2] != 0) {
                        if (matriz[3][2] == 0) {
                            matriz[3][2] = matriz[2][2] + matriz[1][2];
                            matriz[2][2] = matriz[0][2];
                            matriz[1][2] = 0;
                            matriz[0][2] = 0;
                        } else {
                            matriz[2][2] += matriz[1][2];
                            matriz[1][2] = matriz[0][2];
                            matriz[0][2] = 0;
                        }
                    } else {
                        if (matriz[3][2] != matriz[0][2]) {
                            matriz[2][2] = matriz[0][2];
                            matriz[0][2] = 0;
                        }
                    }
                }

                if (matriz[3][2] == matriz[0][2] && matriz[2][2] == 0 && matriz[1][2] == 0) {
                    matriz[3][2] += matriz[0][2];
                    matriz[0][2] = 0;
                }

                if (matriz[2][2] == matriz[0][2] && matriz[1][2] == 0) {
                    if (matriz[3][2] == 0) {
                        matriz[3][2] = matriz[2][2] + matriz[0][2];
                        matriz[2][2] = 0;
                        matriz[0][2] = 0;
                    } else {
                        matriz[2][2] += matriz[0][2];
                        matriz[0][2] = 0;
                    }
                }
                if (matriz[3][2] == matriz[1][2] && matriz[2][2] == 0) {
                    matriz[3][2] += matriz[1][2];
                    matriz[2][2] = matriz[0][2];
                    matriz[1][2] = 0;
                    matriz[0][2] = 0;
                }

                if ((matriz[3][2] == 0 || matriz[2][2] != matriz[1][2]) && (matriz[1][2] == 0 || matriz[1][2] == matriz[0][2])) {

                    if (matriz[3][2] == 0 && matriz[2][2] == 0) {
                        matriz[3][2] = matriz[1][2] + matriz[0][2];
                        matriz[2][2] = 0;
                        matriz[1][2] = 0;
                        matriz[0][2] = 0;

                    } else if (matriz[3][2] != 0 && matriz[2][2] == 0) {
                        matriz[2][2] = matriz[1][2] + matriz[0][2];
                        matriz[1][2] = 0;
                        matriz[0][2] = 0;

                    } else if (matriz[3][2] == 0 && matriz[2][2] != 0) {
                        matriz[3][2] = matriz[2][2];
                        matriz[2][2] = matriz[1][2] + matriz[0][2];
                        matriz[1][2] = 0;
                        matriz[0][2] = 0;

                    } else if (matriz[3][2] != 0 && matriz[2][2] != 0) {
                        matriz[1][2] += matriz[0][2];
                        matriz[0][2] = 0;
                    }
                }

                if (matriz[1][2] != matriz[0][2]) {
                    if (matriz[3][2] == 0 && matriz[2][2] == 0) {
                        matriz[3][2] = matriz[1][2];
                        matriz[2][2] = matriz[0][2];
                        matriz[1][2] = 0;
                        matriz[0][2] = 0;

                    } else if (matriz[3][2] != 0 && matriz[2][2] == 0) {
                        matriz[2][2] = matriz[1][2];
                        matriz[1][2] = matriz[0][2];
                        matriz[0][2] = 0;

                    } else if (matriz[3][2] == 0 && matriz[2][2] != 0) {
                        matriz[3][2] = matriz[2][2];
                        matriz[2][2] = matriz[1][2];
                        matriz[1][2] = matriz[0][2];
                        matriz[0][2] = 0;
                    }
                }

//codigo para columna 3 y todas las filas cuando el jugador seleccione la opcion abajo
                if (matriz[3][3] == matriz[2][3]) {
                    if (matriz[3][3] == 0 || matriz[3][3] != 0) {
                        matriz[3][3] += matriz[2][3];
                        matriz[2][3] = matriz[1][3];
                        matriz[1][3] = matriz[0][3];
                        matriz[0][3] = 0;
                    }
                }
                if (matriz[2][3] == matriz[1][3]) {
                    if (matriz[2][3] != 0 && matriz[1][3] != 0) {
                        if (matriz[3][3] == 0) {
                            matriz[3][3] = matriz[2][3] + matriz[1][3];
                            matriz[2][3] = matriz[0][3];
                            matriz[1][3] = 0;
                            matriz[0][3] = 0;
                        } else {
                            matriz[2][3] += matriz[1][3];
                            matriz[1][3] = matriz[0][3];
                            matriz[0][3] = 0;
                        }
                    } else {
                        if (matriz[3][3] != matriz[0][3]) {
                            matriz[2][3] = matriz[0][3];
                            matriz[0][3] = 0;
                        }
                    }
                }

                if (matriz[3][3] == matriz[0][3] && matriz[2][3] == 0 && matriz[1][3] == 0) {
                    matriz[3][3] += matriz[0][3];
                    matriz[0][3] = 0;

                }
                if (matriz[2][3] == matriz[0][3] && matriz[1][3] == 0) {
                    if (matriz[3][3] == 0) {
                        matriz[3][3] = matriz[2][3] + matriz[0][3];
                        matriz[2][3] = 0;
                        matriz[0][3] = 0;
                    } else {
                        matriz[2][3] += matriz[0][3];
                        matriz[0][3] = 0;
                    }
                }
                if (matriz[3][3] == matriz[1][3] && matriz[2][3] == 0) {
                    matriz[3][3] += matriz[1][3];
                    matriz[2][3] = matriz[0][3];
                    matriz[1][3] = 0;
                    matriz[0][3] = 0;
                }

                if ((matriz[3][3] == 0 || matriz[2][3] != matriz[1][3]) && (matriz[1][3] == 0 || matriz[1][3] == matriz[0][3])) {

                    if (matriz[3][3] == 0 && matriz[2][3] == 0) {
                        matriz[3][3] = matriz[1][3] + matriz[0][3];
                        matriz[2][3] = 0;
                        matriz[1][3] = 0;
                        matriz[0][3] = 0;

                    } else if (matriz[3][3] != 0 && matriz[2][3] == 0) {
                        matriz[2][3] = matriz[1][3] + matriz[0][3];
                        matriz[1][3] = 0;
                        matriz[0][3] = 0;

                    } else if (matriz[3][3] == 0 && matriz[2][3] != 0) {
                        matriz[3][3] = matriz[2][3];
                        matriz[2][3] = matriz[1][3] + matriz[0][3];
                        matriz[1][3] = 0;
                        matriz[0][3] = 0;

                    } else if (matriz[3][3] != 0 && matriz[2][3] != 0) {
                        matriz[1][3] += matriz[0][3];
                        matriz[0][3] = 0;
                    }
                }

                if (matriz[1][3] != matriz[0][3]) {
                    if (matriz[3][3] == 0 && matriz[2][3] == 0) {
                        matriz[3][3] = matriz[1][3];
                        matriz[2][3] = matriz[0][3];
                        matriz[1][3] = 0;
                        matriz[0][3] = 0;

                    } else if (matriz[3][3] != 0 && matriz[2][3] == 0) {
                        matriz[2][3] = matriz[1][3];
                        matriz[1][3] = matriz[0][3];
                        matriz[0][3] = 0;

                    } else if (matriz[3][3] == 0 && matriz[2][3] != 0) {
                        matriz[3][3] = matriz[2][3];
                        matriz[2][3] = matriz[1][3];
                        matriz[1][3] = matriz[0][3];
                        matriz[0][3] = 0;
                    }
                }

                //insertar un 2 en un lugar de la nueva matriz                 
                int aleatorio1 = (int) (Math.random() * 3 + 1);
                if (aleatorio1 == 1) {
                    if (matriz[0][1] == 0) {
                        matriz[0][1] = 2;
                    } else if (matriz[0][2] == 0) {
                        matriz[0][2] = 4;
                    } else if (matriz[0][3] == 0) {
                        matriz[0][3] = 2;
                    } else {
                        matriz[0][0] = 4;
                    }
                } else if (aleatorio1 == 2) {
                    if (matriz[0][3] == 0) {
                        matriz[0][3] = 4;
                    } else if (matriz[0][2] == 0) {
                        matriz[0][2] = 4;
                    } else if (matriz[0][1] == 0) {
                        matriz[0][1] = 4;
                    } else {
                        matriz[0][0] = 2;
                    }
                } else {
                    if (matriz[0][2] == 0) {
                        matriz[0][2] = 2;
                    } else if (matriz[0][3] == 0) {
                        matriz[0][3] = 2;
                    } else if (matriz[0][1] == 0) {
                        matriz[0][1] = 4;
                    } else {
                        matriz[0][0] = 4;
                    }
                }

//Movimiento hacia la Izquierda                
            } else if (movimientoTablero.equalsIgnoreCase(MOVIMIENTO_IZQUIERDA)) {

//codigo para fila 0 y todas las columnas cuando el jugador seleccione la opcion izquierda
                if (matriz[0][0] == matriz[0][1]) {
                    if (matriz[0][0] == 0 || matriz[0][0] != 0) {
                        matriz[0][0] += matriz[0][1];
                        matriz[0][1] = matriz[0][2];
                        matriz[0][2] = matriz[0][3];
                        matriz[0][3] = 0;
                    }
                }
                if (matriz[0][1] == matriz[0][2]) {
                    if (matriz[0][1] != 0 && matriz[0][2] != 0) {
                        if (matriz[0][0] == 0) {
                            matriz[0][0] = matriz[0][1] + matriz[0][2];
                            matriz[0][1] = matriz[0][3];
                            matriz[0][2] = 0;
                            matriz[0][3] = 0;
                        } else {
                            matriz[0][1] += matriz[0][2];
                            matriz[0][2] = matriz[0][3];
                            matriz[0][3] = 0;
                        }
                    } else {
                        if (matriz[0][0] != matriz[0][3]) {
                            matriz[0][1] = matriz[0][3];
                            matriz[0][3] = 0;
                        }
                    }
                }

                if (matriz[0][0] == matriz[0][3] && matriz[0][1] == 0 && matriz[0][2] == 0) {
                    matriz[0][0] += matriz[0][3];
                    matriz[0][3] = 0;
                }
                if (matriz[0][1] == matriz[0][3] && matriz[0][2] == 0) {
                    if (matriz[0][0] == 0) {
                        matriz[0][0] = matriz[0][1] + matriz[0][3];
                        matriz[0][1] = 0;
                        matriz[0][3] = 0;
                    } else {
                        matriz[0][1] += matriz[0][3];
                        matriz[0][3] = 0;
                    }
                }
                if (matriz[0][0] == matriz[0][2] && matriz[0][1] == 0) {
                    matriz[0][0] += matriz[0][2];
                    matriz[0][1] = matriz[0][3];
                    matriz[0][2] = 0;
                    matriz[0][3] = 0;
                }

                if ((matriz[0][0] == 0 || matriz[0][1] != matriz[0][2]) && (matriz[0][2] == 0 || matriz[0][2] == matriz[0][3])) {

                    if (matriz[0][0] == 0 && matriz[0][1] == 0) {
                        matriz[0][0] = matriz[0][2] + matriz[0][3];
                        matriz[0][1] = 0;
                        matriz[0][2] = 0;
                        matriz[0][3] = 0;

                    } else if (matriz[0][0] != 0 && matriz[0][1] == 0) {
                        matriz[0][1] = matriz[0][2] + matriz[0][3];
                        matriz[0][2] = 0;
                        matriz[0][3] = 0;

                    } else if (matriz[0][0] == 0 && matriz[0][1] != 0) {
                        matriz[0][0] = matriz[0][1];
                        matriz[0][1] = matriz[0][2] + matriz[0][3];
                        matriz[0][2] = 0;
                        matriz[0][3] = 0;

                    } else if (matriz[0][0] != 0 && matriz[0][1] != 0) {
                        matriz[0][2] += matriz[0][3];
                        matriz[0][3] = 0;
                    }
                }

                if (matriz[0][2] != matriz[0][3]) {
                    if (matriz[0][0] == 0 && matriz[0][1] == 0) {
                        matriz[0][0] = matriz[0][2];
                        matriz[0][1] = matriz[0][3];
                        matriz[0][2] = 0;
                        matriz[0][3] = 0;

                    } else if (matriz[0][0] != 0 && matriz[0][1] == 0) {
                        matriz[0][1] = matriz[0][2];
                        matriz[0][2] = matriz[0][3];
                        matriz[0][3] = 0;

                    } else if (matriz[0][0] == 0 && matriz[0][1] != 0) {
                        matriz[0][0] = matriz[0][1];
                        matriz[0][1] = matriz[0][2];
                        matriz[0][2] = matriz[0][3];
                        matriz[0][3] = 0;
                    }
                }

//codigo para fila 1 y todas las columnas cuando el jugador seleccione la opcion izquierda
                if (matriz[1][0] == matriz[1][1]) {
                    if (matriz[1][0] == 0 || matriz[1][0] != 0) {
                        matriz[1][0] += matriz[1][1];
                        matriz[1][1] = matriz[1][2];
                        matriz[1][2] = matriz[1][3];
                        matriz[1][3] = 0;
                    }
                }
                if (matriz[1][1] == matriz[1][2]) {
                    if (matriz[1][1] != 0 && matriz[1][2] != 0) {
                        if (matriz[1][0] == 0) {
                            matriz[1][0] = matriz[1][1] + matriz[1][2];
                            matriz[1][1] = matriz[1][3];
                            matriz[1][2] = 0;
                            matriz[1][3] = 0;
                        } else {
                            matriz[1][1] += matriz[1][2];
                            matriz[1][2] = matriz[1][3];
                            matriz[1][3] = 0;
                        }
                    } else {
                        if (matriz[1][0] != matriz[1][3]) {
                            matriz[1][1] = matriz[1][3];
                            matriz[1][3] = 0;
                        }
                    }
                }

                if (matriz[1][0] == matriz[1][3] && matriz[1][1] == 0 && matriz[1][2] == 0) {
                    matriz[1][0] += matriz[1][3];
                    matriz[1][3] = 0;
                }
                if (matriz[1][1] == matriz[1][3] && matriz[1][2] == 0) {
                    if (matriz[1][0] == 0) {
                        matriz[1][0] = matriz[1][1] + matriz[1][3];
                        matriz[1][1] = 0;
                        matriz[1][3] = 0;
                    } else {
                        matriz[1][1] += matriz[1][3];
                        matriz[1][3] = 0;
                    }
                }
                if (matriz[1][0] == matriz[1][2] && matriz[1][1] == 0) {
                    matriz[1][0] += matriz[1][2];
                    matriz[1][1] = matriz[1][3];
                    matriz[1][2] = 0;
                    matriz[1][3] = 0;
                }

                if ((matriz[1][0] == 0 || matriz[1][1] != matriz[1][2]) && (matriz[1][2] == 0 || matriz[1][2] == matriz[1][3])) {

                    if (matriz[1][0] == 0 && matriz[1][1] == 0) {
                        matriz[1][0] = matriz[1][2] + matriz[1][3];
                        matriz[1][1] = 0;
                        matriz[1][2] = 0;
                        matriz[1][3] = 0;

                    } else if (matriz[1][0] != 0 && matriz[1][1] == 0) {
                        matriz[1][1] = matriz[1][2] + matriz[1][3];
                        matriz[1][2] = 0;
                        matriz[1][3] = 0;

                    } else if (matriz[1][0] == 0 && matriz[1][1] != 0) {
                        matriz[1][0] = matriz[1][1];
                        matriz[1][1] = matriz[1][2] + matriz[1][3];
                        matriz[1][2] = 0;
                        matriz[1][3] = 0;

                    } else if (matriz[1][0] != 0 && matriz[1][1] != 0) {
                        matriz[1][2] += matriz[1][3];
                        matriz[1][3] = 0;
                    }
                }

                if (matriz[1][2] != matriz[1][3]) {
                    if (matriz[1][0] == 0 && matriz[1][1] == 0) {
                        matriz[1][0] = matriz[1][2];
                        matriz[1][1] = matriz[1][3];
                        matriz[1][2] = 0;
                        matriz[1][3] = 0;

                    } else if (matriz[1][0] != 0 && matriz[1][1] == 0) {
                        matriz[1][1] = matriz[1][2];
                        matriz[1][2] = matriz[1][3];
                        matriz[1][3] = 0;

                    } else if (matriz[1][0] == 0 && matriz[1][1] != 0) {
                        matriz[1][0] = matriz[1][1];
                        matriz[1][1] = matriz[1][2];
                        matriz[1][2] = matriz[1][3];
                        matriz[1][3] = 0;
                    }
                }

//codigo para fila 2 y todas las columnas cuando el jugador seleccione la opcion izquierda
                if (matriz[2][0] == matriz[2][1]) {
                    if (matriz[2][0] == 0 || matriz[2][0] != 0) {
                        matriz[2][0] += matriz[2][1];
                        matriz[2][1] = matriz[2][2];
                        matriz[2][2] = matriz[2][3];
                        matriz[2][3] = 0;
                    }
                }
                if (matriz[2][1] == matriz[2][2]) {
                    if (matriz[2][1] != 0 && matriz[2][2] != 0) {
                        if (matriz[2][0] == 0) {
                            matriz[2][0] = matriz[2][1] + matriz[2][2];
                            matriz[2][1] = matriz[2][3];
                            matriz[2][2] = 0;
                            matriz[2][3] = 0;
                        } else {
                            matriz[2][1] += matriz[2][2];
                            matriz[2][2] = matriz[2][3];
                            matriz[2][3] = 0;
                        }
                    } else {
                        if (matriz[2][0] != matriz[2][3]) {
                            matriz[2][1] = matriz[2][3];
                            matriz[2][3] = 0;
                        }
                    }
                }

                if (matriz[2][0] == matriz[2][3] && matriz[2][1] == 0 && matriz[2][2] == 0) {
                    matriz[2][0] += matriz[2][3];
                    matriz[2][3] = 0;
                }
                if (matriz[2][1] == matriz[2][3] && matriz[2][2] == 0) {
                    if (matriz[2][0] == 0) {
                        matriz[2][0] = matriz[2][1] + matriz[2][3];
                        matriz[2][1] = 0;
                        matriz[2][3] = 0;
                    } else {
                        matriz[2][1] += matriz[2][3];
                        matriz[2][3] = 0;
                    }
                }
                if (matriz[2][0] == matriz[2][2] && matriz[2][1] == 0) {
                    matriz[2][0] += matriz[2][2];
                    matriz[2][1] = matriz[2][3];
                    matriz[2][2] = 0;
                    matriz[2][3] = 0;
                }

                if ((matriz[2][0] == 0 || matriz[2][1] != matriz[2][2]) && (matriz[2][2] == 0 || matriz[2][2] == matriz[2][3])) {

                    if (matriz[2][0] == 0 && matriz[2][1] == 0) {
                        matriz[2][0] = matriz[2][2] + matriz[2][3];
                        matriz[2][1] = 0;
                        matriz[2][2] = 0;
                        matriz[2][3] = 0;

                    } else if (matriz[2][0] != 0 && matriz[2][1] == 0) {
                        matriz[2][1] = matriz[2][2] + matriz[2][3];
                        matriz[2][2] = 0;
                        matriz[2][3] = 0;

                    } else if (matriz[2][0] == 0 && matriz[2][1] != 0) {
                        matriz[2][0] = matriz[2][1];
                        matriz[2][1] = matriz[2][2] + matriz[2][3];
                        matriz[2][2] = 0;
                        matriz[2][3] = 0;

                    } else if (matriz[2][0] != 0 && matriz[2][1] != 0) {
                        matriz[2][2] += matriz[2][3];
                        matriz[2][3] = 0;
                    }
                }

                if (matriz[2][2] != matriz[2][3]) {
                    if (matriz[2][0] == 0 && matriz[2][1] == 0) {
                        matriz[2][0] = matriz[2][2];
                        matriz[2][2] = matriz[2][3];
                        matriz[2][2] = 0;
                        matriz[2][3] = 0;

                    } else if (matriz[2][0] != 0 && matriz[2][1] == 0) {
                        matriz[2][1] = matriz[2][2];
                        matriz[2][2] = matriz[2][3];
                        matriz[2][3] = 0;

                    } else if (matriz[2][0] == 0 && matriz[2][1] != 0) {
                        matriz[2][0] = matriz[2][1];
                        matriz[2][1] = matriz[2][2];
                        matriz[2][2] = matriz[2][3];
                        matriz[2][3] = 0;
                    }
                }

//codigo para fila 3 y todas las columnas cuando el jugador seleccione la opcion izquierda
                if (matriz[3][0] == matriz[3][1]) {
                    if (matriz[3][0] == 0 || matriz[3][0] != 0) {
                        matriz[3][0] += matriz[3][1];
                        matriz[3][1] = matriz[3][2];
                        matriz[3][2] = matriz[3][3];
                        matriz[3][3] = 0;
                    }
                }
                if (matriz[3][1] == matriz[3][2]) {
                    if (matriz[3][1] != 0 && matriz[3][2] != 0) {
                        if (matriz[3][0] == 0) {
                            matriz[3][0] = matriz[3][1] + matriz[3][2];
                            matriz[3][1] = matriz[3][3];
                            matriz[3][2] = 0;
                            matriz[3][3] = 0;
                        } else {
                            matriz[3][1] += matriz[3][2];
                            matriz[3][2] = matriz[3][3];
                            matriz[3][3] = 0;
                        }
                    } else {
                        if (matriz[3][0] != matriz[3][3]) {
                            matriz[3][1] = matriz[3][3];
                            matriz[3][3] = 0;
                        }
                    }
                }

                if (matriz[3][0] == matriz[3][3] && matriz[3][1] == 0 && matriz[3][2] == 0) {
                    matriz[3][0] += matriz[3][3];
                    matriz[3][3] = 0;
                }
                if (matriz[3][1] == matriz[3][3] && matriz[3][2] == 0) {
                    if (matriz[3][0] == 0) {
                        matriz[3][0] = matriz[3][1] + matriz[3][3];
                        matriz[3][1] = 0;
                        matriz[3][3] = 0;
                    } else {
                        matriz[3][1] += matriz[3][3];
                        matriz[3][3] = 0;
                    }
                }
                if (matriz[3][0] == matriz[3][2] && matriz[3][1] == 0) {
                    matriz[3][0] += matriz[3][2];
                    matriz[3][1] = matriz[3][3];
                    matriz[3][2] = 0;
                    matriz[3][3] = 0;
                }

                if ((matriz[3][0] == 0 || matriz[3][1] != matriz[3][2]) && (matriz[3][2] == 0 || matriz[3][2] == matriz[3][3])) {

                    if (matriz[3][0] == 0 && matriz[3][1] == 0) {
                        matriz[3][0] = matriz[3][2] + matriz[3][3];
                        matriz[3][1] = 0;
                        matriz[3][2] = 0;
                        matriz[3][3] = 0;

                    } else if (matriz[3][0] != 0 && matriz[3][1] == 0) {
                        matriz[3][1] = matriz[3][2] + matriz[3][3];
                        matriz[3][2] = 0;
                        matriz[3][3] = 0;

                    } else if (matriz[3][0] == 0 && matriz[3][1] != 0) {
                        matriz[3][0] = matriz[3][1];
                        matriz[3][1] = matriz[3][2] + matriz[3][3];
                        matriz[3][2] = 0;
                        matriz[3][3] = 0;

                    } else if (matriz[3][0] != 0 && matriz[3][1] != 0) {
                        matriz[3][2] += matriz[3][3];
                        matriz[3][3] = 0;
                    }
                }

                if (matriz[3][2] != matriz[3][3]) {
                    if (matriz[3][0] == 0 && matriz[3][1] == 0) {
                        matriz[3][0] = matriz[3][2];
                        matriz[3][1] = matriz[3][3];
                        matriz[3][2] = 0;
                        matriz[3][3] = 0;

                    } else if (matriz[3][0] != 0 && matriz[3][1] == 0) {
                        matriz[3][1] = matriz[3][2];
                        matriz[3][2] = matriz[3][3];
                        matriz[3][3] = 0;

                    } else if (matriz[3][0] == 0 && matriz[3][1] != 0) {
                        matriz[3][0] = matriz[3][1];
                        matriz[3][1] = matriz[3][2];
                        matriz[3][2] = matriz[3][3];
                        matriz[3][3] = 0;
                    }
                }

                //introducir un 2 o 4 en la nueva matriz                
                int aleatorio1 = (int) (Math.random() * 3 + 1);

                if (aleatorio1 == 1) {
                    if (matriz[0][3] == 0) {
                        matriz[0][3] = 2;
                    } else if (matriz[1][3] == 0) {
                        matriz[1][3] = 2;
                    } else if (matriz[2][3] == 0) {
                        matriz[2][3] = 2;
                    } else {
                        matriz[3][3] = 2;
                    }
                } else if (aleatorio1 == 2) {
                    if (matriz[2][3] == 0) {
                        matriz[2][3] = 4;
                    } else if (matriz[1][3] == 0) {
                        matriz[1][3] = 2;
                    } else if (matriz[0][3] == 0) {
                        matriz[0][3] = 4;
                    } else {
                        matriz[3][3] = 2;
                    }
                } else {
                    if (matriz[3][3] == 0) {
                        matriz[3][3] = 2;
                    } else if (matriz[1][3] == 0) {
                        matriz[1][3] = 4;
                    } else if (matriz[2][3] == 0) {
                        matriz[2][3] = 2;
                    } else {
                        matriz[0][3] = 2;
                    }
                }

//Movimiento hacia la derecha
            } else if (movimientoTablero.equalsIgnoreCase(MOVIMIENTO_DERECHA)) {

//codigo para fila 0 y todas las filas cuando el jugador seleccione la opcion derecha
                if (matriz[0][3] == matriz[0][2]) {
                    if (matriz[0][3] == 0 || matriz[0][3] != 0) {
                        matriz[0][3] += matriz[0][2];
                        matriz[0][2] = matriz[0][1];
                        matriz[0][1] = matriz[0][0];
                        matriz[0][0] = 0;
                    }
                }

                if (matriz[0][2] == matriz[0][1]) {
                    if (matriz[0][2] != 0 && matriz[0][1] != 0) {
                        if (matriz[0][3] == 0) {
                            matriz[0][3] = matriz[0][2] + matriz[0][1];
                            matriz[0][2] = matriz[0][0];
                            matriz[0][1] = 0;
                            matriz[0][0] = 0;
                        } else {
                            matriz[0][2] += matriz[0][1];
                            matriz[0][1] = matriz[0][0];
                            matriz[0][0] = 0;
                        }
                    } else {
                        if (matriz[0][3] != matriz[0][0]) {
                            matriz[0][2] = matriz[0][0];
                            matriz[0][0] = 0;
                        }
                    }
                }

                if (matriz[0][3] == matriz[0][0] && matriz[0][2] == 0 && matriz[0][1] == 0) {
                    matriz[0][3] += matriz[0][0];
                    matriz[0][0] = 0;
                }

                if (matriz[0][2] == matriz[0][0] && matriz[0][1] == 0) {
                    if (matriz[0][3] == 0) {
                        matriz[0][3] = matriz[0][2] + matriz[0][0];
                        matriz[0][2] = 0;
                        matriz[0][0] = 0;

                    } else {
                        matriz[0][2] += matriz[0][0];
                        matriz[0][0] = 0;
                    }
                }
                if (matriz[0][3] == matriz[0][1] && matriz[0][2] == 0) {
                    matriz[0][3] += matriz[0][1];
                    matriz[0][2] = matriz[0][0];
                    matriz[0][1] = 0;
                    matriz[0][0] = 0;
                }

                if ((matriz[0][3] == 0 || matriz[0][2] != matriz[0][1]) && (matriz[0][1] == 0 || matriz[0][1] == matriz[0][0])) {

                    if (matriz[0][3] == 0 && matriz[0][2] == 0) {
                        matriz[0][3] = matriz[0][1] + matriz[0][0];
                        matriz[0][2] = 0;
                        matriz[0][1] = 0;
                        matriz[0][0] = 0;

                    } else if (matriz[0][3] != 0 && matriz[0][2] == 0) {
                        matriz[0][2] = matriz[0][1] + matriz[0][0];
                        matriz[0][1] = 0;
                        matriz[0][0] = 0;

                    } else if (matriz[0][3] == 0 && matriz[0][2] != 0) {
                        matriz[0][3] = matriz[0][2];
                        matriz[0][2] = matriz[0][1] + matriz[0][0];
                        matriz[0][1] = 0;
                        matriz[0][0] = 0;

                    } else if (matriz[0][3] != 0 && matriz[0][2] != 0) {
                        matriz[0][1] += matriz[0][0];
                        matriz[0][0] = 0;
                    }
                }

                if (matriz[0][1] != matriz[0][0]) {
                    if (matriz[0][3] == 0 && matriz[0][2] == 0) {
                        matriz[0][3] = matriz[0][1];
                        matriz[0][2] = matriz[0][0];
                        matriz[0][1] = 0;
                        matriz[0][0] = 0;

                    } else if (matriz[0][3] != 0 && matriz[0][2] == 0) {
                        matriz[0][2] = matriz[0][1];
                        matriz[0][1] = matriz[0][0];
                        matriz[0][0] = 0;

                    } else if (matriz[0][3] == 0 && matriz[0][2] != 0) {
                        matriz[0][3] = matriz[0][2];
                        matriz[0][2] = matriz[0][1];
                        matriz[0][1] = matriz[0][0];
                        matriz[0][0] = 0;
                    }
                }

//codigo para fila 1 y todas las columnas cuando el jugador seleccione la opcion derecha
                if (matriz[1][3] == matriz[1][2]) {
                    if (matriz[1][3] == 0 || matriz[1][3] != 0) {
                        matriz[1][3] += matriz[1][2];
                        matriz[1][2] = matriz[1][1];
                        matriz[1][1] = matriz[1][0];
                        matriz[1][0] = 0;
                    }
                }

                if (matriz[1][2] == matriz[1][1]) {
                    if (matriz[1][2] != 0 && matriz[1][1] != 0) {
                        if (matriz[1][3] == 0) {
                            matriz[1][3] = matriz[1][2] + matriz[1][1];
                            matriz[1][2] = matriz[1][0];
                            matriz[1][1] = 0;
                            matriz[1][0] = 0;
                        } else {
                            matriz[1][2] += matriz[1][1];
                            matriz[1][1] = matriz[1][0];
                            matriz[1][0] = 0;
                        }
                    } else {
                        if (matriz[1][3] != matriz[1][0]) {
                            matriz[1][2] = matriz[1][0];
                            matriz[1][0] = 0;
                        }
                    }
                }

                if (matriz[1][3] == matriz[1][0] && matriz[1][2] == 0 && matriz[1][1] == 0) {
                    matriz[1][3] += matriz[1][0];
                    matriz[1][0] = 0;
                }

                if (matriz[1][2] == matriz[1][0] && matriz[1][1] == 0) {
                    if (matriz[1][3] == 0) {
                        matriz[1][3] = matriz[1][2] + matriz[1][0];
                        matriz[1][2] = 0;
                        matriz[1][0] = 0;

                    } else {
                        matriz[1][2] += matriz[1][0];
                        matriz[1][0] = 0;
                    }
                }
                if (matriz[1][3] == matriz[1][1] && matriz[1][2] == 0) {
                    matriz[1][3] += matriz[1][1];
                    matriz[1][2] = matriz[1][0];
                    matriz[1][1] = 0;
                    matriz[1][0] = 0;
                }

                if ((matriz[1][3] == 0 || matriz[1][2] != matriz[1][1]) && (matriz[1][1] == 0 || matriz[1][1] == matriz[1][0])) {

                    if (matriz[1][3] == 0 && matriz[1][2] == 0) {
                        matriz[1][3] = matriz[1][1] + matriz[1][0];
                        matriz[1][2] = 0;
                        matriz[1][1] = 0;
                        matriz[1][0] = 0;

                    } else if (matriz[1][3] != 0 && matriz[1][2] == 0) {
                        matriz[1][2] = matriz[0][1] + matriz[1][0];
                        matriz[1][1] = 0;
                        matriz[1][0] = 0;

                    } else if (matriz[1][3] == 0 && matriz[1][2] != 0) {
                        matriz[1][3] = matriz[1][2];
                        matriz[1][2] = matriz[1][1] + matriz[1][0];
                        matriz[1][1] = 0;
                        matriz[1][0] = 0;

                    } else if (matriz[1][3] != 0 && matriz[1][2] != 0) {
                        matriz[1][1] += matriz[1][0];
                        matriz[1][0] = 0;
                    }
                }

                if (matriz[1][1] != matriz[1][0]) {
                    if (matriz[1][3] == 0 && matriz[1][2] == 0) {
                        matriz[1][3] = matriz[1][1];
                        matriz[1][2] = matriz[1][0];
                        matriz[1][1] = 0;
                        matriz[1][0] = 0;

                    } else if (matriz[1][3] != 0 && matriz[1][2] == 0) {
                        matriz[1][2] = matriz[1][1];
                        matriz[1][1] = matriz[1][0];
                        matriz[1][0] = 0;

                    } else if (matriz[1][3] == 0 && matriz[1][2] != 0) {
                        matriz[1][3] = matriz[1][2];
                        matriz[1][2] = matriz[1][1];
                        matriz[1][1] = matriz[1][0];
                        matriz[1][0] = 0;
                    }
                }

//codigo para fila 2 y todas las columnas cuando el jugador seleccione la opcion derecha
                if (matriz[2][3] == matriz[2][2]) {
                    if (matriz[2][3] == 0 || matriz[2][3] != 0) {
                        matriz[2][3] += matriz[2][2];
                        matriz[2][2] = matriz[2][1];
                        matriz[2][1] = matriz[2][0];
                        matriz[2][0] = 0;
                    }
                }

                if (matriz[2][2] == matriz[2][1]) {
                    if (matriz[2][2] != 0 && matriz[2][1] != 0) {
                        if (matriz[2][3] == 0) {
                            matriz[2][3] = matriz[2][2] + matriz[2][1];
                            matriz[2][2] = matriz[2][0];
                            matriz[2][1] = 0;
                            matriz[2][0] = 0;
                        } else {
                            matriz[2][2] += matriz[2][1];
                            matriz[2][1] = matriz[2][0];
                            matriz[2][0] = 0;
                        }
                    } else {
                        if (matriz[2][3] != matriz[2][0]) {
                            matriz[2][2] = matriz[2][0];
                            matriz[2][0] = 0;
                        }
                    }
                }

                if (matriz[2][3] == matriz[2][0] && matriz[2][2] == 0 && matriz[2][1] == 0) {
                    matriz[2][3] += matriz[2][0];
                    matriz[2][0] = 0;
                }

                if (matriz[2][2] == matriz[2][0] && matriz[2][1] == 0) {
                    if (matriz[2][3] == 0) {
                        matriz[2][3] = matriz[2][2] + matriz[2][0];
                        matriz[2][2] = 0;
                        matriz[2][0] = 0;

                    } else {
                        matriz[2][2] += matriz[2][0];
                        matriz[2][0] = 0;
                    }
                }
                if (matriz[2][3] == matriz[2][1] && matriz[2][2] == 0) {
                    matriz[2][3] += matriz[2][1];
                    matriz[2][2] = matriz[2][0];
                    matriz[2][1] = 0;
                    matriz[2][0] = 0;
                }

                if ((matriz[2][3] == 0 || matriz[2][2] != matriz[2][1]) && (matriz[2][1] == 0 || matriz[2][1] == matriz[2][0])) {

                    if (matriz[2][3] == 0 && matriz[2][2] == 0) {
                        matriz[2][3] = matriz[2][1] + matriz[2][0];
                        matriz[2][2] = 0;
                        matriz[2][1] = 0;
                        matriz[2][0] = 0;

                    } else if (matriz[2][3] != 0 && matriz[2][2] == 0) {
                        matriz[2][2] = matriz[2][1] + matriz[2][0];
                        matriz[2][1] = 0;
                        matriz[2][0] = 0;

                    } else if (matriz[2][3] == 0 && matriz[2][2] != 0) {
                        matriz[2][3] = matriz[2][2];
                        matriz[2][2] = matriz[2][1] + matriz[2][0];
                        matriz[2][1] = 0;
                        matriz[2][0] = 0;

                    } else if (matriz[2][3] != 0 && matriz[2][2] != 0) {
                        matriz[2][1] += matriz[2][0];
                        matriz[2][0] = 0;
                    }
                }

                if (matriz[2][1] != matriz[2][0]) {
                    if (matriz[2][3] == 0 && matriz[2][2] == 0) {
                        matriz[2][3] = matriz[2][1];
                        matriz[2][2] = matriz[2][0];
                        matriz[2][1] = 0;
                        matriz[2][0] = 0;

                    } else if (matriz[2][3] != 0 && matriz[2][2] == 0) {
                        matriz[2][2] = matriz[2][1];
                        matriz[2][1] = matriz[2][0];
                        matriz[2][0] = 0;

                    } else if (matriz[2][3] == 0 && matriz[2][2] != 0) {
                        matriz[2][3] = matriz[2][2];
                        matriz[2][2] = matriz[2][1];
                        matriz[2][1] = matriz[2][0];
                        matriz[2][0] = 0;
                    }
                }

//codigo para fila 3 y todas las columnas cuando el jugador seleccione la opcion derecha
                if (matriz[3][3] == matriz[3][2]) {
                    if (matriz[3][3] == 0 || matriz[3][3] != 0) {
                        matriz[3][3] += matriz[3][2];
                        matriz[3][2] = matriz[3][1];
                        matriz[3][1] = matriz[3][0];
                        matriz[3][0] = 0;
                    }
                }

                if (matriz[3][2] == matriz[3][1]) {
                    if (matriz[3][2] != 0 && matriz[3][1] != 0) {
                        if (matriz[3][3] == 0) {
                            matriz[3][3] = matriz[3][2] + matriz[3][1];
                            matriz[3][2] = matriz[3][0];
                            matriz[3][1] = 0;
                            matriz[3][0] = 0;
                        } else {
                            matriz[3][2] += matriz[3][1];
                            matriz[3][1] = matriz[3][0];
                            matriz[3][0] = 0;
                        }
                    } else {
                        if (matriz[3][3] != matriz[3][0]) {
                            matriz[3][2] = matriz[3][0];
                            matriz[3][0] = 0;
                        }
                    }
                }

                if (matriz[3][3] == matriz[3][0] && matriz[3][2] == 0 && matriz[3][1] == 0) {
                    matriz[3][3] += matriz[3][0];
                    matriz[3][0] = 0;
                }

                if (matriz[3][2] == matriz[3][0] && matriz[3][1] == 0) {
                    if (matriz[3][3] == 0) {
                        matriz[3][3] = matriz[3][2] + matriz[3][0];
                        matriz[3][2] = 0;
                        matriz[3][0] = 0;

                    } else {
                        matriz[3][2] += matriz[3][0];
                        matriz[3][0] = 0;
                    }
                }

                if (matriz[3][3] == matriz[3][1] && matriz[3][2] == 0) {
                    matriz[3][3] += matriz[3][1];
                    matriz[3][2] = matriz[3][0];
                    matriz[3][1] = 0;
                    matriz[3][0] = 0;
                }

                if ((matriz[3][3] == 0 || matriz[3][2] != matriz[3][1]) && (matriz[3][1] == 0 || matriz[3][1] == matriz[3][0])) {

                    if (matriz[3][3] == 0 && matriz[3][2] == 0) {
                        matriz[3][3] = matriz[3][1] + matriz[3][0];
                        matriz[3][2] = 0;
                        matriz[3][1] = 0;
                        matriz[3][0] = 0;

                    } else if (matriz[3][3] != 0 && matriz[3][2] == 0) {
                        matriz[3][2] = matriz[3][1] + matriz[3][0];
                        matriz[3][1] = 0;
                        matriz[3][0] = 0;

                    } else if (matriz[3][3] == 0 && matriz[3][2] != 0) {
                        matriz[3][3] = matriz[3][2];
                        matriz[3][2] = matriz[3][1] + matriz[3][0];
                        matriz[3][1] = 0;
                        matriz[3][0] = 0;

                    } else if (matriz[3][3] != 0 && matriz[3][2] != 0) {
                        matriz[3][1] += matriz[3][0];
                        matriz[3][0] = 0;
                    }
                }

                if (matriz[3][1] != matriz[3][0]) {
                    if (matriz[3][3] == 0 && matriz[3][2] == 0) {
                        matriz[3][3] = matriz[3][1];
                        matriz[3][2] = matriz[3][0];
                        matriz[3][1] = 0;
                        matriz[3][0] = 0;

                    } else if (matriz[3][3] != 0 && matriz[3][2] == 0) {
                        matriz[3][2] = matriz[3][1];
                        matriz[3][1] = matriz[3][0];
                        matriz[3][0] = 0;

                    } else if (matriz[3][3] == 0 && matriz[3][2] != 0) {
                        matriz[3][3] = matriz[3][2];
                        matriz[3][2] = matriz[3][1];
                        matriz[3][1] = matriz[3][0];
                        matriz[3][0] = 0;
                    }
                }

                //introducir un 2 o 4 en la nueva matriz 
                int aleatorio1 = (int) (Math.random() * 3 + 1);

                if (aleatorio1 == 1) {
                    if (matriz[0][0] == 0) {
                        matriz[0][0] = 2;
                    } else if (matriz[1][0] == 0) {
                        matriz[1][0] = 2;
                    } else if (matriz[2][0] == 0) {
                        matriz[2][0] = 2;
                    } else {
                        matriz[3][0] = 2;
                    }

                } else if (aleatorio1 == 2) {
                    if (matriz[0][0] == 0) {
                        matriz[0][0] = 4;
                    } else if (matriz[1][0] == 0) {
                        matriz[1][0] = 4;
                    } else if (matriz[2][0] == 0) {
                        matriz[2][0] = 4;
                    } else {
                        matriz[3][0] = 4;
                    }
                } else {
                    if (matriz[0][0] == 0) {
                        matriz[0][0] = 4;
                    } else if (matriz[1][0] == 0) {
                        matriz[1][0] = 2;
                    } else if (matriz[2][0] == 0) {
                        matriz[2][0] = 2;
                    } else {
                        matriz[3][0] = 4;
                    }
                }

//el jugador sale del juego
            } else if (movimientoTablero.equalsIgnoreCase(SALIR_JUEGO)) {
                System.out.println("Fin del juego!!");
                jugar = 1;
                imprimirMatriz = 1;

                //cuando la letra ingresada por el jugador es incorrecto    
            } else {
                System.out.println("La letra ingresada es incorrecta.! intente de nuevo!!");
            }

//Impresion de la matriz en pantalla con los nuevos numeros
            if (imprimirMatriz == 0) {
                for (int j = 0; j < 4; j++) {
                    for (int i = 0; i < 4; i++) {
                        System.out.print("|   " + matriz[j][i] + "   |");
                    }

                    System.out.println();
                }
            }

            //condicion para que el jugador gane
            if (movimientoTablero.equalsIgnoreCase(MOVIMIENTO_ARRIBA) || movimientoTablero.equalsIgnoreCase(MOVIMIENTO_ABAJO)
                    || movimientoTablero.equalsIgnoreCase(MOVIMIENTO_IZQUIERDA) || movimientoTablero.equalsIgnoreCase(MOVIMIENTO_DERECHA)) {

                if (matriz[0][0] == 2048 || matriz[0][1] == 2048 || matriz[0][2] == 2048 || matriz[0][3] == 2048
                        || matriz[1][0] == 2048 || matriz[1][1] == 2048 || matriz[1][2] == 2048 || matriz[1][3] == 2048
                        || matriz[2][0] == 2048 || matriz[2][1] == 2048 || matriz[2][2] == 2048 || matriz[2][3] == 2048
                        || matriz[3][0] == 2048 || matriz[3][1] == 2048 || matriz[3][2] == 2048 || matriz[3][3] == 2048) {

                    System.out.println("\nFIN DEL JUEGO\n" + nombreJugador + ", usted ganó el juego!! FELICITACIONES!!");
                    jugar = 1;
                }
            }

            //condiciones para que el jugador pierda
            if (movimientoTablero.equalsIgnoreCase(MOVIMIENTO_ARRIBA) || movimientoTablero.equalsIgnoreCase(MOVIMIENTO_ABAJO)
                    || movimientoTablero.equalsIgnoreCase(MOVIMIENTO_IZQUIERDA) || movimientoTablero.equalsIgnoreCase(MOVIMIENTO_DERECHA)) {

                if ((matriz[0][0] != matriz[0][1] && matriz[0][1] != matriz[0][2] && matriz[0][2] != matriz[0][3]
                        && matriz[1][0] != matriz[1][1] && matriz[1][1] != matriz[1][2] && matriz[1][2] != matriz[1][3]
                        && matriz[2][0] != matriz[2][1] && matriz[2][1] != matriz[2][2] && matriz[2][2] != matriz[2][3]
                        && matriz[3][0] != matriz[3][1] && matriz[3][1] != matriz[3][2] && matriz[3][2] != matriz[3][3]
                        && matriz[0][0] != matriz[1][0] && matriz[1][0] != matriz[2][0] && matriz[2][0] != matriz[3][0]
                        && matriz[0][1] != matriz[1][1] && matriz[1][1] != matriz[2][1] && matriz[2][1] != matriz[3][1]
                        && matriz[0][2] != matriz[1][2] && matriz[1][2] != matriz[2][2] && matriz[2][2] != matriz[3][2]
                        && matriz[0][3] != matriz[1][3] && matriz[1][3] != matriz[2][3] && matriz[2][3] != matriz[3][3])
                        && matriz[0][0] != 0 && matriz[0][1] != 0 && matriz[0][2] != 0 && matriz[0][3] != 0
                        && matriz[1][0] != 0 && matriz[1][1] != 0 && matriz[1][2] != 0 && matriz[1][3] != 0
                        && matriz[2][0] != 0 && matriz[2][1] != 0 && matriz[2][2] != 0 && matriz[2][3] != 0
                        && matriz[3][0] != 0 && matriz[3][1] != 0 && matriz[3][2] != 0 && matriz[3][3] != 0) {

                    System.out.println("FIN DEL JUEGO!!");
                    System.out.println("\n" + nombreJugador + ", usted perdio el juego!!");
                    jugar = 1;
                }
            }
        }
    }

//metodo main para arrancar el programa
    public static void main(String[] args) {
        Juego_2048 nuevo = new Juego_2048();
        Scanner in = new Scanner(System.in);

        int b = 1;
        while (b == 1) {
            nuevo.Juego_2048();

            System.out.println("\nSeleccione una opción:   \n 1. jugar nuevo 2048 (presione 1) "
                    + "\n 2. salir del juego e ir a menú principal (presione 2)"
                    + "\n 3. salir del programa (presione un numero igual o mayor a 3)");
            b = in.nextInt();

            if (b == 2) {
                System.out.println("Fin del juego.");
                b = 2;
                b++;
                Juegos inicio = new Juegos();
                inicio.Juegos();

            } else if (b >= 3) {
                System.out.println("Fin del Programa.");
                b = 2;
            }
        }
    }

}
