package com.example.ejercicio4Sb;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class GetSetCiudadesHabsService implements IgetSetCiudadesHabsService
{

    private List<ParCiudadHabs> parCiudadHabs = new ArrayList<ParCiudadHabs>();
    
    @Override
    public void addToList(ParCiudadHabs pch) { parCiudadHabs.add(pch); }

    @Override
    public List<ParCiudadHabs> getParCiudadHabs() { return parCiudadHabs; }

}