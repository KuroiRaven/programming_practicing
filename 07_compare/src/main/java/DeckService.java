import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;
import java.util.List;

public class DeckService {

    public static String[] getDeckFromDataBase() {
        ObjectMapper mapper = new ObjectMapper();
        String[] cards = new String[29];
        try {
            List<Card> listCard = mapper.readValue(new URL("file:src/main/java/cards.json"), new TypeReference<List<Card>>() {});
            for(int i = 0; i < cards.length; i++) {
                Card card = listCard.get(i);
                String[] line = new String[]{card.name, String.valueOf(card.uniqueId), String.valueOf(card.hp), String.valueOf(card.cost), card.rarity, card.artwork};
                cards[i] = String.join(";", line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return cards;
    }

    private record Card(String name, int uniqueId, int hp, int cost, String rarity, String artwork) {}

}
