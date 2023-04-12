package StepDefinition;


import actions.ActionsLogin;
import Util.InstanciarWebDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public class StepLogin {
    ActionsLogin actionsLogin;

    public StepLogin(){
        InstanciarWebDriver.getDriver();
        actionsLogin = new ActionsLogin(InstanciarWebDriver.getDriver());
    }

    @Given("Abro o navegador")
    public void abro_o_navegador() {
        InstanciarWebDriver.getDriver();
        actionsLogin = new ActionsLogin(InstanciarWebDriver.getDriver());
    }

    @And("usuario abrir site {string}")
    public void acesso_site(String url) {
        InstanciarWebDriver.getDriver().get(url);
    }
    @When("que usuario esteja na tela de registro")
    public void tela_registro() {
        actionsLogin.TelaRegistro();
    }

    @When("preencha todos os campos")
    public void preenchimentoCampos() throws IOException, ParseException {
        actionsLogin.PreencherCamposIniciais();
        actionsLogin.PreencherSkill();
        actionsLogin.PreencherYear();
        actionsLogin.PreencherMonth();
        actionsLogin.PreencherDay();
        actionsLogin.PreencherPassword();
    }
}