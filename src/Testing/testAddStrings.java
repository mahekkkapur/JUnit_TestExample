package Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddStrings {

	@Test
	void test() {
		JUnitTest jUnitString = new JUnitTest();
		String result=jUnitString.addStrings("capstone", "project");
		assertEquals("capstoneproject", result);
	}

}
