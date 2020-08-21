import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class contactUSTestCase {

	//Object should not be null when called ---------
	contactUS instance;
	@Test
	void test_ContactUsinstance() {
		instance = contactUS.getInstance("test", "test", "test");
		assertNotNull(instance);
	}

}
