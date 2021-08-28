package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.utility.Locators_Repo;

public class OwnerPage extends Locators_Repo {
	
	
	public OwnerPage(WebDriver browserObject)
	{
		this.browserObject = browserObject;
	}
	
	public void navigatetoOwners () 
	{
		browserObject.findElement(FindOwnersMenuButton).click();
		browserObject.findElement(FindOwnerButton).click();
	}
	
	public void existingOwnersCounter (String ownerCount) 
	{	
		  List<WebElement> OwnersCount  = browserObject.findElements(By.xpath("//table[@class='table table-striped']/tbody/tr"));
		  System.out.println("Existing Owners Number is : " + OwnersCount.size());
		  Assert.assertEquals(String.valueOf(OwnersCount.size()), ownerCount);
	}
	
	public void addOwners (String firstName , String lastName , String address , String city , String telephone) throws InterruptedException 
	{
		
		browserObject.findElement(FindOwnersMenuButton).click();
		browserObject.findElement(AddOwnerButton).click();
		Vaildation.validateEmptyField( firstName ,  browserObject ,  FirstNameTxtBox);
		Vaildation.validateEmptyField( lastName ,  browserObject ,  LastNameTxtBox);
		Vaildation.validateEmptyField( address ,  browserObject ,  AddressTxtBox);
		Vaildation.validateEmptyField( city ,  browserObject ,  CityTxtBox);
		Vaildation.validateLength(telephone, browserObject, TelephoneTxtBox);
		browserObject.findElement(CreateOwnerButton).click();
		
	}
	
	public void addPet (String petname , String petBirthdate , String petType) throws InterruptedException 
	{
		try {
			browserObject.findElement(addNewPetButton).click();
			Vaildation.validateEmptyField(petname, browserObject, PetNameTxtBox);
			Vaildation.validatePetBirthdate(petBirthdate, browserObject, Pet_BD_TxtBox);
			browserObject.findElement(Pet_Type_DDL).sendKeys(petType);
			browserObject.findElement(Add_Pet_Button).click();
		} catch (Exception e) {
			// TODO: handle exception
			if(!browserObject.findElement(ownerInformationPage).isDisplayed()) 
			{
				System.out.println("Please add the required data in the Add Owner Page");
			}
		}

	}
	
	public void vaildateOwnerData(String ownerName , String address , String city , String telephone) throws InterruptedException 
	{
		try {
			if(ownerName.equalsIgnoreCase(browserObject.findElement(Owner_Name_Path).getText()))
			{
				System.out.println("The Owner Name is "+ ownerName);
			}else {
				System.out.println("The Owner Name Doesn't Match");
			}
			
			if(address.equalsIgnoreCase(browserObject.findElement(Owner_Address_Path).getText()))
			{
				System.out.println("The Address is "+ address);
			}else {
				System.out.println("The Address Doesn't Match");
			}
			
			if(city.equalsIgnoreCase(browserObject.findElement(Owner_City_Path).getText()))
			{
				System.out.println("The City is "+ city);
			}else {
				System.out.println("The City Doesn't Match");
			}
			
			if(telephone.equalsIgnoreCase(browserObject.findElement(Owner_Phone_Path).getText()))
			{
				System.out.println("The Telephone is "+ telephone);
			}else {
				System.out.println("The Telephone Doesn't Match");
			}	
		} catch (Exception e) {
			// TODO: handle exception
			if(!browserObject.findElement(newPet).isDisplayed()) 
			{
				System.out.println("Please add the required data in the Add Pet Page");
			}
		}

		
	}
	
	public void vaildatePetData(String petname , String petBirthdate , String petType ) throws InterruptedException 
	{
		if(petname.equalsIgnoreCase(browserObject.findElement(Pet_Name_Path).getText()))
		{
			System.out.println("The Pet Name is "+ petname);
		}else {
			System.out.println("The Pet Name Doesn't Match");
		}
		
		if(petBirthdate.equalsIgnoreCase(browserObject.findElement(Pet_BDate_Path).getText()))
		{
			System.out.println("The Pet Birth Date is "+ petBirthdate);
		}else {
			System.out.println("The Pet Birth Date Doesn't Match");
		}
		if(petType.equalsIgnoreCase(browserObject.findElement(Pet_Type_Path).getText()))
		{
			System.out.println("The Pet Type is "+ petType);
		}else {
			System.out.println("The Pet Type Doesn't Match");
		}	
}
	

}
