package Test;

import code.RpnCalculator;
import junit.framework.TestCase;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CucumberSteps extends TestCase {
	
	RpnCalculator newtest = new RpnCalculator();
	
	String input;
	 
	
	@Given("^user enters \"([^\"]*)\"$") 
	public void user_enters(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		input = arg1;
	}

	@Then("^it displays \"([^\"]*)\"$")
	public void it_displays(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		
		assertEquals(arg1, newtest.calculate(input));
	}

	
	

}
