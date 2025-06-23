package test;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class nextPage extends BaseTest{
    
	
@Test

public void login1Validation() {
	String expectedResult ="Facebook";
	String actualResult = driver.findElement(By.className("fb_logo _8ilh img")).getText();
	
	Reporter.log("Expected Result =" + expectedResult);
	Reporter.log("Actual Result =" + actualResult);
	assertTrue(actualResult.equals(expectedResult), "Mismatch in the Facebook");
	
}

}
