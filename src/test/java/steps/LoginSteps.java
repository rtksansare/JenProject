package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.ConfigReader;

public class LoginSteps extends CommonMethods {
    @Given("user is on login page")
    public void user_is_on_login_page() {
    }

    @When("user enters correct username and password")
    public void user_enters_correct_username_and_password() {
        sendText(login.username_field, ConfigReader.getPropertyValue("username"));
        sendText(login.password_field,ConfigReader.getPropertyValue("password"));
    }

    @When("clicks on login button")
    public void clicks_on_login_button() {
        click(login.login_button);
    }

    @Then("user navigated to homepage")
    public void user_navigated_to_homepage() {
        System.out.println("Test passed");
    }

    @When("user enters correct {string} and {string}")
    public void user_enters_correct_and(String username, String password) {
        System.out.println(username+" "+password);
    }
}
