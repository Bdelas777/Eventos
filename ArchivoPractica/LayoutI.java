package graficos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LayoutI {

	public static void main(String[] args) {
		
		MarcoLayout mimarco= new MarcoLayout();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
		
	}

}

class MarcoLayout extends JFrame{
	public MarcoLayout(){
		setTitle("Prueba con Layout");
		
		setBounds(600,350,600,300);
		
		PanelLayout2 milamina= new PanelLayout2();
		
		add(milamina,BorderLayout.NORTH);
		
		PanelLayout milamina2= new PanelLayout();	
		
		//FlowLayout disposicion= new FlowLayout(FlowLayout.TRAILING);// allign, width, height
		
		//milamina2.setLayout(new FlowLayout(FlowLayout.CENTER,75,100));
		
		add(milamina2,BorderLayout.SOUTH);
		
		
	
	}
	
}

class PanelLayout extends JPanel{
	
	public PanelLayout() {
		
		//setLayout(new FlowLayout(FlowLayout.CENTER,75,100));
		//Ejemplo de Border
		setLayout(new BorderLayout(10,10));
		
		add(new JButton("Amarillo"),BorderLayout.NORTH);
		
		add(new JButton("Azul"),BorderLayout.SOUTH);
		
		add(new JButton("Rojo"),BorderLayout.WEST);
		
		add(new JButton("Verde"),BorderLayout.EAST);
		
		add(new JButton("Negro"),BorderLayout.CENTER);
		// Para diferentes disposiciones diferentes laminas
	}
}
class PanelLayout2 extends JPanel{
	
	public PanelLayout2() {
		
		setLayout(new FlowLayout(FlowLayout.LEFT,75,100));
		
        add(new JButton("Rojo"));
		
		add(new JButton("Amarillo"));
		
	}
}	
/*Layouts o Disposiciones
 * GridLayout es por cuadricula
 * Border Layout maneja por puntos cardinales
 * FlowLayout Laminas por defectos
 * setLayout*/