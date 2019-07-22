import static org.junit.Assert.*;
import org.junit.Test;

public class TestNQueen {
	NQueens Queen = new NQueens();

	@Test
	public void testsolveNQ() {
		try {
			Queen.solveNQ(0);
		} catch (Exception e) {
			assertEquals("Zero no. of Queens", e.getMessage());
		}
	}

	@Test
	public void testsolveNQ_positive() throws Exception {
		assertTrue(Queen.solveNQ(4));
	}

	@Test
	public void testsolveNQ_negative() throws Exception {
		assertFalse(Queen.solveNQ(3));
	}

	@Test
	public void testsolveNQ_positive1() throws Exception {
		assertTrue(Queen.solveNQ(8));
	}

}