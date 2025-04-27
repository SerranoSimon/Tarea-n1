public class Expendedor {
    private DepositoGenerico<Producto> coca;
    private DepositoGenerico<Producto> sprite;
    private DepositoGenerico<Producto> fanta;
    private DepositoGenerico<Producto> snickers;
    private DepositoGenerico<Producto> super8;
    private DepositoGenerico<Moneda> MonVu;
    public Expendedor(int numProductos){
        this.coca=new DepositoGenerico<>();
        this.sprite=new DepositoGenerico<>();
        this.fanta=new DepositoGenerico<>();
        this.snickers=new DepositoGenerico<>();
        this.super8=new DepositoGenerico<>();
        this.MonVu=new DepositoGenerico<>();
        for(int i=0; i<numProductos;i++){
            Cocacola b1=new Cocacola(100+i);
            Sprite b2=new Sprite(200+i);
            Fanta b3=new Fanta(300+i);
            Snickers e1=new Snickers(400+i);
            Super8 e2=new Super8(500+i);
            coca.add(b1);
            sprite.add(b2);
            fanta.add(b3);
            snickers.add(e1);
            super8.add(e2);

        }
    }
    private DepositoGenerico<Producto> getDeposito(Productos producto){
        return switch (producto) {
            case COCACOLA -> coca;
            case SPRITE -> sprite;
            case FANTA -> fanta;
            case SUPER8 -> super8;
            case SNICKERS -> snickers;
        };
    }
    public Moneda getVuelto(){
        return MonVu.get();
    }
    public Producto comprarProducto(Moneda m, int cual) throws NoHayProductoException, PagoIncorrectoException, PagoInsuficienteException {

            Productos [] productosArr= Productos.values();
            Productos seleccion=productosArr[cual];
            if(m==null){
                throw new PagoIncorrectoException("Moneda nula");
            }
            if(cual>= productosArr.length||cual<0){
                MonVu.add(m);
                throw new NoHayProductoException("numero de depósito erróneo");
            }
            if(getDeposito(seleccion).getArr().size()==0){
                MonVu.add(m);
                throw new NoHayProductoException("producto agotado");
            }
            if(seleccion.getPrecioProducto()> m.getValor()){
                MonVu.add(m);
                throw new PagoInsuficienteException("Pago insuficiente");
            }
            int vuelto= m.getValor() -seleccion.getPrecioProducto();
            while (vuelto > 0) {
                Moneda aux = new Moneda100();
                MonVu.add(aux);
                vuelto -= 100;
            }
            return switch (seleccion) {
                case FANTA -> fanta.get();
                case SPRITE -> sprite.get();
                case COCACOLA -> coca.get();
                case SNICKERS -> snickers.get();
                case SUPER8 -> super8.get();
            };




    }
}
