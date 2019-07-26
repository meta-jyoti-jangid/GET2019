/**
 * class HexCalc that supports following methods for hexadecimal arithmetic
 * 
 * @author jyoti
 *
 */
public class HexCalc {

	/**
	 * @param decimal
	 *            takes decimal as argument and convert it into hexadecimal
	 * @return returns hexadecimal
	 */
	String decimalToHexa(int decimal) {
		int rem;
		String hex = "";
		char hexchars[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
				'A', 'B', 'C', 'D', 'E', 'F' };
		while (decimal > 0) {
			rem = decimal % 16;
			hex = hexchars[rem] + hex;
			decimal = decimal / 16;
		}
		return hex;
	}

	/**
	 * @param hexa
	 *            takes hexadecimal as parameter and converts it into decimal
	 * @return returns decimal value
	 */
	int hexToDecimal(String hexa) {
		String d = "0123456789ABCDEF";
		hexa = hexa.toUpperCase();
		int value = 0;
		for (int i = 0; i < hexa.length(); i++) {
			char c = hexa.charAt(i);
			int digit = d.indexOf(c);
			value = 16 * value + digit;
		}
		return value;
	}

	/**
	 * @param aString
	 *            as hexadecimal
	 * @param bString
	 *            as hexadecimal
	 * @return returns addition of two hexadecimal string
	 */
	public String add(String aString, String bString) {

		int decimal1 = 0, decimal2;
		try {
			decimal1 = hexToDecimal(aString);
			decimal2 = hexToDecimal(bString);
			decimal1 += decimal2;
		} catch (Exception e) {
			System.out.println("addition can't be performed");
		}
		return decimalToHexa(decimal1);
	}

	/**
	 * @param aString
	 *            and @param bString are hexadecimal numbers
	 * @return returns subtraction of aString and bString in hexadecimal as a
	 *         string
	 */
	public String subtract(String aString, String bString) {

		int decimal1 = 0, decimal2;
		try {
			decimal1 = hexToDecimal(aString);
			decimal2 = hexToDecimal(bString);
			decimal1 -= decimal2;
			if (decimal1 < 0)
				decimal1 *= -1;
		} catch (Exception e) {
			System.out.println("substraction cant be performed");
		}
		return decimalToHexa(decimal1);
	}

	/**
	 * @param aString
	 *            and @param bString are hexadecimal numbers
	 * @return returns multiplication of aString and bString in hexadecimal as a
	 *         string
	 */
	public String multiply(String aString, String bString) {

		int decimal1 = 0, decimal2;
		try {
			decimal1 = hexToDecimal(aString);
			decimal2 = hexToDecimal(bString);
			decimal1 *= decimal2;
		} catch (Exception e) {
			System.out.println("multiplication cant be performed");
		}
		return decimalToHexa(decimal1);
	}

	/**
	 * @param aString
	 *            and @param bString are hexadecimal numbers
	 * @return returns division of aString and bString in hexadecimal as a
	 *         string
	 */
	public String divide(String aString, String bString) {

		int decimal1, decimal2, decimal3 = 0;
		try {
			decimal1 = hexToDecimal(aString);
			decimal2 = hexToDecimal(bString);
			if (decimal1 > decimal2) {
				decimal3 = (int) (decimal1 / decimal2);
			} else {
				decimal3 = 0;
			}
		} catch (ArithmeticException e) {
			System.out
					.print("please enter valid numbers you entered zero in denominator ");
		}
		return decimalToHexa(decimal3);
	}

	/**
	 * @param aString
	 *            and @param bString are hexadecimal numbers
	 * @return returns true if aString is less than bString
	 * @throws Exception
	 *             handles Exception if occurs
	 */
	public boolean equalTo(String aString, String bString) throws Exception {

		if (aString.equalsIgnoreCase(bString))
			return true;
		else
			return false;
	}

	/**
	 * @param aString
	 *            and @param bString are hexadecimal numbers
	 * @return returns true if aString is greater than bString
	 * @throws Exception
	 *             handles Exception if occurs
	 */
	public boolean greaterThan(String aString, String bString) throws Exception {

		if (aString.compareTo(bString) > 0)
			return true;
		return false;
	}

	/**
	 * @param aString
	 *            and @param bString are hexadecimal numbers
	 * @return returns true if aString is less than bString
	 * @throws Exception
	 *             handles Exception if occurs
	 */
	public boolean LessThan(String aString, String bString) throws Exception {

		if (aString.compareTo(bString) < 0)
			return true;
		return false;
	}

	public static void main(String args[]) {
		try {
			HexCalc ob = new HexCalc();
			System.out.println(ob.hexToDecimal("74h"));
			System.out.println(ob.hexToDecimal("74"));
			System.out.println(ob.decimalToHexa(116));
			// 1E is 30 and 35 is 53
			String aString = "1E", bString = "35";
			System.out.println("addition:" + ob.add(aString, bString));
			System.out.println("substraction:" + ob.subtract(aString, bString));
			System.out.println("multiplication:"
					+ ob.multiply(aString, bString));

			System.out.println("division:" + ob.divide(bString, aString));
			System.out.println("equal" + ob.equalTo(aString, bString));
			System.out.println("greater:" + ob.greaterThan(aString, bString));
			System.out.println("less:" + ob.LessThan(aString, bString));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}