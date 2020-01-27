package java_card;

public class PlayedCard {

    private ICard card;

    private ICardPlayer player;

    private Team team;

    private PlayedCard()
    {
    }

    public PlayedCard(ICard card, ICardPlayer player)
    {
        this.card = card;
        this.player = player;
    }

    public ICard getCard() {
        return this.card;
    }

    public ICardPlayer getPlayer() {
        return this.player;
    }
}
