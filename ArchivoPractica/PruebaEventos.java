package graficos; 

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaEventos {

	public static void main(String[] args) {
		
		MarcoConBotones mimarco= new MarcoConBotones();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	}

}

class MarcoConBotones extends JFrame{
	MarcoConBotones(){
		setTitle("Prueba con Imagenes");
		
		setBounds(750,300,500,300);
		
		LaminaConBotones milamina2= new LaminaConBotones();
		
		add(milamina2);	
		
	}
	
}


class LaminaConBotones extends JPanel {
	
	JButton BotonAzul=new JButton("Azul");	
	
	JButton BotonAmarillo=new JButton("Amarillo");
	
	JButton BotonRojo=new JButton("Rojo");
	
	public LaminaConBotones() {
		
		add(BotonAzul);
		
		add(BotonAmarillo);
		
		add(BotonRojo);
		
		ColorFondo Amarillo=new ColorFondo(Color.yellow);
		
		ColorFondo Rojo=new ColorFondo(Color.red);
		
		ColorFondo Azul=new ColorFondo(Color.blue);
		
		BotonAzul.addActionListener(Azul);
		
		BotonAmarillo.addActionListener(Amarillo);
		
		BotonRojo.addActionListener(Rojo);
		
	}
	
	/*public void actionPerformed(ActionEvent e) {
		
		Object BotonPulsado=e.getSource();//Metodo de actionevent que nos devuelve el origen del evento
		
		if(BotonPulsado==BotonAzul) {
			
			setBackground(Color.BLUE);
			
		}else if(BotonPulsado==BotonAmarillo) {
			
			setBackground(Color.YELLOW);
			
		}else {
			
			setBackground(Color.RED);
			
		}
	}*/
	private class ColorFondo implements ActionListener{//clase interna
		public ColorFondo(Color c){
			
			ColordeFondo=c;
			
		}
		public void actionPerformed(ActionEvent e) {
			
			setBackground(ColordeFondo);
			
		}
		private Color ColordeFondo;
	}
}

/*Que desencadena la accion objeto evento
* Quien desencadena la accion objeto fuente
* recibe la accion objeto listener*/
