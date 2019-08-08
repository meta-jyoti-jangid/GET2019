package UniqueCharacter;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestUniqueCharacter {
	UniqueCharacter c = new UniqueCharacter();
	@Test
	public void testUniqueCharacter() {
		assertEquals(3, c.numberOfUniqueCharacter("hello"));
		assertEquals(2, c.numberOfUniqueCharacter("jaya"));
		assertEquals(8, c.numberOfUniqueCharacter("asdfgghjkl"));
		assertEquals(8, c.numberOfUniqueCharacter("asdfgghjkl"));
		assertEquals(4, c.numberOfUniqueCharacter("hello world hii"));
	}

}
