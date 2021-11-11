package com.example.ejercicio4Sb;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
public class Controlador2 {

    @Autowired
    private IgetSetCiudadesHabsService igetSetCiudadesHabsService;


    // http://localhost:8080/controlador2/getCiudad
    @GetMapping("/controlador2/getCiudad")
    public List<ParCiudadHabs> controlador2 () {


        Iterator<ParCiudadHabs> it= igetSetCiudadesHabsService.getParCiudadHabs().iterator();
        while(it.hasNext()) {

            ParCiudadHabs aux;
            aux = it.next();
            System.out.println("Controlador 2. Leído item de ArrayList. Ciudad: " + aux.getCiudad() + " Num habitantes: " + aux.getNumHabs() );
        }

        return igetSetCiudadesHabsService.getParCiudadHabs();
    }


}
