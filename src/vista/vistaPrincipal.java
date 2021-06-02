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
import javax.swing.JComboBox;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

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
	private JTextField textFieldISBN;
	private JButton btnNewButtonBuscar;
	private JComboBox comboBoxCantidad;
	private JButton btnNewButtonAñadir;
	private JPanel panelPrestar;
	private JPanel panelDevolver;
	private JTabbedPane tabbedPane;
	private JTextField textFieldDNIPrestar;
	private JButton btnNewButtonAñadirPrestar;
	private JButton btnNewButtonAñadirDevolver;
	private JTextField textFieldISBNPrestar;
	private JTextField textFieldDNIDevolver;
	private JTextField textFieldISBNDevolver;
	private JButton btnGuardarSocios;
	private JButton btnGuardarLibros;
	private JButton btnCargarSocios;
	private JButton btnCargarLibros;
	private JButton btnMostrarLibros;
	private JButton btnMostrarSocios;

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
	
	private String[] rellenar() {
		
		String[] num = new String[1000];
		
		for(int i = 0; i<1000; i++) {
			
			num[i] = String.valueOf(i);
			
		}
		
		return num;
		
	}

	/**
	 * Create the frame.
	 */
	public vistaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 567, 430);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Menu");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_3 = new JMenu("Mostrar");
		mnNewMenu.add(mnNewMenu_3);
		
		btnMostrarLibros = new JButton("Libros");
		mnNewMenu_3.add(btnMostrarLibros);
		
		btnMostrarSocios = new JButton("Socios");
		mnNewMenu_3.add(btnMostrarSocios);
		
		JMenu mnNewMenu_2 = new JMenu("Guardar");
		mnNewMenu.add(mnNewMenu_2);
		
		btnGuardarSocios = new JButton("Socios");
		mnNewMenu_2.add(btnGuardarSocios);
		
		btnGuardarLibros = new JButton("Libros");
		mnNewMenu_2.add(btnGuardarLibros);
		
		JMenu mnNewMenu_1 = new JMenu("Cargar");
		mnNewMenu.add(mnNewMenu_1);
		
		btnCargarSocios = new JButton("Socios");
		mnNewMenu_1.add(btnCargarSocios);
		
		btnCargarLibros = new JButton("Libros");
		mnNewMenu_1.add(btnCargarLibros);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane);
		
		
		
		JPanel panelAñadirUsuario = new JPanel();
		tabbedPane.addTab("Añadir Usuario", null, panelAñadirUsuario, null);
		panelAñadirUsuario.setLayout(null);
		
		JPanel panelSuperiorUsuario = new JPanel();
		panelSuperiorUsuario.setBounds(10, 11, 516, 272);
		panelAñadirUsuario.add(panelSuperiorUsuario);
		panelSuperiorUsuario.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNombre.setBounds(47, 50, 70, 15);
		panelSuperiorUsuario.add(lblNombre);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setFont(new Font("Dialog", Font.BOLD, 14));
		lblApellidos.setBounds(47, 102, 80, 25);
		panelSuperiorUsuario.add(lblApellidos);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setFont(new Font("Dialog", Font.BOLD, 14));
		lblDni.setBounds(47, 162, 70, 15);
		panelSuperiorUsuario.add(lblDni);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setColumns(10);
		textFieldNombre.setBounds(145, 48, 341, 19);
		panelSuperiorUsuario.add(textFieldNombre);
		
		textFieldApellidos = new JTextField();
		textFieldApellidos.setColumns(10);
		textFieldApellidos.setBounds(145, 105, 341, 19);
		panelSuperiorUsuario.add(textFieldApellidos);
		
		textFieldDNI = new JTextField();
		textFieldDNI.setColumns(10);
		textFieldDNI.setBounds(145, 160, 190, 19);
		panelSuperiorUsuario.add(textFieldDNI);
		
		JPanel panelInferiorUsuario = new JPanel();
		panelInferiorUsuario.setBounds(10, 294, 516, 48);
		panelAñadirUsuario.add(panelInferiorUsuario);
		panelInferiorUsuario.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));
		
		btnAñadirUsuarios = new JButton("Añadir");
		btnAñadirUsuarios.setVerticalAlignment(SwingConstants.TOP);
		panelInferiorUsuario.add(btnAñadirUsuarios);
		
		JPanel panelAñadirLibros = new JPanel();
		tabbedPane.addTab("Añadir Libros", null, panelAñadirLibros, null);
		panelAñadirLibros.setLayout(null);
		
		JPanel panelSuperiorLibros = new JPanel();
		panelSuperiorLibros.setBounds(10, 11, 516, 272);
		panelAñadirLibros.add(panelSuperiorLibros);
		panelSuperiorLibros.setLayout(null);
		
		JLabel lblIsbn = new JLabel("ISBN");
		lblIsbn.setFont(new Font("Dialog", Font.BOLD, 14));
		lblIsbn.setBounds(52, 51, 70, 15);
		panelSuperiorLibros.add(lblIsbn);
		
		JLabel lblTitulo = new JLabel("Titulo");
		lblTitulo.setFont(new Font("Dialog", Font.BOLD, 14));
		lblTitulo.setBounds(52, 167, 70, 15);
		panelSuperiorLibros.add(lblTitulo);
		
		JLabel lblAutor = new JLabel("Autor");
		lblAutor.setFont(new Font("Dialog", Font.BOLD, 14));
		lblAutor.setBounds(52, 108, 70, 15);
		panelSuperiorLibros.add(lblAutor);
		
		txtIsbn = new JTextField();
		txtIsbn.setBounds(119, 49, 281, 19);
		panelSuperiorLibros.add(txtIsbn);
		txtIsbn.setColumns(10);
		
		txtAutor = new JTextField();
		txtAutor.setBounds(119, 106, 330, 19);
		panelSuperiorLibros.add(txtAutor);
		txtAutor.setColumns(10);
		
		txtTitulo = new JTextField();
		txtTitulo.setBounds(119, 165, 330, 19);
		panelSuperiorLibros.add(txtTitulo);
		txtTitulo.setColumns(10);
		
		JPanel panelInferiorLibros = new JPanel();
		panelInferiorLibros.setBounds(10, 294, 516, 48);
		panelAñadirLibros.add(panelInferiorLibros);
		panelInferiorLibros.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));
		
		btnAñadirLibros = new JButton("Añadir");
		btnAñadirLibros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panelInferiorLibros.add(btnAñadirLibros);
		
		JPanel panelAñadirEjemplar = new JPanel();
		tabbedPane.addTab("Añadir ejemplar", null, panelAñadirEjemplar, null);
		panelAñadirEjemplar.setLayout(null);
		
		JPanel panelSuperiorEjemplar = new JPanel();
		panelSuperiorEjemplar.setBounds(10, 11, 516, 272);
		panelAñadirEjemplar.add(panelSuperiorEjemplar);
		panelSuperiorEjemplar.setLayout(null);
		
		JLabel lblNewLabelISBN = new JLabel("ISBN");
		lblNewLabelISBN.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabelISBN.setBounds(65, 55, 46, 14);
		panelSuperiorEjemplar.add(lblNewLabelISBN);
		
		textFieldISBN = new JTextField();
		textFieldISBN.setBounds(159, 55, 265, 20);
		panelSuperiorEjemplar.add(textFieldISBN);
		textFieldISBN.setColumns(10);
		
		btnNewButtonBuscar = new JButton("Buscar");
		btnNewButtonBuscar.setBounds(241, 86, 89, 23);
		panelSuperiorEjemplar.add(btnNewButtonBuscar);
		
		JLabel lblNewLabelCantidad = new JLabel("Cantidad");
		lblNewLabelCantidad.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabelCantidad.setBounds(65, 156, 68, 14);
		panelSuperiorEjemplar.add(lblNewLabelCantidad);
		
		comboBoxCantidad = new JComboBox(rellenar());
		comboBoxCantidad.setBounds(159, 154, 62, 22);
		panelSuperiorEjemplar.add(comboBoxCantidad);
		comboBoxCantidad.setEnabled(false);
		
		JPanel panelInferiorEjemplar = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panelInferiorEjemplar.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		panelInferiorEjemplar.setBounds(10, 294, 516, 48);
		panelAñadirEjemplar.add(panelInferiorEjemplar);
		
		btnNewButtonAñadir = new JButton("Añadir");
		panelInferiorEjemplar.add(btnNewButtonAñadir);
		btnNewButtonAñadir.setEnabled(false);
		
		panelPrestar = new JPanel();
		tabbedPane.addTab("Prestar", null, panelPrestar, null);
		
				panelPrestar.setLayout(null);
				
				JPanel panelSuperiorPrestar = new JPanel();
				panelSuperiorPrestar.setLayout(null);
				panelSuperiorPrestar.setBounds(10, 11, 516, 272);
				panelPrestar.add(panelSuperiorPrestar);
				
				JLabel lblNewLabelISBN_1 = new JLabel("DNI");
				lblNewLabelISBN_1.setFont(new Font("Tahoma", Font.BOLD, 14));
				lblNewLabelISBN_1.setBounds(69, 131, 46, 14);
				panelSuperiorPrestar.add(lblNewLabelISBN_1);
				
				textFieldDNIPrestar = new JTextField();
				textFieldDNIPrestar.setColumns(10);
				textFieldDNIPrestar.setBounds(163, 131, 265, 20);
				panelSuperiorPrestar.add(textFieldDNIPrestar);
				
				textFieldISBNPrestar = new JTextField();
				textFieldISBNPrestar.setColumns(10);
				textFieldISBNPrestar.setBounds(163, 81, 265, 20);
				panelSuperiorPrestar.add(textFieldISBNPrestar);
				
				JLabel lblNewLabelISBN_1_1 = new JLabel("ISBN");
				lblNewLabelISBN_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
				lblNewLabelISBN_1_1.setBounds(69, 81, 46, 14);
				panelSuperiorPrestar.add(lblNewLabelISBN_1_1);
				
				JPanel panelInferiorDevolver = new JPanel();
				FlowLayout flowLayout_1 = (FlowLayout) panelInferiorDevolver.getLayout();
				flowLayout_1.setAlignment(FlowLayout.RIGHT);
				panelInferiorDevolver.setBounds(10, 294, 516, 48);
				panelPrestar.add(panelInferiorDevolver);
				
				btnNewButtonAñadirPrestar = new JButton("Añadir");
				btnNewButtonAñadirPrestar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				panelInferiorDevolver.add(btnNewButtonAñadirPrestar);
	
		panelDevolver = new JPanel();
		tabbedPane.addTab("Devolver", null, panelDevolver, null);
		
	
		panelDevolver.setLayout(null);
		
		JPanel panelSuperiorEjemplar_1 = new JPanel();
		panelSuperiorEjemplar_1.setLayout(null);
		panelSuperiorEjemplar_1.setBounds(10, 11, 516, 272);
		panelDevolver.add(panelSuperiorEjemplar_1);
		
		textFieldDNIDevolver = new JTextField();
		textFieldDNIDevolver.setColumns(10);
		textFieldDNIDevolver.setBounds(159, 133, 265, 20);
		panelSuperiorEjemplar_1.add(textFieldDNIDevolver);
		
		JLabel lblNewLabelISBN_1_2 = new JLabel("DNI");
		lblNewLabelISBN_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabelISBN_1_2.setBounds(65, 133, 46, 14);
		panelSuperiorEjemplar_1.add(lblNewLabelISBN_1_2);
		
		JLabel lblNewLabelISBN_1_1_1 = new JLabel("ISBN");
		lblNewLabelISBN_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabelISBN_1_1_1.setBounds(65, 83, 46, 14);
		panelSuperiorEjemplar_1.add(lblNewLabelISBN_1_1_1);
		
		textFieldISBNDevolver = new JTextField();
		textFieldISBNDevolver.setColumns(10);
		textFieldISBNDevolver.setBounds(159, 83, 265, 20);
		panelSuperiorEjemplar_1.add(textFieldISBNDevolver);
		
		JPanel panelInferiorEjemplar_1 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panelInferiorEjemplar_1.getLayout();
		flowLayout_2.setAlignment(FlowLayout.RIGHT);
		panelInferiorEjemplar_1.setBounds(10, 294, 516, 48);
		panelDevolver.add(panelInferiorEjemplar_1);
		
		btnNewButtonAñadirDevolver = new JButton("Añadir");

		panelInferiorEjemplar_1.add(btnNewButtonAñadirDevolver);
		
	}
	
	
	
	public JButton getBtnMostrarLibros() {
		return btnMostrarLibros;
	}

	public JButton getBtnMostrarSocios() {
		return btnMostrarSocios;
	}

	public JButton getBtnGuardarSocios() {
		return btnGuardarSocios;
	}
	
	
	public JButton getBtnGuardarLibros() {
		return btnGuardarLibros;
	}

	public JButton getBtnCargarLibros() {
		return btnCargarLibros;
	}

	public JButton getBtnCargarSocios() {
		return btnCargarSocios;
	}

	public JTextField getTextFieldDNIPrestar() {
		return textFieldDNIPrestar;
	}

	public JTextField getTextField() {
		return textFieldISBNPrestar;
	}

	public JTextField getTextFieldDNIDevolver() {
		return textFieldDNIDevolver;
	}

	public JTextField getTextFieldISBNPrestar() {
		return textFieldDNIPrestar;
	}

	public JTextField getTextFieldISBNDevolver() {
		return textFieldISBNDevolver;
	}

	public JButton getBtnNewButtonAñadirPrestar() {
		return btnNewButtonAñadirPrestar;
	}


	public JButton getBtnNewButtonAñadirDevolver() {
		return btnNewButtonAñadirDevolver;
	}

	public JTabbedPane getTabbedPane() {
		return tabbedPane;
	}

	public JPanel getPanelPrestar() {
		return panelPrestar;
	}

	public JPanel getPanelDevolver() {
		return panelDevolver;
	}

	public JButton getBtnNewButtonAñadir() {
		return btnNewButtonAñadir;
	}

	public JTextField getTextFieldISBN() {
		return textFieldISBN;
	}

	public JButton getBtnNewButtonBuscar() {
		return btnNewButtonBuscar;
	}

	public JComboBox getComboBoxCantidad() {
		return comboBoxCantidad;
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
