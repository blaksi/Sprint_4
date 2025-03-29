package ru.yandex.praktikum.pom;

import org.openqa.selenium.By;

public class MainPage {
 // url страницы
    private final String url ="https://qa-scooter.praktikum-services.ru/";
    public String getUrl() {
        return url;
    }

 // Вопросы о важном
    // 1. Сколько это стоит? И как оплатить?
    private final By firstQuestion = By.xpath(".//div[text()='Сколько это стоит? И как оплатить?']"); // Вопрос: Сколько это стоит? И как оплатить?
    public By getFirstQuestion() {
        return firstQuestion;
    } //ответ
    private final By firstAnswer = By.xpath(".//p[text()='Сутки — 400 рублей. Оплата курьеру — наличными или картой.']"); // Ответ на вопрос "Сколько это стоит? И как оплатить?"
    public By getFirstAnswer() {
        return firstAnswer;
    }

    // 2. Хочу сразу несколько самокатов! Так можно?
    private final By secondQuestion = By.xpath(".//div[text()='Хочу сразу несколько самокатов! Так можно?']");  // Вопрос: Хочу сразу несколько самокатов! Так можно?
    public By getSecondQuestion() {
        return secondQuestion;
    }//ответ
    private final By secondAnswer = By.xpath(".//p[contains(text(),'Пока что у нас так: один заказ — один самокат')]");
    public By getSecondAnswer() {
        return secondAnswer;
    }

    // 3. Как рассчитывается время аренды?
    private final By thirdQuestion = By.xpath(".//div[text()='Как рассчитывается время аренды?']");
    public By getThirdQuestion() {
        return thirdQuestion;
    } //ответ
    private final By thirdAnswer = By.xpath(".//p[contains(text(),'Допустим, вы оформляете заказ на 8 мая')]");
    public By getThirdAnswer() {
        return thirdAnswer;
    }

    // 4. Можно ли заказать самокат прямо на сегодня?
    private final By fourQuestion = By.xpath(".//div[text()='Можно ли заказать самокат прямо на сегодня?']");
    public By getFourQuestion() {
        return fourQuestion;
    } //ответ
    private final By fourAnswer = By.xpath(".//p[text()='Только начиная с завтрашнего дня. Но скоро станем расторопнее.']");
    public By getFourAnswer() {
        return fourAnswer;
    }
    // 5. Можно ли продлить заказ или вернуть самокат раньше?
    private final By fiveQuestion = By.xpath(".//div[text()='Можно ли продлить заказ или вернуть самокат раньше?']");
    public By getFiveQuestion() {
        return fiveQuestion;
    } //ответ
    private final By fiveAnswer = By.xpath(".//p[contains(text(),'Пока что нет! Но если что-то срочное')]");
    public By getFiveAnswer() {
        return fiveAnswer;
    }
    // 6. Вы привозите зарядку вместе с самокатом?
    private final By sixQuestion = By.xpath(".//div[text()='Вы привозите зарядку вместе с самокатом?']");
    public By getSixQuestion() {
        return sixQuestion;
    } //ответ
    private final By sixAnswer = By.xpath(".//p[contains(text(),'Самокат приезжает к вам с полной зарядкой')]");
    public By getSixAnswer() {
        return sixAnswer;
    }

    // 7. Можно ли отменить заказ?'
    private final By sevenQuestion = By.xpath(".//div[text()='Можно ли отменить заказ?']");
    public By getSevenQuestion() {
        return sevenQuestion;
    } //ответ
    private final By sevenAnswer = By.xpath(".//p[contains(text(),'Да, пока самокат не привезли')]");
    public By getSevenAnswer() {
        return sevenAnswer;
    }

    // 8. Я жизу за МКАДом, привезёте?
    private final By eightQuestion = By.xpath(".//div[text()='Я жизу за МКАДом, привезёте?']");
    public By getEightQuestion() {
        return eightQuestion;
    } //ответ
    private final By eightAnswer = By.xpath(".//p[contains(text(),'Да, обязательно. Всем самокатов!')]");
    public By getEightAnswer() {
        return eightAnswer;
    }

 //кнопка "Заказать" рядом со статусом заказа
    private final By firstButtonOrder = By.xpath(".//button[text()='Статус заказа']/parent::div/button[text()='Заказать']");
    public By getFirstButtonOrder() {
        return firstButtonOrder;
    }
    // кнопка Заказать внизу страницы
    private final By secondButtonOrder = By.xpath(".//div[@class='Home_FinishButton__1_cWm']/child::button[text()='Заказать']");
    public By getSecondButtonOrder() {
        return secondButtonOrder;
    }
}
