import javax.swing.JOptionPane;

public class Ejercicio04 {

	public static void main(String[] args) {
	        String radioStr = JOptionPane.showInputDialog("Introduce el radio del círculo:");
	        
	        try {
	            double radio = Double.parseDouble(radioStr);
	            double area = Math.PI * Math.pow(radio, 2);
	            
	            JOptionPane.showMessageDialog(null, "El área del círculo es: " + area);
	        } catch (NumberFormatException e) {
	            JOptionPane.showMessageDialog(null, "Valor no valido.");
	        }
	    }

}
