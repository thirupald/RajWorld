package src;
import junit.framework.TestCase;
import src.HelloWorld;


public class HelloWorldTest extends TestCase {

	public void testMethod1() {
		HelloWorld world = new HelloWorld();
		assertEquals("TestPassed","hi",world.method1());
	}

}
