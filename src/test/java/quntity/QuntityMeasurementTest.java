package quntity;

//https://stackoverflow.com/questions/4501061/java-null-check-why-use-instead-of-equals

import org.junit.Assert;
import org.junit.Test;

public class QuntityMeasurementTest {

    boolean compareCheck = false;

    @Test
    public void given0feetAnd0feetIfEqual_ShouldReturnTrue() {
        UnitManipulator feet1 = new UnitManipulator(UnitConverter.ConvertUnit.FEET, 0.0);
        UnitManipulator feet2 = new UnitManipulator(UnitConverter.ConvertUnit.FEET, 0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given0feetAnd1FeetValues_ShouldReturnFalse() {
        UnitManipulator feet1 = new UnitManipulator(UnitConverter.ConvertUnit.FEET, 0.0);
        UnitManipulator feet2 = new UnitManipulator(UnitConverter.ConvertUnit.FEET, 1.0);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenOneNUllValueShouldReturnFalse() {
        UnitManipulator feet1 = new UnitManipulator(UnitConverter.ConvertUnit.FEET, 3.0);
        feet1.equals(null);
        Assert.assertFalse(false);
    }

    @Test
    public void given0InchAnd0InchIfEqual_ShouldReturnTrue() {
        UnitManipulator inch1 = new UnitManipulator(UnitConverter.ConvertUnit.INCHES, 0.0);
        UnitManipulator inch2 = new UnitManipulator(UnitConverter.ConvertUnit.INCHES, 0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void givenDifferentInchValues_ShouldReturnFalse() {
        UnitManipulator inch1 = new UnitManipulator(UnitConverter.ConvertUnit.INCHES, 0.0);
        UnitManipulator inch2 = new UnitManipulator(UnitConverter.ConvertUnit.INCHES, 1.0);
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnFalse() {
        UnitManipulator inch1 = new UnitManipulator(UnitConverter.ConvertUnit.INCHES, 1.0);
        UnitManipulator feet1 = new UnitManipulator(UnitConverter.ConvertUnit.FEET, 1.0);
        Assert.assertNotEquals(inch1, feet1);
    }

    @Test
    public void given0InchAnd0Feet_ShouldReturnEqual() {
        try {
            UnitManipulator feet1 = new UnitManipulator(UnitConverter.ConvertUnit.FEET, 0.0);
            UnitManipulator inches1 = new UnitManipulator(UnitConverter.ConvertUnit.INCHES, 0.0);
            compareCheck = UnitManipulator.compare(feet1, inches1);
            Assert.assertTrue(compareCheck);
        } catch (UnitManipulatorException e) {
            e.printStackTrace();
            Assert.assertEquals(UnitManipulatorException.ExceptionType.WRONG_UNIT_TYPE, e.type);
        }
    }

    @Test
    public void given1FeetAnd1FeetIfEqual_ShouldReturnTrue() {
        try {
            UnitManipulator feet1 = new UnitManipulator(UnitConverter.ConvertUnit.FEET, 1.0);
            UnitManipulator feet2 = new UnitManipulator(UnitConverter.ConvertUnit.FEET, 1.0);
            compareCheck = UnitManipulator.compare(feet1, feet2);
            Assert.assertTrue(compareCheck);
        } catch (UnitManipulatorException e) {
            Assert.assertEquals(UnitManipulatorException.ExceptionType.WRONG_UNIT_TYPE, e.type);
        }
    }

    @Test
    public void given1feetAnd1inchIfNotEqual_ShouldReturnFalse() {
        try {
            UnitManipulator feet = new UnitManipulator(UnitConverter.ConvertUnit.FEET, 1.0);
            UnitManipulator inch = new UnitManipulator(UnitConverter.ConvertUnit.INCHES, 1.0);
            compareCheck = UnitManipulator.compare(feet, inch);
            Assert.assertFalse(compareCheck);
        } catch (UnitManipulatorException e) {
            Assert.assertEquals(UnitManipulatorException.ExceptionType.WRONG_UNIT_TYPE, e.type);
        }
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEqual() {
        try {
            UnitManipulator feet1 = new UnitManipulator(UnitConverter.ConvertUnit.FEET, 1.0);
            UnitManipulator inches1 = new UnitManipulator(UnitConverter.ConvertUnit.INCHES, 1.0);
            compareCheck = UnitManipulator.compare(feet1, inches1);
            Assert.assertFalse(compareCheck);
        } catch (UnitManipulatorException e) {
            Assert.assertEquals(UnitManipulatorException.ExceptionType.WRONG_UNIT_TYPE, e.type);
        }
    }

    @Test
    public void given1InchAnd1InchIfEquals_Should_ReturnTrue() {
        try {
            UnitManipulator inch1 = new UnitManipulator(UnitConverter.ConvertUnit.INCHES, 1.0);
            UnitManipulator inch2 = new UnitManipulator(UnitConverter.ConvertUnit.INCHES, 1.0);
            compareCheck = UnitManipulator.compare(inch1, inch2);
            Assert.assertTrue(compareCheck);
        } catch (UnitManipulatorException e) {
            Assert.assertEquals(UnitManipulatorException.ExceptionType.WRONG_UNIT_TYPE, e.type);
        }
    }

    @Test
    public void given1FeetAnd12InchIfEquals_ShouldReturnTrue() {
        try {
            UnitManipulator inch1 = new UnitManipulator(UnitConverter.ConvertUnit.FEET, 1.0);
            UnitManipulator inch2 = new UnitManipulator(UnitConverter.ConvertUnit.INCHES, 12.0);
            compareCheck = UnitManipulator.compare(inch1, inch2);
            Assert.assertTrue(compareCheck);
        } catch (UnitManipulatorException e) {
            Assert.assertEquals(UnitManipulatorException.ExceptionType.WRONG_UNIT_TYPE, e.type);
        }
    }

    @Test
    public void given12InchAnd1FeetIfEquals_ShouldReturnTrue() {
        try {
            UnitManipulator inch1 = new UnitManipulator(UnitConverter.ConvertUnit.INCHES, 12.0);
            UnitManipulator inch2 = new UnitManipulator(UnitConverter.ConvertUnit.FEET, 1.0);
            compareCheck = UnitManipulator.compare(inch1, inch2);
            Assert.assertTrue(compareCheck);
        } catch (UnitManipulatorException e) {
            Assert.assertEquals(UnitManipulatorException.ExceptionType.WRONG_UNIT_TYPE, e.type);
        }
    }

    @Test
    public void given3feetAnd1yardIfEquals_ShouldReturnTrue() {
        try {
            UnitManipulator feet = new UnitManipulator(UnitConverter.ConvertUnit.FEET, 3);
            UnitManipulator yard = new UnitManipulator(UnitConverter.ConvertUnit.YARD, 1);
            compareCheck = UnitManipulator.compare(feet, yard);
            Assert.assertTrue(compareCheck);
        } catch (UnitManipulatorException e) {
            Assert.assertEquals(UnitManipulatorException.ExceptionType.WRONG_UNIT_TYPE, e.type);
        }
    }

    @Test
    public void given1feetAnd1yardIfEquals_ShouldReturnfalse() {
        try {
            UnitManipulator feet = new UnitManipulator(UnitConverter.ConvertUnit.FEET, 1);
            UnitManipulator yard = new UnitManipulator(UnitConverter.ConvertUnit.YARD, 1);
            compareCheck = UnitManipulator.compare(feet, yard);
            Assert.assertFalse(compareCheck);
        } catch (UnitManipulatorException e) {
            Assert.assertEquals(UnitManipulatorException.ExceptionType.WRONG_UNIT_TYPE, e.type);
        }
    }

    @Test
    public void given1inchAnd1yardIfEquals_ShouldReturnFalse() {
        try {
            UnitManipulator feet = new UnitManipulator(UnitConverter.ConvertUnit.INCHES, 1);
            UnitManipulator yard = new UnitManipulator(UnitConverter.ConvertUnit.YARD, 1);
            compareCheck = UnitManipulator.compare(feet, yard);
            Assert.assertFalse(compareCheck);
        } catch (UnitManipulatorException e) {
            Assert.assertEquals(UnitManipulatorException.ExceptionType.WRONG_UNIT_TYPE, e.type);
        }
    }

    @Test
    public void given0YardAnd0Yard_ShouldReturnTrue() {
        UnitManipulator yard1 = new UnitManipulator(UnitConverter.ConvertUnit.YARD, 0.0);
        UnitManipulator yard2 = new UnitManipulator(UnitConverter.ConvertUnit.YARD, 0.0);
        Assert.assertEquals(yard1, yard2);

    }

    @Test
    public void given0yardAnd1yardValues_ShouldReturnFalse() {
        UnitManipulator yard1 = new UnitManipulator(UnitConverter.ConvertUnit.YARD, 0.0);
        UnitManipulator yard2 = new UnitManipulator(UnitConverter.ConvertUnit.YARD, 1.0);
        Assert.assertNotEquals(yard1, yard2);
    }

    @Test
    public void givenOneNUllValueForYardUnitShouldReturnFalse() {
        UnitManipulator yard1 = new UnitManipulator(UnitConverter.ConvertUnit.YARD, 3.0);
        yard1.equals(null);
        Assert.assertFalse(false);
    }

    @Test
    public void given1yardAnd36feetIfEquals_ShouldReturnFalse() {
        try {
            UnitManipulator yard = new UnitManipulator(UnitConverter.ConvertUnit.YARD, 1);
            UnitManipulator feet = new UnitManipulator(UnitConverter.ConvertUnit.FEET, 36);
            compareCheck = UnitManipulator.compare(yard, feet);
            Assert.assertFalse(compareCheck);
        } catch (UnitManipulatorException e) {
            Assert.assertEquals(UnitManipulatorException.ExceptionType.WRONG_UNIT_TYPE, e.type);
        }
    }

    @Test
    public void given36inchesAnd1yardIfEquals_ShouldReturnTrue() {
        try {
            UnitManipulator inches = new UnitManipulator(UnitConverter.ConvertUnit.INCHES, 36);
            UnitManipulator yard = new UnitManipulator(UnitConverter.ConvertUnit.YARD, 1);

            compareCheck = UnitManipulator.compare(inches, yard);
            Assert.assertTrue(compareCheck);
        } catch (UnitManipulatorException e) {
            Assert.assertEquals(UnitManipulatorException.ExceptionType.WRONG_UNIT_TYPE, e.type);
        }
    }

    @Test
    public void given1yardAnd3feetIfEquals_ShouldReturnTrue() {
        try {
            UnitManipulator yard = new UnitManipulator(UnitConverter.ConvertUnit.YARD, 1);
            UnitManipulator inches = new UnitManipulator(UnitConverter.ConvertUnit.INCHES, 36);
            compareCheck = UnitManipulator.compare(yard, inches);
            Assert.assertTrue(compareCheck);
        } catch (UnitManipulatorException e) {
            Assert.assertEquals(UnitManipulatorException.ExceptionType.WRONG_UNIT_TYPE, e.type);
        }
    }

    @Test
    public void given2InchAnd5CmIfEquals__ShouldReturnTrue() {
        try {
            UnitManipulator inches = new UnitManipulator(UnitConverter.ConvertUnit.INCHES, 2);
            UnitManipulator cm = new UnitManipulator(UnitConverter.ConvertUnit.CENTIMETER, 5);
            compareCheck = UnitManipulator.compare(inches,cm);
            Assert.assertTrue(compareCheck);
        } catch (UnitManipulatorException e) {
            Assert.assertEquals(UnitManipulatorException.ExceptionType.WRONG_UNIT_TYPE, e.type);
        }
    }
}
