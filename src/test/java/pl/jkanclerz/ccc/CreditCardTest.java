package pl.jkanclerz.ccc;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class CreditCardTest {
    @Test
    public void itCreateCardWithNumber() {
        //Arrange

        //Act
        CreditCard card = new CreditCard("1234-5678");
        //Assert
        Assert.assertEquals(card.getNumber(), "1234-5678");
    }

    @Test
    public void itAllowAssignLimit() {
        //Arrange
        CreditCard card = new CreditCard("1234-5678");
        //Act
        card.assignLimit(new BigDecimal(1000));
        //Assert
        Assert.assertTrue(new BigDecimal(1000).equals(card.currentBallance()));
    }

    @Test
    public void itDenyAssignLimitBelow100() {
        //Arrange
        CreditCard card = new CreditCard("1234-5678");
        //Act
        try {
            card.assignLimit(new BigDecimal(50));
            Assert.fail("should throw exception");
        } catch (CreditBelowLimitException e) {
            Assert.assertTrue(true);
        }
    }
}
