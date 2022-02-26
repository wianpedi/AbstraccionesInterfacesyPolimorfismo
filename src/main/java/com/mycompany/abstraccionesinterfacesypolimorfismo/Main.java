/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstraccionesinterfacesypolimorfismo;

/**
 *
 * @author Wilmer Perez
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        int menuoption = 0;
        while (menuoption != 3) {

            System.out.println("Digite 1 si Deseas ver las naves creadas \n"
                    + "Digite 2 si Deseas crear una nave  \n"
                    + "Digite 3 si Deseas salir del programa \n");

            menuoption = lectura.nextInt();

            switch (menuoption) {

                case 1: {

                    Aggregatespacecraft savedata1 = new Aggregatespacecraft("Nave Lanzadera ", "saturno V ", "petróleo refinado y oxígeno líquido ", 2.400, 3.060, 0);
                    savedata1.showdata();

                    System.out.println("_____________________________");

                    Aggregatespacecraft savedata2 = new Aggregatespacecraft("No Tripulada ", "Cassini-Huygens ", "tetróxido de nitrógeno ", 240, 45.39, 0);
                    savedata2.showdata();

                    System.out.println("_____________________________");

                    Aggregatespacecraft savedata3 = new Aggregatespacecraft("Tripulada ", "Skylab ", "tetróxido de nitrógeno ", 76.540, 19.39, 7);
                    savedata3.showdata();

                    Aggregatespacecraft userdate = new Aggregatespacecraft ();
                    
                    System.out.println("retorno   "+ userdate.getCargoweight());
                    if(userdate.getCargoweight()!=0){
                    userdate.showdata();
                    
                    }
                    break;
                }

                case 2: {
                    System.out.println("Que Nave Deseas Crear  \n"
                            + "Digite 1 Si Deseas crear lanzadera  \n"
                            + "Digite 2 Si Deseas crear Nave no tripulada   \n"
                            + "Digite 3 Si Deseas crear Nave  tripulada   \n");
                    int createnave = lectura.nextInt();

                    switch (createnave) {

                        case 1: {
                            Spacecraft add = new Spacecraft() {
                            };
                            add.Adddata();
                            break;
                        }
                        case 2: {
                            Spacecraft add = new Spacecraft() {
                            };
                            add.Adddata();
                            break;
                        }
                        case 3: {
                            Spacecraft add = new Spacecraft() {
                            };
                            add.Adddata();
                            break;
                        }

                    }
                    break;
                }
            }
        }

    }
}
