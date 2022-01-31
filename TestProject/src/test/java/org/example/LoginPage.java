package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebDriver driver;
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(xpath = "//input[@id='identifierId']")
    public WebElement loginField;

    @FindBy(xpath = "//div[@id='identifierNext']")
    public WebElement loginBtn;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwdField;

    @FindBy(xpath = "//div[@id='passwordNext']")
    public WebElement passwdBtn;

    public void inputLogin() {
        loginField.sendKeys("testquest919@gmail.com"); }

    public void inputPasswd() {
        passwdField.sendKeys("sdghg456"); }

    public void clickLoginBtn() {
        loginBtn.click(); }

    public void clickPasswdBtn() {
        passwdBtn.click(); }

}
