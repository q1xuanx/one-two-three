package com.minigame.one_two_three.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RandomObjectStepDefinitions {
    WebDriver driver = Hooks.driver;
    @Given("The list button is show")
    public void the_list_button_is_show() {
        String baseUrl = "http://localhost:3000/";
        driver.get(baseUrl);
    }
    @When("The user chose Bua")
    public void the_user_chose_zero() {
        driver.findElement(By.xpath("//button[normalize-space()='Bua']")).click();
    }
    @When("The user chose Keo")
    public void the_user_chose_one() {
        driver.findElement(By.xpath("//button[normalize-space()='Keo']")).click();
    }
    @When("The user chose Bao")
    public void the_user_chose_two() {
        driver.findElement(By.xpath("//button[normalize-space()='Bao']")).click();
    }
    @Then("Bot will response result")
    public void bot_will_response_result(io.cucumber.datatable.DataTable body)  throws InterruptedException {
        WebElement botRes = driver.findElement(By.cssSelector("div[class='yes'] div:nth-child(2)"));
        String botChoiceText = botRes.getText();
        String splitResult = botChoiceText.replace("Bot: ", "").trim();
        body.asMaps().forEach(row -> {
            String expectedBotChose = row.get("If bot chose");
            String expectedResult = row.get("then");
            if (splitResult.equals(expectedBotChose)) {
                String result = driver.findElement(By.xpath("//span[@class='button-9 center']")).getText();
                assertEquals(expectedResult, result);
            }
        });
        Thread.sleep(2000);
    }
}
