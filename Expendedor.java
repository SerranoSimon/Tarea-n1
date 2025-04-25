public class Expendedor {
    private DepositoGenerico<Producto> coca;
    private DepositoGenerico<Producto> sprite;
    private DepositoGenerico<Producto> fanta;
    private DepositoGenerico<Producto> snickers;
    private DepositoGenerico<Producto> super8;
    private DepositoGenerico<Moneda> Monvu;
    public Expendedor(int numProductos){
        this.coca=new DepositoGenerico<>();
        this.sprite=new DepositoGenerico<>();
        this.fanta=new DepositoGenerico<>();
        this.snickers=new DepositoGenerico<>();
        this.super8=new DepositoGenerico<>();
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
}
