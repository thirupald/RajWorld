package src;
import junit.framework.TestCase;
import src.HelloWorld;


public class HelloWorldTest extends TestCase {

	public static void main (String[] args) {
		System.out.println("Test");
	}
	public void testMethod1() {
		HelloWorld world = new HelloWorld();
		assertEquals("TestPassed","hi",world.method1());
	}

}
