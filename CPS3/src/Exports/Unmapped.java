package Exports;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;  
import org.openqa.selenium.JavascriptExecutor;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.support.ui.Select;
  
public class Unmapped {  
  
    public static void main(String[] args) {  
      
        // System Property for Chrome Driver   
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\phubb\\OneDrive\\Documents\\PROJECTS\\Chicago Public Schools 127-001\\Eclipse\\chromedriver.exe");  
          
        // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
          
        // Launch Website  
        driver.navigate().to("https://id.resolutebi.com/users/sign_in/"); 
        //driver.navigate().to("http://yahoo.com/"); 
          
        // Maximize the browser  
        driver.manage().window().maximize();  
          
        // Get WebElement in Login Email Textbox
        WebElement login_email = driver.findElement(By.id("user_email"));
         
        // Add Email Address to Textbox
        login_email.sendKeys("testplatform@resolutebi.com");
        
        // Find and Click Login Continue Button
        driver.findElement(By.className("continue")).click();
        
        // Get WebElement in Login Password Textbox
        WebElement login_password = driver.findElement(By.id("user_password"));
        
        // Add Email Address to Textbox
        login_password.sendKeys("autoUser1");
        
        // Find and Click Login Button
        driver.findElement(By.name("commit")).click();
        
        // Select CPS from Company List
        WebElement companyname = driver.findElement(By.xpath("//div[@data-cmp = 'distributors-select-component']/div[@data-cmp = 'react-select']/div/div/div[1]/div[1]"));
		companyname.click();
		
		WebElement select = driver.findElement(By.xpath("//*[@data-cmp = 'distributors-select-component']/div[@data-cmp = 'react-select']"
				+ "//div[contains(@class, 'DistributorsSelectComponent__Options')]//*[contains(text(), 'Chicago Public School')]"));
		select.click();
		
        // Find and Click Point Mapper Link
		driver.navigate().to("https://synergy.resolutebi.com/distributors/119/customers/375/configuration/bulk/pointmapper/"); 
		
		// Read # of pages
		
	//    WebElement tableRows = driver.findElement(By.xpath("//div[@class = 'rt-table'][not(following-sibling::*[@class = 'rt-noData'])]//div[@class = 'rt-tbody']//div[@class = 'rt-tr-group'][@role = 'rowgroup']"));
	  //  Integer numOfPages = Integer.valueOf(NumOfPg.getText());
		//System.out.println("Max Pages = "+ numOfPages);
		
		String fileLocation = "C:\\Users\\phubb\\OneDrive\\Documents\\PROJECTS\\Chicago Public Schools 127-001\\Eclipse\\CPS - Mapped.txt";
	    int count = 0;     

	    List<String> combinedPoints = new ArrayList<String>();     
	    
	    for (int i = 1; i < 14; i++) {
	          // for (int i = 1; i < 3; i++) {
//	          unmappedPage.goToPointMapperTablePage(i);
//	          List<String> points = unmappedPage.getAllCellsValuesOfMetricIDColumn(Optional.empty());
//	          combinedPoints.addAll(points);
	          System.out.println("COUNTING Step" + combinedPoints.size());
	        }
	
//	    writePage.sendTextToTextFile(fileLocation, combinedPoints, false);
	//      System.out.println("COUNTING TOTAL" + combinedPoints.size());
	     
	      
//		WebElement NumOfPg = driver.findElement(By.xpath("//*[@class='pagination-bottom']//span[@class='-totalPages']//"));
	//	Integer numOfPages = Integer.valueOf(NumOfPg.getText());
		//System.out.println("Max Pages = "+ numOfPages);
		
        //Scroll down the webpage by 5000 pixels
 //       JavascriptExecutor js = (JavascriptExecutor)driver;  
   //     js.executeScript("scrollBy(0, 5000)");   
          
        // Click on the Search button  
 //       driver.findElement(By.linkText("Core Java")).click();     
        
  //     driver.close();
 //       driver.quit();
  
    }  
    
  
}

