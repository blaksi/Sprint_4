package ru.yandex.praktikum.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Steps {
    private final WebDriver webDriver;
    public Steps(WebDriver webDriver){
        this.webDriver = webDriver;
    }

 //скролл, клик на элемент и вывод текста
    public String scrollClickGetText(By firstElement, By secondElement){
        scrollClick(firstElement);
        return webDriver.findElement(secondElement).getText();
    }
    // скролл и клик
    public Steps scrollClick(By firstElement){
        WebElement element = webDriver.findElement(firstElement);
        ((JavascriptExecutor)webDriver).executeScript("arguments[0].scrollIntoView();", element); //скролл до элемента
        webDriver.findElement(firstElement).click();
        return this;
    }

// клик на элемент
    public Steps click(By element){
        webDriver.findElement(element).click();
        return this;
    }
// Ввод текста
    public Steps inputText (By element, String text){
        webDriver.findElement(element).sendKeys(text);
        return this;
    }
    // получение текстового значения
    public String getText(By element){
       return webDriver.findElement(element).getText();
    }

 // Выбор значения из списка
    public Steps selectList(By firstElement, By secondElement){
        webDriver.findElement(firstElement).click();
        webDriver.findElement(secondElement).click();
        return this;
    }

    public Steps inputCurrentDate(By element){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        String formattedDate = dateFormat.format(Calendar.getInstance().getTime());
        webDriver.findElement(element).sendKeys(formattedDate);
        return this;
    }



}
