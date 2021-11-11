package com.example.ejercicio4Sb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class Controlador1
{

    @Autowired
    private IgetSetCiudadesHabsService getSetCiudadesHabsService;

    //http://localhost:8080/controlador1/addCiudad/?ciudad=Sarria&numHabs=20000
    @PostMapping("/controlador1/addCiudad")
    public List<ParCiudadHabs> controlador1 (@RequestParam String ciudad,
                                             @RequestParam int numHabs)
    {

        System.out.println("Ciudad     parametro leído: " + ciudad);
        System.out.println("Habitantes parametro leído: " + numHabs);

        ParCiudadHabs miPar = new ParCiudadHabs(ciudad, numHabs);
        System.out.println("miPar: " + miPar);
        getSetCiudadesHabsService.addToList(miPar);  //Añado pareja Ciudad-numHabs a la lista

        //System.out.println("Controlador1. Lista item 0: " + getSetCiudadesHabsService.getLista().get(0).toString());
        //System.out.println("Controlador1. Lista item 1: " + getSetCiudadesHabsService.getLista().get(1).toString());

        return getSetCiudadesHabsService.getParCiudadHabs();

    }


}
