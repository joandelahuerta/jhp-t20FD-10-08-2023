import javax.swing.JOptionPane;

public class Ejercicio05 {

	public static void main(String[] args) {
		String numeroTeclado = JOptionPane.showInputDialog("Ingresa un numero:");
        
		try {
            int numero = Integer.parseInt(numeroTeclado);
            
            if (numero % 2 == 0) {
                JOptionPane.showMessageDialog(null, "El número " + numero + " es divisible entre 2.");
            } else {
                JOptionPane.showMessageDialog(null, "El número " + numero + " no es divisible entre 2.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor no compatible.");
        }
	}

}
