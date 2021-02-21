package java_card

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PlayedCardTest {

    @Test
    fun testGetAttributes() {
        val player: TestCardPlayerImpl = TestCardPlayerImpl()
        val game: TestCardGameImpl = TestCardGameImpl()
        val card: TestCardImpl = TestCardImpl(TestSuitImpl(), TestRankImpl(), game)
        val playedCard: PlayedCard = PlayedCard(card, player)
        Assertions.assertEquals(card, playedCard.getCard())
        Assertions.assertEquals(player, playedCard.getPlayer())
    }
}
