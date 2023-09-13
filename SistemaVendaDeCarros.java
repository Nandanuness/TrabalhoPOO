package OO;

import java.util.Scanner;

public class SistemaVendaDeCarros {

    public static void finalizarMenu() {
        System.out.println("Menu finalizado...");
    }

    public static Veiculo venderVeiculo() {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite a marca do veículo");
        String marca = leitura.nextLine();
        System.out.println("Digite a Quilometragem do veículo");
        double km = leitura.nextDouble();
        System.out.println("Digite o valor de venda");
        double valor = leitura.nextDouble();
        System.out.println("Qual o mês da venda?");
        int mes = leitura.nextInt();
        System.out.println("Digite o ano do veículo");
        int ano = leitura.nextInt();

        return new Carro(marca, km, valor, mes, ano);
    }

    public static void gerarRelatorioMensal(Veiculo[] vetorDeVeiculos, int tamanho, int mes) {
        System.out.println("Relatório de Vendas Mensal para o mês " + mes + ":");
        for (int i = 0; i < tamanho; i++) {
            if (vetorDeVeiculos[i].getMes() == mes) {
                System.out.println("Marca: " + vetorDeVeiculos[i].getMarca());
                System.out.println("Quilometragem: " + vetorDeVeiculos[i].getKm());
                System.out.println("Valor de venda: " + vetorDeVeiculos[i].getValor());
                System.out.println("Ano: " + vetorDeVeiculos[i].getAno());
                System.out.println("--------");
            }
        }
    }

    public static void gerarRelatorioAnual(Veiculo[] vetorDeVeiculos, int tamanho) {
        System.out.println("Relatório de Vendas Anual:");

        int[] vendasPorMes = new int[13];

        for (int i = 0; i < tamanho; i++) {
            int mes = vetorDeVeiculos[i].getMes();
            vendasPorMes[mes]++;
        }

        for (int mes = 1; mes <= 12; mes++) {
            if (vendasPorMes[mes] > 0) {
                System.out.println("Mês " + mes + ": Quantidade de veículos vendidos - " + vendasPorMes[mes]);
            }
        }
    }
}

