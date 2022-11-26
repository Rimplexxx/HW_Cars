package transport;

public enum TypeOfBody {

    SEDAN("Седан"),
    HATCHBACK("Хэтчбек"),
    COUPE("Купе"),
    UNIVERSAL("Универсал"),
    OFFROAD("Внедорожник"),
    CROSSOVER("Кроссовер"),
    PICKUP("Пикап"),
    VAN("Фургон"),
    MINIVAN("Минивэн");

    private String name;

    TypeOfBody(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}