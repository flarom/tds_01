import java.util.Scanner;

public class Pizzaria {
    public static void main(String[] args) {
        System.out.println("Seja bem-viado a pizzaria bate-papo");

        Scanner scan = new Scanner(System.in);
        Pedido pedido = new Pedido();
        ItemDoPedido item = new ItemDoPedido();

        String continuar;
        do {
            System.out.println("Informe o tipo da pizza (tradicional/especial):");
            item.setTipo(scan.nextLine().trim());

            System.out.println("Informe o sabor da pizza:");
            item.setSabor(scan.nextLine());

            pedido.addItemDoPedido(item);

            System.out.println("mais alguma coisa?");
            continuar = scan.nextLine();
        } while (!continuar.equalsIgnoreCase(""));

        System.out.println("Informe o nome do cliente:");
        pedido.setCliente(scan.nextLine());

        System.out.println("Informe a localização da entrega (centro/periferia/outro):");
        pedido.setLocal(scan.nextLine().trim());

        pedido.imprimir();
        scan.close();
    }
}
