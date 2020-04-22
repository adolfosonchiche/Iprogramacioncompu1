package Practica_1;

//@author hectoradolfo
import java.util.Scanner;

public class Juegos {

//constructor de libreria de juegos, con su diseño y funcionalidad
    public void Juegos() {

        Scanner in = new Scanner(System.in);
        int opcion, JUGAR = 0;

        while (JUGAR == 0) {
            System.out.println("\nBIENVENIDO AL MENÚ DE LIBRERIA DE JUEGOS");
            System.out.println("\nSeleccione una opcion, ingresando un numero segun el juego que desee: ");
            System.out.println("\n 1. Juego sopa de letras (presione 1)  \n 2. Juego target (presione 2)"
                    + "\n 3. Juego 2048  (presione 3)      \n 4. Tabla de resultados (presione 4)  "
                    + "\n 5. Salir del programa (presione 5)");
            opcion = in.nextInt();

//ir al  juego sopa de letras
            if (opcion == 1) {
                SopaLetras nuevo = new SopaLetras();

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

                    } else if (a >= 3) {
                        System.out.println("Fin del Programa.");
                        a = 2;
                    }
                }

//ir al juego target
            } else if (opcion == 2) {
                Target nuevo = new Target();

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

                    } else if (a >= 3) {
                        System.out.println("Fin del Programa.");
                        a = 2;
                    }
                }

//ir al juego 2048
            } else if (opcion == 3) {
                Juego_2048 nuevo = new Juego_2048();

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

                    } else if (b >= 3) {
                        System.out.println("Fin del Programa.");
                        b = 2;
                    }
                }

//ver la tabla de puntuaciones                
            } else if (opcion == 4) {
                TablaResultados estadistica = new TablaResultados();
                estadistica.TablaResultados();

//fin programa                
            } else if (opcion == 5) {
                System.out.println("Fin del programa!!");
                JUGAR = 1;

//la opcion seleccionada es incorrecto                
            } else {
                System.out.println("El numero ingresado es incorrecto, intente de nuevo!!");
                JUGAR = 0;
            }
        }
    }

//metodo main para correr el programa
    public static void main(String args[]) {

//iniciar un juego de inmediato sin ir a menu principal, con un parametro
        Scanner in = new Scanner(System.in);
        if (args.length == 1) {
            SopaLetras nuevo = new SopaLetras();

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

        } else if (args.length == 2) {
            Target nuevo = new Target();

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

        } else if (args.length == 3) {
            Juego_2048 nuevo = new Juego_2048();

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

        } else if (args.length == 4) {
            TablaResultados estadistica = new TablaResultados();
            estadistica.TablaResultados();

        } else if (args.length == 5) {
            System.out.println("Fin del programa!!");

        } else {
            System.out.println("El numero ingresado es incorrecto, intente de nuevo!!");
        }

//iniciar  presentando el menu principal
        Juegos inicio = new Juegos();
        inicio.Juegos();
    }
}
