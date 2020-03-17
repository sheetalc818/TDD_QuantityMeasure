package quantity;

import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {

    @Test
    public void given0feetAnd0feetIfEqual_ShouldReturnTrue() {
        Length feet1 = new Length(Conversion.ConversionOfUnits.FEET,0.0);
        Length feet2 = new Length(Conversion.ConversionOfUnits.FEET,0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given0feetAnd1inchValues_ShouldReturnFalse() {
        Length feet1 = new Length(Conversion.ConversionOfUnits.FEET,0.0);
        Length feet2 = new Length(Conversion.ConversionOfUnits.FEET,1.0);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenOneNUllValueShouldReturnFalse() {
        Length feet1 = new Length(Conversion.ConversionOfUnits.FEET,3.0);
        feet1.equals(null);
        Assert.assertFalse(false);
    }
    @Test
    public void given0InchAnd0InchIfEqual_ShouldReturnTrue() {
        Length inch1 = new Length(Conversion.ConversionOfUnits.INCHES,0.0);
        Length inch2 = new Length(Conversion.ConversionOfUnits.INCHES,0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void givenDifferentInchValues_ShouldReturnFalse() {
        Length inch1 = new Length(Conversion.ConversionOfUnits.INCHES,0.0);
        Length inch2 = new Length(Conversion.ConversionOfUnits.INCHES,1.0);
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnFalse() {
        Length inch1 = new Length(Conversion.ConversionOfUnits.INCHES,1.0);
        Length feet1 = new Length(Conversion.ConversionOfUnits.FEET,1.0);
        Assert.assertNotEquals(inch1, feet1);
    }

    @Test
    public void given0InchAnd0Feet_ShouldReturnEqual() {
        Length feet1 = new Length(Conversion.ConversionOfUnits.FEET, 0.0);
        Length inches1 = new Length(Conversion.ConversionOfUnits.INCHES, 0.0);
        boolean check = feet1.compareCheck(inches1);
        Assert.assertTrue(check);
    }

    @Test
    public void given1InchAnd1Feet_ShouldReturnNotEqual() {
        Length feet1 = new Length(Conversion.ConversionOfUnits.FEET, 1.0);
        Length inches1 = new Length(Conversion.ConversionOfUnits.INCHES, 1.0);
        boolean check = feet1.compareCheck(inches1);
        Assert.assertFalse(check);
    }

    @Test
    public void given1FeetAnd1FeetIfEqual_ShouldReturnTrue() {
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        Length feet2 = new Length(Length.Unit.FEET, 1.0);
        Length feet1 = new Length(Conversion.ConversionOfUnits.FEET, 1.0);
        Length feet2 = new Length(Conversion.ConversionOfUnits.FEET, 1.0);
        boolean result = feet1.compareCheck(feet2);
        Assert.assertTrue(result);
    }

    @Test
    public void given1InchAnd1InhIfEquals_Should_ReturnTrue() {
        Length inch1 = new Length(Conversion.ConversionOfUnits.INCHES, 1.0);
        Length inch2 = new Length(Conversion.ConversionOfUnits.INCHES, 1.0);
        boolean result = inch1.compareCheck(inch2);
        Assert.assertTrue(result);
    }

    @Test
    public void given1feetAnd1inchIfNotEqual_ShouldReturnFalse() {
        Length feet = new Length(Conversion.ConversionOfUnits.FEET, 1.0);
        Length inch = new Length(Conversion.ConversionOfUnits.INCHES, 1.0);
        boolean compareCheck = feet.compareCheck(inch);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1InchAnd1FeetIfNotEqual_ShouldReturnFalse() {
        Length inch = new Length(Conversion.ConversionOfUnits.INCHES, 1.0);
        Length feet = new Length(Conversion.ConversionOfUnits.FEET, 1.0);
        boolean compareCheck = inch.compareCheck(feet);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1feetAnd12inches_ShouldReturnTrue() {
        Length feet = new Length(Conversion.ConversionOfUnits.FEET, 1.0);
        Length inch = new Length(Conversion.ConversionOfUnits.INCHES, 12.0);
        boolean compareCheck = feet.compareCheck(inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given12InchesAnd1Feet_ShouldReturnTrue() {
        Length inches = new Length(Conversion.ConversionOfUnits.INCHES, 12.0);
        Length feet = new Length(Conversion.ConversionOfUnits.FEET, 1.0);
        boolean compareCheck = inches.compareCheck(feet);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given3FeetAnd12Inch_ShouldReturnFalse() {
        Length inches = new Length(Conversion.ConversionOfUnits.INCHES, 12.0);
        Length feet = new Length(Conversion.ConversionOfUnits.FEET,3.0);
        boolean compareCheck = inches.compareCheck(feet);
        Assert.assertFalse(compareCheck);
    }
}
