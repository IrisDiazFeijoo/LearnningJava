package campusdual.com.exceptions;

public class ByZeroException extends ArithmeticException {
    public ByZeroException() {
    }

    public ByZeroException(String s) {
        super(s);
    }
}
