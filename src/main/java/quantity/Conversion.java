package quantity;

public class Conversion {

    public enum ConversionOfUnits {

        FEET {
            public double convertToInches( double value) {
                return value*12;
            }

        },INCHES {
            public double convertToInches( double value) {
                return value;
            }

        };
        public double convertToInches(double value) {return 0.0;}
    }
}
