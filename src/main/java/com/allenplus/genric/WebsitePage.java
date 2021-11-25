package com.allenplus.genric;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class WebsitePage{
	
	Logger logger=Logger.getLogger("WebsitePage");
	
	@FindBy(xpath="//a[@class='first']//i[@class='sprite']")
	private WebElement homeBtn;
	
	@FindBy(xpath="//span[text()='Student Login']")
	private WebElement studentLoginBtn;
	
	@FindBy(xpath="//span[text()='Buy Package']")
	private WebElement buyPackageBtn;
	
	//@FindBy(xpath="")
 
	public WebsitePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		driver.getTitle();
		
	}
	/*
	 * @description This method is used to Get Website url
	 */
	public void OpenWebsitePage(WebDriver driver, String environment, String panel) 
	{
		driver.manage().window().maximize();
		
		if(environment.equalsIgnoreCase("Local")&&panel.equalsIgnoreCase("Student"))
		{
			driver.get("http://192.168.0.116/allendsat/");
			logger.info("Test is Executed at "+panel+" Panel at "+environment+" server\n");
			Reporter.log("\n                  ==========================================================\n                      Test is Executed on "+panel+" Panel at "+environment+" server\n                  ==========================================================\n",true);
		}
		else if(environment.equalsIgnoreCase("uat")&&panel.equalsIgnoreCase("Student"))
		{
			driver.get("http://dsatuat.thinkexam.com/");
			logger.info("Test is Executed at "+panel+" Panel at "+environment+" server\n");
			Reporter.log("\n                  ==========================================================\n                      Test is Executed on "+panel+" Panel at "+environment+" server\n                  ==========================================================\n",true);
		}
		else if(environment.equalsIgnoreCase("Live")&&panel.equalsIgnoreCase("Student"))
		{
			driver.get("https://dsat.allen.ac.in/");
			logger.info("Test is Executed at "+panel+" Panel at "+environment+" server\n");
			Reporter.log("\n                  ==========================================================\n                      Test is Executed on "+panel+" Panel at "+environment+" server\n                  ==========================================================\n",true);
		}
		if(environment.equalsIgnoreCase("Local")&&panel.equalsIgnoreCase("Admin"))
		{
			driver.get("http://192.168.0.250/thinkExam/allendsat/admin/");
			logger.info("Test is Executed at "+panel+" Panel at "+environment+" server\n");
			Reporter.log("\n                  ==========================================================\n                      Test is Executed on "+panel+" Panel at "+environment+" server\n                  ==========================================================\n",true);
		}
		else if(environment.equalsIgnoreCase("uat")&&panel.equalsIgnoreCase("Admin"))
		{
			driver.get("http://dsatuat.thinkexam.com/admin/");
			logger.info("Test is Executed at "+panel+" Panel at "+environment+" server\n");
			Reporter.log("\n                  ==========================================================\n                      Test is Executed on "+panel+" Panel at "+environment+" server\n                  ==========================================================\n",true);
		}
		else if(environment.equalsIgnoreCase("Live")&&panel.equalsIgnoreCase("Admin"))
		{
			driver.get("https://dsat.allen.ac.in/admin/");
			logger.info("Test is Executed at "+panel+" Panel at "+environment+" server\n");
			Reporter.log("\n                  ==========================================================\n                      Test is Executed on "+panel+" Panel at "+environment+" server\n                  ==========================================================\n",true);
		}
		
	}

}
