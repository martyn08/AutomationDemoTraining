package stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import javax.xml.soap.Detail;
import java.util.List;
import java.util.concurrent.TimeUnit;
import static org.testng.Assert.assertTrue;





public class AutomationDemoTrainingSteps {
    public static WebDriver driver;

    @Given("^i'm on registration page$")
    public void i_m_on_registration_page() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\BidemiAkinlade\\IdeaProjects\\AutomationDemoTraining\\drivers\\chromedriver.exe");

        //System.setProperty("webdriver.firefox.marionette", "C:\\Users\\BidemiAkinlade\\IdeaProjects\\GoogleSearch\\drivers\\geckodriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
    }

    @When("^i enter my \"([^\"]*)\" in the text boxes$")
    public void i_enter_my_in_the_text_boxes(String arg1) throws Throwable {
        driver.findElement(By.cssSelector("#post-body-3077692503353518311 > div > div:nth-child(1) > div:nth-child(4) > input[type=text]")).sendKeys("Martyn");
        driver.findElement(By.cssSelector("#post-body-3077692503353518311 > div > div:nth-child(1) > div:nth-child(7) > input[type=text]")).sendKeys("Akin");


    }

    @When("^i click on \"([^\"]*)\" to confirm my sex my gender$")
    public void i_click_on_to_confirm_my_sex_my_gender(String arg1) throws Throwable {
        driver.findElement(By.cssSelector("#sex-0")).click();

    }

    @When("^i click on \"([^\"]*)\" to confirm my Years of Experience$")
    public void i_click_on_to_confirm_my_Years_of_Experience(String arg1) throws Throwable {
        driver.findElement(By.cssSelector("#exp-2")).click();
    }

    @When("^i enter \"([^\"]*)\" on date picker$")
    public void i_enter_on_date_picker(String arg1) throws Throwable {
        driver.findElement(By.cssSelector("#datepicker")).sendKeys("18/07/2019");
    }

    @When("^i click on \"([^\"]*)\" to confirm my Profession$")
    public void i_click_on_to_confirm_my_Profession(String arg1) throws Throwable {
        driver.findElement(By.cssSelector("#profession-1")).click();
    }

    @When("^i click to confirm Checkbox to confirm \"([^\"]*)\" i've used$")
    public void i_click_to_confirm_Checkbox_to_confirm_i_ve_used(String arg1) throws Throwable {

        //driver.findElement(By.xpath("//*[@id=\"tool-2\"]")).click();

        WebElement checkBox = driver.findElement(By.id("#tool-2"));
        checkBox.click();


       // if ( driver.findElement(By.xpath("//*[@id=\"tool-2\"]")).isSelected() )
        //{
            //driver.findElement(By.xpath("//*[@id=\"tool-2\"]")).click();
        //}

    }

    @When("^i click on \"([^\"]*)\" on multi select box to choose where i'm from$")
    public void i_click_on_on_multi_select_box_to_choose_where_i_m_from(String arg1) throws Throwable {
            driver.findElement(By.cssSelector("#continents > option:nth-child(3)")).click();
    }

    @When("^i clicked on \"([^\"]*)\" i use in selenium$")
    public void i_clicked_on_i_use_in_selenium(String arg1) throws Throwable {
            driver.findElement(By.cssSelector("#selenium_commands > option:nth-child(5)")).click();
    }

    @When("^i click on \"([^\"]*)\" to upload image$")
    public void i_click_on_to_upload_image(String arg1) throws Throwable {
        WebElement uploadButton = driver.findElement(By.cssSelector("#photo"));
        uploadButton.sendKeys("C:\\Users\\BidemiAkinlade\\Pictures");
    }

    @When("^i click to \"([^\"]*)\" to upload my file$")
    public void i_click_to_to_upload_my_file(String arg1) throws Throwable {
           // driver.findElement(By.cssSelector("#post-body-3077692503353518311 > div > div:nth-child(1) > div.controls > div:nth-child(2) > div > a")).click();
    }

    @Then("^i click on submit button$")
    public void i_click_on_submit_button() throws Throwable {
            driver.findElement(By.cssSelector("#submit")).click();
    }

}
