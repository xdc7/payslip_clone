package payslip;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;        
public class Uat {      
        private WebDriver driver;       
        @Test              
        public void testEasy() {    
            driver.get("http://192.168.34.12:8080/payslip-0.0.1/");  
            String title = driver.getTitle();                
            Assert.assertTrue(title.contains("PAY SLIP"));       
        }   
        @BeforeTest
        public void beforeTest() {  
        	//System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
        	//System.setProperty("webdriver.firefox.bin","/usr/bin/firefox");
        	//System.setProperty("webdriver.gecko.driver","G:\\Selenium\\Firefox driver\\geckodriver.exe");
            //driver = new ChromeDriver();
        	FirefoxBinary binary = new FirefoxBinary(new File("/usr/bin/firefox"));
            binary.setEnvironmentProperty("DISPLAY",System.getProperty("lmportal.xvfb.id",":99"));
        	driver = new FirefoxDriver();
        	
        	
            //driver = new FirefoxDriver(binary,null);
            
            
           
        }       
        @AfterTest
        public void afterTest() {
            driver.quit();          
        }       
}  