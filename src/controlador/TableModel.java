package controlador;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public abstract class TableModel<T> extends AbstractTableModel{

protected final List<String> HEADER;
	
	protected List<T> data;
	
	public TableModel(List<String> HEADER,List<T> data) {
		this.data=data;
		this.HEADER=HEADER;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return HEADER.size();
	}

	@Override
	public int getRowCount() {
	
		return data.size();
	}
	@Override
	public String getColumnName(int column) {
		return HEADER.get(column);
	}
	
	
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		if(columnIndex==0)
			return false;
		else
			return true;
	}
	
	@Override
	public abstract void setValueAt(Object value, int row, int col);
	
	@Override
	public abstract Object getValueAt(int row, int col);
	
	public void addElementAtRow(T element) {
		data.add(element);
		fireTableRowsInserted(data.size()-1,data.size()-1);
	}
	
	public T getElement(int row) {
		return data.get(row);
	}
	public ArrayList<T> getElements(int[] rows) {
		ArrayList<T> elements=new ArrayList<T>();
		for(int row:rows){
			elements.add(getElement(row));
		}
		return elements;
	}
	
	public void removeElement(T element) {
		int index=data.indexOf(element);
		data.remove(element);
		fireTableRowsDeleted(index,index);
	}
}
