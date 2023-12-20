public class main {
    public static void main(String[] args) {
        boolean blancoNegro = Math.random() < 0.5;
        String aleatorio = blancoNegro ? "Blanco" : "Negro";
        System.out.println(aleatorio);
    }
}
