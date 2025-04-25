public class Comprador {
    private String consumido;
    private int vuelto;

    public Comprador(Moneda m, Productos prod, Expendedor exp) throws PagoIncorrectoException, NoHayProductoException, PagoInsuficienteException {
        Producto p = exp.comprarProducto(m, prod);
        consumido = p.consumir();

        Moneda temp;
        while ((temp = exp.getVuelto()) != null) {
            vuelto += temp.getValor();
        }
    }

    public String queConsumiste() {
        return consumido;
    }

    public int cuantoVuelto() {
        return vuelto;
    }
}