package controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import clases.*;
import vista.vistaPrincipal;

public class controladorPrincipal implements ActionListener{
	
	private vistaPrincipal view;
	private Biblioteca biblioteca;	
	
	public controladorPrincipal(vistaPrincipal view, Biblioteca biblioteca) {
		super();
		this.view = view;
		this.biblioteca = biblioteca;
		
		inicializar();
		
	}


	public void go() {
		
		view.setVisible(true);
		
	}
	
	private void inicializar() {
		// TODO Auto-generated method stub
		
		view.getBtnAñadirUsuarios().addActionListener(this);
		view.getBtnAñadirLibros().addActionListener(this);
		
		view.getBtnAñadirLibros().setActionCommand("Añadir Libros");
		view.getBtnAñadirUsuarios().setActionCommand("Añadir Usuarios");
		
	}	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		if(e.getActionCommand().equals("Añadir Libros")) {
			
			añadirLibros();
			
		}else if(e.getActionCommand().equals("Añadir Usuarios")) {
			
			añadirUsuario();
			
		}
		
		
		
	}


	private void añadirUsuario() {
				
		String nombre = view.getTextFieldNombre().getText();
		String apellidos = view.getTextFieldApellidos().getText();
		int  DNI = comprobarInt(view.getTextFieldDNI().getText());
		
		if(DNI == -1 || !biblioteca.añadirUsuarios(nombre,apellidos,DNI)) {
			
			JOptionPane.showMessageDialog(view, "Ha habido un error");	
			
		}else {
			
			JOptionPane.showMessageDialog(view, "Usuario añadido");
			
			view.getTextFieldNombre().setText("");
			view.getTextFieldApellidos().setText("");
			view.getTextFieldDNI().setText("");

			
		}
		
		
	}


	private int comprobarInt(String text) {
		
		int res = -1;
		
		try{
			res = Integer.parseInt(text);
		
		}catch(NumberFormatException e) {
		}
		return res;
	}


	private void añadirLibros() {
		
		int ISBN = comprobarInt(view.getTxtIsbn().getText());
		String titulo = view.getTxtTitulo().getText();
		String autor = view.getTxtAutor().getText();
		
		
		if(ISBN == -1 || !biblioteca.añadirLibros(ISBN,titulo,autor)) {
			
			JOptionPane.showMessageDialog(view, "Ha habido un error");	
			
		}else {
			
			JOptionPane.showMessageDialog(view, "Usuario añadido");
			
			view.getTxtIsbn().setText("");
			view.getTxtTitulo().setText("");
			view.getTxtAutor().setText("");

			
		}
		
		
	}

	
	
}
