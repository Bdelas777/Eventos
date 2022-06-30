package graficos;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PruebaLibre {

	public static void main(String[] args) {

		MarcoLibre mimarco= new MarcoLibre();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
		
	}

}

class MarcoLibre extends JFrame{
	public MarcoLibre(){
		setTitle("Prueba con Libre");
		
		setBounds(450,150,600,400);
		
		LaminaLibre milamina= new LaminaLibre();
		
		add(milamina);	
	
	}
	
}


class LaminaLibre extends JPanel {
	
	public LaminaLibre() {
		
		setLayout(new EnColumnas());//Disposicion libre
		
		JLabel nombre=new JLabel("Nombre: ");
		
		JTextField cnombre=new JTextField();
		
		JLabel apellido=new JLabel("Apellido: ");
		
		JTextField capellido=new JTextField();
		
		JLabel edad=new JLabel("Edad: ");
		
		JTextField cedad=new JTextField();
		
		/*nombre.setBounds(20,20,80,10);
		cnombre.setBounds(100,20,100,20);
		apellido.setBounds(20,60,80,15);
		capellido.setBounds(100,60,100,20);*/
		add(nombre);
		
		add(cnombre);
		
		add(apellido);
		
		add(capellido);
		
		add(edad);
		
		add(cedad);
		
	}

}

	class EnColumnas implements LayoutManager{
		
		public void addLayoutComponent(String name, Component comp) {
			
			
		}

		public void removeLayoutComponent(Component comp) {
			
			
		}

		public Dimension preferredLayoutSize(Container parent) {
			
			return null;
		}


		public Dimension minimumLayoutSize(Container parent) {
			
			return null;
		}

		
		public void layoutContainer(Container parent) {
			//establece el contenedor especificado
			int d=parent.getWidth();
			
			x=d/2;
			
			int contador=0;
			
			int n=parent.getComponentCount();
			
			for(int i=0; i<n;i++) {
				
				contador++;
				//Ubicacion de un elemento en concreto
				Component c=parent.getComponent(i);
				
				c.setBounds(x-100,y,100,20);
				
				x+=100;
				
				if(contador%2==0) {
					
					x=d/2;
					
					y+=40;
					
				}
				
			}
			
		}
		private int x;
		
		private int y=20;
	}

/*LayoutManager interfaz que sobreescribe la disposiciones para reutilizar cuando quieras*/