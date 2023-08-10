import javax.swing.JOptionPane;

public class Ejercicio13 {

	public static void main(String[] args) {
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el 1 número:"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el 2 número:"));
        String signo = JOptionPane.showInputDialog("Introduce que operacion quieres (+, -, *, /, ^, %):");

        double resultado = 0;
        
        switch (signo) {
            case "+":
                resultado = numero1 + numero2;
                break;
            case "-":
                resultado = numero1 - numero2;
                break;
            case "*":
                resultado = numero1 * numero2;
                break;
            case "/":
                resultado = numero1 / numero2;
                break;
            case "^":
                resultado = Math.pow(numero1, numero2);
                break;
            case "%":
                resultado = numero1 % numero2;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Signo incorrecto.");
                System.exit(0);
        }
        
        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
    }

}
