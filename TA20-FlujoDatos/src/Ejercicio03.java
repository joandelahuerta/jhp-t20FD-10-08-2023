import javax.swing.JOptionPane;

public class Ejercicio03 {

	public static void main(String[] args) {
		String nombre = JOptionPane.showInputDialog("Ingresa tu nombre:");
        
        if (nombre != null && !nombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Bienvenido, " + nombre + "!");
        } else {
            JOptionPane.showMessageDialog(null, "Nombre no valido.");
        }
	}
}