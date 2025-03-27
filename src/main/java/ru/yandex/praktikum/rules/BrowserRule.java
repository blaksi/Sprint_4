package ru.yandex.praktikum.rules;

import org.junit.rules.ExternalResource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.yandex.praktikum.pom.MainPage;

import java.time.Duration;

public class BrowserRule extends ExternalResource {
    private WebDriver webDriver;
    protected void before(){

        webDriver = new ChromeDriver();
//        webDriver = new FirefoxDriver();

        MainPage mainPage = new MainPage();
        webDriver.get(mainPage.getUrl());
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
    protected void after(){
        webDriver.quit();
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }
}
