import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        String nome = "André Marques";
        String cpf ="001.002.003-05";
        String tipoConta = "Corrente";
        double saldo = 2000.00;
        int opcao = 0;

        System.out.println("**********************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Saldo da conta: " + saldo);
        System.out.println("**********************************");

        String menu = """
                ---------------------
                1- Consultar saldo.
                2- Transferir valor.
                3- Receber Valor.
                4- Consultar CPF.
                5- Sair.
                ---------------------
                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 6){
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("O saldo atualizado é R$" + saldo );
            } else if (opcao == 2) {
                System.out.println("Qual valor deseja transferir?");
                double valor = leitura.nextDouble();

                if (valor > saldo){
                    System.out.println("Saldo insuficiente.");
                }else {
                    saldo -= valor;
                    System.out.println("Novo saldo: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: " + saldo);

            } else if (opcao != 4) {
                System.out.println("O CPF consultado é: " + cpf);

            }
                
            }
        }




    }


