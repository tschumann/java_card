package java_card

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Test

class CardTest {

    @Test
    fun testGetAttributes() {
        val suit = TestSuitImpl();
        val rank = TestRankImpl();
        val card = TestCardImpl(suit, rank, TestCardGameImpl());
        assertEquals(suit.ordinal(), card.suit.ordinal());
        assertEquals(rank.ordinal(), card.rank.ordinal());
        assertNotNull(card.game);
    }
}
