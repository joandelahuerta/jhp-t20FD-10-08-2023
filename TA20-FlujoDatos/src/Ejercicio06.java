import javax.swing.JOptionPane;

public class Ejercicio06 {

	public static void main(String[] args) {
		String precioStr = JOptionPane.showInputDialog("Introduce el precio:");
        try {
            double precioProducto = Double.parseDouble(precioStr);
            double precioFinal = precioProducto * (1 + 0.21);
            
            JOptionPane.showMessageDialog(null, "El precio con IVA es: " + precioFinal);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor incorrecto.");
        }
	}
}