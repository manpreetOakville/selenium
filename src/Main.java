
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world!");
		
		// Windows
	    //System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver","/Users/macstudent/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "http://demo.guru99.com/test/newtours/";
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = "";
		
		// launch Fire fox and direct it to the Base URL
		driver.get(baseUrl);
		
		// get the actual value of the title
		actualTitle = driver.getTitle();
		
		/*
		 * compare the actual title of the page with the expected one and print
		 * the result as "Passed" or "Failed"
		 */
		if (actualTitle.contentEquals(expectedTitle)){
		    System.out.println("Test Passed!");
		} else {
		    System.out.println("Test Failed");
		    }
		   
		    //close Chrome
		    driver.close();
		   
	}

}