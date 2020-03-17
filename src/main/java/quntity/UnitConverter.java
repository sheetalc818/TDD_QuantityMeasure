package quntity;

public class UnitConverter {

    public enum ConvertUnit {

        FEET(12.0,TypeOfUnits.LENGTH),
        INCHES(1.0,TypeOfUnits.LENGTH),
        YARD(36.0,TypeOfUnits.LENGTH),
        CENTIMETER(0.393701,TypeOfUnits.LENGTH);

        public TypeOfUnits typeOfUnits;
        public double baseUnit;

        ConvertUnit(double baseUnit, TypeOfUnits typeOfUnits) {
            this.baseUnit = baseUnit;
            this.typeOfUnits = typeOfUnits;
        }
    }
}
