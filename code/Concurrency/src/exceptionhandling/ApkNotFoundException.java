package exceptionhandling;

public class ApkNotFoundException extends Exception {

    ApkNotFoundException() {

    }

    ApkNotFoundException(String errorMessage) {
        super(errorMessage);
    }

}
