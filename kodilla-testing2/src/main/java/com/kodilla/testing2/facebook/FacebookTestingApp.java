package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookTestingApp {

    public static final String XPATH_COOKIES = "//div[contains(@class, \"al64\")]/button[contains(@class,\"42ft _4jy0 _al65 _4jy3 _4jy1\" )]";

    public static final String XPATH_REGISTER = "//a[contains(@class,\"42ft _4jy0 _6lti _4jy6 _4jy2\" )]";
    public static final String XPATH_DAYBORN = "//div[contains(@class, \"5k_5\")]/span/span/select[1]";
    public static final String XPATH_MONTHBORN = "//div[contains(@class, \"5k_5\")]/span/span/select[2]";
    public static final String XPATH_YEARBORN = "//div[contains(@class, \"5k_5\")]/span/span/select[3]";
    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://www.facebook.com/");

        while (!driver.findElement(By.xpath(XPATH_COOKIES)).isDisplayed());
        WebElement selectCookies = driver.findElement(By.xpath(XPATH_COOKIES));
        selectCookies.click();

        WebElement createNewAccount = driver.findElement(By.xpath(XPATH_REGISTER));
        createNewAccount.click();

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(XPATH_DAYBORN)));

        WebElement selectComboDayBorn = driver.findElement(By.xpath(XPATH_DAYBORN));
        Select selectDayBorn = new Select(selectComboDayBorn);
        selectDayBorn.selectByIndex(8);

        WebElement selectComboMonthBorn = driver.findElement(By.xpath(XPATH_MONTHBORN));
        Select selectMonthBorn = new Select(selectComboMonthBorn);
        selectMonthBorn.selectByIndex(4);

        WebElement selectComboYearBorn = driver.findElement(By.xpath(XPATH_YEARBORN));
        Select selectYearBorn = new Select(selectComboYearBorn);
        selectYearBorn.selectByValue("1994");

    }
}