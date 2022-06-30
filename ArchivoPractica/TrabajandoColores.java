package graficos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.SystemColor;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TrabajandoColores {

	public static void main(String[] args) {
		MarcoConColor mimarco= new MarcoConColor();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class MarcoConColor extends JFrame{
	MarcoConColor(){
		setTitle("Prueba con colores");
		
		setSize(400,400);
		
		LaminaConColor milamina2= new LaminaConColor();
		
		add(milamina2);	
		
		milamina2.setBackground(SystemColor.window);//color del sistema
	}
	
}
class LaminaConColor extends JPanel{
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		Graphics2D g2=(Graphics2D) g;
		
		Rectangle2D	rectangulo=new Rectangle2D.Double(100,100,200,150);
		g2.setPaint(Color.blue);
		g2.draw(rectangulo);
		g2.setPaint(Color.red);//Poner color
		
		g2.fill(rectangulo);
		
		Ellipse2D elipse= new Ellipse2D.Double();
		
		elipse.setFrame(rectangulo);
		//brighter() y darker()
		//opcion 1
		//g2.setPaint(new Color(109,172,59));
		//opcion2
		Color micolor=new Color(125,189,200);
		
		g2.setPaint(micolor);
		
		g2.fill(elipse);
	}	
}