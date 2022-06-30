package graficos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class CampoPassword {

	public static void main(String[] args) {
		
		MarcoPassword mimarco= new MarcoPassword();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoPassword extends JFrame{
	MarcoPassword(){
		setTitle("Prueba con Password");
		
		setBounds(600,300,600,350);
		
		LaminaPassword milamina2= new LaminaPassword();
		
		add(milamina2);	
		
		setVisible(true);
		
	}
	
}

class LaminaPassword extends JPanel{
	public LaminaPassword(){
		
		setLayout(new BorderLayout());
		
		JPanel laminasuperior= new JPanel();
		
		laminasuperior.setLayout(new GridLayout(2,2));
		
		add(laminasuperior,BorderLayout.NORTH);
		
		JLabel etiqueta1=new JLabel("User:");
		
		JLabel etiqueta2=new JLabel("Password:");
		
		JTextField usuario=new JTextField(15);
		
		password=new JPasswordField(15);
		
		 CompruebaPass mievento=new  CompruebaPass();
		
		password.getDocument().addDocumentListener(mievento);
		
		laminasuperior.add(etiqueta1);
		
		laminasuperior.add(usuario);
		
		laminasuperior.add(etiqueta2);
	
		laminasuperior.add(password);
		
		JButton enviar=new JButton("enviar");
		
		add(enviar,BorderLayout.SOUTH);
		
		
		}
	private class CompruebaPass implements DocumentListener{
	
		public void insertUpdate(DocumentEvent e) {
			
			char contrasena [];
			
			contrasena=password.getPassword();
			
			if(contrasena.length<8  || contrasena.length>12) {
				
				password.setBackground(Color.red);
				
			}else {
				
				password.setBackground(Color.white);
				
			}
			
		}

		public void removeUpdate(DocumentEvent e) {
			
			
		}

		public void changedUpdate(DocumentEvent e) {
			
			
		}
		
	}
		
	private JPasswordField password;
}