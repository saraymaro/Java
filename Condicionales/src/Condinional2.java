public class Condinional2 {
	public static void main (String[] args) {
		double temperatura = 11.7;
		
		//If unidireccional
		if (temperatura < 10) {
			System.out.println("Climas frios");
			if (temperatura < 10) {
			System.out.println("Tipo: Polar");
			}
			if (temperatura > 5 && temperatura < 10) {
				System.out.println("Tipo: Alta montaña");
			}
			if (temperatura > 5 && temperatura < 10) {
				System.out.println("Tipo: Alta montaña");
			}
		}
		
		if (temperatura >= 10 && temperatura <= 20) {
			System.out.println("Climas templados");
			if (temperatura >= 10 && temperatura <= 13.5) {
			System.out.println("Tipo: Oceánico");
			if (temperatura >= 13.5 && temperatura <= 16.5) {
				System.out.println("Tipo: Mediterráneo");
			}
			if (temperatura >= 16.5 && temperatura <= 20) {
				System.out.println("Tipo: Continental");
			}
		}
		if (temperatura >= 20 && temperatura <= 26.5) {
			System.out.println("Climas cálidos");
			if (temperatura >= 20 && temperatura <= 23.5) {
			System.out.println("Tipo: Ecuatorial");
			}
			if (temperatura >= 23.5 && temperatura <= 26.5) {
			System.out.println("Tipo: Tropical");
			}
			if (temperatura >= 26.5) {
			System.out.println("Tipo: Desértico");
			}
		}
		//If bidireccional
	    if (temperatura < 10) {
            System.out.println("Climas fríos");
            if (temperatura < 5) {
                System.out.println("Tipo: Polar");
            } else {
                System.out.println("Tipo: Alta montaña");
            }
        } else if (temperatura >= 10 && temperatura <= 13.5) {
            System.out.println("Climas templados");
            if (temperatura <= 13.5) {
                System.out.println("Tipo: Oceánico");
            } else if (temperatura <= 16.5) {
                System.out.println("Tipo: Mediterráneo");
            } else {
                System.out.println("Tipo: Continental");
            }
        } else if (temperatura >= 20 && temperatura <= 26.5) {
            System.out.println("Climas cálidos");
            if (temperatura <= 23.5) {
                System.out.println("Tipo: Ecuatorial");
            } else if (temperatura <= 26.5) {
                System.out.println("Tipo: Tropical");
            } else {
                System.out.println("Tipo: Desértico");
            }
        } else {
            System.out.println("No se encuentra en ningun clima conocido.");
        }
	}

	}
}