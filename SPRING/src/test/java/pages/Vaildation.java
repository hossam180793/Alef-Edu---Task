package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Vaildation {
	
	public static int Size = 10 ;
	
	public static void validateEmptyField(String str , WebDriver browserObject , By Locator) 
	{
		if(str.isEmpty()) 
		{
			System.out.println("Field must not be empty");
			
		}else {
			browserObject.findElement(Locator).sendKeys(str);
		}
	}
	
	public static void validateLength(String str , WebDriver browserObject , By Locator )
	{
		browserObject.findElement(Locator).sendKeys(str);
		if(str.length()>Size)
		{
			System.out.println("Field exceeded its maximum lenght , Maximum length is 10");
		}		
	}
	
	public static void validatePetBirthdate(String str, WebDriver browserObject , By Locator)
	{
		if(str.matches("^\\d{4}\\-(0?[1-9]|1[012])\\-(0?[1-9]|[12][0-9]|3[01])$") || !str.isEmpty())
		{
			browserObject.findElement(Locator).sendKeys(str);
		}else {
				System.out.println("Birth date formate must be YYYY-MM-DD");	
		}
		
	}

}
