package graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TiposCuadrosDialogo {

	public static void main(String[] args) {

		MarcoCuadro mimarco= new MarcoCuadro();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
		

	}

}

class MarcoCuadro extends JFrame{
	public MarcoCuadro(){
		setTitle("Prueba de Cuado de Dialogo");
		
		setBounds(500,300,400,250);
		
		add(new LaminaCuadros());	
	
	}
	
}


class LaminaCuadros extends JPanel {
	
	public LaminaCuadros() {
		
		boton1=new JButton("Boton 1");
		
		boton2=new JButton("Boton 2");
		
		boton3=new JButton("Boton 3");
		
		boton4=new JButton("Boton 4");
		
		boton1.addActionListener(new AccionBotones());
		
		boton2.addActionListener(new AccionBotones());
		
		boton3.addActionListener(new AccionBotones());
		
		boton4.addActionListener(new AccionBotones());
		
		add(boton1);
		
		add(boton2);
		
		add(boton3);
		
		add(boton4);
	}
	private class AccionBotones implements  ActionListener{

	
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource()==boton1) {
				
				//System.out.println("Has presionado el boton 1");
				
				//JOptionPane.showMessageDialog(LaminaCuadros.this,"Mensaje de prueba" );
				//componente padre y string
				JOptionPane.showMessageDialog(LaminaCuadros.this,"Mensaje de prueba","Advertencia",2 );
				//Mismo , titulo y tipo de mensaje(el icono que pone)
			} else if(e.getSource()==boton2) {
				
				//System.out.println("Has presionado el boton 2");
				
				JOptionPane.showInputDialog(LaminaCuadros.this,"Mete la informacion",
						"Introducción datos",1);
				
			}else if(e.getSource()==boton3) {
				
				//System.out.println("Has presionado el boton 3");
				
				JOptionPane.showConfirmDialog(LaminaCuadros.this, "Elige Opcion"
						,"Confirmar", 2);//la ultima es el tipo de opcion
			
			}else if(e.getSource()==boton4) {
				
				//System.out.println("Has presionado el boton 4");
				// despues del titulo son opciones de dialogo, el siguiente es el icono,icon tuyo,
				//array objetos y val inicial
				JOptionPane.showOptionDialog(LaminaCuadros.this, "Elige", "Ventana de Opciones", 1, 1, null
						, null, null);
			}
			
		}
		
	}
	
	JButton boton1,boton2,boton3,boton4;

}

	