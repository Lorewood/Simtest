package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {
    public WebDriver driver;
    public ProfilePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(xpath = "//div[text()='Написать']")
    public WebElement writeBtn;

    @FindBy(xpath = "//textarea[@name='to']")
    public WebElement adrField;

    @FindBy(xpath = "//input[@name='subjectbox']")
    public WebElement subField;

    @FindBy(css = "#:25 .bx0")
    public WebElement textField;

    @FindBy(xpath = "//div[text()='Отправить']")
    public WebElement sendBtn;


    public void clickWriteBtn() {
        writeBtn.click(); }

    public void keysAdrField() {
        adrField.sendKeys("testquest919@gmail.com"); }

    public void keysSubField() {
        subField.sendKeys("Simbirsoft Тестовое задание. Кирьянов"); }

    public void keysTextField() {
        String mail = textField.getText();
        textField.sendKeys(mail); }

    public void clickSendBtn() {
        sendBtn.click(); }
}
