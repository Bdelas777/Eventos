package graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class PruebaAcciones {

	public static void main(String[] args) {
		
		MarcoAcciones mimarco= new MarcoAcciones();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoAcciones extends JFrame{
	MarcoAcciones(){
		
		setTitle("Prueba Acciones");
		
		//setBounds(300,300,500,300);
		
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		add(new PanelAccion());
		
		setVisible(true);
		
	}
	
}

class PanelAccion extends JPanel{
	
	public PanelAccion() {
		
		AccionColor AccionAmarillo= new AccionColor("Amarillo", new ImageIcon("src/graficos/amarillo.gif"),
				Color.yellow);
		
		AccionColor AccionAzul= new AccionColor("Azul", new ImageIcon("src/graficos/azul.gif"),
				Color.blue);
		
		AccionColor AccionRojo= new AccionColor("Rojo", new ImageIcon("src/graficos/rojo.gif"),
				Color.red);
		
		add(new JButton(AccionAzul));
		
		add(new JButton(AccionAmarillo));
		
		add(new JButton(AccionRojo));
		//ejemplos
		//1-Mapa de entrada y Metodo devuelve un objeto InputMap y de entrada recibe una condicion
		InputMap mapaEntrada=getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);//como quieres modificar
		// when focused objeto que tiene el foco, la que usas este boton esta en el 
		//objeto que tiene el foco y ancestor objeto contenido en el foco
		//2-Crear combinacion de teclas
		KeyStroke teclaAmarillo=KeyStroke.getKeyStroke("ctrl A");//modificardor letra
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl B"), "Fondo Azul");
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl R"), "Fondo Rojo");
		//3- Asignar la combinacion de teclas a un objeto
		mapaEntrada.put(teclaAmarillo, "Fondo Amarillo");//KeyStroke y nombre
		//4- Asignar un objeto a accion
		ActionMap mapaAccion=getActionMap();
		
		mapaAccion.put("Fondo Amarillo", AccionAmarillo);//nombre y accion
		mapaAccion.put("Fondo Azul", AccionAzul);
		mapaAccion.put("Fondo Rojo", AccionRojo);
		
	}
	
	private class AccionColor extends AbstractAction{
		
		public AccionColor(String nombre, Icon icono,Color color_boton){
			
			putValue(Action.NAME,nombre);
			
			putValue(Action.SMALL_ICON,icono);
			
			putValue(Action.SHORT_DESCRIPTION,"Poner la lamina de color "+ nombre);
			
			putValue("Color de Fondo", color_boton);
			
		}
		
		public void actionPerformed(ActionEvent e) {
			
			Color c=(Color)getValue("Color de Fondo");
			
			setBackground(c);//Jpanel
			
			System.out.println("Nombre: "+ getValue(Action.NAME)+ "  Descripcion: "+ 
					getValue(Action.SHORT_DESCRIPTION) );
		}	
	
	}	
}

/* * Metodos de clase action
 *setEnabled:nos permite poner activo un objeto evento
 *isEnable nos dice si esta activado o no
 *addPropertyChangedListed(oyente cambiada): agregar propiedades al objeto oyente
 *removePropertyChangedListed(mismo parametro)  Eliminar propiedades al objeto oyente*
 *putValue almacena parejas de clave y valor
 *getValue recupera la informacion almacenada en el evento mediante la clave
 *
 *Teclas:
 *1- mapa de entrada: es decir que objeto tiene le foco
 *2- Crear combinacion de teclas
 *3- Asignar la combinacion de teclas a un objeto
 *4- Asignar un objeto a accion*/