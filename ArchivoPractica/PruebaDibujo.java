package graficos;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.*;
import java.awt.geom.Ellipse2D.Double;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaDibujo {

	public static void main(String[] args) {
		
		MarcoConDibujos mimarco= new MarcoConDibujos();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
	}

}

class MarcoConDibujos extends JFrame{
	public MarcoConDibujos() {
		
		setTitle("Prueba de dibujo");
		
		setSize(400,400);
		
		LaminaConFiguras milamina2= new LaminaConFiguras();
		
		add(milamina2);		
	}
}

class LaminaConFiguras extends JPanel{
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		//posicion x,y,ancho alto
		//g.drawRect(50, 50, 200 ,200);
		
		//g.drawLine(30, 40,300 , 200);//x,y,inicial ,final
		
		//g.drawArc(50, 100, 100, 200, 120, 150);//x,y,ancho,alto,angulo,arco de angulo
		
		Graphics2D g2=(Graphics2D) g;
		//x,y,ancho,largo
		Rectangle2D	rectangulo=new Rectangle2D.Double(100,100,200,150);
		
		g2.draw(rectangulo);
		
		Ellipse2D elipse= new Ellipse2D.Double();
		//Se puede dibujar con parametros o usando un rectangulo
		elipse.setFrame(rectangulo);
		
		g2.draw(elipse);
		//instanciado con objeto draw
		g2.draw(new Line2D.Double(100,100,300,250));
		
		double CentroX=rectangulo.getCenterX();
		
		double CentroY=rectangulo.getCenterY();
		
		double radio=150;
		
		Ellipse2D circulo= new Ellipse2D.Double();
		
		circulo.setFrameFromCenter(CentroX, CentroY,CentroX+radio,CentroY+radio);
		
		g2.draw(circulo);
	}	
}