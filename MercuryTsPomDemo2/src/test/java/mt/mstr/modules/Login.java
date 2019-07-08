package mt.mstr.modules;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import mt.mstr.pages.FlightFinderpage;
import mt.mstr.pages.Loginpage;
import mt.mstr.pages.SignOnpage;
import mt.mstr.utility.CloseBrowser;

public class Login 
{
	@Parameters({"usernm","passwd"})
	@Test(priority=1)
	public void executeLoginwithValidds(String username,String password)
	{
		Loginpage lg=new Loginpage();
		lg.loadLoginpage();
		lg.enterUserName(username);
		lg.enterPassword(password);
		lg.clickonLogin();
		
		FlightFinderpage ff=new FlightFinderpage();
		ff.loadFlightFinderpage();
		ff.verifyFlightFinder();
		ff.clickonSignoff();
		
		CloseBrowser cb= new CloseBrowser();
		cb.closeBrowser();		
	}
	
	
	@Parameters({"invalidusernm","invalidpasswd"})
	@Test(priority=2)
	public void executeLoginwithInValidds(String username1,String password1)
	{
		
		Loginpage lg=new Loginpage();
		lg.loadLoginpage();
		lg.enterUserName(username1);
		lg.enterPassword(password1);
		lg.clickonLogin();
		
		SignOnpage sp= new SignOnpage();
		sp.loadSignOnpage();
		sp.verifySignOn();
			
		CloseBrowser cb= new CloseBrowser();
		cb.closeBrowser();		
	}
	
}
