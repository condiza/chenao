/*7. Realiza un algoritmo donde se simule un diccionario simple. Crea un HashMap o HashTable donde las claves sean palabras en inglés y los valores sean las traducciones al español. Permite al usuario ingresar una palabra en inglés y muestra su traducción en español si está en el diccionario.*/
import java.util.Hashtable;

import javax.swing.JOptionPane;


public class palabras {
	public static void main(String[] args) {
		palabras diccionario=new palabras();
		diccionario.palabrasEnDiccionario();
		
		String palabraEnIngles=JOptionPane.showInputDialog("Ingrese una palbra en ingles");
		String traducida=diccionario.traduccion(palabraEnIngles);
		
		if (traducida != null) {
			JOptionPane.showMessageDialog(null, "Palabra encontrada: "+palabraEnIngles+" y su traduccion es: "+traducida);
		} else {
			JOptionPane.showMessageDialog(null, "Palabra no encontrada");
		}
		
		
	}
	private Hashtable<String, String> diccionario = new Hashtable<String, String>();
	
	public void palabrasEnDiccionario() {
	    diccionario.put("Hello", "Hola");
	    diccionario.put("Sorry", "Perdon");
	    diccionario.put("Love", "Amor");
	}
	
	public String traduccion(String palabraEnIngles) {
		return diccionario.get(palabraEnIngles);
	}
}
