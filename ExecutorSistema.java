package OO;

import java.util.Scanner;

public class ExecutorSistema {

    public static void main(String[] args) {

        Veiculo[] vetorDeVeiculos = new Veiculo[200];
        int op;
        int contador = 0;

        do {
            Scanner leitura = new Scanner(System.in);
            System.out.println("Escolha uma operação:");
            System.out.println("0 - Encerrar menu.");
            System.out.println("1 - Venda de veículo.");
            System.out.println("2 - Gerar Relatório de vendas mensal.");
            System.out.println("3 - Gerar Relatório de vendas anual.");
            op = leitura.nextInt();

            if (op < 0 || op > 3) {
                System.out.println("Operação inválida.");
            } else {
                if (op == 0) {
                    SistemaVendaDeCarros.finalizarMenu();
                } else if (op == 1) {
                    if (contador < 200) {
                        Veiculo veiculo = SistemaVendaDeCarros.venderVeiculo();
                        vetorDeVeiculos[contador] = veiculo;
                        contador++;
                    } else {
                        System.out.println("Vetor de veículos está cheio!");
                    }
                } else if (op == 2) {
                    System.out.println("Digite o mês para gerar o relatório mensal:");
                    int mesRelatorio = leitura.nextInt();
                    SistemaVendaDeCarros.gerarRelatorioMensal(vetorDeVeiculos, contador, mesRelatorio);
                } else if (op == 3) {
                    SistemaVendaDeCarros.gerarRelatorioAnual(vetorDeVeiculos, contador);
                }
            }
        } while (op != 0);
    }
}

//Lembretes
//Tamanho do vetor definido como 200 para armazenamento.