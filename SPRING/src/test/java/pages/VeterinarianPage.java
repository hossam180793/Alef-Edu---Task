package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.utility.Locators_Repo;

public class VeterinarianPage extends Locators_Repo {
	
	public VeterinarianPage(WebDriver browserObject)
	{
		this.browserObject = browserObject;
	}
	
	public void navigatetoVeterinarian () 
	{
		browserObject.findElement(veterinariansMenuButton).click();
	}
	
	public void assertVeterinariansCount (String veterinarianCount) 
	{
		  List<WebElement> veterinariansCount  = browserObject.findElements(By.xpath("//table[@class='table table-striped']/tbody/tr"));
		  System.out.println("Veterinarians Number is : " + veterinariansCount.size());
		  Assert.assertEquals(String.valueOf(veterinariansCount.size()), veterinarianCount);
	}
	
}
