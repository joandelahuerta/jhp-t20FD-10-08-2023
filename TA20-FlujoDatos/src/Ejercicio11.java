import javax.swing.JOptionPane;

public class Ejercicio11 {

	public static void main(String[] args) {
		String diaSemana = JOptionPane.showInputDialog("Introduce un d�a de la semana):");

        switch (diaSemana) {
            case "lunes":
            case "martes":
            case "mi�rcoles":
            case "miercoles":
            case "jueves":
            case "viernes":
                JOptionPane.showMessageDialog(null, "Es un d�a laboral.");
                break;
            case "s�bado":
            case "sabado":
            case "domingo":
                JOptionPane.showMessageDialog(null, "No es un d�a laboral.");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Dia de la semana no valido.");
        }
    }

}
