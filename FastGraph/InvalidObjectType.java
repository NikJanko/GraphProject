package FastGraph;

public class InvalidObjectType extends RuntimeException {
    public InvalidObjectType() {
        super("Object type is not valid in this instance.");
    }
}
