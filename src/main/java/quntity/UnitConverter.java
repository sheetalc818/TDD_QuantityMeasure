package quntity;

public class UnitConverter {

    public enum ConvertUnit {

        FEET(12.0,TypeOfUnits.LENGTH),
        INCHES(1.0,TypeOfUnits.LENGTH),
        YARD(36.0,TypeOfUnits.LENGTH),
        CENTIMETER(0.393701,TypeOfUnits.LENGTH),
        GALLONS(3.78,TypeOfUnits.VOLUME),
        LITRE(1.00, TypeOfUnits.VOLUME),
        ML(0.1000,TypeOfUnits.VOLUME),
        GRAMS(1.00, TypeOfUnits.WEIGHT),
        KG(1000,TypeOfUnits.WEIGHT),
        TONNE(1000000, TypeOfUnits.WEIGHT),
        CELSIUS(0.0,TypeOfUnits.TEMPERATURE),
        FAHRENHEIT(0.0,TypeOfUnits.TEMPERATURE);

        public TypeOfUnits typeOfUnits;
        public double baseUnit;

        ConvertUnit(double baseUnit, TypeOfUnits typeOfUnits) {
            this.baseUnit = baseUnit;
            this.typeOfUnits = typeOfUnits;
        }
    }
}
