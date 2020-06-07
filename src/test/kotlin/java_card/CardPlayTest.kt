package java_card

import org.junit.Assert.assertEquals
import org.junit.Test

class CardPlayTest {

    @Test
    fun testGetAttributes() {
        val player: TestCardPlayerImpl = TestCardPlayerImpl()
        val game: TestCardGameImpl = TestCardGameImpl()
        val card: TestCardImpl = TestCardImpl(TestSuitImpl(), TestRankImpl(), game)
        val play: CardPlay = CardPlay(player, card)
        assertEquals(player, play.getPlayer())
        assertEquals(card, play.getCard())
    }
}
