package com.example.ejercicio4Sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;



@SpringBootApplication
public class Ejercicio4SbApplication {

	public static void main(String[] args)  { SpringApplication.run(Ejercicio4SbApplication.class, args); }

	@Bean
	//GetSetCiudadesHabsService getSetCiudadesHabsService() { return new GetSetCiudadesHabsService(); }
  	  GetSetCiudadesHabsService metodoCrearBean()           { return new GetSetCiudadesHabsService(); }
}