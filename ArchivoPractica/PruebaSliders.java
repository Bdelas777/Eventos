package graficos;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class PruebaSliders {
	public static void main(String[] args) {

		MarcoSliders mimarco= new MarcoSliders();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}

class MarcoSliders extends JFrame{
	MarcoSliders(){
		setTitle("Prueba Sliders");
		
		setBounds(600,300,600,350);
		
		LaminaSliders milamina= new LaminaSliders();
		
		add(milamina);	
		
		setVisible(true);
		
	}
	
}

class LaminaSliders extends JPanel{
	public LaminaSliders(){
		
		/*JSlider control= new JSlider(0,100,50);//min,max,value(donde aparece), SwingConstants para orientacion
		Ejemplos de uso
		//control.setOrientation(SwingConstants.VERTICAL);// cambio de orientacion
		
		control.setMajorTickSpacing(50);//son las lineas grandes de la egla
		
		control.setMinorTickSpacing(25);//lineas chicas
		
		control.setPaintTicks(true);//dice q pinte las lineas
		
		control.setFont(new Font("Serif",Font.ITALIC,12));
		
		control.setPaintLabels(true);//rotulos
		
		//control.setSnapToTicks(true);// que funcionen como iman
		
		add(control);*/
		
		setLayout(new BorderLayout());
		
		rotulo=new JLabel("En un lugar de la mancha de cuyo nombre...");
		
		add(rotulo,BorderLayout.CENTER);
		
		control= new JSlider(8,50,12);
		
		control.setMajorTickSpacing(20);
		
		control.setMinorTickSpacing(5);
		
		control.setPaintTicks(true);
		
		control.setPaintLabels(true);
		
		control.setFont(new Font("Serif",Font.ITALIC,10));
		
		JPanel laminaSlider=new JPanel();
		
		control.addChangeListener(new TomaElemento());
		
		laminaSlider.add(control);	
		
		add(laminaSlider,BorderLayout.NORTH);
	}
	private class TomaElemento implements ChangeListener{

		public void stateChanged(ChangeEvent e) {
			
			/*contador++;
			
			System.out.println("Esta manipulado el slider y esta es tu vez: " +contador+
					" Es el valor: "+ control.getValue());*/
			
			rotulo.setFont(new Font("Serif",Font.ITALIC,control.getValue()));
			
		}
		
	}
	private JLabel rotulo;
	
	private JSlider control;
	
	//private static int contador;
}
/*setpaintticks salgan lineas de division
 * setpaintlabels se impriman los valores numeros
 * setmajortickspacing marcas mayores
 * setminortickspacing marcas menores ambas nos dicen de cuanto en cuanto van las barras
 * addchangelistener evento que cambia todo*/