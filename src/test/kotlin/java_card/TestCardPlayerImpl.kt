package java_card

class TestCardPlayerImpl : ICardPlayer {

    var isDealer: Boolean = false;

    // set it to a dummy card to start with as it can't be null
    var cardToPlay: ICard = TestCardImpl(TestSuitImpl(), TestRankImpl(), TestCardGameImpl());

    override fun getIsDealer(): Boolean {
        return this.isDealer;
    }

    override fun setIsDealer(isDealer: Boolean) {
        this.isDealer = isDealer;
    }

    override fun receive(card: ICard?) {
    }

    override fun play(played: List<CardPlay>?): ICard {
        return this.cardToPlay;
    }

    override fun seePlayedCards(played: List<CardPlay>?) {
    }

    fun setPlayCard(card: ICard) {
        this.cardToPlay = card;
    }
}
