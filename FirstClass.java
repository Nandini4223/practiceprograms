
import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstClass {
		 
	    public static void main(String[] args) throws InterruptedException {	
	         
	        //Creating a driver object referencing WebDriver interface
	        
	    	WebDriver driver;
	        	         
	        //Setting webdriver.gecko.driver property
	    	
	        System.setProperty("webdriver.gecko.driver", "E:\\freshers\\Firefox\\geckodriver.exe");
	         
	        //Instantiating driver object and launching browser
	        
	        driver = new FirefoxDriver();
	         
	        //Using get() method to open a webpage
	        
	        driver.get("https://google.com");
	        Thread.sleep(2000);
	        WebElement gole=driver.findElement(By.name("q"));
	        gole.sendKeys("testing interview questions for 10 years experience");
	        
	        //Thread.sleep(1000);
	        //driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div/div[2]/div/span")).click();
	        
	        Thread.sleep(2000);
	        driver.findElement(By.className("gNO89b")).click();
	        Thread.sleep(2000);            
	       //driver.close();
	        String Title=driver.getTitle();
	        System.out.println(" Website Title  :   " + Title);
	        Thread.sleep(2000);
	        driver.findElement(By.partialLinkText("Software Manual Testing Interview Questions for Experienced ...")).click();
	        System.out.println("Link clicked successfully");
	        Thread.sleep(1000);
	        String Title2=driver.getTitle();
	        System.out.println(" Website Title  :   " + Title2);
	        
	        if(Title.equals(Title2))
	        
	        {
	        	
	        	System.out.println("Title As Expected");
	        	System.out.println("Testcase PASS");
	        	
	        }
	        else
	        {
	        	
	        	System.out.println("Wrong Title");
	        	System.out.println("Testcase FAIL");
	        	
	        }
	        }
	  
	} 
	  
	
