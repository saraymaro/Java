public class CondicionalArbol {
	public static void main(String[] args) {
		int altura = 10;
		//for para la altura
		for (int i = 0; i <= altura; i++) {
			//for para los espacios 
			for (int x = 0; x < altura -i; x++) {
				System.out.print(" ");
			}
			//for para asteriscos
			for (int y = 0; y < 2 *i; y++) {
				System.out.print("*");
			}
			for (int x = 0; x < altura -i; x++) {
				System.out.print(" ");}
			System.out.println();
			}
		int altTronco = 2;
		for (int z = 0; z < altTronco; z++) {
			for (int a = 0; a < altTronco*4; a++) {
				System.out.print(" ");
			}
			for (int t = 0; t < altTronco; t++) {
				System.out.print("**");
			}
			for (int a = 0; a < altTronco*4; a++) {
				System.out.print(" ");
			}
			System.out.println();
}
	}
}
