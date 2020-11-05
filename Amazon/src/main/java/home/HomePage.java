package home;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static home.HomePageWebElements.*;

public class HomePage extends WebAPI {

    @FindBy(how = How.ID, using = searBoxWebElement)
    public WebElement searchBox;
    @FindBy(how = How.CSS, using = searButtonWebElement)
    public WebElement searchButton;
    @FindBy(how = How.XPATH, using = toysActualTextWebElement)
    public WebElement toysWebElement;

    public void searchBox1() throws InterruptedException {
        searchBox.sendKeys(searchToys);
        Thread.sleep(3000);
        searchButton.click();
        Thread.sleep(5000);
    }

    public void validateSearchBox1() {
        String expectedText = "\"toys\"";
        String actualText =toysWebElement.getText() ;
        Assert.assertEquals(actualText, expectedText, "Test Fail: Search keyword does not match");
    }

    public void searchBox2() throws InterruptedException {
        driver.findElement(By.id(searBoxWebElement)).sendKeys(searchHandSanitizer);
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(searButtonWebElement)).click();
        Thread.sleep(5000);

    }

    public void validateSearchBox2() {
        String expectedText = "\"Hand Sanitizer\"";
        String actualText = driver.findElement(By.cssSelector(handSanitizerActualTextWebElement)).getText();
        Assert.assertEquals(actualText, expectedText, "Test Fail: Search keyword does not match");
    }

    public void searchBox3() throws InterruptedException {
        driver.findElement(By.id(searBoxWebElement)).sendKeys(searchRolex);
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(searButtonWebElement)).click();
        Thread.sleep(5000);
    }

    public void validateSearchBox3() throws InterruptedException {
        String expectedText = "\"rolex\"";
        String actualText = driver.findElement(By.xpath(rolexActualTextWebElement)).getText();
        Assert.assertEquals(actualText, expectedText, "Test Fail: Search keyword does not match");
    }

    public void searchBox4() throws InterruptedException {
        driver.findElement(By.id(searBoxWebElement)).sendKeys(searchIphone12ProMax);
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(searButtonWebElement)).click();
        Thread.sleep(5000);
    }

    public void validateSearchBox4() throws InterruptedException {
        String expectedText = "\"iphone 12 pro max\"";
        String actualText = driver.findElement(By.xpath(iphone12ProMaxActualTextWebElement)).getText();
        Assert.assertEquals(actualText, expectedText, "Test Fail: Search keyword does not match");
    }

    public void loginWithValidCredential() throws InterruptedException {
        driver.findElement(By.xpath(helloSignInWebElement)).click();
        driver.findElement(By.id(emailForSignInWebElement)).sendKeys(enterEmailForSignInWebElement);
        driver.findElement(By.xpath(continueForSignInWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(passwordForSignInWebElement)).sendKeys(enterPasswordForSignInWebElement);
        driver.findElement(By.xpath(submitForSignInWebElement)).click();
        Thread.sleep(3000);
    }

    public void validateLoginWithValidCredential() throws InterruptedException {

    }

    public void searchToys() throws InterruptedException {
        driver.findElement(By.id(searBoxWebElement)).sendKeys(searchToys);
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(searButtonWebElement)).click();
        Thread.sleep(3000);
        //String actualText= driver.findElement(By.xpath("//span[contains(text(),'Drawing Tablet')]")).getText();
        //String actualText= driver.findElement(By.xpath("//span[contains(text(),'Drawing Tablet')]")).getAttribute("dir");
        driver.findElement(By.xpath(clickOnProductWebElement)).click();
        driver.findElement(By.xpath(clickOnColorWebElement)).click();
        driver.findElement(By.xpath(clickOnUnknowWebElement)).click();
        driver.findElement(By.xpath(clickOnQtyWebElement)).click();
        driver.findElement(By.xpath(clickOnCartWebElement)).click();
        driver.findElement(By.xpath(clickOnCheckoutWebElement)).click();

    }

    public void validateSearchToys() {


    }


}
