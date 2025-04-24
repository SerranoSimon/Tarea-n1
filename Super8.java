public class Super8 extends Dulce{
    public Super8(int serie){
        super(serie);

    }
    @Override
    public String consumir() {
        return "Super8";
    }

    @Override
    public int getPrecio() {
        return Productos.SUPER8.getPrecioProducto();
    }
}
