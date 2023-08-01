package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {

        this.driver = driver;

    }

    // Identifications

    By txtEmail = By.cssSelector("input#Email");
    By txtPass = By.cssSelector("input#Password");
    By chkRem = By.cssSelector("input#RememberMe");
    By btnLogin = By.tagName("button");
    By btnLogout = By.partialLinkText("ogou");

    
    
    
    // Methods/Action

    public void enterEmail(String email) {

        // driver is null
        driver.findElement(txtEmail).clear();
        driver.findElement(txtEmail).sendKeys(email);
        System.out.println("email entered.....");

    }

    public void enterPass(String pwd) {

        driver.findElement(txtPass).clear();
        driver.findElement(txtPass).sendKeys(pwd);
        System.out.println("email entered.....");

    }

    public void clickRemCheckbox() {

        driver.findElement(chkRem).click();
    }

    public void clickLoginButton() {

        driver.findElement(btnLogin).click();
        System.out.println("Logged in!!!!");
    }

    public void clickLogoutButton() throws InterruptedException {

    	Thread.sleep(3000);
        driver.findElement(btnLogout).click();
        System.out.println("Logged out!!!");
    }
    
    
    public void verifyApplicationTitle(String expTitle) throws Exception {

        Thread.sleep(3000);
        Assert.assertEquals(driver.getTitle(), expTitle);
    }
    
    public boolean verifyEmailDisplayed() {

        return driver.findElement(txtEmail).isDisplayed();
    }

}