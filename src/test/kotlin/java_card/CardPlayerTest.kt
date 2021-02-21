package java_card

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CardPlayerTest {

    @Test
    fun testIsDealer() {
        val cardPlayer: TestCardPlayerImpl = TestCardPlayerImpl()
        Assertions.assertEquals(false, cardPlayer.getIsDealer())
        cardPlayer.setIsDealer(true)
        Assertions.assertEquals(true, cardPlayer.getIsDealer())
    }
}