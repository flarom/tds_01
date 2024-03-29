import java.util.Scanner;

public class Pizzaria {
    public static void main(String[] args) {
        System.out.println("Seja bem-viado a pizzaria bate-papo");

        Scanner scan = new Scanner(System.in);
        Pedido pedido = new Pedido();
        ItemDoPedido item = new ItemDoPedido();

        String continuar;
        do {
            System.out.println("Informe o tipo da pizza (tradicional [R$40] / especial [R$50]):");
            item.addTipo(scan.nextLine().trim());

            System.out.println("Informe o sabor da pizza:");
            item.addSabor(scan.nextLine());

            pedido.addItemDoPedido(item);

            System.out.println("mais alguma coisa?");
            continuar = scan.nextLine();
        } while (!continuar.equalsIgnoreCase(""));

        System.out.println("Informe o nome do cliente:");
        pedido.setCliente(scan.nextLine());

        System.out.println("Informe a taxa da entrega:");
        pedido.setTxEntrega(scan.nextDouble());
        scan.nextLine();

        pedido.imprimir();
        scan.close();
    }
}
