package graficos;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MarcoMenu {

	public static void main(String[] args) {

		MenuFrame mimarco= new MenuFrame();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class MenuFrame extends JFrame{
	MenuFrame(){
		setTitle("Prueba Menu");
		
		setBounds(600,300,600,350);
		
		LaminaMenu milamina= new LaminaMenu();
		
		add(milamina);	
		
		setVisible(true);
		
	}
	
}

class LaminaMenu extends JPanel{
	public LaminaMenu(){
		
		JMenuBar barra=new JMenuBar();
		
		JMenu archivo=new JMenu("Archivo");
		
		JMenu edicion=new JMenu("Edicion");
		
		JMenu herramientas=new JMenu("Herramientas");
		
		JMenu opciones=new JMenu("Opciones");
		
		JMenuItem guardar=new JMenuItem("Guardar");
		
		JMenuItem guardarcomo=new JMenuItem("Guardar Como");
		
		JMenuItem cortar=new JMenuItem("Cortar", new ImageIcon("src/graficos/cortar.gif"));
		
		JMenuItem copiar=new JMenuItem("Copiar", new ImageIcon("src/graficos/copiar.gif"));
		//donde aparece el txt de la imagen
		copiar.setHorizontalTextPosition(SwingConstants.LEFT);
		
		JMenuItem pegar=new JMenuItem("Pegar",  new ImageIcon("src/graficos/pegar.gif"));
		
		JMenuItem generales=new JMenuItem("Generales");
		
		JMenuItem opcion1=new JMenuItem("Opcion 1");
		
		JMenuItem opcion2=new JMenuItem("Opcion 2");
		
		opciones.add(opcion1);
		
		opciones.add(opcion2);
		
		archivo.add(guardar);
		
		archivo.add(guardarcomo);
		
		edicion.add(copiar);
		
		edicion.add(cortar);
		
		edicion.add(pegar);
		
		edicion.addSeparator();
		
		edicion.add(opciones);
		
		herramientas.add(generales);
		
		barra.add(archivo);
		
		barra.add(edicion);
		
		barra.add(herramientas);
		
		add(barra);
		
	}
	
}