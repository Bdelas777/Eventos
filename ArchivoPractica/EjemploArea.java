package graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class EjemploArea {

	public static void main(String[] args) {
		MarcoArea mimarco= new MarcoArea();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
class MarcoArea extends JFrame{
	MarcoArea(){
		setTitle("Prueba con Areas");
		
		setBounds(600,300,600,350);
		
		LaminaArea milamina2= new LaminaArea();
		
		add(milamina2);	
		
		setVisible(true);
		
	}
	
}

class LaminaArea extends JPanel{
	public LaminaArea(){
		//rows columns
		miarea=new JTextArea(8,20);
		
		JScrollPane laminaBarras= new JScrollPane(miarea);//con barra de desplazamiento
		
		//miarea.setLineWrap(true);//pone saltos de linea
		
		add(laminaBarras);
		
		JButton miboton= new JButton("presiona");
		
		miboton.addActionListener(new GestionaArea());
		
		add(miboton);
	}
	private class GestionaArea implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			System.out.println(miarea.getText());
			
		}
		
	}
	private JTextArea miarea;
}
		
/*setLineWrap establece si hay saltos de linea
 * getlineWrap nos dice si el area tienes saltos de linea*/