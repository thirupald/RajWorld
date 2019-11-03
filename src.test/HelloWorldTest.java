import junit.framework.TestCase;
import src.HelloWorld;


public class HelloWorldTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}
	
	
	public void testMethod1() {
		HelloWorld world = new HelloWorld();
		assertEquals("TestPassed","hi",world.method1());
	}

}
