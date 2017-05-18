import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {
	String message = "H W";
	MessageUtil messageutil = new MessageUtil(message);
	
	@Test
	public void testPrintMessage(){
		Assert.assertEquals(message, messageutil.printMessage());
	}

}
