/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstraccionesinterfacesypolimorfismo;

import java.util.Scanner;

/**
 *
 * @author Wilmer Perez
 */
public abstract class Spacecraft {

    Scanner lectura = new Scanner(System.in);

    String esselname;//nombre de Nave
    String typeofvessel;//tipo de la nave
    double cargoweight;//peso de carga
    double thrust;//empuje
    String fueltype;//tipo de combustible
    int person;//numero de personas

  

    public void Adddata() {

        System.out.println("Digite el nombre de la nave");
        esselname = lectura.next();

        System.out.println("Digite el peso de la nave");
        cargoweight = lectura.nextDouble();

        System.out.println("Digite el empuje de la nave");
        thrust = lectura.nextDouble();

        System.out.println("Digite el tipo de combustible de la nave");
        fueltype = lectura.next();

        System.out.println("Digite el numero de personas en la nave ");
        person = lectura.nextInt();
        
        

    }
     public Spacecraft(String esselname, String typeofvessel, String fueltype, double cargoweight, double thrust, int person) {
        
        this.esselname = esselname;
        this.typeofvessel = typeofvessel;
        this.cargoweight = cargoweight;
        this.thrust = thrust;
        this.fueltype = fueltype;
        this.person = person;

    }
    public Spacecraft() {
        
        
    }
    

    public Scanner getLectura() {
        return lectura;
    }

    public void setLectura(Scanner lectura) {
        this.lectura = lectura;
    }

    public String getEsselname() {
        return esselname;
    }

    public void setEsselname(String esselname) {
        this.esselname = esselname;
    }

    public String getTypeofvessel() {
        return typeofvessel;
    }

    public void setTypeofvessel(String typeofvessel) {
        this.typeofvessel = typeofvessel;
    }

    public double getCargoweight() {
        return cargoweight;
    }

    public void setCargoweight(double cargoweight) {
        this.cargoweight = cargoweight;
    }

    public double getThrust() {
        return thrust;
    }

    public void setThrust(double thrust) {
        this.thrust = thrust;
    }

    public String getFueltype() {
        return fueltype;
    }

    public void setFueltype(String fueltype) {
        this.fueltype = fueltype;
    }

    public int getPerson() {
        return person;
    }

    public void setPerson(int person) {
        this.person = person;
    }

}
