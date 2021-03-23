package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class vistaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNombre;
	private JTextField textFieldApellidos;
	private JTextField textFieldDNI;
	private JTextField txtIsbn;
	private JTextField txtAutor;
	private JTextField txtTitulo;
	private JButton btnAñadirUsuarios;
	private JButton btnAñadirLibros;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vistaPrincipal frame = new vistaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public vistaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 567, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane);
		
		JPanel panelAñadirUsuario = new JPanel();
		tabbedPane.addTab("Añadir Usuario", null, panelAñadirUsuario, null);
		panelAñadirUsuario.setLayout(null);
		
		JPanel panelSuperior = new JPanel();
		panelSuperior.setBounds(12, 12, 528, 273);
		panelAñadirUsuario.add(panelSuperior);
		panelSuperior.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNombre.setBounds(47, 50, 70, 15);
		panelSuperior.add(lblNombre);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setFont(new Font("Dialog", Font.BOLD, 14));
		lblApellidos.setBounds(47, 102, 80, 25);
		panelSuperior.add(lblApellidos);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setFont(new Font("Dialog", Font.BOLD, 14));
		lblDni.setBounds(47, 162, 70, 15);
		panelSuperior.add(lblDni);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setColumns(10);
		textFieldNombre.setBounds(145, 48, 341, 19);
		panelSuperior.add(textFieldNombre);
		
		textFieldApellidos = new JTextField();
		textFieldApellidos.setColumns(10);
		textFieldApellidos.setBounds(145, 105, 341, 19);
		panelSuperior.add(textFieldApellidos);
		
		textFieldDNI = new JTextField();
		textFieldDNI.setColumns(10);
		textFieldDNI.setBounds(145, 160, 190, 19);
		panelSuperior.add(textFieldDNI);
		
		JPanel panelInferior = new JPanel();
		panelInferior.setBounds(12, 321, 528, 35);
		panelAñadirUsuario.add(panelInferior);
		panelInferior.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));
		
		btnAñadirUsuarios = new JButton("Añadir");
		btnAñadirUsuarios.setVerticalAlignment(SwingConstants.TOP);
		panelInferior.add(btnAñadirUsuarios);
		
		JPanel panelAñadirLibros = new JPanel();
		tabbedPane.addTab("Añadir Libros", null, panelAñadirLibros, null);
		panelAñadirLibros.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 12, 528, 278);
		panelAñadirLibros.add(panel);
		panel.setLayout(null);
		
		JLabel lblIsbn = new JLabel("ISBN");
		lblIsbn.setFont(new Font("Dialog", Font.BOLD, 14));
		lblIsbn.setBounds(52, 51, 70, 15);
		panel.add(lblIsbn);
		
		JLabel lblTitulo = new JLabel("Titulo");
		lblTitulo.setFont(new Font("Dialog", Font.BOLD, 14));
		lblTitulo.setBounds(52, 167, 70, 15);
		panel.add(lblTitulo);
		
		JLabel lblAutor = new JLabel("Autor");
		lblAutor.setFont(new Font("Dialog", Font.BOLD, 14));
		lblAutor.setBounds(52, 108, 70, 15);
		panel.add(lblAutor);
		
		txtIsbn = new JTextField();
		txtIsbn.setBounds(119, 49, 281, 19);
		panel.add(txtIsbn);
		txtIsbn.setColumns(10);
		
		txtAutor = new JTextField();
		txtAutor.setBounds(119, 106, 330, 19);
		panel.add(txtAutor);
		txtAutor.setColumns(10);
		
		txtTitulo = new JTextField();
		txtTitulo.setBounds(119, 165, 330, 19);
		panel.add(txtTitulo);
		txtTitulo.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 321, 528, 35);
		panelAñadirLibros.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));
		
		btnAñadirLibros = new JButton("Añadir");
		btnAñadirLibros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(btnAñadirLibros);
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public JTextField getTextFieldNombre() {
		return textFieldNombre;
	}

	public JTextField getTextFieldApellidos() {
		return textFieldApellidos;
	}

	public JTextField getTextFieldDNI() {
		return textFieldDNI;
	}

	public JTextField getTxtIsbn() {
		return txtIsbn;
	}

	public JTextField getTxtAutor() {
		return txtAutor;
	}

	public JTextField getTxtTitulo() {
		return txtTitulo;
	}

	public JButton getBtnAñadirUsuarios() {
		return btnAñadirUsuarios;
	}

	public JButton getBtnAñadirLibros() {
		return btnAñadirLibros;
	}
	
	
}
