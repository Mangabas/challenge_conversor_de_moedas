package moedas;

import com.google.gson.*;

import java.io.IOException;

public class PegaValor {


    public double pescarValor(String moeda1, String moeda2) throws IOException, InterruptedException {
        Conversor converter = new Conversor();
        String json = converter.cambio(moeda1);

        Gson gson = new GsonBuilder()
             //   .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        Cambio meuCambio = gson.fromJson(json, Cambio.class);
        JsonParser parser = new JsonParser();
        JsonElement jsonElement = parser.parse(String.valueOf(meuCambio.conversion_rates()));

        JsonObject teste = jsonElement.getAsJsonObject();
        double brazil = teste.get(moeda2).getAsDouble();


        return brazil;
    }
}
