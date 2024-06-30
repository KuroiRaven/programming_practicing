import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EqualsCardTest {

    @Test
    @DisplayName("Une carte doit être égale à une autre carte si son nom est le même que celui d'une autre")
    void ShouldBeEqual() {
        TradingCard common = new TradingCard("Murktide Regent", 303, 3, 5, "Common", "basic");
        TradingCard shiny = new TradingCard("Murktide Regent", 456, 3, 5, "Rare", "shiny-alternate");
        TradingCard full = new TradingCard("Murktide Regent", 749, 3, 5, "Epic", "full-card");
        TradingCard NameWrittenDifferently = new TradingCard("murkTide rEgEnt", 9658, 3, 5, "Common", "basic");

        assertThat(common)
                .isEqualTo(shiny)
                .isEqualTo(full)
                .isEqualTo(NameWrittenDifferently);
    }

    @Test
    @DisplayName("Une carte ne doit pas être égale à une autre si son nom est différent")
    void ShouldNotBeEqual() {
        TradingCard baseCard = new TradingCard("Murktide Regent", 303, 3, 5, "Common", "basic");
        TradingCard comparedWith1 = new TradingCard("Archangel Elspeth", 303, 3, 5, "Common", "basic");
        TradingCard comparedWith2 = new TradingCard("Murktide King", 303, 3, 5, "Common", "basic");
        TradingCard comparedWith3 = new TradingCard("Phyrexian Pegasus", 303, 3, 5, "Common", "basic");

        assertThat(baseCard)
                .isNotEqualTo(comparedWith1)
                .isNotEqualTo(comparedWith2)
                .isNotEqualTo(comparedWith3);
    }
}
