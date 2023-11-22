package pages1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class EditAddrPage {

	// variables
	WebDriver driver;

	@FindBy(xpath = "//a[text()='Address Book']")
	private WebElement btnAddrBook;

	@FindBy(xpath = "//a[text()='Edit']")
	private WebElement btnEditAddr;

	@FindBy(xpath = "//input[@id='input-postcode']")
	private WebElement textBoxPostCode;

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement btnContinue;

	// constructor
	public EditAddrPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); // this : current class non-static variables
	}

	// Methods
	public void editAddress() throws InterruptedException {
		btnAddrBook.click();

		btnEditAddr.click();
		Thread.sleep(1000);
//		Scrolling.PerformScroll(driver, textBoxPostCode);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", textBoxPostCode);
		Thread.sleep(1000);
		textBoxPostCode.sendKeys("12345");
		Thread.sleep(1000);
		btnContinue.click();
		Thread.sleep(1000);
	}

}
