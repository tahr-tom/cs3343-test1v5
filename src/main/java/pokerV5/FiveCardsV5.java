package pokerV5;

public class FiveCardsV5 {
	// example: C2, D2, HX, SK, DA
	int length;
	CardV5[] cards;
	PreConditionV5 cond;

	public FiveCardsV5(String[] strCards, PreConditionV5 cond) {
		this.length = strCards.length;
		this.cards = new CardV5[length];
		for (int i = 0; i < length; i++) {
			this.cards[i] = new CardV5(strCards[i]);
		}
		this.cond = cond;
	}

	public int getLength() {
		return length;
	}

	public CardV5 getCard(int i) {
		return cards[i];
	}

	// all five cards are of the same suit.
	public boolean isFlush() {
		char suit = cards[0].getSuit();
		for (int i = 1; i < length; i++) {
			if (suit != cards[i].getSuit())
				return false;
		}
		return true;
	}

	public CategoryV5 getCategory() {
		if (length != 5)
			return CategoryV5.INVALID;
		if (!cond.isSorted(cards)) // labeled as S1
			return CategoryV5.NOSORTED;
		if (isFlush())
			return CategoryV5.FLUSH;
		return CategoryV5.OTHER;
	}

}
