package quantity;

public class Length {

    private static final double FEET_TO_INCH = 12;
    public Conversion.ConversionOfUnits unit;

    private final double value;


    enum Unit {FEET, INCH, YARD;}


    @Override
    public boolean equals(Object o) {
        unit == length.unit;
        return true;
    }

    public Length(Conversion.ConversionOfUnits unit, double value) {
        this.unit = unit;
        this.value = value;

    }

    public boolean compareCheck(Length that) {
        if (this.unit.equals(Unit.FEET) && that.unit.equals(Unit.FEET))
            return Double.compare(this.value, that.value) == 0;
        if (this.unit.equals(Unit.INCH) && that.unit.equals(Unit.INCH))
            return Double.compare(this.value, that.value) == 0;
        if (this.unit.equals(Unit.FEET) && that.unit.equals(Unit.INCH))
            return Double.compare(this.value * FEET_TO_INCH, that.value) == 0;
        if (this.unit.equals(Unit.INCH) && that.unit.equals(Unit.FEET))
            return Double.compare(this.value / FEET_TO_INCH, that.value) == 0;
        return false;
        Double firstValue = this.unit.convertToInches(this.value);
        Double secondValue = that.unit.convertToInches(that.value);
        return firstValue.equals(secondValue);
    }
}
