package com.Maven;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base {
	
public static WebDriver driver;
	
	public static WebDriver browser(String name) {
		if (name.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Maven_Project\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else {
			System.out.println("Invalid Browser");
		}
		driver.manage().window().maximize();
		return driver;	
	}
	
	//URL LAUNCH
	
	public static void launch(String url) {
		driver.get(url);
	}
	
	//FACEBOOK LOGIN
	
	public static void sendvalues(WebElement element, String values) {
		element.sendKeys(values);
		
	}
	public static void passvalues(WebElement element,String value) {
		element.sendKeys(value);
		
	}
	public static void clickable(WebElement element) {
		element.click();

	}
	
	//TAKING SCREENSHOT
	
	public static void scrnshot(String filename) throws Throwable {
		TakesScreenshot s = (TakesScreenshot) driver;
		File src = s.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\HP\\eclipse-workspace\\Maven_Project\\screenshot\\scrn.png");
		FileUtils.copyFile(src, dest);
		
	}
	
	//CLOSE
	
	public static void closeBrowser() {
		driver.close();
	}
	
	//QUIT
	
	public static void quitbrowser() {
		driver.quit();
	}
	
	//NAVIGATIONS
	
	public static void navigateto(String url) {
		driver.navigate().to(url);
	}
	public static void navigateback() {
		driver.navigate().back();
	}
	public static void navigateforward() {
		driver.navigate().forward();
	}
	public static void navigaterefresh() {
		driver.navigate().refresh();
	}
	
	//ALERT
	
	public static void alert() {
		WebElement al = driver.findElement(By.id("alertButton"));
		al.click();
		driver.switchTo().alert().accept();
	}
	
	//ACTIONS
	
	public static void actio() {
		WebElement dc = driver.findElement(By.id("doubleClickBtn"));
		Actions act = new Actions(driver);
		act.doubleClick(dc).build().perform();
		
		WebElement rc = driver.findElement(By.id("rightClickBtn"));
		Actions act1 = new Actions(driver);
		act1.contextClick(rc).build().perform();
		
		WebElement cli = driver.findElement(By.xpath("//button[text()='Click Me']"));
		Actions act2 = new Actions(driver);
		act2.click(cli).build().perform();
	}
	
	//FRAMES
	
	public static void frame() {
		driver.switchTo().frame(0);
		WebElement fr = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		fr.sendKeys("krishna");
		
		driver.switchTo().defaultContent();
		
		WebElement ifr = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		ifr.click();
		
		driver.switchTo().frame(1);
		driver.switchTo().frame(0);
		
		WebElement ifr2 = driver.findElement(By.xpath("//input[@type = 'text']"));
		ifr2.sendKeys("gopi");
	}
		
	//ROBOT
	
	public static void robo() throws Throwable {
		WebElement mob = driver.findElement(By.linkText("Mobiles"));
		Actions act = new Actions(driver);
		act.contextClick(mob).build().perform();
		
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);

	}
	
	//WINDOWS HANDLING
	
	public static void windowHandle() throws Throwable {
		WebElement mob = driver.findElement(By.linkText("Mobiles"));
		Actions act = new Actions(driver);
		act.contextClick(mob).build().perform();
		
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement cs = driver.findElement(By.linkText("Customer Service"));
		act.contextClick(cs).build().perform();
		
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement td = driver.findElement(By.linkText("Today's Deals"));
		act.contextClick(td).build().perform();
		
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		String wh = driver.getWindowHandle();
		System.out.println(wh);
		
		Set<String> whs = driver.getWindowHandles();
		for (String string : whs) {
			System.out.println(string);
		}
		for (String string : whs) {
			String title = driver.switchTo().window(string).getTitle();
			System.out.println(title);
			
		}
	}
	
	//DROPDOWN GET FIRST SELECTED OPTION
	
	public static void drpdown() {
		WebElement sel = driver.findElement(By.id("dropdown3"));
		Select s = new Select(sel);
		
		s.selectByValue("1");
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
	}
	//DROPDOWN GET ALL SELECTED OPTIONS
	public static void allselect() {
		WebElement sele = driver.findElement(By.id("dropdown3"));
		Select s1 = new Select(sele);
		s1.selectByValue("1");
		s1.selectByValue("2");
		s1.selectByValue("3");
		
		List<WebElement> allSelectedOptions = s1.getAllSelectedOptions();
		for (WebElement webElement : allSelectedOptions) {
			System.out.println(webElement.getText());
		}
	}
	
	//DROPDOWN GET OPTIONS
	
	public static void getoptions() {
		WebElement opt = driver.findElement(By.id("dropdown3"));
		Select s2 = new Select(opt);
		
		List<WebElement> options = s2.getOptions();
		for (WebElement webElement : options) {
			System.out.println(webElement.getText());
		}
	}
	public static void mult() {
		WebElement mul = driver.findElement(By.id("dropdown3"));
		Select s2 = new Select(mul);
		boolean multiple = s2.isMultiple();
		System.out.println(multiple);
	}
	
	//IS DISPLAYED
	
	public static boolean isdisplay(WebElement element) {
		return element.isDisplayed();

	}
	
	//IS ENABLED
	
	public static boolean isenable(WebElement element) {
		return element.isEnabled();
	}
	
	//IS SELECTED
	
	public static boolean isselect(WebElement element) {
		return element.isSelected();
	}
	
	//GET TEXT
	
	public static void gettext(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}
	
	//GET CURRENTURL
	 
	public static void geturl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	 
	//GET TITLE
	
	public static void gettitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	//GET ATTRIBUTE
	
	public static void getattribute(WebElement element) {
		String attribute = element.getAttribute("data-testid");
		System.out.println(attribute);
	}
	
	//SCROLLDOWN
	
	public static void scrolldown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,9000)");
	}
	
	//SCROLLUP
	
	public static void scrollup() {
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,-1500)");
	}

}
