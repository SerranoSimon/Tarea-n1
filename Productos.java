public enum Productos {
    COCACOLA(800),
    SPRITE(800),
    FANTA(700),
    SUPER8(300),
    SNICKERS(600);
    private final int precioProducto;
    Productos(int precioProducto){
        this.precioProducto=precioProducto;
    }

    public int getPrecioProducto() {
        return precioProducto;
    }
}
