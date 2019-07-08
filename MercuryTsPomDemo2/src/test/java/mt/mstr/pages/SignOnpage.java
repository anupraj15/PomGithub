package mt.mstr.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import mt.mstr.config.Config;

public class SignOnpage 
{
	@FindBy(how=How.XPATH,using="//input[@name='userName']")
	WebElement objusername1;
	
	@FindBy(how=How.XPATH,using="//input[@name='password']")
	WebElement objpassword1;
	
	@FindBy(how=How.XPATH,using="//input[@name='login']")
	WebElement objlogin1;
	
	@FindBy(how=How.XPATH,using="//img[@src='/images/masts/mast_signon.gif']")
	WebElement objSignOn;
	

	public void loadSignOnpage()
	{
		PageFactory.initElements(Config.driver, this);
	}
	
	public void enterUserName(String username)
	{
		objusername1.sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		objpassword1.sendKeys(password);
	}
	
	public void clickonLogin()
	{
		objlogin1.click();
	}
	
	public void verifySignOn()
	{
		boolean flag=objSignOn.isDisplayed();
		System.out.println("Signon page is displayed: " +flag);
	}

}
