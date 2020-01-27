package java_card

class TestCardImpl(suit: ICardSuit, rank: ICardRank, game: ICardGame) : Card(suit, rank, game) {
    override fun compareTo(other: Card): Int {
        return 0;
    }
}
