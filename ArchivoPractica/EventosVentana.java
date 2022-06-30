package graficos;

import java.awt.event.WindowAdapter;

import javax.swing.JFrame;


public class EventosVentana {

	public static void main(String[] args) {
		
		MarcoConVentana mimarco= new MarcoConVentana();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Programa finaliza exit on close
		
		MarcoConVentana mimarco2= new MarcoConVentana();
		
		mimarco2.setVisible(true);
		
		mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		mimarco.setTitle("Ventana 1");
		
		mimarco2.setTitle("Ventana 2");
		
		mimarco.setBounds(300,300,500,350);
		
		mimarco2.setBounds(800,300,500,350);
	}

}
class MarcoConVentana extends JFrame{
	MarcoConVentana(){
		//setTitle("Prueba con Ventana");
		
		//setBounds(750,300,500,300);
		
		//M_Ventana oyente=new M_Ventana();
		
		addWindowListener(new M_Ventana());
		
	}
	
}


class M_Ventana extends WindowAdapter{
	
	/*public void windowActivated(WindowEvent e) {
		System.out.println("Ventana Activada");
	}
	
	public void windowClosed(WindowEvent e) {
		System.out.println("La venta ha sido cerrada");
	}
	
	public void windowClosing(WindowEvent e) {
		System.out.println("Cerrando Ventana");
	}
	
	public void windowDeactivated(WindowEvent e) {
		System.out.println("Ventana Desactivada");
	}
	
	public void windowIconified(WindowEvent e) {
		System.out.println("Ventana minimizada ");	
	}
	
	public void windowDeiconified(WindowEvent e) {	
		System.out.println("Ventana Restaurada ");	
	}
	
	public void windowOpened(WindowEvent e) {	
		System.out.println("Ventana Abierta ");	
	}*/
	
}

/*WindowListener eventos de ventana te obliga a construir 7 metodos per hay otra solucion elegante
 * clases adapatadoras: Son las que tienen los metodos de las interfaces y no escribas todos solo los 
 * que ocupas */
