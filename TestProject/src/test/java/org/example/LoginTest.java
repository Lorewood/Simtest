package org.example;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class LoginTest {
   public static LoginPage loginPage;
   public static ProfilePage profilePage;
   public static WebDriver driver;

   @BeforeClass
    public static void setup() throws MalformedURLException {
       System.setProperty("webdriver.chrome.driver",ConfProperties.getProperty("chromedriver"));
       driver = new ChromeDriver();
       String URL = "https://www.gmail.com";
       String Node ="http://localhost:4444";
       DesiredCapabilities capabilities = new DesiredCapabilities();
       capabilities.setBrowserName("chrome");
       capabilities.setPlatform(Platform.WIN10);
       driver = new RemoteWebDriver(new URL(Node),capabilities);
       driver.navigate().to(URL);
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   }
   @Test
   public void loginTest() {
      //ввод логина
      loginPage.inputLogin();
      //нажать кнопку входа
      loginPage.clickLoginBtn();
      //ввод пароля
      loginPage.inputPasswd();
      //нажать кнопку входа
      loginPage.clickPasswdBtn();
      //нажать кнопку "написать"
      profilePage.clickWriteBtn();
      //написать почту адресата
      profilePage.keysAdrField();
      //написать тему
      profilePage.keysSubField();
      //написать текст
      profilePage.keysTextField();
      //отправить письмо
      profilePage.clickSendBtn();
   }
   @AfterClass
   public static void tearDown() {
           driver.quit();
   }
}
