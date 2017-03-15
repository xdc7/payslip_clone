package payslip;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
        	System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
        	//System.setProperty("webdriver.firefox.bin","/usr/bin/firefox");
        	//System.setProperty("webdriver.gecko.driver","G:\\Selenium\\Firefox driver\\geckodriver.exe");
            driver = new ChromeDriver();  
        }       
        @AfterTest
        public void afterTest() {
            driver.quit();          
        }       
}  