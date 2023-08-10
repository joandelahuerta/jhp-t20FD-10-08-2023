import javax.swing.JOptionPane;

public class Ejercicio10 {

	public static void main(String[] args) {
String numeroDeVentasStr = JOptionPane.showInputDialog("Introduce el número de ventas:");
        
        try {
            int numeroDeVentas = Integer.parseInt(numeroDeVentasStr);
            double sumaVentas = 0;

            for (int i = 1; i <= numeroDeVentas; i++) {
                String ventaStr = JOptionPane.showInputDialog("Ingresa el total de ventas de " + i + ":");
                double venta = Double.parseDouble(ventaStr);
                sumaVentas += venta;
            }

            JOptionPane.showMessageDialog(null, "El total es: " + sumaVentas);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor no valido.");
        }
    }

}
