import java.util.*;

public class CompraRopa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         * Complejidad temporal: O(1) Tiempo Constante
         */
        Ropa Camisa = new Ropa("Jersey", 150000);
        System.out.println("\nBienvenido!! \n");
        System.out.println(
                "Desea Realizar la compra de la camisa " + Camisa.camisa + " por el valor de "
                        + Camisa.valor + "?");
        String opcion = sc.nextLine();

        /*
         * Complejidad temporal: O(1) Tiempo Constante
         */
        if (opcion.equals("Si") || opcion.equals("si") || opcion.equals("s") || opcion.equals("S") || opcion.equals("s")
                || opcion.equals("SI")) {
            Camisa.Venta();
        } else {
            Camisa.NoCompra();
        }
    }
}