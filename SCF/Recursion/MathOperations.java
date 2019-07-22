
public class MathOperations {
	/**
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

	/**
	 * @param x and @param y are two positive integers whose lcm is to be
	 * calculated
	 * 
	 * @return returns lcm of x and y
	 */
	int lcm(int x, int y) throws Exception {
		if(x==0&&y==0)
			throw new Exception("Divide By Zero");
	        int large = Math.max(x, y); 
	        int small = Math.min(x, y); 
	        for (int i = large; ; i += large) { 
	            if (i % small == 0) 
	                return i; 
	    } 
	}
	public static void main(String args[]) throws Exception{
		MathOperations m=new MathOperations();
		System.out.println(m.hcf(1,1));
		System.out.println(m.lcm(2, 8));
		System.out.println(m.lcm(0,8));
	}

}
