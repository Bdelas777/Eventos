package graficos;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class EventoTeclas {

	public static void main(String[] args) {
		
		MarcoConTeclas mimarco= new MarcoConTeclas();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class MarcoConTeclas extends JFrame{
	MarcoConTeclas(){
		setVisible(true);
		
		setTitle("Prueba de Evento de Teclado");
		
		setBounds(300,300,500,300);
		
		EventoTeclado tecla= new EventoTeclado();
		
		addKeyListener(tecla);
	}
	
}

class EventoTeclado implements KeyListener{

	public void keyTyped(KeyEvent e) {
		
		/*int codigo=e.getKeyCode();
		
		System.out.println(codigo);*/
		
		 char letra=e.getKeyChar();
		
		System.out.println(letra);
	}

	public void keyPressed(KeyEvent e) {
		
	}

	public void keyReleased(KeyEvent e) {
		
	}	
}