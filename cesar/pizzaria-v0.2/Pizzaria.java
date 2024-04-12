import java.util.Scanner;

public class Pizzaria {
    public static void main(String[] args) {
        System.out.println("Seja bem-viado a pizzaria bate-papo");

        Scanner scan = new Scanner(System.in);
        Faturamento faturamento = new Faturamento();

        while (true) {
            Pedido pedido = new Pedido();
            ItemDoPedido item = new ItemDoPedido();
            String selecaoMenu = "";
            String operador = "";

            System.out.println("Selecione uma operação:\n"
                    + " [1] Realizar um pedido\n"
                    + " [2] Imprimir relatorio diairo\n"
                    + " [#] Sair");
            System.out.print("Seleção: ");

            operador = scan.nextLine();

            if(operador.equals("#")){
                break; // sair do programa
            }

            switch (operador) {
                case "1":
                    String continuar;
                    do {
                        System.out.println("Informe o tipo da pizza (tradicional/especial):");
                        item.setTipo(scan.nextLine().trim());
                        faturamento.addTotalGeral(item.getValor());

                        System.out.println("Informe o sabor da pizza:");
                        item.setSabor(scan.nextLine());

                        pedido.setItemDoPedido(item);
                        faturamento.addPizzasVendidas();
                        
                        System.out.println("mais alguma coisa?");
                        continuar = scan.nextLine();
                    } while (!continuar.equalsIgnoreCase(""));

                    faturamento.addItemDoPedido(item);
                    faturamento.addPedidosRealizados();

                    System.out.println("Informe o nome do cliente:");
                    pedido.setCliente(scan.nextLine());

                    System.out.println("Informe a localização da entrega (centro/periferia/outro):");
                    pedido.setLocal(scan.nextLine().trim());
                    faturamento.addTotalEntregador(pedido.calcFrete());

                    pedido.imprimir();
                    break;

                case "2":
                    faturamento.imprimirRelatorio();
                    break;

                default:
                    System.out.println("Esta operação não existe");
                    break;
            }
        }
        scan.close();
    }
}
