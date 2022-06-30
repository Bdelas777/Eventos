package graficos;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class EscribiendoEnMArco {

	public static void main(String[] args) {
		
		MarcoConTexto mimarco=new MarcoConTexto();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Salida
	}

}
class MarcoConTexto extends JFrame{
	public MarcoConTexto() {
		
		setVisible(true);
		
		setBounds(400,200,600,450);
		
		setTitle("Primer texto");
		
		Lamina milamina= new Lamina();
		
		add(milamina);
	}
}
class Lamina extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.drawString("Estamos aprendiendo Swing", 100, 100);//texto,x and y

	}
}