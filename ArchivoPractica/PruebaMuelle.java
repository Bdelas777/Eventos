package graficos;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Spring;
import javax.swing.SpringLayout;

public class PruebaMuelle {

	public static void main(String[] args) {

		MarcoMuelle mimarco= new MarcoMuelle();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);

	}

}
class MarcoMuelle extends JFrame{
	public MarcoMuelle(){
		setTitle("Prueba con Muelle");
		
		setBounds(200,200,1000,500);
		
		LaminaMuelle milamina= new LaminaMuelle();
		
		add(milamina);	
	
	}
	
}


class LaminaMuelle extends JPanel{
	public LaminaMuelle() {
		
		JButton boton1= new JButton ("Boton 1");
		
		JButton boton2= new JButton ("Boton 2");
		
		JButton boton3= new JButton ("Boton 3");
		
		SpringLayout milayout= new SpringLayout();
		
		setLayout(milayout);
		
		add(boton1);
		
		add(boton2);
		
		add(boton3);
		
		Spring mimuelle=Spring.constant(0,10,100);//min,pref,max
		
		Spring muellerigido=Spring.constant(80);
		//donde comienza el muelle,componente,muelle,donde va y  cotenedor
		milayout.putConstraint(SpringLayout.WEST,boton1,mimuelle,SpringLayout.WEST,this);
		// donde inicia donde acaba
		milayout.putConstraint(SpringLayout.WEST,boton2,muellerigido,SpringLayout.EAST,boton1);
		
		milayout.putConstraint(SpringLayout.WEST,boton3,muellerigido,SpringLayout.EAST,boton2);
		
		milayout.putConstraint(SpringLayout.EAST,this,mimuelle,SpringLayout.EAST,boton3);
	
	}

}