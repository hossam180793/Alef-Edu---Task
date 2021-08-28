package com.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class Locators_Repo {
	
	public WebDriver browserObject ;


		
	//Spring Home Page Locators
	public String URL = "http://localhost:8080/";
	public By ImgPath = By.xpath("//img[@class='img-responsive']");
	public By veterinariansMenuButton = By.xpath("//a[@title='veterinarians']");
	public By FindOwnersMenuButton = By.xpath("//a[@title='find owners']");
	public By FindOwnerButton = By.xpath("//button[@class='btn btn-default']");
	
	public By AddOwnerButton = By.xpath("//a[@class='btn btn-default']");
	
	public By FirstNameTxtBox = By.id("firstName");
	public By LastNameTxtBox = By.id("lastName");
	public By AddressTxtBox = By.id("address");
	public By CityTxtBox = By.id("city");
	public By TelephoneTxtBox = By.id("telephone");
	
	public By CreateOwnerButton = By.xpath("//button[@type='submit']");
	public By addNewPetButton = By.xpath("//a[@class='btn btn-default'][2]");
	
	public By PetNameTxtBox = By.xpath("//input[@id='name']");
	public By Pet_BD_TxtBox = By.id("birthDate");
	public By Pet_Type_DDL = By.xpath("//select[@id='type']");
	public By Add_Pet_Button = By.xpath("//button[@type='submit']");
	
	public By Owner_Name_Path = By.xpath("//table[@class='table table-striped']/tbody/tr[1]/td/b");
	public By Owner_Address_Path = By.xpath("//table[@class='table table-striped']/tbody/tr[2]/td");
	public By Owner_City_Path = By.xpath("//table[@class='table table-striped']/tbody/tr[3]/td");
	public By Owner_Phone_Path = By.xpath("//table[@class='table table-striped']/tbody/tr[4]/td");
	
	public By Pet_Name_Path = By.xpath("//table//td//dd [1]");
	public By Pet_BDate_Path = By.xpath("//table//td//dd [2]");
	public By Pet_Type_Path = By.xpath("//table//td//dd [3]");
	
	public By ownerInformationPage = By.xpath("//div//h2[text()='Owner Information']");
	
	public By newPet = By.xpath("//div//h2");
	
	
	
	
	



}
