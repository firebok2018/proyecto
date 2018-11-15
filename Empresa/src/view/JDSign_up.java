package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.ConexionUser;
import model.Encrypt;
import model.Usuarios;
import util.Conexion;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Font;

public class JDSign_up extends JDialog implements ActionListener {
	private JLabel lblUsuario;
	private JLabel lblContrasea;
	private JLabel lblConfirmarContrasea;
	private JLabel lblNombre;
	private JLabel lblCorreo;
	private JLabel lblApellido;
	private JTextField txtUser;
	private JTextField txtCorreo;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JButton btnRegistrar;
	private JPasswordField txtPassword;
	private JPasswordField txtPasswordConfirm;
	private JLabel tiempo;
	
	//tiempo
	
	public static int hora=0,minuto=0,segundo=0;
	public static  boolean Time=true;
	public static boolean SigIn_Time=false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JDSign_up dialog = new JDSign_up();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public JDSign_up() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(53, 36, 46, 14);
		getContentPane().add(lblUsuario);
		
		lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setBounds(53, 61, 72, 14);
		getContentPane().add(lblContrasea);
		
		lblConfirmarContrasea = new JLabel("<html>Confirmar Contrase\u00F1a:</html>");
		lblConfirmarContrasea.setBounds(53, 86, 89, 28);
		getContentPane().add(lblConfirmarContrasea);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(53, 150, 56, 14);
		getContentPane().add(lblNombre);
		
		lblCorreo = new JLabel("Correo:");
		lblCorreo.setBounds(53, 125, 46, 14);
		getContentPane().add(lblCorreo);
		
		lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(53, 175, 46, 14);
		getContentPane().add(lblApellido);
		
		txtUser = new JTextField();
		txtUser.setBounds(135, 33, 153, 20);
		getContentPane().add(txtUser);
		txtUser.setColumns(10);
		
		txtCorreo = new JTextField();
		txtCorreo.setBounds(135, 119, 153, 20);
		getContentPane().add(txtCorreo);
		txtCorreo.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(135, 147, 215, 20);
		getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(135, 172, 215, 20);
		getContentPane().add(txtApellido);
		txtApellido.setColumns(10);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(this);
		btnRegistrar.setBounds(107, 214, 89, 23);
		getContentPane().add(btnRegistrar);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(135, 58, 153, 20);
		getContentPane().add(txtPassword);
		
		txtPasswordConfirm = new JPasswordField();
		txtPasswordConfirm.setBounds(135, 89, 153, 20);
		getContentPane().add(txtPasswordConfirm);
		
		tiempo = new JLabel("");
		tiempo.setFont(new Font("Segoe UI", Font.BOLD, 44));
		tiempo.setBounds(218, 186, 189, 64);
		getContentPane().add(tiempo);
		tiempo();
		
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnRegistrar) {
			actionPerformedBtnRegistrar(arg0);
		}
		
	}
	protected void actionPerformedBtnRegistrar(ActionEvent arg0) {
		ConexionUser usuario= new ConexionUser();
		Usuarios user;
		String pwd= new String(txtPassword.getPassword());
		String pwdConfirm= new String(txtPasswordConfirm.getPassword());
		
		
		
	}
	void tiempo(){
		if (Time==true) {
			SigIn_Time=true;
			iniciar();
		}
		if (Time==false) {
			SigIn_Time=false;
			System.out.println("444444444444444444");
			detener();
		}

	}

	private void detener() {
		// TODO Auto-generated method stub
		
	}

	private void iniciar() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 1000000000; i++) {
			tiempo.setText(i+"");
		}
	}
		
	
}

	
