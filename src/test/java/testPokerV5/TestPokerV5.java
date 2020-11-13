package testPokerV5;


import org.junit.jupiter.api.Test;
import pokerV5.CardV5;
import pokerV5.CategoryV5;
import pokerV5.FiveCardsV5;
import pokerV5.PreConditionV5;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPokerV5 {

    // Add your answer to the four test cases for Q1
    @Test
    public void testQ1_1() {
        String[] strCards = {"C2", "C3", "C4", "C5", "C6", "C7"};
        PreConditionV5 preConditionV5 = new PreConditionV5();
        FiveCardsV5 fiveCardsV5 = new FiveCardsV5(strCards, preConditionV5);
        assertEquals(CategoryV5.INVALID, fiveCardsV5.getCategory());
    }

    @Test
    public void testQ1_2() {
        String[] strCards = {"H1", "H2", "H3", "CX", "H9"};
        PreConditionV5 preConditionV5 = new PreConditionV5();
        FiveCardsV5 fiveCardsV5 = new FiveCardsV5(strCards, preConditionV5);
        assertEquals(CategoryV5.NOSORTED, fiveCardsV5.getCategory());
    }

    @Test
    public void testQ1_3() {
        String[] strCards = {"S2", "S3", "S4", "S5", "S6"};
        PreConditionV5 preConditionV5 = new PreConditionV5();
        FiveCardsV5 fiveCardsV5 = new FiveCardsV5(strCards, preConditionV5);
        assertEquals(CategoryV5.FLUSH, fiveCardsV5.getCategory());
    }

    @Test
    public void testQ1_4() {
        String[] strCards = {"D2", "D3", "D4", "D5", "C6"};
        PreConditionV5 preConditionV5 = new PreConditionV5();
        FiveCardsV5 fiveCardsV5 = new FiveCardsV5(strCards, preConditionV5);
        assertEquals(CategoryV5.OTHER, fiveCardsV5.getCategory());
    }

    // Add your answer to the two test cases for Q2
    @Test
    public void testQ2_1() {
        class PreConditionV5Stub extends PreConditionV5 {
            @Override
            public boolean isSorted(CardV5[] fiveCards) {
                return true;
            }
        }

        String[] strCards = {"H6", "H5", "H4", "H2", "H3"};
        PreConditionV5 preConditionV5 = new PreConditionV5Stub();
        FiveCardsV5 fiveCardsV5 = new FiveCardsV5(strCards, preConditionV5);
        assertEquals(CategoryV5.FLUSH,fiveCardsV5.getCategory());
    }

    @Test
    public void testQ2_2() {
        class PreConditionV5Stub extends PreConditionV5 {
            @Override
            public boolean isSorted(CardV5[] fiveCards) {
                return false;
            }
        }
        String[] strCards = {"H6", "H5", "H4", "H2", "H3"};
        PreConditionV5 preConditionV5 = new PreConditionV5Stub();
        FiveCardsV5 fiveCardsV5 = new FiveCardsV5(strCards, preConditionV5);
        assertEquals(CategoryV5.NOSORTED,fiveCardsV5.getCategory());
    }
}
