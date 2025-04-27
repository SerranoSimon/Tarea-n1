
public class mainEstatico {
    public static void main(String[] args) throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        //caso exitoso
        System.out.println("Caso exitoso:");
        Moneda m=new Moneda1000();
        Expendedor exp1=new Expendedor(1);
        for(int i=0;i<5;i++){
            Comprador c= new Comprador(m,i,exp1);
            System.out.println(c.queConsumiste());
            System.out.println(c.cuantoVuelto());

        }
        //caso no queda de un producto en particular
        System.out.println("Caso no queda de un producto en particular: ");
        try{
            Moneda m1=new Moneda1000();
            Expendedor exp2=new Expendedor(1);
            Comprador c1= new Comprador(m1,0,exp2);
            Comprador c2=new Comprador(m1,0,exp2);
        }
        catch(NoHayProductoException e){
            System.out.println("Error en la compra: " + e.getMessage());

        }

        //caso moneda nula
        System.out.println("Caso moneda nula: ");
        try {
            Moneda m1=null;
            Expendedor exp2=new Expendedor(3);
            Comprador c=new Comprador(m1,0,exp2);
            System.out.println(c.queConsumiste());

        } catch (PagoIncorrectoException e) {
            System.out.println("Error en la compra: " + e.getMessage());
        }
        //caso dinero insuficiente
        try{
            Moneda m2=new Moneda100();
            Comprador c= new Comprador(m2,3,new Expendedor(1));
            System.out.println(c.queConsumiste());
        }
        catch (PagoInsuficienteException e){
            System.out.println("Error en la compra: " + e.getMessage());

        }

    }
}






