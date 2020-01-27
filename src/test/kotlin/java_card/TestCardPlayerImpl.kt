package java_card

class TestCardPlayerImpl : ICardPlayer {

    // set it to a dummy card to start with as it can't be null
    var cardToPlay: ICard = TestCardImpl(TestSuitImpl(), TestRankImpl(), TestCardGameImpl());

    override fun getIsDealer(): Boolean {
        return false;
    }

    override fun setIsDealer(isDealer: Boolean) {
    }

    override fun receive(card: ICard?) {
    }

    override fun play(played: List<CardPlay>?): ICard {
        return cardToPlay;
    }

    override fun seePlayedCards(played: List<CardPlay>?) {
    }

    fun setPlayCard(card: ICard) {
        cardToPlay = card;
    }
}
