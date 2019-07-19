package sak1;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ListDemo {
	@Given("^user must be registered$")
	public void user_must_be_registered() throws Throwable {
	   System.out.println("user must be registered");
	    throw new PendingException();
	}

	@When("^login using below credentials$")
	public void login_using_below_credentials(DataTable arg1) throws Throwable {
	    List<Map<String,String>> cred=arg1.asMaps(String.class, String.class);
	    for(int i=0;i<cred.size();i++)
	    {
	    	System.out.println(cred.get(i).get("username")+"\t"+cred.get(i).get("password"));
	    }
	    throw new PendingException();
	}

	@Then("^user must be in home page$")
	public void user_must_be_in_home_page() throws Throwable {
	    System.out.println("user must be directed to home page");
	    throw new PendingException();
	}

}
