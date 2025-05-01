import java.util.Scanner;

/**
 * Clase que simula una máquina expendedora.
 * Permite a la persona seleccionar productos e ingresar monedas, simulando compras hasta que el usuario decida salirse.
 */
public class MainInteractivo {

    public static void main(String[] args) {
        Expendedor exp = new Expendedor(3);
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {

                Productos[] prod = Productos.values();
                /**
                 * Muestra los productos con su número asociado y su precio.
                 */
                for (int i = 0; i < prod.length; i++) {
                    System.out.println(i + ":" + prod[i].name() + " $" + prod[i].getPrecioProducto()); //Muestra cada tipo de producto con su número asociado y su precio
                }
                System.out.println("Ingrese -1 para salir.");
                System.out.println("Número del producto:");

                int selection = sc.nextInt();
                /**
                 * La persona puede salir del programa ingresando -1 como número del producto.
                 */
                if (selection == -1){
                    System.out.println("Saliste de expendedor");
                    break;
                }
                System.out.println("Ingrese un valor de moneda:");
                int x = sc.nextInt();

                Moneda m = null;
                /**
                 * Crea una moneda dependiendo del valor ingresado (100,500,1000)
                 */
                if (x == 100) {
                    m = new Moneda100();
                } else if (x == 500) {
                    m = new Moneda500();
                } else if (x == 1000) {
                    m = new Moneda1000();
                }
                /**
                 * Crea un nuevo comprador para producir la compra del producto, su consumo y el vuelto.
                 */
                Comprador c = new Comprador(m, selection, exp);
                System.out.println("Consumiste: " + c.queConsumiste());
                System.out.println("Tu vuelto es: " + c.cuantoVuelto());
            } catch (PagoIncorrectoException | PagoInsuficienteException | NoHayProductoException e) {
                System.out.println("Tipo de error:" + e.getMessage());
            }
        }
        sc.close();
    }
}