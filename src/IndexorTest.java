import static org.junit.Assert.*;

import org.junit.Test;


public class IndexorTest {

	@Test
	public void test() {
		PersistentArray.initialize("IndexTest.bin", 3, 5);
		PersistentArray testPersArray = new PersistentArray("IndexTest.bin");
		assertEquals(5, testPersArray.get(1));
		testPersArray.set(1, 9);
		assertEquals(9, testPersArray.get(1));
	}

}
