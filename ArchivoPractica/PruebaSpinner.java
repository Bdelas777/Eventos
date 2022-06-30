package graficos;

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;

public class PruebaSpinner {

	public static void main(String[] args) {
		
		MarcoSpinner mimarco= new MarcoSpinner();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoSpinner extends JFrame{
	MarcoSpinner(){
		
		setTitle("Prueba Spinner");
		
		setBounds(600,300,600,350);
		
		LaminaSpinner milamina= new LaminaSpinner();
		
		add(milamina);	
		
		setVisible(true);
		
	}
	
}

class LaminaSpinner extends JPanel{
	public LaminaSpinner(){
		
		//String[] lista= GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		JSpinner control= new JSpinner(new SpinnerNumberModel(5,0,10,1) {
			
			public Object getNextValue() {
				
				return super.getPreviousValue();
				
			}
			
			public Object getPreviousValue() {
				
				return super.getNextValue();
				
			}
			
		});
		//basico sin nada y el otro es con SpinnerModel
		//SipinnerDateModel, SpinnerListModel SpinnerNumberModel(formatos especificos)
		//SpinnerNumberModel value min max step
		Dimension dime=new Dimension(200,20);
		
		control.setPreferredSize(dime);
		
		add(control);
		
	}
	//normal
	/*private class MiModeloSpinner extends SpinnerNumberModel{
		
		public MiModeloSpinner() {
			
			super(5,0,10,1);
			
		}
		
		public Object getNextValue() {
			
			return super.getPreviousValue();
			
		}
		
		public Object getPreviousValue() {
			
			return super.getNextValue();
			
		}
		
	}*/
	
	

}