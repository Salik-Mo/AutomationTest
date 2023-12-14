package EntrilY.Pages;import org.openqa.selenium.By;import org.openqa.selenium.WebDriver;import org.openqa.selenium.WebElement;import org.openqa.selenium.support.FindBy;import org.openqa.selenium.support.PageFactory;import java.io.File;public class UniversityPage{    public UniversityPage (WebDriver driver) {        PageFactory.initElements(driver, this);    }    @FindBy(xpath ="(//span[text()='Universities'])[2]")    public WebElement UniversityClick;    @FindBy(xpath ="//button[text()='Add University']")    public WebElement UniversityPop;    @FindBy(id = "institution")    public WebElement UName;    @FindBy(id = "floatingInputemail")    public WebElement Email;    @FindBy(id="telephone")    public WebElement PhoneNo;    @FindBy(id = "url")    public WebElement URL;    @FindBy(id="currency")    public WebElement Currency;    @FindBy(xpath = "(//span[@class='dropdown-btn'])[1]")    public WebElement MaM;    @FindBy(xpath = "(//input[@class='ng-untouched ng-pristine ng-valid'])[3]")    public  WebElement SearchBox;    @FindBy(xpath = "(//span[text()='Select'])[1]")    public WebElement MAM1;    @FindBy(xpath = "//div[text()='new ']']")    public WebElement MAM2;    @FindBy(xpath = "(//span[@class='dropdown-btn'])[2]")    public WebElement RaM;    @FindBy(xpath = "(//div[text()='Goer'])[2]")    public WebElement RaM1;    @FindBy(xpath = " (//div[text()='Admin'])[2]")    public WebElement RaM2;    @FindBy(id ="address")    public WebElement Address;    @FindBy(id = "city")    public WebElement City;    @FindBy(id = "state")    public WebElement State;    @FindBy(id = "applicationType")    public WebElement Application_type;    @FindBy(id="postal_code")    public WebElement Postal;    @FindBy(id="sponsored")    public  WebElement Sponsored;    @FindBy(xpath="(//button[text()='Add University'])[2]")    public WebElement Add_University;    @FindBy(xpath ="(//a[@class='text-danger ng-star-inserted'])[1]")    public WebElement StatusBu;    @FindBy(xpath ="//button[text()='Confirm']")    public WebElement Confirm;}