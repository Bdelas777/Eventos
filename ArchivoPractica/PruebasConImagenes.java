package graficos;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebasConImagenes {
	public static void main(String[] args) {
		MarcoConImagen mimarco= new MarcoConImagen();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}

class MarcoConImagen extends JFrame{
	MarcoConImagen(){
		setTitle("Prueba con Imagenes");
		
		setBounds(750,300,300,200);
		
		LaminaConImagen milamina2= new LaminaConImagen();
		
		add(milamina2);	
		
	}
	
}


class LaminaConImagen extends JPanel{
	public LaminaConImagen() {
		try {
			imagen=ImageIO.read(new File("src/graficos/bola.gif"));
		}
		catch(IOException e) {
			System.out.println("Imagen no se encuentra");
		}
	}
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		//File miimagen= new File("src/graficos/bola.gif");
		
		int AnchoImagen=imagen.getWidth(this);//Objeto que espera que sea cargado
				
		int AlturaImagen=imagen.getHeight(this);
		
		g.drawImage(imagen, 0, 0, null);
		//imagen x y y objeto modificado o objeto que informa el proceso de la imagen
		for(int i=0;i<300;i++) {
			for(int j=0;j<200;j++) {
				
				if(i+j>0) {
					g.copyArea(0, 0, AnchoImagen, AlturaImagen, AnchoImagen*i,AlturaImagen*j);
				}
				
			}
		}
		
	}	
	
	private Image imagen;
}

/*Que desencadena la accion objeto evento
 * Quien desencadena la accion objeto fuente
 * recibe la accion objeto listener*/