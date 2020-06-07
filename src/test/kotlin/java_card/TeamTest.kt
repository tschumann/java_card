package java_card

import org.junit.Assert.assertEquals
import org.junit.Test

class TeamTest {

    @Test
    fun testGetAttributes() {
        val team: TestTeamImpl = TestTeamImpl(1, 2)
        assertEquals(team.id, 1)
        assertEquals(team.wins, 0)
        assertEquals(team.players.size, 0)
    }

    @Test
    fun testAddWin() {
        val team: TestTeamImpl = TestTeamImpl(1, 2)
        assertEquals(team.wins, 0)
        team.addWin()
        assertEquals(team.wins, 1)
    }
}
