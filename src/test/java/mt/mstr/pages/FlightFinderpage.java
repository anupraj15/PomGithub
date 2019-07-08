package mt.mstr.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import mt.mstr.config.Config;
import mt.mstr.utility.CloseBrowser;
import mt.mstr.utility.LaunchApp;

public class FlightFinderpage
{
	
	@FindBy(how=How.XPATH,using="//img[@src='/images/masts/mast_flightfinder.gif']")
	WebElement objFlightFinder;
	
	@FindBy(how=How.LINK_TEXT,using="SIGN-OFF")
	WebElement objSignoff;

	public void loadFlightFinderpage()
	{
		PageFactory.initElements(Config.driver, this);
	}
	public void verifyFlightFinder()
	{
		boolean flag=objFlightFinder.isDisplayed();
		if(flag==true)
		{
			System.out.println("FlightFinder page is displayed");
		}
	}
	
	public void clickonSignoff()
	{
		objSignoff.click();
	}
	public static void main(String[] args)
	{
		LaunchApp lc =new LaunchApp();
    	lc.openBrowser("chrome");
    	lc.enterApplicationURL("http://newtours.demoaut.com/mercurywelcome.php");
    	lc.maximizeBrowser();
    	lc.waittillLoginpageLoaded(15);
    	
    	Loginpage lg =new Loginpage();
    	lg.loadLoginpage();
    	lg.enterUserName("Suvidyap1");
    	lg.enterPassword("P@ssword1");
    	lg.clickonLogin();
		
    	FlightFinderpage ff =new FlightFinderpage();
    	ff.loadFlightFinderpage();
    	ff.verifyFlightFinder();
    	ff.clickonSignoff();
    	
    	CloseBrowser cb=new CloseBrowser();
    	cb.closeBrowser();
	}

}
