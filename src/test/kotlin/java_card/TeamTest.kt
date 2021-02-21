package java_card

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TeamTest {

    @Test
    fun testGetAttributes() {
        val team: TestTeamImpl = TestTeamImpl(1, 2)
        Assertions.assertEquals(team.id, 1)
        Assertions.assertEquals(team.wins, 0)
        Assertions.assertEquals(team.players.size, 0)
    }

    @Test
    fun testAddWin() {
        val team: TestTeamImpl = TestTeamImpl(1, 2)
        Assertions.assertEquals(team.wins, 0)
        team.addWin()
        Assertions.assertEquals(team.wins, 1)
    }
}
