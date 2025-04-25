public abstract class Moneda {
    public Moneda(){
    }
    public Moneda getSerie(){

        return this;
    }
    public abstract int getValor();
    @Override
    public String toString(){
        return "valor: "+getValor()+", serie: "+this.hashCode();
    }


}
