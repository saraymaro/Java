public class Condicional {
	 public static void main (String[] args) {
		 //Operador Ternario
		 boolean numero = Math.random() > 0.5;
		 String aleatorio = numero ? "Rojo" : "Negro";
		 System.out.println(aleatorio);
		 
		 //If unidireccional
		 if (numero == true) {
			 System.out.println("Rojo");
		 }
		 if (numero == false) {
			 System.out.println("Negro");
		 }
		 
		 //If bidireccional
		 if (numero == true) {
			 System.out.println("Rojo");
		 } else {
			 System.out.println("Negro");
		 }
		 
	 }
}
