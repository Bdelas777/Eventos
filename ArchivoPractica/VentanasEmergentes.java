package graficos;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

public class VentanasEmergentes {

	public static void main(String[] args) {

		MenuVentana mimarco= new MenuVentana();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MenuVentana extends JFrame{
	MenuVentana(){
		setTitle("Prueba Ventanas emergentes");
		
		setBounds(600,300,600,350);
		
		LaminaVentana milamina= new LaminaVentana();
		
		add(milamina);	
		
		setVisible(true);
		
	}
	
}

class LaminaVentana extends JPanel{
	public LaminaVentana(){
		
		JPopupMenu emergente= new JPopupMenu();
		
		JMenuItem opcion1= new JMenuItem("Opcion 1");
		
		JMenuItem opcion2= new JMenuItem("Opcion 2");
		
		JMenuItem opcion3= new JMenuItem("Opcion 3");
		
		emergente.add(opcion1);
		
		emergente.add(opcion2);
		
		emergente.add(opcion3);
		
		setComponentPopupMenu(emergente);
	}
	
}