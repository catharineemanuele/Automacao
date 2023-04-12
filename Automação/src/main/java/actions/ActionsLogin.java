package actions;

import PageObjects.PagesObjectAutomacao;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.io.FileReader;
import java.io.IOException;

import static org.junit.Assert.assertTrue;



public class ActionsLogin extends PagesObjectAutomacao {
    WebDriverWait wait;


    //Entrar no chorme
    public ActionsLogin(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, 30);
    }


    public void TelaRegistro() {
        wait.until(ExpectedConditions.visibilityOf(validacaotelaregistro));

        if (validacaotelaregistro.isEnabled()) {
            System.out.println("Elemento está presente");
        } else {
            System.out.println("Elemento não está presente");
        }
    }
    
    
    public void PreencherCamposIniciais() throws IOException, ParseException {
        String login = "src/main/java/actions/massadados.json";
        Object ob = new JSONParser().parse(new FileReader(login));
        JSONObject js = (JSONObject) ob;
        wait.until(ExpectedConditions.visibilityOf(Firstname)).sendKeys((String)js.get("Firstname"));
        wait.until(ExpectedConditions.visibilityOf(Lastname)).sendKeys((String)js.get("Lastname"));
        wait.until(ExpectedConditions.visibilityOf(Andress)).sendKeys((String)js.get("Andress"));
        wait.until(ExpectedConditions.visibilityOf(EmailAndress)).sendKeys((String)js.get("EmailAndress"));
        wait.until(ExpectedConditions.visibilityOf(Phone)).sendKeys((String)js.get("Phone"));
        wait.until(ExpectedConditions.visibilityOf(Gender)).click();
        wait.until(ExpectedConditions.visibilityOf(Hobbie)).click();
    }

    public void PreencherSkill () throws IOException, ParseException {
        String login = "src/main/java/actions/massadados.json";
        Object ob = new JSONParser().parse(new FileReader(login));
        JSONObject js = (JSONObject) ob;
        Skill.click();
        Select combo = new Select(Skill);
        combo.selectByVisibleText((String) js.get("Skill"));
    }


    public void PreencherYear () throws IOException, ParseException {
        String login = "src/main/java/actions/massadados.json";
        Object ob = new JSONParser().parse(new FileReader(login));
        JSONObject js = (JSONObject) ob;
        Year.click();
        Select combo = new Select(Year);
        combo.selectByVisibleText((String) js.get("Year"));
    }

    public void PreencherMonth () throws IOException, ParseException {
        String login = "src/main/java/actions/massadados.json";
        Object ob = new JSONParser().parse(new FileReader(login));
        JSONObject js = (JSONObject) ob;
        Month.click();
        Select combo = new Select(Month);
        combo.selectByVisibleText((String) js.get("Month"));
    }

    public void PreencherDay () throws IOException, ParseException {
            String login = "src/main/java/actions/massadados.json";
            Object ob = new JSONParser().parse(new FileReader(login));
            JSONObject js = (JSONObject) ob;
            Day.click();
            Select combo = new Select(Day);
            combo.selectByVisibleText((String) js.get("Day"));
    }

    public void PreencherPassword () throws IOException, ParseException {
        String login = "src/main/java/actions/massadados.json";
        Object ob = new JSONParser().parse(new FileReader(login));
        JSONObject js = (JSONObject) ob;
        wait.until(ExpectedConditions.visibilityOf(Password)).sendKeys((String)js.get("Password"));
        wait.until(ExpectedConditions.visibilityOf(ConfirmPassword)).sendKeys((String)js.get("ConfirmPassword"));

    }

}