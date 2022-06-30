package graficos;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class CreandoMarcoCentrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoCentrado marco1=new MarcoCentrado();
		
		marco1.setVisible(true);
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Salida
		

	}

}
class MarcoCentrado extends JFrame{
	public MarcoCentrado() {
	//Resolucion de pantalla
		Toolkit mipantalla=Toolkit.getDefaultToolkit();
	//Tamaño de la pantalla devuelve objeto dimension
		Dimension tamanoPantalla=mipantalla.getScreenSize();
		
		int alturaPantalla=tamanoPantalla.height;
		
		int anchoPantalla=tamanoPantalla.width;
		
		setSize(anchoPantalla/2,alturaPantalla/2);//width and height
		
		setLocation(anchoPantalla/4,alturaPantalla/4);
		
		setTitle("Marco Centrado");
		//poniendo iconos
		Image miIcono=mipantalla.getImage("src/graficos/icono.gif");
		
		setIconImage(miIcono);
		
	}
}
