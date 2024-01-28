package max.seminar1;

import org.junit.Ignore;
import org.junit.jupiter.api.*;
import org.max.seminar1.Card;
import org.max.seminar1.Deck;
import org.max.seminar1.exception.DeckEmptyException;
import org.max.seminar1.type.Ranks;
import org.max.seminar1.type.Suits;

import java.util.ArrayList;
import java.util.List;
/*@Ignore
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CardTest {
    static List<Card> cards;
    static Deck deck;

    @BeforeAll
    static void beforeAll() {
        cards = new ArrayList<>();
        deck = new Deck(cards);
    }

    @BeforeEach
    void clean(){
        cards.clear();
    }

    @Test
    @Order(1)
    void emptyDeck() {
        System.out.println("emptyDeck");

        Assertions.assertThrows(DeckEmptyException.class, deck::getCard);
    }

    @Test
    @Order(2)
    void nonEmptyDeck() throws DeckEmptyException {
        System.out.println("nonEmptyDeck");
        Card card = new Card(Ranks.EIGHT, Suits.CLUBS);
        cards.add(card);
        Card actual = deck.getCard();
        Assertions.assertEquals(card, actual);
        Assertions.assertEquals(0, deck.getCards().size());
    }

    @Test
    @Order(3)
    void nonEmptyDeckWithTwoCards() throws DeckEmptyException {
        System.out.println("nonEmptyDeckWithTwoCards");
        Card card1 = new Card(Ranks.TWO, Suits.DIAMONDS);
        Card card2 = new Card(Ranks.TEN, Suits.HEARTS);
        cards.add(card1);
        cards.add(card2);
        Card actual = deck.getCard();
        Assertions.assertEquals(card1, actual);
        Assertions.assertEquals(1, deck.getCards().size());
    }
}*/
