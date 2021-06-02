package controlador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import clases.Libro;

public class LibrosTableModel extends TableModel<Libro> {

	public LibrosTableModel(List<Libro> data) {
		super(new ArrayList<String>(Arrays.asList("ISBN","Autor","Titulo","N Ejemplares")), data);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setValueAt(Object value, int row, int col) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object getValueAt(int row, int col) {
		
		switch(col) {
		
			case 0: return data.get(row).getISBN();
			case 1: return data.get(row).getAutor();
			case 2: return data.get(row).getTitulo();
			case 3: return data.get(row).getEjemplares().size();
		
		}
		
		
		return null;
	}

}
