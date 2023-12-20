public class Operadores {
	// Variable global
	int numero = 0;
	public static void main (String[] args) {
		Operadores e = new Operadores();
		System.out.println("Cuando se incrementa: " + e.incrementar());
		System.out.println("Cuando se decrementa: " + e.decrementar());
	}
	public int incrementar() {
		return ++numero;
	}
	public int decrementar() {
		return --numero;
	}
		
}