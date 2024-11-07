package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.ControladorProducto;
import Modelo.Producto;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaProductos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtID;
	private JTextField txtNOMBRE;
	private JTextField txtPRECIO;
	private JTextField txtCANTIDAD;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaProductos frame = new VistaProductos();
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
	public VistaProductos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel LBLID = new JLabel("ID PRODUCTO");
		LBLID.setBounds(10, 36, 80, 14);
		contentPane.add(LBLID);
		
		JLabel lblNewLabel_1 = new JLabel("NOMBRE");
		lblNewLabel_1.setBounds(10, 61, 80, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PRECIO");
		lblNewLabel_2.setBounds(10, 97, 80, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("CANTIDAD");
		lblNewLabel_3.setBounds(10, 132, 80, 14);
		contentPane.add(lblNewLabel_3);
		
		txtID = new JTextField();
		txtID.setBounds(100, 33, 86, 20);
		contentPane.add(txtID);
		txtID.setColumns(10);
		
		txtNOMBRE = new JTextField();
		txtNOMBRE.setBounds(100, 58, 86, 20);
		contentPane.add(txtNOMBRE);
		txtNOMBRE.setColumns(10);
		
		txtPRECIO = new JTextField();
		txtPRECIO.setBounds(100, 94, 86, 20);
		contentPane.add(txtPRECIO);
		txtPRECIO.setColumns(10);
		
		txtCANTIDAD = new JTextField();
		txtCANTIDAD.setBounds(100, 129, 86, 20);
		contentPane.add(txtCANTIDAD);
		txtCANTIDAD.setColumns(10);
		
		JButton btnNewButton = new JButton("guardar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				guardar();

			}
		});
		btnNewButton.setBounds(100, 160, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("consultar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(201, 160, 89, 23);
		contentPane.add(btnNewButton_1);
	}
	public void guardar() {
		ControladorProducto cp=new ControladorProducto();
		Producto pd=new Producto(); 	
		pd.setIdproducto(Integer.parseInt(txtID.getText()));
		pd.setNombreproducto(txtNOMBRE.getText());
		pd.setPrecio(Integer.parseInt(txtPRECIO.getText()));
		pd.setCantidad(Integer.parseInt(txtCANTIDAD.getText()));
		 cp.guardar(pd);
		
		
		
	}
}
