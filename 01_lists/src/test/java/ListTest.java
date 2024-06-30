
import org.example.TradingCard;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class ListTest {
    private final TradingCard card1 = new TradingCard(1, "Black Lotus");
    private final TradingCard card2 = new TradingCard(2, "Saphire Medaillon");
    private final TradingCard card3 = new TradingCard(3, "The necrobloom");
    private final TradingCard card4 = new TradingCard(4, "Sauron, the Dark Lord");
    private final TradingCard card5 = new TradingCard(5, "The Ur Dragon");

    @Test
    /* Remplire la liste de cartes avec toutes les cartes ci-dessus, dans l'ordre numérique.*/
    public void AddElementsToList() {
        ArrayList<TradingCard> cardList = new ArrayList<>();

        assertThat(cardList).hasSize(5);
        assertThat(cardList).contains(card1, card2, card3, card4, card5);
    }

    @Test
    /* Depuis la liste, pré-remplie, récupérer les cartes demandées*/
    public void GetElementsFromList() {
        ArrayList<TradingCard> cardList = new ArrayList<>(Arrays.asList(
                this.card1,
                this.card2,
                this.card3,
                this.card4,
                this.card5)
        );

        // Créer les variables correspondantes à fetchedCard1, fetchedCard3 et fetchedCard5

        // Ne pas toucher.
        assertThat(fetchedCard3).isEqualTo(this.card3);
        assertThat(fetchedCard1).isEqualTo(this.card1);
        assertThat(fetchedCard5).isEqualTo(this.card5);
    }

    @Test
    /* La liste est déjà déclarée, vous n'avez plus qu'à utiliser la bonne méthode pour la vider.
    Le code déjà en place ne doit pas être touché. Vous pouvez ajouter le votre, avant, au milieu ou après.*/
    public void RemoveElementsList() {
        ArrayList<TradingCard> cardList = new ArrayList<>(Arrays.asList(
                this.card1,
                this.card2,
                this.card3,
                this.card4,
                this.card5)
        );

        // Enlever la card 1 et 4 de la liste

        // Ne pas toucher.
        assertThat(cardList).doesNotContain(this.card1);
        assertThat(cardList).doesNotContain(this.card4);
        assertThat(cardList).contains(this.card2);
        assertThat(cardList).contains(this.card3);
        assertThat(cardList).contains(this.card5);
        assertThat(cardList).hasSize(3);
    }

    @Test
    /* La liste est déjà déclarée, vous n'avez plus qu'à utiliser la bonne méthode pour la vider.
    Le code déjà en place ne doit pas être touché. Vous pouvez ajouter le votre, avant, au milieu ou après.*/
    public void ClearList() {
        ArrayList<TradingCard> cardList = new ArrayList<>(Arrays.asList(
                this.card1,
                this.card2,
                this.card3,
                this.card4,
                this.card5)
        );

        // Vider la liste

        // Ne pas toucher.
        assertThat(cardList).isEmpty();
    }
}
