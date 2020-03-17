package quntity;

public class UnitManipulatorException extends Exception {
    public enum ExceptionType {
        WRONG_UNIT_TYPE
    }
    public ExceptionType type;
    public UnitManipulatorException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }
}