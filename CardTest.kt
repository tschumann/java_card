package java_card

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Test

class CardTest {

    class TestSuit : ICardSuit {
        override fun ordinal(): Int {
            return 0;
        }
    }

    class TestRank : ICardRank {
        override fun ordinal(): Int {
            return 0;
        }
    }

    class TestCard(suit: ICardSuit, rank: ICardRank, game: ICardGame) : Card(suit, rank, game) {
        override fun compareTo(card: Card): Int {
            return 0;
        }
    }

    class TestCardGame() : CardGame() {
    }

    @Test
    fun testGetAttributes() {
        val suit = TestSuit();
        val rank = TestRank();
        val card = TestCard(suit, rank, TestCardGame());
        assertEquals(suit.ordinal(), card.suit.ordinal());
        assertEquals(rank.ordinal(), card.rank.ordinal());
        assertNotNull(card.game);
    }
}
