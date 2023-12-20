public class Main{
    public static void main (String[] args) {
    	// Lógicos
    	boolean interruptor = false;
    	interruptor = !interruptor;
    	System.out.println(interruptor);
    	
    	// Caracter + texto
    	char inicial = 'S';
    	String nombre = "Saray";
    	System.out.println("La inicial de su nombre es: " + inicial + ", y su nombre completo es: " + nombre);
    	
    	// 	Num entero
    	byte num1 = 120;
    	short num2 = 13437;
    	int num3 = 47002;
    	long num4 = 2147483640l; 
    	long suma = num1 + num2 + num3 + num4;
    	System.out.println("La suma de los números es: " + suma);
    	
    	// Num real
    	float numeroFloat = 3.14159265f; 
    	double numeroDouble = 3.141592653589793; 
    	double sumaNums = numeroFloat + numeroDouble;

    	System.out.println("La suma del float y del double es: " + sumaNums);

    	// Constante
    	final String NOMBRE_COMPLETO = "Saray Magallanes Rodriguez";
    	System.out.println(NOMBRE_COMPLETO);
    	
    ejercicioCircular();
    ejercicioConstantes();
    }
    
        public static void ejercicioCircular() {
    		byte num1 = (byte) (Byte.MAX_VALUE + 5);
    		System.out.println(num1);
    		short num2 = (short) (Short.MAX_VALUE + 25);
    		System.out.println(num2);
    		int num3 = (int) (Integer.MAX_VALUE + 10000);
    		System.out.println(num3);
    		long num4 = (long) (Long.MAX_VALUE + 20000);
    		System.out.println(num4);
        }
        
        public static void ejercicioConstantes() {
        	// Lógicos
        	final boolean INTERRUPTOR = false;
        	System.out.println(INTERRUPTOR);
        	
        	// Caracter + texto
        	 final char INICIAL = 'S';
        	final String NOMBRE = "Saray";
        	System.out.println("La inicial de su nombre es: " + INICIAL + ", y su nombre completo es: " + NOMBRE);
        	
        	// 	Num entero
        	final byte NUM_1 = 120;
        	final short NUM_2 = 13437;
        	final int SUMA = NUM_1 + NUM_2;
        	System.out.println("La suma de los números es: " + SUMA);
        	
        	// Num real
        	final float NUM_FLOAT = 3.14159265f; 
        	final double NUM_DOUBLE = 3.141592653589793; 
        	final double SUMA_NUMS = NUM_FLOAT + NUM_DOUBLE;

        	System.out.println("La suma del float y del double es: " + SUMA_NUMS);

        	// Constante
        	final String NOMBRE_COMPLETO = "Saray Magallanes Rodriguez";
        	System.out.println(NOMBRE_COMPLETO);
        	
        }

}
