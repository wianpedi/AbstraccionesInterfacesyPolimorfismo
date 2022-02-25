/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstraccionesinterfacesypolimorfismo;

/**
 *
 * @author Wilmer Perez
 */
public class Aggregatespacecraft extends Spacecraft {

    public Aggregatespacecraft(String esselname, String typeofvessel, String fueltype, double cargoweight, double thrust, int person) {
        this.esselname = esselname;
       
    this.typeofvessel=typeofvessel;
    this.cargoweight=cargoweight;
    this.thrust=thrust;
    this.fueltype=fueltype;
    this.person=person;
    }

    public void showdata() {
        System.out.println(esselname);
        System.out.println(typeofvessel);
        System.out.println(fueltype);
        System.out.println(cargoweight);
        System.out.println(thrust);
        System.out.println(person);
    }
;

}
