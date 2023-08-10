import javax.swing.JOptionPane;

public class Ejercicio12 {

	public static void main(String[] args) {
		String contrase�aCorrecta = "bootcamp";
        int intentosRestantes = 3;

        while (intentosRestantes > 0) {
            String contrase�aIngresada = JOptionPane.showInputDialog("Introduce la contrase�a:");
            
            if (contrase�aIngresada.equals(contrase�aCorrecta)) {
                JOptionPane.showMessageDialog(null, "�Enhorabuena!");
                break;  // Sale del bucle si la contrase�a es correcta
            } else {
                intentosRestantes--;
                JOptionPane.showMessageDialog(null, "Contrase�a incorrecta. Intentos restantes: " + intentosRestantes);
            }
        }

        if (intentosRestantes == 0) {
            JOptionPane.showMessageDialog(null, "Acceso denegado.");
        }
    }

}
