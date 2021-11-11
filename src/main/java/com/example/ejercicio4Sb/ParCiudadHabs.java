package com.example.ejercicio4Sb;

/**
 * @author antonio.dols
 * Para poder guardar en el ArrayList objetos compuestos de "Ciudad + numHabitantes"
 */
public class ParCiudadHabs
{

    String ciudad;
    int numHabs;


    public ParCiudadHabs(String ciudadIn, int habsIn)
    {
        this.ciudad = ciudadIn;
        this.numHabs = habsIn;
    }

    public String getCiudad() {
        return ciudad;
    }
    public int getNumHabs() {
        return numHabs;
    }

}
