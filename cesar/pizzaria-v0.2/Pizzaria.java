import java.util.Scanner;

public class Pizzaria {
    public static void main(String[] args) {
        System.out.println("Seja bem-viado a pizzaria bate-papo");

        Scanner scan = new Scanner(System.in);
        Pedido pedido = new Pedido();
        ItemDoPedido item = new ItemDoPedido();

        String continuar;
        do {

            System.out.println("Informe o tipo da pizza (Tradicional (R$40) / Especial (R$50)):");
            String inp = scan.nextLine();
            switch (inp) {
                case "tradicional":
                case "trad":
                    item.addValor(40);
                    break;
                case "especial":
                case "epec":
                    item.addValor(50);
            }
            item.setTipo(inp);

            System.out.println("Informe o sabor da pizza:");
            item.addSabor(scan.nextLine());

            // System.out.println("Informe o valor da pizza:");
            // item.addValor(scan.nextDouble());

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
