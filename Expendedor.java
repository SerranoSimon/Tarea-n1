public class Expendedor {
    private Deposito coca;
    private Deposito sprite;
    private Deposito fanta;
    private Deposito snickers;
    private Deposito super8;
    public Expendedor(int numProductos){
        this.coca=new Deposito();
        this.sprite=new Deposito();
        this.fanta=new Deposito();
        this.snickers=new Deposito();
        this.super8=new Deposito();
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
