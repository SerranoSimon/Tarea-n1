/**
 * Snickers hereda de Dulce
 */
public class Snickers extends Dulce{
    /**
     * Se llama al constructor de Bebida
     * @param serie le da serie como parametro al constructor de Bebida
     */
    public Snickers(int serie){
        super(serie);

    }
    /**
     * Definimos el metodo consumir reescribiendolo
     * @return la bebida que se consumió
     */
    @Override
    public String consumir() {
        return "Snickers";
    }
    /**
     * Definimos el metodo  getPrecio reescribiendolo
     * @return el precio del Snickers
     */
    @Override
    public int getPrecio() {
        return Productos.SNICKERS.getPrecioProducto();
    }
}
