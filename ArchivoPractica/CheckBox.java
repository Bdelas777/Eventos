package graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CheckBox {

	public static void main(String[] args) {
		
		MarcoCheckBox mimarco= new MarcoCheckBox();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoCheckBox extends JFrame{
	MarcoCheckBox(){
		setTitle("Prueba con CheckBox");
		
		setBounds(600,300,600,350);
		
		LaminaCheckBox milamina2= new LaminaCheckBox();
		
		add(milamina2);	
		
		setVisible(true);
		
	}
	
}

class LaminaCheckBox extends JPanel{
	public LaminaCheckBox(){
		
		setLayout(new BorderLayout());
		
		Font letra= new Font("Serif",Font.PLAIN,24);
		
		texto=new JLabel("En un lugar de la mancha de cuyo nombre...");
		
		texto.setFont(letra);//establece tipo de letra objeto tipo font
		
		JPanel laminatexto=new JPanel();
		
		laminatexto.add(texto);
		
		add(laminatexto,BorderLayout.CENTER);
		
		checa1= new JCheckBox("Negrita");
		
		checa2= new JCheckBox("Cursiva");
		
		checa1.addActionListener(new ManejaChecks());
		
		checa2.addActionListener(new ManejaChecks());
		
		JPanel laminaChecks=new JPanel();
		
		laminaChecks.add(checa1);
		
		laminaChecks.add(checa2);
		
		add(laminaChecks,BorderLayout.SOUTH);

	}
	
	private class ManejaChecks implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			int tipo=0;
			
			if(checa1.isSelected()) tipo+=Font.BOLD;
			
			if(checa2.isSelected()) tipo+=Font.ITALIC;
			
			texto.setFont(new Font("Serif",tipo,24));
			
		}
		
	}
	
	private JLabel texto;
	
	private JCheckBox checa1,checa2;
	
}