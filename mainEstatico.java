
public class mainEstatico {
    public static void main(String[] args) throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        //CASO EXITOSO:

        System.out.println("Caso exitoso:");
        Moneda m=new Moneda1000();
        Expendedor exp1=new Expendedor(1);
        for(int i=0;i<5;i++){
            Comprador c= new Comprador(m,i,exp1);
            System.out.println("Compra "+(1+i)+":"+" consumiste "+c.queConsumiste()+", y tu vuelto es "+c.cuantoVuelto());
        }

        //CASO PRODUCTO AGOTADO
        System.out.println("");
        System.out.println("Caso producto agotado: ");
        try{
            Moneda m1=new Moneda1000();
            Expendedor exp2=new Expendedor(1);
            Comprador c1= new Comprador(m1,0,exp2);
            Comprador c2=new Comprador(m1,0,exp2);
        }
        catch(NoHayProductoException e){
            System.out.println("Tipo de error: " + e.getMessage());

        }

        //CASO MONEDA NULA
        System.out.println("");
        System.out.println("Caso moneda nula: ");
        try {
            Moneda m1=null;
            Expendedor exp2=new Expendedor(3);
            Comprador c=new Comprador(m1,0,exp2);
            System.out.println(c.queConsumiste());

        } catch (PagoIncorrectoException e) {
            System.out.println("Tipo de error: " + e.getMessage());
        }
        //CASO DINERO INSUFICIENTE
        System.out.println("");
        System.out.println("Caso pago insuficiente: ");
        try{
            Moneda m2=new Moneda100();
            Comprador c= new Comprador(m2,3,new Expendedor(1));
            System.out.println(c.queConsumiste());
        }
        catch (PagoInsuficienteException e){
            System.out.println("Tipo de error: " + e.getMessage());

        }

    }
}






