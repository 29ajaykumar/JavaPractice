package exceptiontest1;

import java.io.IOException;
import java.math.BigInteger;

class T {
	public void addNumbers() {
		S s = new S();
		s.addNumbers("100");
	}
	public void subtractNumbers() throws IOException {
		S s = new S();
		s.subtractNumbers("100","50");// checked exception need it handle by throws or try catch
	}
}

class S {
	public BigInteger addNumbers(String s) throws ArithmeticException {
		BigInteger b = new BigInteger(s);
		b = b.add(new BigInteger(s));
		return b;
	}

	 /**
	 * IOException is checked/compiletime exception so need to handle it at the time of calling it
	 */
	
	public BigInteger subtractNumbers(String s1, String s2) throws IOException {
		BigInteger b1 = new BigInteger(s1);
		BigInteger b2 = new BigInteger(s2);
		BigInteger b = b1.subtract(b2);
		try {
			int x = 0;
		}catch(Exception e) {
			
		}
		return b;
	}
}


public class ExceptionTest1 {

	public static void main(String[] args) {
		

	}

}

