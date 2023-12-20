package Bucles.src;

public class Letras {
    public static void main(String[] args) {
        String abecedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder letrasEliminadas = new StringBuilder();
        
        while (abecedario.length() >= 1) {
            System.out.println(abecedario);
            char letraEliminada = abecedario.charAt(abecedario.length() - 1);
            letrasEliminadas.append(letraEliminada);
            abecedario = abecedario.substring(0, abecedario.length() - 1);
        }

        StringBuilder letrasAñadidas = new StringBuilder();

        while (letrasEliminadas.length() >= 1) {
            letrasAñadidas.append(letrasEliminadas.charAt(letrasEliminadas.length() - 1));
            System.out.println(letrasAñadidas.toString());
            letrasEliminadas = letrasEliminadas.deleteCharAt(letrasEliminadas.length() - 1);
        }
    }
}
