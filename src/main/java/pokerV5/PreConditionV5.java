package pokerV5;

public class PreConditionV5 {

    // check whether cards are sorted by card rank in ascending order
    public boolean isSorted(CardV5[] fiveCards) {
        for (int i = 0; i < fiveCards.length - 1; i++) {
            CardV5 currCard = fiveCards[i];
            CardV5 nextCard = fiveCards[i + 1];


            if (currCard.isLessThanOrEqualTo(nextCard)) return false;



        }
        return true;
    }


}
