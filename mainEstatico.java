import java.util.ArrayList;
import java.util.Collections;

public class mainEstatico {
    public static void main(String[] args) throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        ArrayList<Moneda> mArr= new ArrayList<>();
        mArr.add(new Moneda100());
        mArr.add(new Moneda1000());
        mArr.add(new Moneda500());

        Collections.sort(mArr);
        System.out.println(mArr);
        //CASO EXITOSO:

        System.out.println("Caso exitoso:");
        Expendedor exp1=new Expendedor(1);
        for(int i=0;i<5;i++){
            Comprador c= new Comprador(mArr.get(2), i,exp1);
            System.out.println("Compra "+(1+i)+":"+" consumiste "+c.queConsumiste()+", y tu vuelto es "+c.cuantoVuelto());
        }

        //CASO PRODUCTO AGOTADO
        System.out.println("");
        System.out.println("Caso producto agotado: ");
        try{
            Expendedor exp2=new Expendedor(1);
            Comprador c1= new Comprador(mArr.get(2),0,exp2);
            Comprador c2=new Comprador(mArr.get(2),0,exp2);
        }
        catch(NoHayProductoException e){
            System.out.println("Tipo de error: " + e.getMessage());

        }

        //CASO MONEDA NULA
        System.out.println("");
        System.out.println("Caso moneda nula: ");
        try {
            Comprador c=new Comprador(null,0,new Expendedor(1));
            System.out.println(c.queConsumiste());

        } catch (PagoIncorrectoException e) {
            System.out.println("Tipo de error: " + e.getMessage());
        }
        //CASO DINERO INSUFICIENTE
        System.out.println("");
        System.out.println("Caso pago insuficiente: ");
        try{
            Comprador c= new Comprador(mArr.get(0),3,new Expendedor(1));
            System.out.println(c.queConsumiste());
        }
        catch (PagoInsuficienteException e){
            System.out.println("Tipo de error: " + e.getMessage());

        }

    }
}






