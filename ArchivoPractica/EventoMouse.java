package graficos;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class EventoMouse {

	public static void main(String[] args) {
		
		MarcoConMouse mimarco= new MarcoConMouse();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	}

}

class MarcoConMouse extends JFrame{
	MarcoConMouse(){
		setVisible(true);
		
		setTitle("Prueba de Evento de Mouse");
		
		setBounds(300,300,500,300);
		
		EventoRaton oyente= new EventoRaton();
		
		//addMouseListener(oyente);
		
		addMouseMotionListener(oyente);
	}
	
}
class EventoRaton extends MouseAdapter implements MouseMotionListener{

	public void mouseDragged(MouseEvent e) {
		System.out.println("Estas arrastrando");
		
	}

	public void mouseMoved(MouseEvent e) {
		System.out.println("Estas moviendo el raton");
		
	}
    /*
	public void mouseClicked(MouseEvent e) {
		//System.out.println("Haz dado un click");
		
		//System.out.println("Coordenada X: "+ e.getX() +" Coordenada Y: "+e.getY());
		
		System.out.println(e.getClickCount());
	}
    
	public void mousePressed(MouseEvent e) {
		
		//System.out.println("Acabas de presionar ");
		
		//System.out.println(e.getModifiersEx());// te dice el valor de donde pulsas 
		if(e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK) {
			System.out.println("Haz pulsado el boton izquierdo");
		}else if(e.getModifiersEx()==MouseEvent.BUTTON2_DOWN_MASK) {
			System.out.println("Haz pulsado la rueda del raton");
		}else if(e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK) {
			System.out.println("Haz pulsado la boton derecho");
		}
	}
   
	public void mouseReleased(MouseEvent e) {
		
		System.out.println("Acabas de levantar");
		
	}

	public void mouseEntered(MouseEvent e) {
		
		System.out.println("Acabas de entrar");
		
	}

	public void mouseExited(MouseEvent e) {
		
		System.out.println("Acabas de salir");
		
	}*/
	
}