package mt.mstr.modules;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import mt.mstr.pages.FlightFinderpage;
import mt.mstr.pages.Loginpage;
import mt.mstr.pages.SignonPage;
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
		
		/*CloseBrowser cb= new CloseBrowser();
		cb.closeBrowser();
		*/
	}
	@Parameters({"usernm1","passwd1"})
	@Test(priority=2)
	public void executeLoginwithINValidds(String username1,String password1) throws InterruptedException
	{
		Loginpage lg=new Loginpage();
		lg.loadLoginpage();
		lg.enterUserName(username1);
		lg.enterPassword(password1);
		lg.clickonLogin();
		
		
		SignonPage sp = new SignonPage();
		sp.loadSignOnpage();
		sp.verifySignOn();
		Thread.sleep(5000);
		CloseBrowser cb= new CloseBrowser();
		cb.closeBrowser();
		
	
	
}}
