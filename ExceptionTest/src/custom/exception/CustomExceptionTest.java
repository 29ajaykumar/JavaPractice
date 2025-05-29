package custom.exception;

import java.math.BigInteger;

class S {

	public BigInteger divide(String s1, String s2) {
		BigInteger b1 = new BigInteger(s1);
		BigInteger b2 = new BigInteger(s2);
		BigInteger b = null;
		try {
			b = b1.divide(b2);
			System.out.println(b);
		} catch (Exception e) {
			throw new CustomException("custom Exception divided by zero " + s1 + "/" + s2, e);
		}
		return b;
	}
}

class CustomException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomException(String message, Throwable th) {
		super(message, th);
	}
}

public class CustomExceptionTest {
	public static void main(String[] args) {
		S s = new S();
		try {
			s.divide("100", "0");
		} catch (CustomException ce) {
			System.out.println(ce.getMessage());
			System.out.println(ce.getLocalizedMessage());
			System.out.println(ce.getCause());
			System.out.println(ce.getClass());
			System.out.println(ce.getStackTrace());
			System.out.println(ce.getSuppressed());
			ce.printStackTrace();
		}
	}
}
