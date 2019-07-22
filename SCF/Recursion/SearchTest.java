import static org.junit.Assert.*;
import org.junit.Test;

public class SearchTest {
	Search s = new Search();

	@Test
	public void testLinearSearchEmptyArray() {
		try {
			s.Linear(new int[] {}, 4);
		} catch (Exception e) {
			assertEquals("Empty Array", e.getMessage());
		}
	}

	@Test
	public void testLinearSearchIndexOutOfBound() {
		try {
			s.Linear(new int[] { 2,3,4 }, 8);
		} catch (Exception e) {
			assertEquals("Array Index Out Of Bound", e.getMessage());
		}
	}

	@Test
	public void testLinearSearchPositiveInput() throws Exception {
		assertEquals(3, s.Linear(new int[] { 1, 2, 3, 4, 5 }, 3));
	}

	@Test
	public void testLinearSearchNegativeInput() throws Exception {
		assertEquals(-1, s.Linear(new int[] { 1, 2, 3, 4, 5 },  9));
	}

	@Test
	public void testBinarySearchEmptyArray() {
		try {
			s.BinarySearch(new int[] {}, 8);
		} catch (Exception e) {
			assertEquals("Empty Array", e.getMessage());
		}
	}

	@Test
	public void testBinarySearchIndexOutOfBound() {
		try {
			s.BinarySearch(new int[] { 1, 2, 3 },  8);
		} catch (Exception e) {
			assertEquals("Array Index Out Of Bound", e.getMessage());
		}
	}

	@Test
	public void testBinarySearchPositiveInput() throws Exception {
		assertEquals(3, s.BinarySearch(new int[] { 1, 2, 3, 4, 5 },  3));
	}

	@Test
	public void testBinarySearchNegativeInput() throws Exception {
		assertEquals(-1, s.BinarySearch(new int[] { 1, 2, 3, 4, 5 },  9));
	}
}