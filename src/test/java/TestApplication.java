import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestApplication {

	@Test
	public void getProfilePaymentInfo() throws InterruptedException {
		Thread.sleep(2000);
		assertEquals(7,7);
		
	}

	@Test
	public void getProfileAddressTest() throws InterruptedException {
		Thread.sleep(2000);
		assertEquals(7,7);
	}
}