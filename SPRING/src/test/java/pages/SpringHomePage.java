package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.utility.Locators_Repo;

public class SpringHomePage extends Locators_Repo{
	
	public SpringHomePage(WebDriver browserObject)
	{
		this.browserObject = browserObject;
	}
	
	public void navigatetoURL()
	{
		browserObject.navigate().to(URL);
	}
	
	public void checkImage ()
	{
		  WebElement image = browserObject.findElement(ImgPath);
		  Assert.assertTrue(image.isDisplayed());
	}

}
