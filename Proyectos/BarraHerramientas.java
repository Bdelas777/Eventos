package graficos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JToolBar;


public class BarraHerramientas {

	public static void main(String[] args) {
		
		MarcoBarra mimarco= new MarcoBarra();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoBarra extends JFrame{
	MarcoBarra(){
		
		setTitle("Prueba Barras");
		
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		lamina=new JPanel();
		
		add(lamina);
		
		Action AccionAmarillo= new AccionColor("Amarillo", new ImageIcon("src/graficos/amarillo.gif"),
				Color.yellow);
		
		Action AccionAzul= new AccionColor("Azul", new ImageIcon("src/graficos/azul.gif"),Color.blue);
		
		Action AccionRojo= new AccionColor("Rojo", new ImageIcon("src/graficos/rojo.gif"),Color.red);
		
		Action AccionSalir= new AbstractAction("Salir", new ImageIcon("src/graficos/coche.png")) {

			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
				
			}
			
		};
		
		JMenu menu=new JMenu("Color");
		
		menu.add(AccionAmarillo);
		
		menu.add(AccionAzul);
		
		menu.add(AccionRojo);
		
		JMenuBar barramenu=new JMenuBar();
		
		barramenu.add(menu);
		
		setJMenuBar(barramenu);//construye una barra en un menu
		//COnstruccion barra de herramientas
		JToolBar barra=new JToolBar();
		
		barra.add(AccionAmarillo);
		
		barra.add(AccionAzul);
		
		barra.add(AccionRojo);
		
		barra.addSeparator();
		
		barra.add(AccionSalir);
		
		add(barra, BorderLayout.NORTH);//te deja colocar donde quieras
		
	}
	
	private class AccionColor extends AbstractAction{
			
		public AccionColor(String nombre, Icon icono,Color color_boton){
				
			putValue(Action.NAME,nombre);
				
			putValue(Action.SMALL_ICON,icono);
				
			putValue(Action.SHORT_DESCRIPTION,"Poner la lamina de color "+ nombre);
				
			putValue("Color de Fondo", color_boton);
				
		}
			
		public void actionPerformed(ActionEvent e) {
				
			Color color=(Color)getValue("Color de Fondo");
				
			lamina.setBackground(color);
				
			System.out.println("Nombre: "+ getValue(Action.NAME)+ "  Descripcion: "+ 
					getValue(Action.SHORT_DESCRIPTION) );
		}	
		
	}	
	
	private JPanel lamina;
}
