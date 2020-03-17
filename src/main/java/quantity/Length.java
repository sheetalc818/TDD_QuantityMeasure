package quantity;

public class Length {

    private static final double FEET_TO_INCH = 12;
    private final Unit unit;
    private final double value;

    public Length(Unit unit, double value) {
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
        return false;
    }
}
