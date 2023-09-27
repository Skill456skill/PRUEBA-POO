public class Ropa {

    /** Atributos **/
    String camisa;
    int valor;

    /*
     * Metodo Constructor para inicializar la clase
     * 
     * @param camisa el tipo de camisa
     * 
     * @param valor el costo de la camisa
     * 
     * Complejidad temporal: O(1) Tiempo Constante
     */
    public Ropa(String camisa, int valor) {
        this.camisa = camisa;
        this.valor = valor;
    }

    /*
     * Metodo Constructor de NoCompra
     * 
     * Complejidad temporal: O(1) Tiempo constante
     */
    void NoCompra() {
        System.out.println("\nGracias por Venir, Esperamos que Vuelva Pronto!!!\n");
    }

    /*
     * Metodo Constructor de Venta
     * 
     * Complejidad temporal: O(1) Tiempo Constante
     */
    void Venta() {
        System.out.println("\nVenta Exitosa\n");
    }
}
