package Jenkins;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class JenkinsParameter {
	@Test
	public void receiveParameter() {
		String browserValue = System.getProperty("Browser");
		Reporter.log(browserValue, true);
	}
	

}
