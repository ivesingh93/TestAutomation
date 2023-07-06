package com.sampletest;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGTodo1 {

    private RemoteWebDriver driver;
    private String Status = "failed";

    @BeforeMethod
    public void setup(Method m, ITestContext ctx) throws MalformedURLException {
        System.setProperty("webdriver.chrome.driver", "/Users/ivkaransingh/Downloads/chromedriver_mac64/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        driver = new ChromeDriver(options);

    }

    @Test
    public void basicTest() throws InterruptedException {

        // Navigate to the Google homepage
        driver.get("https://www.google.com");

        // Locate the search text box
        WebElement searchTextBox = driver.findElement(By.name("q"));

        // Enter a search query
        searchTextBox.sendKeys("Selenium");

        Thread.sleep(4000);

        // Click the search button
        WebElement searchButton = driver.findElement(By.name("btnK"));
        searchButton.click();

        // Verify that the search results page is displayed
        String expectedTitle = "Selenium - Google Search";
        String actualTitle = driver.getTitle();
        assert expectedTitle.equals(actualTitle);

        // Close the browser
        driver.quit();

    }


    @Test
    public void basicTest2() throws InterruptedException {

        // Navigate to the Google homepage
        driver.get("https://www.google.com");

        // Locate the search text box
        WebElement searchTextBox = driver.findElement(By.name("q"));

        // Enter a search query
        searchTextBox.sendKeys("Maven");

        Thread.sleep(4000);

        // Click the search button
        WebElement searchButton = driver.findElement(By.name("btnK"));
        searchButton.click();

        // Verify that the search results page is displayed
        String expectedTitle = "Maven - Google Search";
        String actualTitle = driver.getTitle();
        assert expectedTitle.equals(actualTitle);

        // Close the browser
        driver.quit();

    }


    @Test
    public void basicTest3() throws InterruptedException {

        // Navigate to the Google homepage
        driver.get("https://www.google.com");

        // Locate the search text box
        WebElement searchTextBox = driver.findElement(By.name("q"));

        // Enter a search query
        searchTextBox.sendKeys("Maven");

        Thread.sleep(4000);

        // Click the search button
        WebElement searchButton = driver.findElement(By.name("btnK"));
        searchButton.click();

        // Verify that the search results page is displayed
        String expectedTitle = "Selenium - Google Search";
        String actualTitle = driver.getTitle();
        assert expectedTitle.equals(actualTitle);

        // Close the browser
        driver.quit();

    }

    @Test
    public void basicTest4() throws InterruptedException {

        // Navigate to the Google homepage
        driver.get("https://www.google.com");

        // Locate the search text box
        WebElement searchTextBox = driver.findElement(By.name("q"));

        // Enter a search query
        searchTextBox.sendKeys("Jenkins");

        Thread.sleep(4000);

        // Click the search button
        WebElement searchButton = driver.findElement(By.name("btnK"));
        searchButton.click();

        // Verify that the search results page is displayed
        String expectedTitle = "Jenkins - Google Search";
        String actualTitle = driver.getTitle();
        assert expectedTitle.equals(actualTitle);

        // Close the browser
        driver.quit();

    }

    @Test
    public void basicTest5() throws InterruptedException {

        // Navigate to the Google homepage
        driver.get("https://www.google.com");

        // Locate the search text box
        WebElement searchTextBox = driver.findElement(By.name("q"));

        // Enter a search query
        searchTextBox.sendKeys("ChromeDriver");

        Thread.sleep(4000);

        // Click the search button
        WebElement searchButton = driver.findElement(By.name("btn"));
        searchButton.click();

        // Verify that the search results page is displayed
        String expectedTitle = "ChromeDriver - Google Search";
        String actualTitle = driver.getTitle();
        assert expectedTitle.equals(actualTitle);

        // Close the browser
        driver.quit();

    }

    @Test
    public void basicTest6() throws InterruptedException {

        // Navigate to the Google homepage
        driver.get("https://www.google.com");

        // Locate the search text box
        WebElement searchTextBox = driver.findElement(By.name("q"));

        // Enter a search query
        searchTextBox.sendKeys("Threads");

        Thread.sleep(4000);

        // Click the search button
        WebElement searchButton = driver.findElement(By.name("btnK"));
        searchButton.click();

        // Verify that the search results page is displayed
        String expectedTitle = "Threads - Google Search";
        String actualTitle = driver.getTitle();
        assert expectedTitle.equals(actualTitle);

        // Close the browser
        driver.quit();

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}