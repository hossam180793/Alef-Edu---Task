package tests;

import org.testng.annotations.Test;


import com.utility.ExcelLib;
import pages.OwnerPage;
import pages.SpringHomePage;
import pages.VeterinarianPage;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;


public class SpringTest extends ExcelLib {

		WebDriver browserObject ;
		SpringHomePage springHomePage ;
		VeterinarianPage veterinarianPage;
		OwnerPage ownerPage;

	  @BeforeMethod
	  public void beforeClass() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Hossam\\Automation\\chromedriver_win32\\chromedriver.exe");
		 browserObject = new ChromeDriver();
		 browserObject .manage().window().maximize();	
		 springHomePage = new SpringHomePage(browserObject);
		 springHomePage.navigatetoURL();	 
	  }
	
	  @Test(dataProvider = "AddOwner")
	  public void SpringTestScript(String firstName , String lastName , String address , String city ,
			  String telephone , String petname , String petBirthdate , String petType ,String ownerName , String ownerCount , String veterinarianCount) throws InterruptedException{

		  springHomePage = new SpringHomePage(browserObject);
		  springHomePage.checkImage();
		 
		  veterinarianPage = new VeterinarianPage(browserObject);
		  veterinarianPage.navigatetoVeterinarian();
		  veterinarianPage.assertVeterinariansCount(veterinarianCount);
		  ownerPage = new OwnerPage(browserObject);
		  ownerPage.navigatetoOwners();
		  ownerPage.existingOwnersCounter(ownerCount);
		  ownerPage.addOwners(firstName, lastName, address, city, telephone);
		  ownerPage.addPet(petname, petBirthdate, petType);
		  
		  ownerPage.vaildateOwnerData(ownerName, address, city, telephone);
		  ownerPage.vaildatePetData(petname, petBirthdate, petType);

	  }

	@AfterMethod
	  public void afterClass() {
		//browserObject.close();
	  }
 
}
