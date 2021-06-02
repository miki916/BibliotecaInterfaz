package controlador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import clases.Persona;

public class SociosTableModel extends TableModel<Persona> {

	public SociosTableModel(List<Persona> data) {
		super(new ArrayList<String>(Arrays.asList("DNI","Nombre","Apellidos","N Prestados")), data);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setValueAt(Object value, int row, int col) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object getValueAt(int row, int col) {
		// TODO Auto-generated method stub
		
		switch(col) {
		
		case 0: return data.get(row).getDNI();
		case 1: return data.get(row).getNombre();
		case 2: return data.get(row).getApellidos();
		case 3: return data.get(row).getnPrestados();
		
		}
		
		return null;
	}

}
