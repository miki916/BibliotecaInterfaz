package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;

public class vistaLibros extends JFrame {

	private JPanel contentPane;
	private JTable tableLibros;


	/**
	 * Create the frame.
	 */
	public vistaLibros() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 629, 455);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelSuperior = new JPanel();
		panelSuperior.setBounds(10, 11, 593, 48);
		contentPane.add(panelSuperior);
		
		JLabel lblNewLabel = new JLabel("MOSTRAR LIBROS");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panelSuperior.add(lblNewLabel);
		
		JPanel panelInferior = new JPanel();
		panelInferior.setBounds(10, 59, 593, 346);
		contentPane.add(panelInferior);
		panelInferior.setLayout(new BorderLayout(0, 0));
		Object[][] data = {{""}};
		String[] columnas = {"ISBN", "Titulo", "Autor",  "Número Ejemplares"};
		
	
		DefaultTableModel dtm = new DefaultTableModel(data,columnas);
		tableLibros = new JTable(dtm);
		tableLibros.setFillsViewportHeight(true);
		panelInferior.add(tableLibros, BorderLayout.CENTER);
		JScrollPane scrollPane = new JScrollPane(tableLibros);
	}
}
