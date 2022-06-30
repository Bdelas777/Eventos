package graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MultiplesOyentes {

	public static void main(String[] args) {
		
		MarcoPrincipal mimarco= new MarcoPrincipal();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
		
	}

}
class MarcoPrincipal extends JFrame{
	public MarcoPrincipal(){
		setTitle("Prueba con Varios Oyentes");
		
		setBounds(0,0,200,200);
		
		LaminaPrincipal milamina2= new LaminaPrincipal();
		
		add(milamina2);	
	
	}
	
}


class LaminaPrincipal extends JPanel{
	public LaminaPrincipal() {
		
		JButton Nuevo=new JButton("Nuevo");
		
		add(Nuevo);
		
	    Cerrar=new JButton("Cerrar Todo");
		
		add(Cerrar);
		
		oyenteNuevo oyente=new oyenteNuevo();
		
		Nuevo.addActionListener(oyente);
		
	}
	
	JButton Cerrar;
	
	private class oyenteNuevo implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			MarcoEmergente NuevoMarco=new MarcoEmergente(Cerrar);
			
			NuevoMarco.setVisible(true);
			
		}
		
	}
}
class MarcoEmergente extends JFrame{
	public MarcoEmergente (JButton botoncierralo) {
		
		contador++;
		
		setTitle("Ventana " + contador);
		
		setBounds( 40*contador, 40*contador, 300, 150);
		
		CierraMarco oyenteCierra=new CierraMarco();
		
		botoncierralo.addActionListener(oyenteCierra);
		
	}
	
	private static int contador=0;
	
	private class CierraMarco implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			//dispose es de Jframe cierra las ventanas marcandolas como invisible 
			dispose();
			
		}
		
	}
	
}