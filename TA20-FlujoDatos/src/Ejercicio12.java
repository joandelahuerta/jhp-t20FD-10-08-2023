import javax.swing.JOptionPane;

public class Ejercicio12 {

	public static void main(String[] args) {
		String contraseñaCorrecta = "bootcamp";
        int intentosRestantes = 3;

        while (intentosRestantes > 0) {
            String contraseñaIngresada = JOptionPane.showInputDialog("Introduce la contraseña:");
            
            if (contraseñaIngresada.equals(contraseñaCorrecta)) {
                JOptionPane.showMessageDialog(null, "¡Enhorabuena!");
                break;  // Sale del bucle si la contraseña es correcta
            } else {
                intentosRestantes--;
                JOptionPane.showMessageDialog(null, "Contraseña incorrecta. Intentos restantes: " + intentosRestantes);
            }
        }

        if (intentosRestantes == 0) {
            JOptionPane.showMessageDialog(null, "Acceso denegado.");
        }
    }

}
