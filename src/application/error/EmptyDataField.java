package application.error;

public class EmptyDataField extends Exception {
    public EmptyDataField(String errorMessage) {
        super(errorMessage);
    }
}