package org.ict.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class TestBase {
WebDriver driver;
@BeforeMethod
public void SetUp() throws InterruptedException {
	driver=new ChromeDriver();
	driver.get("https://learnertracker.netlify.app/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
}
@AfterTest
public void TearDown() {
	driver.quit();
}
}
