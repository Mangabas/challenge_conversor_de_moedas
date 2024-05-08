package moedas;

import com.google.gson.JsonObject;

public record Cambio(JsonObject conversion_rates) {
}
