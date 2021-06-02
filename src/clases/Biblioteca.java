package clases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
		controladorPrincipal cp = new controladorPrincipal(new vistaPrincipal(),this);
		 cp.go();	
		
	}
	
	public void añadirEjemplar(Libro contains, int num) {
		
		
			for(int i = 0;i<num;i++)
				new Ejemplar(contains);
			

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
	
	public int prestamoLibros(int usuario, int libro) {
		
		
		Persona containsSocio= containsSocios(usuario);
		int error = -1;
		
		if(containsSocio != null) {
		
			Libro containsLibros = containsLibro(libro);
				
				if(containsLibros != null) {
					
					error = containsSocio.añadirEjemplar(containsLibros); 
						
				}
				
		}	
		
		return error;
				
		
	}

	
	public boolean devolucionLibro(int usuario, int libro) {
		
		Persona contains = containsSocios(usuario);
		
		if(contains != null) {

				if(contains.devolverEjemplar(libro)) {						

					return true;
				}
		
		}
		
		return false;
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
	
	public Libro containsLibro(int ISBN) {
		
		
		for(Libro libro : libros) {
			
			if(libro.getISBN() == ISBN) 
				return libro;	
			
		}	
		
		return null;
		
	}
	
	public Persona containsSocios(int DNI) {
		
		for(Persona p : socios) {
			
			if(p.getDNI() == DNI) 
				
				return p;	
		
		}	
		
		return null;
		
	}

	public void cargarSocios(File archivo) {
		// TODO Auto-generated method stub
		
		try(ObjectInputStream ois =  new ObjectInputStream(new FileInputStream(archivo))){
			
			socios = (ArrayList<Persona>) ois.readObject();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(socios);
				
	}

	public void guardarSocios(File archivo) {
		// TODO Auto-generated method stub
		
		try(ObjectOutputStream oos =  new ObjectOutputStream(new FileOutputStream(archivo))){
			
			oos.writeObject(socios);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void cargarLibros(File fileSelection) {
		// TODO Auto-generated method stub
		
		try(ObjectInputStream ois =  new ObjectInputStream(new FileInputStream(fileSelection))){
			
			libros = (ArrayList<Libro>) ois.readObject();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(libros);
		
	}

	public void guardarLibros(File fileSelection) {
		// TODO Auto-generated method stub
		
		try(ObjectOutputStream oos =  new ObjectOutputStream(new FileOutputStream(fileSelection))){
			
			oos.writeObject(libros);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
