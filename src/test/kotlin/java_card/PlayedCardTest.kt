package java_card

import org.junit.Assert.assertEquals
import org.junit.Test

class PlayedCardTest {

    @Test
    fun testGetAttributes() {
        val player = TestCardPlayerImpl();
        val game = TestCardGameImpl();
        val card = TestCardImpl(TestSuitImpl(), TestRankImpl(), game);
        val playedCard = PlayedCard(card, player);
        assertEquals(card, playedCard.getCard());
        assertEquals(player, playedCard.getPlayer());
    }
}
