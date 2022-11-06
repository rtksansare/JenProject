package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class LoginPage extends CommonMethods {
    //By username= By.xpath("//input[@name=\"username\"]");

    @FindBy(xpath = "//input[@name=\"username\"]")
    public WebElement username_field;

    @FindBy(xpath = "//input[@name=\"password\"]")
    public WebElement password_field;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    public WebElement login_button;

    public LoginPage(){
        PageFactory.initElements(driver,this);
    }

}
