
public class Condicional4 {
	public static void main(String[] args) {
		double number = 55;
		
		//If-Else-If
		if (number > 0) {
            System.out.println("¡Es positivo!");
        } else if (number < 0) {
            System.out.println("¡Es negativo!");
        } else {
            System.out.println("¡Es cero, ná de ná");
        }
		
		// Operación ternaria
		String mensaje = (number > 0) ? "¡Es positivo!" : (number < 0) ? "¡Es negativo!" : "¡Es cero, ná de ná";
		System.out.println(mensaje);
		    

	}
}
