package graficos;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Calculadora {

	public static void main(String[] args) {
	
		MarcoCalculadora mimarco= new MarcoCalculadora();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
		
	}

}

class MarcoCalculadora extends JFrame{
	
	public MarcoCalculadora() {
		
		setTitle("Calculadora con Java");
	
		//setBounds(500,300,450,300);
		
		LaminaCalculadora lamina= new LaminaCalculadora();
		
		add(lamina);
		
		pack();//se adapta al tamano por defecto
	}
		
	
}

class LaminaCalculadora extends JPanel{
	
	public LaminaCalculadora() {
		
		setLayout(new BorderLayout());
		
		pantalla=new JButton("0");
		
		add(pantalla,BorderLayout.NORTH);
		
		pantalla.setEnabled(false);
		
		lamina2= new JPanel();//NUeva lamina
		
		lamina2.setLayout(new GridLayout(4,4));
		
		add(lamina2,BorderLayout.CENTER);
		
		ActionListener Insertar= new InsertaNumero();
		
		ActionListener orden=new AccionOrden();
		
		set_boton("7",Insertar);//ordena por filas
		
		set_boton("8",Insertar);
		
		set_boton("9",Insertar);
		
		set_boton("/",orden);
		
		set_boton("4",Insertar);
		
		set_boton("5",Insertar);
		
		set_boton("6",Insertar);
		
		set_boton("*",orden);
		
		set_boton("1",Insertar);
		
		set_boton("2",Insertar);
		
		set_boton("3",Insertar);
		
		set_boton("-",orden);
		
		set_boton("0",Insertar);
		
		set_boton(".",Insertar);
		
		set_boton("=",orden);
		
		set_boton("+",orden);
		
	}
	
	private void set_boton(String rotulo, ActionListener oyente) {
		
		JButton boton= new JButton(rotulo);
		
		boton.addActionListener(oyente);
		
		lamina2.add(boton);
		
		
		
	}
	private class InsertaNumero implements ActionListener{

		public void actionPerformed(ActionEvent e) {
		
			String entrada=e.getActionCommand();//devuelve al string asociado a la accion
			
			if (principio){
				
				pantalla.setText("");
				
				principio=false;
			}
			pantalla.setText(pantalla.getText()+entrada);
		}
		
	}
	
	private class AccionOrden implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			String operacion=e.getActionCommand();
			
			ultimaOperacion=operacion;
			
			calcular(Double.parseDouble(pantalla.getText()));
			
			principio=true;
		}
		
	}
	
	public void calcular(double x) {
		if (ultimaOperacion.equals("+")) {
			
			resultado+=x;
			
		}else if (ultimaOperacion.equals("-")) {
			
			resultado-=x;
			
		}else if (ultimaOperacion.equals("*")) {
			
			resultado*=x;
			
		}else if (ultimaOperacion.equals("/")) {
			
			resultado/=x;
			
		}else if (ultimaOperacion.equals("=")) {
			
			resultado=x;
			
		}
		pantalla.setText(""+resultado);
	}
	private JPanel lamina2; 
	
	private JButton pantalla;
	
	private boolean principio=true;
	
	private double resultado;
	
	private String ultimaOperacion;
	
}
