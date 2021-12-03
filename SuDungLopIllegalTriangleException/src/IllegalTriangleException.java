public class IllegalTriangleException extends Exception {
    String message;

    public IllegalTriangleException(){}

    public IllegalTriangleException(String message) {
        this.message = message;
    }

    public IllegalTriangleException(String message, String message1) {
        super(message);
        this.message = message1;
    }

    public IllegalTriangleException(String message, Throwable cause, String message1) {
        super(message, cause);
        this.message = message1;
    }

    public IllegalTriangleException(Throwable cause, String message) {
        super(cause);
        this.message = message;
    }

    public IllegalTriangleException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String message1) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.message = message1;
    }

    public String getMessage(){
        return this.message;
    }
}
