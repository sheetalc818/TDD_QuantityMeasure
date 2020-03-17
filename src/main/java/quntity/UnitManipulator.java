package quntity;

public class UnitManipulator {

    public double value = 0;
    public UnitConverter.ConvertUnit unit;

    public static double convertion(double input) {
        double result = input * 12.00;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return false;
        if (o == null || getClass() != o.getClass()) return false;
        UnitManipulator length = (UnitManipulator) o;
        return Double.compare(length.value, value) == 0 &&
                unit == length.unit;
    }

    public UnitManipulator(UnitConverter.ConvertUnit unit, double value) {
        this.value = value;
        this.unit = unit;
    }

    public static boolean compare(UnitManipulator input1, UnitManipulator input2) throws UnitManipulatorException {
        if (input1.unit.typeOfUnits.equals(input2.unit.typeOfUnits)) {
            Double firstValue = Double.valueOf((Math.round(input1.value * input1.unit.baseUnit)));
            Double secondValue = Double.valueOf(Math.round(input2.value * input2.unit.baseUnit));
            return firstValue.equals(secondValue);
        }
        throw new UnitManipulatorException("Unit type not compatible", UnitManipulatorException
                .ExceptionType.WRONG_UNIT_TYPE);
    }
}
