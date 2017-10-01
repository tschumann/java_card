package java_card

class TestCardPlayer : ICardPlayer {

    // set it to a dummy card to start with as it can't be null
    var cardToPlay: ICard = TestCard(TestSuit(), TestRank(), TestCardGame());

    override fun getIsDealer(): Boolean {
        return false;
    }

    override fun setIsDealer(isDealer: Boolean) {
    }

    override fun receive(card: ICard?) {
    }

    override fun play(played: MutableCollection<CardPlay>?): ICard {
        return cardToPlay;
    }

    override fun seePlayedCards(played: MutableCollection<CardPlay>?) {
    }

    fun setPlayCard(card: ICard) {
        cardToPlay = card;
    }
}
