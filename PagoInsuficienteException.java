/**
 * Exception que se lanza si el valor de la moneda ingresada es menor al precio del producto.
 * se devuelve la misma moneda.
 */
public class PagoInsuficienteException extends Exception {
    /**
     *Crea una nueva exception con mensaje personalizado.
     * @param message describe el motivo del error.
     */
    public PagoInsuficienteException(String message) {
        super(message);
    }
}
