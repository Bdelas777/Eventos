package graficos;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class PruebaDocumento {

	public static void main(String[] args) {
		MarcoEventoTxt mimarco= new MarcoEventoTxt();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoEventoTxt extends JFrame{
	MarcoEventoTxt(){
		setTitle("Prueba con Eventos de Texto");
		
		setBounds(600,300,600,350);
		
		LaminaEventoTxt milamina2= new LaminaEventoTxt();
		
		add(milamina2);	
		
		setVisible(true);
		
	}
	
}

class LaminaEventoTxt extends JPanel{
	public LaminaEventoTxt(){
		
		JTextField campo=new JTextField(20);
		
		EscuchaTexto elevento=new EscuchaTexto();
		
		Document midoc=campo.getDocument();
		
		midoc.addDocumentListener(elevento);
		
		add(campo);
		
	}
	
	private class EscuchaTexto implements DocumentListener{

		public void insertUpdate(DocumentEvent e) {
			
			System.out.println("Has insertado un texto");
			
		}

		public void removeUpdate(DocumentEvent e) {
			
			System.out.println("Has eliminado un texto");
			
		}

		public void changedUpdate(DocumentEvent e) {
		
			
		}
		
	}
			
}

/*getDocument() devuelve un documento que es una representacion del text en el JTextField*/