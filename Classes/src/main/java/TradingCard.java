import java.util.Objects;

public class TradingCard {
    private final String name;
    private final int uniqueId;
    private final int hp;
    private final int cost;
    private final String rarity;
    private final String artwork;

    public TradingCard(String name, int uniqueId, int hp, int cost, String rarity, String artwork) {
        this.name = name;
        this.uniqueId = uniqueId;
        this.hp = hp;
        this.cost = cost;
        this.rarity = rarity;
        this.artwork = artwork;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TradingCard that = (TradingCard) o;

        if(this.name == null || that.name == null) {
            return false;
        }

        return name.equalsIgnoreCase(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
