package graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class PruebaCombo {

	public static void main(String[] args) {

		MarcoCombo mimarco= new MarcoCombo();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoCombo extends JFrame{
	MarcoCombo(){
		setTitle("Prueba ComboBox");
		
		setBounds(600,300,600,350);
		
		LaminaCombo milamina= new LaminaCombo();
		
		add(milamina);	
		
		setVisible(true);
		
	}
	
}

class LaminaCombo extends JPanel{
	public LaminaCombo(){
			
		setLayout(new BorderLayout());
		
		texto=new JLabel("En un lugar de la mancha de cuyo nombre..."); 
		
		texto.setFont(new Font("Serif",Font.PLAIN,18));
		
		add(texto,BorderLayout.CENTER);
		
		JPanel laminaNorte= new JPanel();
		
		micombo=new JComboBox();
		
		micombo.setEditable(true);// se pueda editar
		
		micombo.addItem("Serif");//agregar elementos a desplegable
		
		micombo.addItem("SansSerif");
		
		micombo.addItem("Monospaced");
		
		micombo.addItem("Dialog");
		
		micombo.addActionListener( new Cambialetra());
		
		laminaNorte.add(micombo);
		
		add(laminaNorte,BorderLayout.NORTH);
		
		
	}
	private class Cambialetra implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			texto.setFont(new Font((String)micombo.getSelectedItem(),Font.PLAIN,18));
			
		} 
		
	}
	private JLabel texto;
	
	private JComboBox micombo;
}

 