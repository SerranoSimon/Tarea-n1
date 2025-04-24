public class Snickers extends Dulce{
    public Snickers(int serie){
        super(serie);

    }
    @Override
    public String consumir() {
        return "Snickers";
    }

    @Override
    public int getPrecio() {
        return Productos.SNICKERS.getPrecioProducto();
    }
}
