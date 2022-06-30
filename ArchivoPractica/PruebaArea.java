package graficos;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PruebaArea {

	public static void main(String[] args) {
		
		MarcoPruebaArea mimarco= new MarcoPruebaArea();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
		mimarco.setVisible(true);

	}

}

class MarcoPruebaArea extends JFrame{
	MarcoPruebaArea(){
		setTitle("Ejercicio con Areas");
		
		setBounds(600,300,600,350);
		
		setLayout(new BorderLayout());
		
		laminaBotones=new JPanel();
		
		botoninsetar=new JButton("Insertar");
		
		botoninsetar.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				
				areaTexto.append("En un lugar de la Mancha de cuyo nombre no quiero acordarme");
				
			}
			
		});
		
		laminaBotones.add(botoninsetar);
		
		botonsaltolinea=new JButton("Salto Linea");
		
		botonsaltolinea.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				boolean saltar=!areaTexto.getLineWrap();
				
				areaTexto.setLineWrap(saltar);
				
				/*if(saltar) {
					
					botonsaltolinea.setText("Quitar Salto");
					
				}else {
					
					botonsaltolinea.setText("Salto Linea");
					
				}*/
				//Operador tenario o si verdadero falso
				botonsaltolinea.setText(saltar ? "Quitar Salto" : "Salto Linea");
			}
			
			
		});
		
		laminaBotones.add(botonsaltolinea);
		
		add(laminaBotones,BorderLayout.SOUTH);
		
		areaTexto=new JTextArea(8,20);
		
		laminaconBarras=new JScrollPane(areaTexto);
		
		add(laminaconBarras,BorderLayout.CENTER);
	}
	
	private JPanel laminaBotones;
	
	private JButton botoninsetar;
	
	private JButton botonsaltolinea;
	
	private JTextArea areaTexto;
	
	private JScrollPane laminaconBarras;
	
}