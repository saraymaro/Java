
public class Numeros {
	// Ejercicio números divisibles por 2
	public static void divisibles2() {
		for (int i = 2; i <= 20; i++) {
			if (i % 2 == 0)
			System.out.println(i);
		}
	}

	// Ejercicio arrays divisibles por 3
	public static void divisibles3() {
		int[] nums = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		int i = 0;
		
		//Haciéndolo con bucle For
		for (int j = 0; i < nums.length; j++) {
			if (nums[j] % 3 == 0) {
				System.out.println(nums[j]);
			}
			
		//Haciéndolo con bucle While
		while (i < nums.length) {
			if (nums[i] % 3 == 0) {
				System.out.println(nums[i]);
				}
				i++;
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("Números divisibles por 2:");
		divisibles2();

		System.out.println("Números divisibles por 3 del array:");
		divisibles3();
		
	}
}
