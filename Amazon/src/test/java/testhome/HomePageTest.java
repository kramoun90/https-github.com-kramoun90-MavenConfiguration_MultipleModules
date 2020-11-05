package testhome;

import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends WebAPI {
    HomePage homePage;
    @BeforeMethod
    public void getInit(){
        homePage= PageFactory.initElements(driver, HomePage.class);
    }


//    @Test(enabled = false)
//    public void testHomePageTitle() throws InterruptedException {
//        //driver.get(amazonUrl);
//        String expectedTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
//        String actualTitle = driver.getTitle();
//        // Validate Title
//        Assert.assertEquals(actualTitle, expectedTitle, "Test Fail: Title does not match");
//        Thread.sleep(5000);
//    }

    @Test(enabled = true)
    public void testSearchBox1() throws InterruptedException {
        homePage.searchBox1(); // calling action method
        homePage.validateSearchBox1(); // calling Assertion/Validation method
    }
//
//    @Test(enabled = false)
//    public void testSearchBox2() throws InterruptedException {
//        searchBox2(); // calling action method
//        validateSearchBox2(); // calling Assertion/Validation method
//    }
//
//    @Test(enabled = false)
//    public void testSearchBox3() throws InterruptedException {
//        searchBox3(); // calling action method
//        validateSearchBox3(); // calling Assertion/Validation method
//    }
//
//    @Test(enabled = false)
//    public void testSearchBox4() throws InterruptedException {
//        searchBox4(); // calling action method
//        validateSearchBox4(); // calling Assertion/Validation method
//    }
//    @Test(enabled = false)
//    public void testLoginWithValidCredential() throws InterruptedException {
//        loginWithValidCredential(); // calling action method
//        validateLoginWithValidCredential(); // calling Assertion/Validation method
//    }
//    @Test(enabled = false)
//    public void testSearchToys() throws InterruptedException {
//        searchToys(); // calling action method
//        validateSearchToys(); // calling Assertion/Validation method
//    }




}
