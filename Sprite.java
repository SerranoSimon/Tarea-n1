public class Sprite extends Bebida {
    public Sprite(int serie){
        super(serie);

    }
    @Override
    public String consumir() {
        return "Sprite";
    }

    @Override
    public int getPrecio() {
        return Productos.SPRITE.getPrecioProducto();
    }
}
