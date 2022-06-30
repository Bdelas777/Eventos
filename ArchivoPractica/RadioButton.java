package graficos;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioButton {

	public static void main(String[] args) {
		
		MarcoRadio mimarco= new MarcoRadio();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoRadio extends JFrame{
	MarcoRadio(){
		setTitle("Prueba con CheckBox");
		
		setBounds(600,300,600,350);
		
		LaminaRadio milamina2= new LaminaRadio();
		
		add(milamina2);	
		
		setVisible(true);
		
	}
	
}

class LaminaRadio extends JPanel{
	public LaminaRadio(){
			
		ButtonGroup grupo1=new ButtonGroup();//solo deja tener uno seleccionado
		
		ButtonGroup grupo2=new ButtonGroup();
		
		JRadioButton boton1=new JRadioButton("Azul",false);//txt, false (no esta seleccionado)
		
		JRadioButton boton2=new JRadioButton("Rojo",true);
		
		JRadioButton boton3=new JRadioButton("Verde",false);
		
		JRadioButton boton4=new JRadioButton("Masculino",false);
		
		JRadioButton boton5=new JRadioButton("Femenino",false);
		
		grupo1.add(boton1);
		
		grupo1.add(boton2);
		
		grupo1.add(boton3);
		
		grupo2.add(boton4);
		
		grupo2.add(boton5);
		
		add(boton1);
		
		add(boton2);
		
		add(boton3);
		
		add(boton4);
		
		add(boton5);
		
	}
	

}
