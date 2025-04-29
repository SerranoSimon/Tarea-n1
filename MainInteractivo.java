import java.util.Scanner;
public class MainInteractivo {
    public static void main(String[] args) {
        Expendedor exp = new Expendedor(3); //El número indica cuánta cantidad hay de cada producto
        Scanner sc = new Scanner(System.in);
        while (true) { //creacion de un bucle para que el expendedor se ejecute constantemente hasta que el usuario decida irse con -1
            try {
                Productos[] prod = Productos.values();
                for (int i = 0; i < prod.length; i++) {
                    System.out.println(i + ":" + prod[i].name() + " $" + prod[i].getPrecioProducto()); //Muestra cada tipo de producto con su número asociado y su precio
                }
                System.out.println("Ingrese -1 para salir.");
                System.out.println("Número del producto:");

                int selection = sc.nextInt(); //permite el ingreso de un valor int en la consola

                if (selection == -1){
                    System.out.println("Saliste de expendedor");
                    break; //rompe el ciclo para salir de expendedor (cerrar el programa)
                }
                System.out.println("Ingrese un valor de moneda:");
                int x = sc.nextInt();
                Moneda m = null;
                if (x == 100) { //creacion de una nueva moneda dependiendo del caso (100,500,1000)
                    m = new Moneda100();
                } else if (x == 500) {
                    m = new Moneda500();
                } else if (x == 1000) {
                    m = new Moneda1000();
                }
                Comprador c = new Comprador(m, selection, exp); //crea un nuevo comprador con los dos parámetos necesarios
                System.out.println("Consumiste: " + c.queConsumiste());
                System.out.println("Tu vuelto es: " + c.cuantoVuelto());
            } catch (PagoIncorrectoException | PagoInsuficienteException | NoHayProductoException e) { //si hubiese algún tipo de error, sería atrapado por catch (por ejemplo, un producto agotado o una cantidad de dinero insuficiente)
                System.out.println("Tipo de error:" + e.getMessage()); //muestra el tipo de exception
            }
        }
        sc.close();
    }
}