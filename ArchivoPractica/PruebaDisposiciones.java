package graficos;

import java.awt.BorderLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PruebaDisposiciones {

	public static void main(String[] args) {
		
		MarcoCaja mimarco= new MarcoCaja();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);

	}

}

class MarcoCaja extends JFrame{
	public MarcoCaja(){
		setTitle("Prueba con Caja");
		
		setBounds(600,150,200,200);
		
		JLabel rotulo1=new JLabel("Nombre:");
		
		JTextField texto1=new JTextField(10);
		
		texto1.setMaximumSize(texto1.getPreferredSize());

		Box cajah1=Box.createHorizontalBox();
		
		cajah1.add(rotulo1);
		
		cajah1.add(Box.createHorizontalStrut(10));
		
		cajah1.add(texto1);
		
		JLabel rotulo2=new JLabel("Contraseña:");
		
		JTextField texto2=new JTextField(10);
		
		texto2.setMaximumSize(texto2.getPreferredSize());
		
		Box cajah2=Box.createHorizontalBox();
		
		cajah2.add(rotulo2);
		
		cajah2.add(Box.createHorizontalStrut(10));
		
		cajah2.add(texto2);
		
		JButton boton1= new JButton("OK");
		
		JButton boton2= new JButton("Cancelar");
		
		Box cajah3=Box.createHorizontalBox();
		
		cajah3.add(boton1);
		
		cajah3.add(Box.createGlue());// crea un espacio entre los componentes
		
		cajah3.add(boton2);
		
		Box cajav=Box.createVerticalBox();
		
		cajav.add(cajah1);
		
		cajav.add(cajah2);
		
		cajav.add(cajah3);
		
		add(cajav, BorderLayout.CENTER);
		
		
	}
	
	
	
}

//disposicion en muella clase spring elasticidad,compresion rebote