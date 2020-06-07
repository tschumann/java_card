package java_card

import org.junit.Assert
import org.junit.Test

class CardPlayerTest {

    @Test
    fun testIsDealer() {
        val cardPlayer: TestCardPlayerImpl = TestCardPlayerImpl()
        Assert.assertEquals(false, cardPlayer.getIsDealer())
        cardPlayer.setIsDealer(true)
        Assert.assertEquals(true, cardPlayer.getIsDealer())
    }
}