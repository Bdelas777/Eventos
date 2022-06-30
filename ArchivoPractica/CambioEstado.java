package graficos;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;

public class CambioEstado {

	public static void main(String[] args) {
		
		MarcoEstado mimarco= new MarcoEstado();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Programa finaliza exit on close

	}

}
class MarcoEstado extends JFrame{
	MarcoEstado(){
		setVisible(true);
		
		setTitle("Prueba con Cambio Estado");
		
		setBounds(300,300,500,300);
		
		CambiaEstado newstate= new CambiaEstado();
		
		addWindowStateListener(newstate);
	}
	
}

class CambiaEstado implements WindowStateListener{
	
	public void windowStateChanged(WindowEvent e) {
		
		//System.out.println("Ventana a cambiado de estado");
		
		//System.out.println(e.getOldState());
		
		//System.out.println(e.getNewState());
		
		if(e.getNewState()==Frame.MAXIMIZED_BOTH) {
			
			System.out.println("Esta a pantalla completa");
			
		}else if(e.getNewState()==Frame.NORMAL){
			
			System.out.println("Esta a pantalla esta normal");
			
		}else if(e.getNewState()==Frame.ICONIFIED){
			
			System.out.println("Esta a pantalla esta minimizada");
			
		}
	}

}
//Los numeros son constantes de clases que nos devueven los metodos checa la api
// o normal maximizar 6 minizo 1