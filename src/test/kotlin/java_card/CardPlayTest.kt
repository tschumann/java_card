package java_card

import org.junit.Assert.assertEquals
import org.junit.Test

class CardPlayTest {

    @Test
    fun testGetAttributes() {
        val player = TestCardPlayerImpl();
        val game = TestCardGameImpl();
        val card = TestCardImpl(TestSuitImpl(), TestRankImpl(), game);
        val play = CardPlay(player, card);
        assertEquals(player, play.getPlayer());
        assertEquals(card, play.getCard());
    }
}
