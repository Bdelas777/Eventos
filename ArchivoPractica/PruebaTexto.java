package graficos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PruebaTexto {

	public static void main(String[] args) {
		MarcoTexto mimarco= new MarcoTexto();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoTexto extends JFrame{
	MarcoTexto(){
		setTitle("Prueba con Texto");
		
		setBounds(600,300,600,350);
		
		LaminaTexto milamina2= new LaminaTexto();
		
		add(milamina2);	
		
		setVisible(true);
		
	}
	
}

class LaminaTexto extends JPanel{
	public LaminaTexto(){
		
		setLayout(new BorderLayout());
		
		JPanel sublamina= new JPanel();
		
		sublamina.setLayout(new FlowLayout());
		
		resultado=new JLabel("",JLabel.CENTER);
		
		JLabel texto1=new JLabel("Email: ");
		
		sublamina.add(texto1);
		
		Campo1= new JTextField(20);//consructor txt y columnas
		
		sublamina.add(Campo1);
		
		add(resultado,BorderLayout.CENTER);
		
		//System.out.println(Campo1.getText().trim());// quita espacio adicional
		
		JButton miboton=new JButton("Comprobar");
		
		DameTexto mievento=new DameTexto();
		
		miboton.addActionListener(mievento);
		
		sublamina.add(miboton);
		
		add(sublamina,BorderLayout.NORTH);
		
	}
	private class DameTexto implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			int correcto=0;
			boolean punto=false;
			String email=Campo1.getText().trim();
			
			for(int i=0;i<email.length();i++) {
				
				if(email.charAt(i)=='@') {
					
					correcto++;
					
				}
				if(email.charAt(i)=='.') {
					
					punto=true;
					
				}
				if(email.charAt(0)=='.'  || email.charAt(email.length()-1)=='.') {
					
					punto=false;
					
				}
				
			}
			if(correcto==1 && punto==true) {
				
				resultado.setText("Correcto");
				
				Campo1.setForeground(Color.black);
				
				resultado.setForeground(Color.black);

			}else {
				
				resultado.setText("Incorrecto");
				
				Campo1.setForeground(Color.red);
				
				resultado.setForeground(Color.red);
				
			}
		
		}
		
	}
	private JTextField Campo1;
	
	private JLabel resultado;
}
/*JTextField construye el cuadro de txt
 * JTextArea construye un area de texto
 * Heredan de JTextCOmponent*/

