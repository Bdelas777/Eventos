package graficos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TrabajandoConFuentes {

	public static void main(String[] args) {
		MarcoConFuente mimarco= new MarcoConFuente();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoConFuente extends JFrame{
	MarcoConFuente(){
		setTitle("Prueba con fuentes");
		
		setSize(400,400);
		
		LaminaConFuentes milamina2= new LaminaConFuentes();
		
		add(milamina2);	
		
		milamina2.setBackground(SystemColor.window);//color del sistema
		
		milamina2.setForeground(Color.BLUE);//Colores de las letras o dibujos
	}
	
}


class LaminaConFuentes extends JPanel{
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2=(Graphics2D) g;
		//tipo letra, constante(bold italic normal) ,tamano
		Font mifuente=new Font("Arial",Font.BOLD,26);
		
		g2.setFont(mifuente);
		
		//g2.setColor(Color.GREEN);

		g2.drawString("Berna",100,100);
		
		g2.setFont(new Font("Arial",Font.ITALIC,14));
		
		//g2.setColor(new Color(128,90,50));
		
		g2.drawString("Java", 200, 100);
		
	}	
}