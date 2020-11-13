package pokerV5;

public class CardV5 {
    // card suit: C, H, S, D
    // card rank: 2,3,4,5,6,7,8,9,X,J,Q,K,A
    char suit;
    char rank;

    public CardV5(String card) {
        this.suit = card.charAt(0);
        this.rank = card.charAt(1);
    }

    public char getSuit() {
        return suit;
    }

    public char getRank() {
        return rank;
    }




    public boolean isLessThanOrEqualTo(CardV5 nextCard) {
        if (this.rank == 'A'
                && nextCard.rank != 'A')
            return true;
        if (this.rank == 'K'
                && (nextCard.rank != 'A' || nextCard.rank != 'K'))
            return true;
        if (this.rank == 'Q'
                && (nextCard.rank != 'A' || nextCard.rank != 'K' || nextCard.rank != 'Q'))
            return true;
        if (this.rank == 'J'
                && (nextCard.rank != 'A' || nextCard.rank != 'K' || nextCard.rank != 'Q' || nextCard.rank != 'J'))
            return true;
        if (this.rank == 'X'
                && nextCard.rank <= '9')
            return true;
        if (this.rank <= '9'
                && this.rank > nextCard.rank)
            return true;
        return false;
    }
}
