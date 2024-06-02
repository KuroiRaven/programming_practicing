import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class CompareCardTest {

    @Test
    @DisplayName("Récupérer les cartes et les trier dans l'ordre \"naturel\"")
    void ShouldBeSortedNaturally() {
        // Retrieve cards array with DeckService
        String[] cardsFromString = DeckService.getDeckFromDataBase();

        // Transformer le tableau de String en TradingCard
        // Organisation de la donnée : name, uniqueId, hp, cost, rarity, artwork
        // Trier les cartes selon l'ordre "naturel"

        assertThat(cards)
                .hasSize(29)
                .isSorted();
    }

    @Test
    @DisplayName("Récupérer les cartes et les trier selon un comparateur différent")
    void ShouldBeSortedByRarity() {
        // Retrieve cards array with DeckService
        String[] cardsFromString = DeckService.getDeckFromDataBase();

        // Transformer le tableau de String en TradingCard
        // Organisation de la donnée : name, uniqueId, hp, cost, rarity, artwork
        // Trier les cartes selon l'ordre "naturel"

        ArrayList<TradingCard> cards = new ArrayList<>();

        for (String line: cardsFromString) {
            String[] cardInfo = line.split(";");
            String name = cardInfo[0];
            int uniqueId = Integer.parseInt(cardInfo[1]);
            int hp = Integer.parseInt(cardInfo[2]);
            int cost = Integer.parseInt(cardInfo[3]);
            String rarity = cardInfo[4];
            String artwork = cardInfo[5];

            TradingCard card = new TradingCard(name, uniqueId, hp, cost, rarity, artwork);
            cards.add(card);
        }

        cards.sort(null);

        assertThat(cards)
                .hasSize(29)
                .isSortedAccordingTo();
    }
}
