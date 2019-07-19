
public class MathOperations {
	/*
	 * @param x and @param y are two positive integers whose hcf is to be
	 * calculated
	 * 
	 * @return returns hcf of x and y
	 */
	int hcf(int x, int y) throws Exception {
		if (y == 0)
			return x;
		else if (x == 0 && y == 0)
			throw new Exception("Divide By Zero");
		else if (x == 0) {
			return y;
		}
		return (hcf(y % x, x));

	}

	/*
	 * @param x and @param y are two positive integers whose lcm is to be
	 * calculated
	 * 
	 * @return returns lcm of x and y
	 */
	int lcm(int x, int y) throws Exception {
		int h = (int) hcf(x, y);
		if (h == 0)
			throw new Exception("Divide By Zero");
		return ((x * y) / h);
	}

}
