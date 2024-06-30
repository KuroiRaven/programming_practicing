import org.example.TradingCard;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class MapTest {
    String TYPE_CREATURE = "Creature";
    String TYPE_SPELL = "Spell";
    String TYPE_LAND = "Terrain";

    private List<TradingCard> deck = Arrays.asList(
      new TradingCard(0, "Monstre", TYPE_CREATURE),
      new TradingCard(0, "Sort", TYPE_SPELL),
      new TradingCard(0, "Terrain", TYPE_LAND),
      new TradingCard(0, "Terrain", TYPE_LAND),
      new TradingCard(0, "Sort", TYPE_SPELL),
      new TradingCard(0, "Monstre", TYPE_CREATURE),
      new TradingCard(0, "Terrain", TYPE_LAND),
      new TradingCard(0, "Monstre", TYPE_CREATURE),
      new TradingCard(0, "Sort", TYPE_SPELL),
      new TradingCard(0, "Terrain", TYPE_LAND),
      new TradingCard(0, "Sort", TYPE_SPELL),
      new TradingCard(0, "Sort", TYPE_SPELL),
      new TradingCard(0, "Terrain", TYPE_LAND),
      new TradingCard(0, "Sort", TYPE_SPELL),
      new TradingCard(0, "Monstre", TYPE_CREATURE),
      new TradingCard(0, "Monstre", TYPE_CREATURE),
      new TradingCard(0, "Monstre", TYPE_CREATURE),
      new TradingCard(0, "Sort", TYPE_SPELL),
      new TradingCard(0, "Monstre", TYPE_CREATURE),
      new TradingCard(0, "Monstre", TYPE_CREATURE)
    );

    @Test
    @DisplayName("Regrouper les cartes selon leur type")
    public void SegmentByType() {
        // Créer votre map et la remplir avec les comme demandé depuis le deck mis à disposition.


        // Vérification création et remplissage de la Map
        assertThat(typeCardMap).isInstanceOf(Map.class);
        assertThat(typeCardMap).hasSize(3);
        assertThat(typeCardMap.get(TYPE_CREATURE))
                .isNotNull()
                .hasSize(8);
        assertThat(typeCardMap.get(TYPE_SPELL))
                .isNotNull()
                .hasSize(7);
        assertThat(typeCardMap.get(TYPE_LAND))
                .isNotNull()
                .hasSize(5);

        // Remettre les listes à 0 ici


        // Vérification vidage des listes internes à la map.
        assertThat(typeCardMap).hasSize(3);
        assertThat(typeCardMap.get(TYPE_CREATURE))
                .isNotNull()
                .isEmpty();
        assertThat(typeCardMap.get(TYPE_SPELL))
                .isNotNull()
                .isEmpty();
        assertThat(typeCardMap.get(TYPE_LAND))
                .isNotNull()
                .isEmpty();
    }

    @Test
    @DisplayName("Compter les cartes qui ont le même nom.")
    public void CountCardOfSameName() {
        // Créer la variable nameCardMap et la remplir comme demandé en utilisant le deck mis à disposition.

        assertThat(nameCardMap).isInstanceOf(Map.class);
        assertThat(nameCardMap).hasSize(3);
        assertThat(nameCardMap.get("Monstre")).isEqualTo(8);
        assertThat(nameCardMap.get("Sort")).isEqualTo(7);
        assertThat(nameCardMap.get("Terrain")).isEqualTo(5);
    }
}
