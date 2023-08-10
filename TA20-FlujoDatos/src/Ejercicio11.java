import javax.swing.JOptionPane;

public class Ejercicio11 {

	public static void main(String[] args) {
		String diaSemana = JOptionPane.showInputDialog("Introduce un día de la semana):");

        switch (diaSemana) {
            case "lunes":
            case "martes":
            case "miércoles":
            case "miercoles":
            case "jueves":
            case "viernes":
                JOptionPane.showMessageDialog(null, "Es un día laboral.");
                break;
            case "sábado":
            case "sabado":
            case "domingo":
                JOptionPane.showMessageDialog(null, "No es un día laboral.");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Dia de la semana no valido.");
        }
    }

}
