package graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioButton2 {

	public static void main(String[] args) {
		MarcoRadio2 mimarco= new MarcoRadio2();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	}

}

class MarcoRadio2 extends JFrame{
	MarcoRadio2(){
		setTitle("Practica Radio Button");
		
		setBounds(600,300,600,350);
		
		LaminaRadio2 milamina= new LaminaRadio2();
		
		add(milamina);	
		
		setVisible(true);
		
	}
	
}

class LaminaRadio2 extends JPanel{
	public LaminaRadio2(){
			
		setLayout(new BorderLayout());
		
		texto=new JLabel("En un lugar de la mancha de cuyo nombre...");

		texto.setFont(new Font("Serif",Font.PLAIN,12));
		
		add(texto,BorderLayout.CENTER);
		
		laminabotones=new JPanel();
		
		migrupo=new ButtonGroup();
		
		ColocarBotones("Pequeño",false,10);
		
		ColocarBotones("Mediano",true,12);
		
		ColocarBotones("Grande",false,18);
		
		ColocarBotones("Muy Grande",false,24);
		
		add(laminabotones,BorderLayout.SOUTH);
		
	}
	
	public void ColocarBotones(String nombre, boolean seleccionado, final int tamano){
		
		JRadioButton boton= new JRadioButton(nombre,seleccionado);
		
		migrupo.add(boton);
		
		laminabotones.add(boton);
		
		ActionListener mievento= new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {// se pide constante en tamano para que no se pueda
				//modificar
				texto.setFont(new Font("Serif",Font.PLAIN,tamano));
			}
			
		};
		
		boton.addActionListener(mievento);
		
	}
	
	private JLabel texto;
	
	private ButtonGroup migrupo;
	
	private JPanel laminabotones;
}
