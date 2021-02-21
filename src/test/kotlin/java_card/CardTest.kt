package java_card

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CardTest {

    @Test
    fun testGetAttributes() {
        val suit: TestSuitImpl = TestSuitImpl()
        val rank: TestRankImpl = TestRankImpl()
        val card: TestCardImpl = TestCardImpl(suit, rank, TestCardGameImpl())
        Assertions.assertEquals(suit.ordinal(), card.suit.ordinal())
        Assertions.assertEquals(rank.ordinal(), card.rank.ordinal())
        Assertions.assertNotNull(card.game)
    }
}
