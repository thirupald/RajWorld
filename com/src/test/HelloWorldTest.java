import org.junit.Test;

import junit.framework.TestCase;


public class HelloWorldTest extends TestCase {

	public static void main (String[] args) {
		System.out.println("Test");
	}
	
	@Test
	public void testMethod1() {
		HelloWorld world = new HelloWorld();
		assertEquals("TestPassed","hi",world.method1());
	}

}
