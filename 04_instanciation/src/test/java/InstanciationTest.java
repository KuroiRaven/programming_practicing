import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class InstanciationTest {

    @Test
    @DisplayName("Trois new donnent 3 instances différentes par défaut")
    void ThreeCardShouldBeDifferent() {
        // Ajouter les instanciations ici

        /*assertThat(cardA).isNotEqualTo(cardB);
        assertThat(cardA).isNotEqualTo(cardC);
        assertThat(cardB).isNotEqualTo(cardC);*/
    }

    @Test
    @DisplayName("Un new avec plusieurs références, reste le même élément")
    void ThreeReferencesShouldBeEqual() {
        // Instancier une carte Ici

        // Référencer cette cartes dans deux autres variables `cardB` et `cardC`

        // Changer le coût de la carte

        /*assertThat(cardA).isEqualTo(cardB);
        assertThat(cardA).isEqualTo(cardC);
        assertThat(cardB).isEqualTo(cardC);

        assertThat(cardA.cost).isEqualTo(cardB.cost);
        assertThat(cardA.cost).isEqualTo(cardC.cost);*/
    }
}
