package Project.tested_coded;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homeclass {
	
	public static WebDriver driver=null;
	@FindBy(id="email")
	private WebElement emailid;
	@FindBy(id="pass")
	private WebElement passwordfield;
	@FindBy (id="loginbutton")
	private WebElement loginbutton;
	@FindBy(id="u_0_h")
	private WebDriver cellno;
	@FindBy(linkText="Forgot account?")
	private WebElement forgotlink;
	public Homeclass (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
public Homeclass() {
		// TODO Auto-generated constructor stub
	}
public void enteringemail(String email) {
	emailid.sendKeys(email);

}
public void password(String password) {
	passwordfield.sendKeys(password);
}
public void clickbutton() {
	loginbutton.click();
}

public void openbrowsersite() {
	System.setProperty("webdriver.chrome.driver", "C://chromedriver//chromedriver_win32/chromedriver.exe");
	driver=new ChromeDriver();
	String url="http://www.facebook.com";
	driver.get(url);
		
}
	public static void main(String[] args) {
		
	}

}
