package clases;

import java.io.Serializable;
import java.util.ArrayList;


import controlador.controladorPrincipal;
import vista.vistaPrincipal;


public class Biblioteca implements Serializable {
	
	public ArrayList<Persona> socios;
	public ArrayList<Libro> libros;
	
	public Biblioteca() {
		
		socios = new ArrayList<Persona>();
		libros = new ArrayList<Libro>();
		
		
	}
	
	public boolean añadirUsuarios(String nombre, String apellidos, int DNI) {
		
		boolean añadido = false;	
		Persona contains = containsSocios(DNI);
			
		
			if(contains == null) {
				
				socios.add(new Persona(nombre,apellidos,DNI));
				añadido = true;			
									
			}
			
			
		return añadido;	
	}
	
	public boolean añadirLibros(int ISBN, String titulo, String autor) {
		
		boolean añadido = false;	
		Libro contains = containsLibro(ISBN);
			
		
			if(contains == null) {
				
				libros.add(new Libro(ISBN,autor,titulo));
				añadido = true;			
									
			}
			
			
		return añadido;	
	}
	
	private Libro containsLibro(int ISBN) {
		
		
		for(Libro libro : libros) {
			
			if(libro.getISBN() == ISBN) 
				return libro;	
			
		}	
		
		return null;
		
	}
	
	private Persona containsSocios(int DNI) {
		
		for(Persona p : socios) {
			
			if(p.getDNI() == DNI) 
				
				return p;	
		
		}	
		
		return null;
		
	}
	
}
