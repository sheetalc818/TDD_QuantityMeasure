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
}
