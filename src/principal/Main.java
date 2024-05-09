package principal;

import moedas.Conversor;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        Conversor resultado = new Conversor();
        double valor = 0;
        int opcoes = 1;

        while (opcoes != 9){
            System.out.println("*********************************************************"+
                    "\nSeja bem vindo/a ao Conversor de Moeda!"+
                    "\n\n1) Dólar =>> Peso argentino"+
                    "\n2) Peso argentino =>> Dólar"+
                    "\n3) Dólar =>> Real brasileiro"+
                    "\n4) Real brasileiro =>> Dólar"+
                    "\n5) Dólar =>> Peso colombiano"+
                    "\n6) Peso colombiano =>> Dólar"+
                    "\n7) Peso chileno =>> Boliviano boliviano"+
                    "\n8) Boliviano boliviano =>> Peso chileno"+
                    "\n9) Sair " +
                    "\n\n*********************************************************");
            opcoes = leitura.nextInt();
            switch (opcoes) {
                case 1:
                    System.out.println("Digite o valor que deseja converter");
                    valor = leitura.nextDouble();
                    System.out.println(resultado.converte(valor, "USD", "ARS"));
                    break;
                case 2:
                    System.out.println("Digite o valor que deseja converter");
                    valor = leitura.nextDouble();
                    System.out.println(resultado.converte(valor, "ARS", "USD"));
                    break;
                case 3:
                    System.out.println("Digite o valor que deseja converter");
                    valor = leitura.nextDouble();
                    System.out.println(resultado.converte(valor, "USD", "BRL"));
                    break;
                case 4:
                    System.out.println("Digite o valor que deseja converter");
                    valor = leitura.nextDouble();
                    System.out.println(resultado.converte(valor, "BRL", "USD"));
                    break;
                case 5:
                    System.out.println("Digite o valor que deseja converter");
                    valor = leitura.nextDouble();
                    System.out.println(resultado.converte(valor, "USD", "COP"));
                    break;
                case 6:
                    System.out.println("Digite o valor que deseja converter");
                    valor = leitura.nextDouble();
                    System.out.println(resultado.converte(valor, "COP", "USD"));
                    break;
                case 7:
                    System.out.println("Digite o valor que deseja converter");
                    valor = leitura.nextDouble();
                    System.out.println(resultado.converte(valor, "CLP", "BOB"));
                    break;
                case 8:
                    System.out.println("Digite o valor que deseja converter");
                    valor = leitura.nextDouble();
                    System.out.println(resultado.converte(valor, "BOB", "CLP"));

                case 9:
                    break;
                default:
                    System.out.println("Digite uma opção válida");
                    break;
            }

        }
        leitura.close();
        System.out.println("Obrigado por utilizar o Conversor de Moedas, tenha um bom dia!");
    }
}
