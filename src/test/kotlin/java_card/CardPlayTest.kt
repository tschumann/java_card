package java_card

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CardPlayTest {

    @Test
    fun testGetAttributes() {
        val player: TestCardPlayerImpl = TestCardPlayerImpl()
        val game: TestCardGameImpl = TestCardGameImpl()
        val card: TestCardImpl = TestCardImpl(TestSuitImpl(), TestRankImpl(), game)
        val play: CardPlay = CardPlay(player, card)
        Assertions.assertEquals(player, play.getPlayer())
        Assertions.assertEquals(card, play.getCard())
    }
}
