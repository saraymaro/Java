public class Salto {
    public static void main(String[] args) {
    	System.out.println("Salto con break: ");
    	saltoBreak();
    	System.out.println("Salto con contune: ");
    	saltoContinue();
    }

    public static void saltoBreak() {
	int x = 0;
	for (int i =1; i<10; i++) {
		System.out.println("Hey, que tal?");
		if (i == 3) {
			break;
		}
	}
	while (x < 10) {
		System.out.println("¡Hola, hola!");
		x++;
		if (x == 3) {
			break;
		}
	}
    }
    public static void saltoContinue() {
    	for(int i = 1; i < 10; i++) {
    		if(i == 5) {
    			continue;
    		}
    		System.out.println(i + ".Iteración");
    	}
    }
}

