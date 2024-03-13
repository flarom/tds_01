import java.util.Scanner;

public class Pizzaria{
    public static void main(String[] args) {
        System.out.println("Seja bem-viado a pizzaria bate-papo");

        Scanner scan = new Scanner(System.in);
        Pedido pedido = new Pedido();
        ItemDoPedido item = new ItemDoPedido();

        System.out.println("Informe o tipo da pizza:");
        item.setTipo(scan.nextLine());

        System.out.println("Informe o sabor da pizza:");
        item.setSabor(scan.nextLine());

        System.out.println("Informe o valor da pizza:");
        item.setValor(scan.nextDouble());

        pedido.addItemDoPedido(item);

        System.out.println("Informe o nome do cliente:");
        pedido.setCliente(scan.next());

        System.out.println("Informe a taxa da entrega:");
        pedido.setTxEntrega(scan.nextDouble());

        pedido.imprimir();
    }
}
