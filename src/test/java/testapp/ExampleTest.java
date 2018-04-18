package testapp;

import static org.junit.Assert.assertEquals;
import myapp.MyController;

import org.junit.Test;

public class ExampleTest {
	@Test
	public void returnValidJson(){
		assertEquals("{\"id\":123}", new MyController().test("/test"));
	}
}
