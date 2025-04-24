public enum Productos {
    COCACOLA(800),
    SPRITE(800),
    FANTA(700),
    SUPER8(250),
    SNICKERS(750);
    private final int precioProducto;
    Productos(int precioProducto){
        this.precioProducto=precioProducto;
    }

    public int getPrecioProducto() {
        return precioProducto;
    }
}
