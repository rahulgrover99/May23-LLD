package exceptions;

public class GateNotFoundException extends RuntimeException {
    public GateNotFoundException(String message) {
        super(message);
    }

    public GateNotFoundException() {
        super("The gate not found.");
    }
}
