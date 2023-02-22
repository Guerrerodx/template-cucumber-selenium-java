package cucumber.StepDefinition;

import cucumber.Page.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginCorrectoDefinition {
    private String URL_TCT = "https://web-tct-staging.copec.cl/Login.aspx";
    private WebDriver driver;
    LoginPage loginPage;
    public LoginCorrectoDefinition(){
        driver= Hooks.driver;
    }

    @Given("^i am on login page$")
    public void i_am_on_login_page() throws Throwable {
        driver.get(URL_TCT);
        loginPage = new LoginPage(driver);
    }

    @When("^i enter \"([^\"]*)\" in username$")
    public void i_enter_something_in_username(String username, String strArg1) throws Throwable {
        loginPage.clickUsr();
        loginPage.enterKeysUsr(strArg1);
    }
    @When("^i enter \"([^\"]*)\" in password$")
    public void i_enter_something_in_password(String password, String strArg1) throws Throwable {
        loginPage.clickPwd();
        loginPage.enterKeysPwd(strArg1);
    }

    @When("^i click on loginBtn$")
    public void i_click_on_loginbtn() throws Throwable {
        loginPage.clickIngresar();
    }

    @Then("^I shouln't see \"([^\"]*)\"$")
    public void i_shoulnt_see_something(String strArg1) throws Throwable {
        Assert.assertTrue(driver.getPageSource().contains(strArg1));
    }


}
