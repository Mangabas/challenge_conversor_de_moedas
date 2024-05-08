package principal;

import moedas.PegaValor;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        PegaValor teste = new PegaValor();
        double valorConvertido = 0;

        System.out.println("Digite um valor em Dolar para a conversão");
        Double valor = leitura.nextDouble();
        valorConvertido = valor * teste.pescarValor("USD","EUR");
        System.out.println(valorConvertido + " USD");
    }
}
