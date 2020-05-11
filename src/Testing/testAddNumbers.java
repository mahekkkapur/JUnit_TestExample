package Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddNumbers {

	@Test
	void test() {
		JUnitTest jUnit = new JUnitTest();
		int result=jUnit.addNumbers(100,  200);
		assertEquals(300, result);
	}

}
