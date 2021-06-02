package controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import clases.*;
import vista.vistaLibros;
import vista.vistaPrincipal;

public class controladorPrincipal implements ActionListener{
	
	private vistaPrincipal view;
	private Biblioteca biblioteca;	
	private vistaLibros viewLibros;
	
	public controladorPrincipal(vistaPrincipal view, Biblioteca biblioteca) {
		super();
		this.view = view;
		this.biblioteca = biblioteca;
		this.viewLibros = new vistaLibros();
		inicializar();
		
	}


	public void go() {
		
		view.setVisible(true);
		
	}
	
	private void inicializar() {
		// TODO Auto-generated method stub
		
		view.getBtnAñadirUsuarios().addActionListener(this);
		view.getBtnAñadirLibros().addActionListener(this);
		view.getBtnNewButtonBuscar().addActionListener(this);
		view.getBtnNewButtonAñadir().addActionListener(this);
		view.getBtnNewButtonAñadirDevolver().addActionListener(this);
		view.getBtnNewButtonAñadirPrestar().addActionListener(this);
		view.getBtnCargarSocios().addActionListener(this);
		view.getBtnGuardarSocios().addActionListener(this);
		view.getBtnCargarLibros().addActionListener(this);
		view.getBtnGuardarLibros().addActionListener(this);
		view.getBtnMostrarLibros().addActionListener(this);


		view.getBtnAñadirLibros().setActionCommand("Añadir Libros");
		view.getBtnAñadirUsuarios().setActionCommand("Añadir Usuarios");
		view.getBtnNewButtonBuscar().setActionCommand("Buscar");
		view.getBtnNewButtonAñadir().setActionCommand("Añadir Ejemplares");
		view.getBtnNewButtonAñadirDevolver().setActionCommand("Devolver");
		view.getBtnNewButtonAñadirPrestar().setActionCommand("Prestar");
		view.getBtnCargarSocios().setActionCommand("Cargar Socios");
		view.getBtnGuardarSocios().setActionCommand("Guardar Socios");
		view.getBtnCargarLibros().setActionCommand("Cargar Libros");
		view.getBtnGuardarLibros().setActionCommand("Guardar Libros");
		view.getBtnMostrarLibros().setActionCommand("Mostrar Libros");
	}	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		if(e.getActionCommand().equals("Añadir Libros")) {
			
			añadirLibros();
			
		}else if(e.getActionCommand().equals("Añadir Usuarios")) {
			
			añadirUsuario();
			
		}else if(e.getActionCommand().equals("Buscar")) {
			
			buscar();
			
		}else if(e.getActionCommand().equals("Añadir Ejemplares")) {
			
			añadirEjemplares();
			
		}else if(e.getActionCommand().equals("Prestar")) {
			
			prestar();
			
		}else if(e.getActionCommand().equals("Devolver")) {
			
			devolver();
			
		}else if(e.getActionCommand().equals("Guardar Socios")) {
			
			guardar("Socios");
			
		}else if(e.getActionCommand().equals("Cargar Socios")) {
			
			cargar("Socios");
			
		}else if(e.getActionCommand().equals("Guardar Libros")) {
			
			guardar("Libros");
			
		}else if(e.getActionCommand().equals("Cargar Libros")) {
			
			cargar("Libros");
			
		}else if(e.getActionCommand().equals("Mostrar Libros")) {
			
			viewLibros.setVisible(true);
			
		}
		
		
			
	}


	

	private void cargar(String value) {
		// TODO Auto-generated method stub
		
		File fileSelection = fileSelection();
		
		if(value.equals("Libros"))
			biblioteca.cargarLibros(fileSelection);
		else
			biblioteca.cargarSocios(fileSelection);
	}


	private void guardar(String value) {
		// TODO Auto-generated method stub
		File fileSelection = fileSelection();
		
		if(value.equals("Libros"))
			biblioteca.guardarLibros(fileSelection);
		else
			biblioteca.guardarSocios(fileSelection);
		
	}


	private File fileSelection() {
		
		File fileSelection = null;
		int userSelection;
		
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setDialogTitle("Specify a file");
		userSelection = fileChooser.showSaveDialog(view);
		
		
		if (userSelection == JFileChooser.APPROVE_OPTION) {
			
			fileSelection = fileChooser.getSelectedFile();
		
		}
		return fileSelection;
	}


	private void devolver() {
		// TODO Auto-generated method stub
		
		int ISBN = comprobarInt(view.getTextFieldISBNDevolver().getText());
		int  DNI = comprobarInt(view.getTextFieldDNIDevolver().getText());

		
		if(biblioteca.devolucionLibro(DNI, ISBN)) {
			
			JOptionPane.showMessageDialog(view, "Ejemplar devuelto");	
			view.getTextFieldDNIDevolver().setText("");
			view.getTextFieldISBNDevolver().setText("");

		}else {
			
			JOptionPane.showMessageDialog(view, "Ha habido un error");
			
		}
		
	}


	private void prestar() {
		// TODO Auto-generated method stub
		
		int ISBN = comprobarInt(view.getTextField().getText());
		int  DNI = comprobarInt(view.getTextFieldDNIPrestar().getText());
		int error = biblioteca.prestamoLibros(DNI, ISBN);
		
		switch(error) {
		
		case 0 : JOptionPane.showMessageDialog(view, "Ejemplar añadido");	
				 view.getTextFieldDNIPrestar().setText("");
				 view.getTextField().setText("");
			break;
			 
		case 1 : JOptionPane.showMessageDialog(view, "El libro no contiene ejemplares");
			break;
			
		case 2: JOptionPane.showMessageDialog(view, "Este socio tiene muchos libros prestados");
			break;
		
		case 3: JOptionPane.showMessageDialog(view, "El socio ya contiene este libro");
			break;
			
		default: JOptionPane.showMessageDialog(view, "Ha habido un error");
		
		}
				
		
	}


	private Libro buscar() {
		// TODO Auto-generated method stub
		
		int ISBN = comprobarInt(view.getTextFieldISBN().getText());
		
		Libro l = containsLibro(ISBN);
		
		if(l != null) {
			
			JOptionPane.showMessageDialog(view, "Libro encontrado");	
			view.getBtnNewButtonAñadir().setEnabled(true);
			view.getComboBoxCantidad().setEnabled(true);
			view.getTextFieldISBN().setEnabled(false);
			view.getBtnNewButtonBuscar().setEnabled(false);
			
		}else {
			
			JOptionPane.showMessageDialog(view, "El libro no  ha sido encontrado");	
		}
		
		return l;
		
	}


	private Libro containsLibro(int ISBN) {
		// TODO Auto-generated method stub
		return biblioteca.containsLibro(ISBN);	
	}


	private void añadirEjemplares() {
		// TODO Auto-generated method stub
		
		int num = Integer.parseInt((String) view.getComboBoxCantidad().getSelectedItem());
		int ISBN = comprobarInt(view.getTextFieldISBN().getText());
		
		biblioteca.añadirEjemplar(containsLibro(ISBN), num);
		JOptionPane.showMessageDialog(view, "Ejemplares añadidos");	
		
		view.getBtnNewButtonAñadir().setEnabled(false);
		view.getComboBoxCantidad().setEnabled(false);
		view.getTextFieldISBN().setText("");
		view.getTextFieldISBN().setEnabled(true);
		view.getBtnNewButtonBuscar().setEnabled(true);
			
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
