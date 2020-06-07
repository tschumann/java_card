package java_card

import org.junit.Assert.assertEquals
import org.junit.Test

class PlayedCardTest {

    @Test
    fun testGetAttributes() {
        val player: TestCardPlayerImpl = TestCardPlayerImpl()
        val game: TestCardGameImpl = TestCardGameImpl()
        val card: TestCardImpl = TestCardImpl(TestSuitImpl(), TestRankImpl(), game)
        val playedCard: PlayedCard = PlayedCard(card, player)
        assertEquals(card, playedCard.getCard())
        assertEquals(player, playedCard.getPlayer())
    }
}
