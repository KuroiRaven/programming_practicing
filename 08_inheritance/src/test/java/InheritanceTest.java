import org.junit.jupiter.api.*;

import java.lang.reflect.Field;
import java.util.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class InheritanceTest {
    private final Creature creature = new Creature(
            "Knight Examplar",
            "Human Knight",
            "If you think you are brave enough to walk the path of honor, follow me into the dragon's den.",
            192,
            2023,
            2,
            "Regular",
            "Knight_on_a_horse.jpg",
            2,
            2
    );
    private final Enchantment enchantment = new Enchantment(
            "Quest for ancient secrets",
            "Regular",
            "",
            249,
            59,
            1,
            "Regular",
            "Enchanter_in_front_of_a_cavern.jpg",
            "Whenever a card is put into your graveyard from anywhere, you may put a quest counter on Query for Ancient Secrets. Remove five quest counters from Quest for Ancient Secrets and sacrifice it: Target player shuffle his or her graveyard into his or her library.",
            "As long as the card is on the battlefield",
            null
    );
    private final Ritual ritual = new Ritual(
            "Pyretic Ritual",
            "Instant",
            "The Multiverse is filled with limitless power just waiting for someone to reach out and seize it.",
            249,
            153,
            1,
            "Regular",
            "Enchanter_in_front_of_fire.jpg",
            "Adds 3 fire mana to your pool.",
            "Instantaneous",
            null
    );
    private final Terrain terrain = new Terrain(
            "Plaine",
            "Terrain de base",
            null,
            259,
            260,
            0,
            "Regular",
            "City.jpg",
            1
    );
    private final Trap trap = new Trap(
            "Refraction Trap",
            "Instant",
            "null",
            145,
            17,
            3,
            "Regular",
            "Gnome.jpg",
            "Prevent the next 3 damage that a source of your choice would deal to you and/or permanents you control this turn.",
            "If an opponent cast a red instant or sorcery spell this turn, you may pay 1 sun rather than pay Refraction Trap's mana cost."
    );

    @Test
    @Order(0)
    @DisplayName("Ensures that the expected abstract classes are")
    void expectedTypes() {
        // Validation - Do not touch
        assertThat(TradingCard.class).isAbstract();
        assertThat(Spell.class).isAbstract();
    }

    @Test
    @Order(1)
    @DisplayName("Different card types should display their characteristics with toString")
    void toStringAble() {
        // Alternative options
        Enchantment enchantmentWithTarget = new Enchantment("Quest for ancient secrets",
                "Regular",
                "",
                249,
                59,
                1,
                "Regular",
                "Enchanter_in_front_of_a_cavern.jpg",
                "Whenever a card is put into your graveyard from anywhere, you may put a quest counter on Query for Ancient Secrets. Remove five quest counters from Quest for Ancient Secrets and sacrifice it: Target player shuffle his or her graveyard into his or her library.",
                "As long as the card is on the battlefield",
                this.creature);
        Ritual ritualWithTargets = new Ritual(
                "Pyretic Ritual",
                "Instant",
                "The Multiverse is filled with limitless power just waiting for someone to reach out and seize it.",
                249,
                153,
                1,
                "Regular",
                "Enchanter_in_front_of_fire.jpg",
                "Adds 3 fire mana to your pool.",
                "Instantaneous",
                Collections.singletonList(this.creature)
        );

        // Validation - Do not change.
        assertThat(this.creature.info()).isEqualTo("Card Knight Examplar, cost 2 when played. Basic creature, will fight and die for your cause. It has 2 damage points and 2 health points.");
        assertThat(this.enchantment.info()).isEqualTo("Card Quest for ancient secrets, cost 1 when played. Its effect is: Whenever a card is put into your graveyard from anywhere, you may put a quest counter on Query for Ancient Secrets. Remove five quest counters from Quest for Ancient Secrets and sacrifice it: Target player shuffle his or her graveyard into his or her library. and its duration is: As long as the card is on the battlefield. It doesn't have a target yet. Please, choose one.");
        assertThat(enchantmentWithTarget.info()).isEqualTo("Card Quest for ancient secrets, cost 1 when played. Its effect is: Whenever a card is put into your graveyard from anywhere, you may put a quest counter on Query for Ancient Secrets. Remove five quest counters from Quest for Ancient Secrets and sacrifice it: Target player shuffle his or her graveyard into his or her library. and its duration is: As long as the card is on the battlefield. Its current target is: " + this.creature);
        assertThat(this.ritual.info()).isEqualTo("Card Pyretic Ritual, cost 1 when played. Its effect is: Adds 3 fire mana to your pool. and its duration is: Instantaneous. You'll have to pick one or multiple target when you activate it ! Its current targets are: not defined yet. Please pick at least one.");
        assertThat(ritualWithTargets.info()).isEqualTo("Card Pyretic Ritual, cost 1 when played. Its effect is: Adds 3 fire mana to your pool. and its duration is: Instantaneous. You'll have to pick one or multiple target when you activate it ! Its current targets are: [Knight Examplar - 192/2023]");
        assertThat(this.terrain.info()).isEqualTo("Card Plaine, cost 0 when played. Adds 1 mana of the type of the card when on the battlefield !");
        assertThat(this.trap.info()).isEqualTo("Card Refraction Trap, cost 3 when played. This card is triggered upon the following event: \"If an opponent cast a red instant or sorcery spell this turn, you may pay 1 sun rather than pay Refraction Trap's mana cost.\".\nits effect is: \"Prevent the next 3 damage that a source of your choice would deal to you and/or permanents you control this turn.\"");
    }

    @Test
    @Order(2)
    @DisplayName("Your deck should contain at least 12 cards of 3 different types")
    void buildDeckTest() {
        Deck deck = new Deck();

        // Add your cards to the deck (You can pick from the cards that have already been set up above).

        // Validation - Do not change.
        assertThat(deck.size()).isGreaterThanOrEqualTo(12);
        assertThat(getNumberOfSubtypes(deck)).isGreaterThanOrEqualTo(3);
    }

    @Test
    @Order(3)
    @DisplayName("Deck can Draw the first card of the pack")
    void shouldBeAbleToDrawAnyCard() {
        // Create two cards and add them to your deck (You can pick from the cards that have already been set up above).
        TradingCard card1 = null;
        TradingCard card2 = null;

        // Add them to the deck
        Deck deck = new Deck();

        // Validation - Do not change
        assertThat(deck.size()).as("Deck has the expected size").isEqualTo(2);

        // Play a card
        TradingCard drawn = deck.draw();

        // Validation - Do not change.
        assertThat(deck.size()).as("Deck size has been reduced by one").isEqualTo(1);
        assertThat(drawn).as("Drawn card is the first one").isEqualTo(card1);
    }

    @Test
    @Order(4)
    @DisplayName("Deck can Discard any amount of cards, until there is no more cards in it")
    void shouldBeAbleToDiscardAnyAmountOfCard() {
        // Create four cards and add them to your deck (You can use the ones that have already been set up above).
        TradingCard card1 = null;
        TradingCard card2 = null;
        TradingCard card3 = null;
        TradingCard card4 = null;

        // Add them to the deck
        Deck deck = new Deck();

        // Create another deck with 1 card only
        Deck deck2 = new Deck();

        // Discard 3 cards from the 2 decks
        String discardResult = deck.discard(3);
        String discardResult2 = deck2.discard(3);

        // Validation - Do not change
        assertThat(discardResult).as("Discarded cards from the first deck are the expected ones").isEqualTo("Discarded cards: \n" + card1 + "\n" + card2 + "\n" + card3 + "\n");
        assertThat(discardResult2).as("Discarded cards from the second deck are the expected ones").isEqualTo("Discarded cards: \n" + card1 + "\n");
        assertThat(deck.size()).as("Deck size has been reduced by 3").isEqualTo(1);
        assertThat(deck2.size()).as("Deck size has been reduced by the max amount").isEqualTo(0);
    }

    // Internal method, do not modify
    private int getNumberOfSubtypes(Deck deck) {
        Field cardsField = null;
        try {
            cardsField = Deck.class.getDeclaredField("cards");
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
        cardsField.setAccessible(true);

        try {
            ArrayList<TradingCard> cards = (ArrayList<TradingCard>) cardsField.get(deck);
            Set<Class<? extends TradingCard>> cardsTypes = new HashSet<>();
            cards.forEach(card -> cardsTypes.add(card.getClass()));

            return cardsTypes.size();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
