package graficos;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EventoFoco {

	public static void main(String[] args) {
		
		MarcoConFoco mimarco= new MarcoConFoco();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class MarcoConFoco extends JFrame{
	MarcoConFoco(){
		setVisible(true);
		
		setTitle("Prueba de Evento de Mouse");
		
		setBounds(300,300,500,300);
		
		add(new LaminaConFoco());
		
	}
	
}

class LaminaConFoco extends JPanel{
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		setLayout(null);//Invalidacion de la colocacion por defecto
		
		cuadro1= new JTextField();
		
		cuadro2= new JTextField();
		
		cuadro1.setBounds(120, 10, 150, 20);
		
		cuadro2.setBounds(120, 50, 150, 20);
		
		add(cuadro1);
		
		add(cuadro2);
		
		cuadro1.addFocusListener(new LanzaFocos());
		
		
	}	
	
	JTextField cuadro1;
	
	JTextField cuadro2;
	
	 private class LanzaFocos implements FocusListener{

		public void focusGained(FocusEvent e) {
			
			
		}

		public void focusLost(FocusEvent e) {
			
		String correo=cuadro1.getText();
		
		int arroba=0;
		
		boolean punto=false;
		
		for(int i=0;i<correo.length();i++) {
			
			if(correo.charAt(i)=='@') {
				
				arroba++;
				
			}
			
			if(correo.charAt(i)=='.') {
				
				punto=true;
				
			}
			
		}
		if(arroba==1 && punto) {
			
			System.out.println("Correo valido");
			
		}
		
		else {
			
			System.out.println("Correo invalido");
		}
		
		}
		
	}	
} 