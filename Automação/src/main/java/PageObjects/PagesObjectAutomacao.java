package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PagesObjectAutomacao {

    public PagesObjectAutomacao(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.XPATH, using = "//div[@class='container center']/h2")
    protected WebElement validacaotelaregistro;

    @FindBy(how = How.XPATH, using = "//div/input[@placeholder='First Name']")
    protected WebElement Firstname;

    @FindBy(how = How.XPATH, using = "//div/input[@placeholder='Last Name']")
    protected WebElement Lastname;

    @FindBy(how = How.XPATH, using = "//div/textarea")
    protected WebElement Andress;

    @FindBy(how = How.XPATH, using = "//div/input [@type='email']")
    protected WebElement EmailAndress;

    @FindBy(how = How.XPATH, using = "//div/input [@type='tel']")
    protected WebElement Phone;

    @FindBy(how = How.XPATH, using = "//div//input[@value='FeMale']")
    protected WebElement Gender;

    @FindBy(how = How.XPATH, using = "//*[@value='Movies']")
    protected WebElement Hobbie;

    @FindBy(how = How.XPATH, using = "//select[@id='Skills']")
    protected WebElement Skill;

    @FindBy(how = How.XPATH, using = "/*//select[@id='yearbox']")
    protected WebElement Year;

    @FindBy(how = How.XPATH, using = "//div[2]/select[@type='text']")
    protected WebElement Month;

    @FindBy(how = How.XPATH, using = "/*//select[@id='daybox']")
    protected WebElement Day;

    @FindBy(how = How.XPATH, using = "//input [@id='firstpassword']")
    protected WebElement Password;

    @FindBy(how = How.XPATH, using = "//input [@id='secondpassword']")
    protected WebElement ConfirmPassword;

}
