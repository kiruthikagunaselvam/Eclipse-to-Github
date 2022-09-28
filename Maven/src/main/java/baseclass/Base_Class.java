 package baseclass;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {
	
	public static WebDriver driver;
	
	public static WebDriver getBrowser(String type) {
		
		if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Selenium_Revise\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\Seleniumdemo\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		return driver;
		}
	
	public static WebDriver getUrl(String url){
	driver.get(url);
	return driver;
	}
	
	public static void clickOnElement(WebElement element) {
		element.click();
	}
	
	public static void inputValue(WebElement element, String value) {
		element.sendKeys(value);
	}
	
	public static void dropDown(WebElement element,String type, String value) {
		Select s = new Select(element);
		if (type.equalsIgnoreCase("selectByValue")) {
			
			s.selectByValue(value);
		}
		else if(type.equalsIgnoreCase("selectByIndex")) {
			int data = Integer.parseInt(value);
			s.selectByIndex(data);
		}
		else if(type.equalsIgnoreCase("selectByVisibleText")) {
			s.selectByVisibleText(value);
		}
	}
	
	public static WebDriver close() {
		driver.close();
		return driver;
		
	}
	
	public static WebDriver quit() {
		driver.quit();
		return driver;
	}
	
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
	
	public static boolean isdisplayed(WebElement element) {
		return element.isDisplayed();

	}
	
	public static boolean isenabled(WebElement element) {
		return element.isEnabled();
	}
	
	public static boolean isselected(WebElement element) {
		return element.isSelected();
	}
	
	public static void gettext(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}
	
	public static void geturl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	
	public static void gettitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	public static void getattribute(WebElement element) {
		String attribute = element.getAttribute("data-testid");
		System.out.println(attribute);
	}
	
	public static void scrolldown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,9000)");
	}
	
	public static void scrollup() {
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,-1500)");
	}
	
	public static void movetoElement(WebElement element) {
				Actions ac = new Actions(driver);
			ac.moveToElement(element).build().perform();
		}
	
	public void dragAndDrop(WebElement source, WebElement target) {
			Actions ac = new Actions(driver);
			ac.dragAndDrop(source, target).build().perform();
		}
	
	public static void doubleClick(WebElement element) {
			Actions ac = new Actions(driver);
			ac.doubleClick(element).build().perform();
		}
	
	public static void contextClick(WebElement element) {
			Actions ac = new Actions(driver);
			ac.contextClick(element).build().perform();
		} 
	
	public static void elementClickusingActions(WebElement element) {
			Actions ac = new Actions(driver);
			ac.click(element).build().perform();
		}
	
	public static void switchtoIframe(String options, Object value) {		
			if (options.equalsIgnoreCase("index")) {
				driver.switchTo().frame(Integer.parseInt((String) value));
			} else if (options.equalsIgnoreCase("name")) {
				driver.switchTo().frame((String) value);
			} else if (options.equalsIgnoreCase("element")) {
				driver.switchTo().frame((WebElement) value);
			}
	}
	
	public static File takeScreenShot(String fileName) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Maven\\snapshot\\"+ fileName + ".png");
		FileUtils.copyFile(source, des);
		return des;

		}
	
	public static void simpleAlert() {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		}
	
	public static void confirmAlert(String option) {
			Alert alert = driver.switchTo().alert();
			if (option.equalsIgnoreCase("confirm")) {
				alert.accept();
			} else if (option.equalsIgnoreCase("dismiss")) {
				alert.dismiss();
			}
		}
	
	public static void promptAlert(String options, String values) {
			Alert alert = driver.switchTo().alert();
			if (options.equalsIgnoreCase("confirm")) {
				alert.sendKeys(values);
				alert.accept();

			} else if (options.equalsIgnoreCase("dismiss")) {
				alert.dismiss();
			}
		}
	
	public static void wait(WebElement element) {
			WebDriverWait wb = new WebDriverWait(driver, 50);
			wb.until(ExpectedConditions.visibilityOf(element));
		}
	
	public static void switchtoDefualtContent() {
			driver.switchTo().defaultContent();
	}

	public static void switchtoSecondWindow() {
		
			String cId = driver.getWindowHandle();
			Set<String> pId = driver.getWindowHandles();
			for (String x : pId) {
				if (!x.equals(cId)) {
					driver.switchTo().window(x);
				}
			}
	}

	public void switchtoMultipleWindow(int index) {
		
			String cId = driver.getWindowHandle();
			Set<String> pId = driver.getWindowHandles();
			List<String> li = new ArrayList<String>();
			li.addAll(pId);
			driver.switchTo().window(li.get(index));
			}

	public static void Webtable(String element, int i) {
		
			WebElement table = driver.findElement(By.xpath(element));
			List<WebElement> findElements = table.findElements(By.xpath("//tr[0]//td[" + i + "]"));
			for (WebElement x : findElements) {
				System.out.println(x.getText());
			}
		}
	}


