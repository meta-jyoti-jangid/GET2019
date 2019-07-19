import static org.junit.Assert.*;
import org.junit.Test;

public class TestMathOperation {
	MathOperations m = new MathOperations();

	@Test
	public void testFindHcf() {
		try {
			m.hcf(0, 0);
		} catch (Exception e) {
			assertEquals("Divide By Zero", e.getMessage());
		}
	}

	@Test
	public void testFindHcfPositiveInput() throws Exception {
		assertEquals(2, m.hcf(6, 8));
	}

	@Test
	public void testFindLcm() {
		try {
			m.lcm(0, 0);
		} catch (Exception e) {
			assertEquals("Divide By Zero", e.getMessage());
		}
	}

	@Test
	public void testFindLcmPositiveInput() throws Exception {
		assertEquals(24, m.lcm(6, 8));
	}

}