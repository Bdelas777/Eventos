package graficos;

import javax.swing.*;

public class CreandoMarcos {

	public static void main(String[] args) {
		
		miMarco marco1=new miMarco();
		
		marco1.setVisible(true);
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Salida
		
		

	}

}
class miMarco extends JFrame{
	public miMarco() {
		
		//setSize(500,300);
		
		//setLocation(500,300);
		//0,0 no esta en el centro de pantalla sino esquina superior de pantalla
		setBounds(500,300,250,250);//da tamaño y locacion es ubicacion y de ahi tamaño
		
		//setResizable(false);//Permite redimensionar
		
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		setTitle("Ventana");
	}
}
/*Frames: Nacen invisibles  se usa setVisible para que se vean
 * tamaño inutil setSize
 * conviene decir que hacer cuando se cierre*/