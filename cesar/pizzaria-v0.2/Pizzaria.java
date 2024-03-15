import java.util.Scanner;

public class Pizzaria {
    public static void main(String[] args) {
        System.out.println("Seja bem-viado a pizzaria bate-papo");

        Scanner scan = new Scanner(System.in);
        Pedido pedido = new Pedido();

        String continuar;
        do {
            ItemDoPedido item = new ItemDoPedido();

            System.out.println("Informe o tipo da pizza (Tradicional/Especial/*):");
            item.setTipo(scan.nextLine());

            System.out.println("Informe o sabor da pizza:");
            item.setSabor(scan.nextLine());

            System.out.println("Informe o valor da pizza:");
            item.setValor(scan.nextDouble());
            pedido.addItemDoPedido(item);
            scan.nextLine();

            System.out.println("mais alguma coisa?");
            continuar = scan.nextLine();
        } while (!continuar.equalsIgnoreCase(""));

        System.out.println("Informe o nome do cliente:");
        pedido.setCliente(scan.nextLine());

        System.out.println("Informe a taxa da entrega:");
        pedido.setTxEntrega(scan.nextDouble());

        pedido.imprimir();
        scan.close();
    }
}