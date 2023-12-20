public class Operadores {
	int numero = 0;
	public static void main (String[] args) {
		System.out.println(10 - 5);
		System.out.println(55 + 45);
		System.out.println(-3 * 1);
		System.out.println(5 * 5);
		System.out.println(25 / 7);
		System.out.println((float)25 / 7);
		System.out.println(25 % 4);
		

		int num = 25;
		System.out.println(num+=5);
		System.out.println(num-=15);
		System.out.println(num*=2);
		System.out.println(num/=2);
		System.out.println(num%=3);
		
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;
		System.out.println(num4 == num2);
		System.out.println(num2 == num3);
		System.out.println(num1 != num3);
		System.out.println(num2 != num2);
		System.out.println(num4 < num3);
		System.out.println(num3 < num1);
		System.out.println(num1 > num3);
		System.out.println(num2 > num4);
		System.out.println(num2 > num3);
		System.out.println(num2 <= num3);
		System.out.println(num2 <= num4);
		System.out.println(num2 <= num1);
		System.out.println(num1 >= num2);
		System.out.println(num2 >= num1);
		System.out.println(num2 >= num2);
		
		boolean bool1 = true;
		boolean bool2 = false;
		boolean bool3 = false;
		System.out.println(bool1 == !bool2);
		System.out.println(bool2 == !bool3);
		
		int numero1 = 37;
		String estado = numero1 % 2 == 0 ? "Par" : "Impar";
		System.out.println(estado);
		
	}
}
