package myapplications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects1 extends BasePage{

		@FindBy(xpath = "//a[@title='Women']")
		private WebElement womtab;
		@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]/a[@title='Dresses']")
		private WebElement Dressestab;
		@FindBy(xpath = "//div[@id='block_top_menu']//ul//li[3]//a[@title='T-shirts']")
		private WebElement TShirtstab;
		@FindBy(xpath="//ul[@id='ul_layered_id_attribute_group_1']//li[1]//label//a")
		private WebElement sizeS;
		@FindBy(xpath="//ul[@id='ul_layered_id_attribute_group_1']//li[2]//label//a")
		private WebElement sizeM;
		@FindBy(xpath="//ul[@id='ul_layered_id_attribute_group_1']/li[3]//label//a")
		private WebElement sizeL;
		@FindBy(xpath="//input[@id='newsletter-input']")
		private WebElement emailid;
	    @FindBy(xpath="//button[@name='submitNewsletter']")
	    private WebElement arrowbtn;
	    @FindBy(xpath="//div[@id='columns']/p")
	    private WebElement successtext;
	    
		public HomePageObjects1() {
			PageFactory.initElements(driver, this);
			
		}
		public void SetEmail(String email) {
			setText(emailid,email);

				}
		public void String(String email) {
		setText(emailid, email);

			}
		public WebElement arrowbtn() {
			WebElement a=driver.findElement(By.xpath("//button[@name='submitNewsletter']"));
			a.click();
			return arrowbtn;
			
		}
		
		public void arrowclick() {
			arrowbtn.click();
		}
		
		

		
		
		}
		


