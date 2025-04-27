public class Cocacola extends Bebida {
    public Cocacola(int serie){
        super(serie);

    }
    @Override
    public String consumir() {
        return "Cocacola";
    }

    @Override
    public int getPrecio() {
        return Productos.COCACOLA.getPrecioProducto();
    }
}
