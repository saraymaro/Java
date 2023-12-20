import java.util.Scanner;

public class Saludo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Dime las veces que quieres que te saludes (mínimo 1): ");
        int cantidadSaludos = scanner.nextInt();

        cantidadSaludos = Math.max(1, cantidadSaludos);
        
        saludo(cantidadSaludos);
        
        scanner.close();
    }

    public static void saludo(int cantidadSaludos) {
    	int i = 0;
    	boolean saludo = true;
    	
    	//Con For
    	for (int y = 0; y < cantidadSaludos; y++) {
            System.out.println("¡Te saludo!");
        }
    	
    	//Con While
        while (i < cantidadSaludos) {
        	System.out.println("Ei!!");
        	i++;
        }
        
        //Con Do-While
        do {
        	System.out.println("¡Hola!");
        	i++;
        }while (i == cantidadSaludos);
    }
}
