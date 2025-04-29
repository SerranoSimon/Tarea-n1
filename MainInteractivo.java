import java.util.Scanner;
public class MainInteractivo {
    public static void main(String[] args) {
        Expendedor exp = new Expendedor(3);
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                Productos[] prod = Productos.values();
                for (int i = 0; i < prod.length; i++) {
                    System.out.println(i + ":" + prod[i].name() + " $" + prod[i].getPrecioProducto());
                }
                System.out.println("Número del producto:");
                int selection = sc.nextInt();
                if (selection == -1){
                    System.out.println("Saliste de expendedor");
                    break;
                }
                System.out.println("Ingrese un valor de moneda:");
                int x = sc.nextInt();
                Moneda m = null;
                if (x == 100) {
                    m = new Moneda100();
                } else if (x == 500) {
                    m = new Moneda500();
                } else if (x == 1000) {
                    m = new Moneda1000();
                }
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