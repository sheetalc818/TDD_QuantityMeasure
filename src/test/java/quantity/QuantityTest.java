package quantity;

import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {

    @Test
    public void given1InchAnd1InchIfEquals_Should_ReturnTrue() {
        Length inch1 = new Length(quantity.Unit.INCH, 1.0);
        Length inch2 = new Length(quantity.Unit.INCH, 1.0);
        boolean result = inch1.compareCheck(inch2);
        Assert.assertTrue(result);
    }

    @Test
    public void given1feetAnd1inchIfNotEqual_ShouldReturnFalse() {
        Length feet = new Length(quantity.Unit.FEET, 1.0);
        Length inch = new Length(quantity.Unit.INCH, 1.0);
        boolean compareCheck = feet.compareCheck(inch);
        Assert.assertFalse(compareCheck);
    }
}
