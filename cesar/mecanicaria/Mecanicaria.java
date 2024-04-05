import java.util.Scanner;

class Mecanicaria {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Cliente cliente = new Cliente();
        Veiculo veiculo = new Veiculo();
        OrdemServico ordemServico = new OrdemServico();

        // Cliente
        System.out.println("Informe o nome do cliente:");
        cliente.setNome(scan.nextLine());
        System.out.println("Informe o CPF do cliente");
        cliente.setCPF(scan.nextLine());
        System.out.println("Informe o endereço do cliente:");
        cliente.setEndereco(scan.nextLine());
        System.out.println("Informe um meio de contato do cliente:");
        cliente.setContato(scan.nextLine());

        // Veiculo
        System.out.println("Descreva o veículo:");
        veiculo.setDescricao(scan.nextLine());
        System.out.println("Informe a placa do veículo:");
        veiculo.setPlaca(scan.nextLine());
        while (true) {
            try {
                System.out.println("Informe o ano do veículo:");
                veiculo.setAno(scan.nextInt());
                scan.nextLine();
                break;
            } catch (Exception ex) {
                System.out.println("Ano precisa ser um numero, digite novamente.");
                scan.nextLine();
            }
        }

        // Servicos
        String inp = "";
        do {
            Servico servico = new Servico();
            System.out.println("Descreva o serviço:");
            servico.setDescricao(scan.nextLine());
            while (true) {
                try {
                    System.out.println("Informe o preço do serviço:");
                    servico.addValor(scan.nextDouble());
                    scan.nextLine();
                    break;
                } catch (Exception ex) {
                    System.out.println("Preço precisa ser um numero, digite novamente.");
                    scan.nextLine();
                }
            }
            System.out.println("Informe a data e hora de ínicio do serviço:");
            servico.setTempo(scan.nextLine());

            System.out.println("Mais um?");
            inp = scan.nextLine();

            // Ordem
            ordemServico.addServico(servico);
        } while (inp != "");
        ordemServico.setCliente(cliente);
        ordemServico.setVeiculo(veiculo);
        ordemServico.imprimir();
    }
}
