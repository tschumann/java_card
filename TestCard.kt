package java_card

class TestCard(suit: ICardSuit, rank: ICardRank, game: ICardGame) : Card(suit, rank, game) {
    override fun compareTo(card: Card): Int {
        return 0;
    }
}
