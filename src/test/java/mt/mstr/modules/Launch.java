package mt.mstr.modules;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import mt.mstr.pages.FlightFinderpage;
import mt.mstr.utility.CloseBrowser;
import mt.mstr.utility.LaunchApp;

public class Launch 
{
  @Parameters({"browser","url","timeoutseconds"}) 
  @Test
  public void executeLaunch(String browsernm,String urlnm,int timeoutseconds)
  {
	  LaunchApp lc=new LaunchApp();
	  lc.openBrowser(browsernm);
	  lc.enterApplicationURL(urlnm);
	  lc.maximizeBrowser();
	  lc.waittillLoginpageLoaded(timeoutseconds);
	  
	 
	  
  }
}
