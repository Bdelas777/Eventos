//Clase que nos dice los tipo de letras del usuario
package graficos;

import java.awt.GraphicsEnvironment;

import javax.swing.JOptionPane;

public class PruebasFuentes {
	public static void main(String[] args) {
		
		String Fuente=JOptionPane.showInputDialog("Introduce Fuente");
		
		boolean estalafuente=false;
		
		String [] NombresDeFuentes=GraphicsEnvironment.getLocalGraphicsEnvironment()
				.getAvailableFontFamilyNames();
		
		for(String NombreFuente:NombresDeFuentes) {
			
			if(NombreFuente.equalsIgnoreCase(Fuente)) {
				
				estalafuente=true;
				
			}
			
		}
		
		if(estalafuente) {
			
			System.out.println("Fuente instala");
		}else {
			
			System.out.println("No esta instala");
			
		}
			
	}
}
