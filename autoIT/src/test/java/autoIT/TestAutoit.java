package autoIT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestAutoit {
@Test
public void test() throws Exception
{
	 //System.setProperty("webdriver.gecko.driver", "D:\\Practise\\autoIT\\src\\test\\resources\\geckodriver.exe");
     WebDriver driver=new FirefoxDriver();
     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     driver.manage().window().maximize();
     driver.get("https://www.seleniumhq.org/download/");
     driver.findElement(By.xpath("//a[@href=\"https://goo.gl/4g538W\"]")).click();
     Thread.sleep(5000);
     Runtime.getRuntime().exec("C:\\Program Files (x86)\\AutoIt3\\SciTE\\..\\aut2exe\\aut2exe.exe");
     System.out.println("Hi");

     System.out.println("local");

	  System.out.println("Git");
	  System.out.println("local1");
	  System.out.println("Git1");
}
}
