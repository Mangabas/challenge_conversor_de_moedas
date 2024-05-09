package moedas;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor {

    public String converte(double valor, String moeda1, String moeda2) throws IOException, InterruptedException {
        PegaValor rates = new PegaValor();
        double valorConvertido = valor * rates.pescarValor(moeda1,moeda2);

        return "O valor de " + valor + " " +  moeda1 + " corresponde ao valor final de =>> " + valorConvertido + " " + moeda2;
    }

    public String cambio(String moeda1) throws IOException, InterruptedException {
        String endereco = "https://v6.exchangerate-api.com/v6/bc1c78916b24a354e5a20fca/latest/" + moeda1 + "";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }

}
