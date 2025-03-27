package ru.yandex.praktikum.pom;

import org.openqa.selenium.By;

public class OrderPage extends MainPage{

    // имя
    private final By name = By.xpath(".//input[@placeholder='* Имя']");
    public By getName() {
        return name;
    }
    // Фамилия
    private final By surname = By.xpath(".//input[@placeholder='* Фамилия']");
    public By getSurname() {
        return surname;
    }
    // Адрес
    private final By address = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    public By getAddress() {
        return address;
    }
    // Список "Станция метро"
    private final By metroList = By.xpath(".//input[@placeholder='* Станция метро']");
    public By getMetroList() {
        return metroList;
    }
    // первое значение из списка "Станция метро"
    private final By metroStationFirst = By.xpath(".//ul[@class='select-search__options']/li[1]");
    public By getMetroStationFirst() {
        return metroStationFirst;
    }
    // номер телефона
    private final By phoneNumber = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    public By getPhoneNumber() {
        return phoneNumber;
    }
   // кнопка Далее
    private final By buttonFurther = By.xpath(".//button[text()='Далее']");
    public By getButtonFurther() {
        return buttonFurther;
    }
    // поле когда привезти самокат
    private final By dateDelivery =By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    public By getDateDelivery() {
        return dateDelivery;
    }
    // список "Срок аренды"
    private final By rentalPeriodList = By.xpath(".//span[@class='Dropdown-arrow']");
    public By getRentalPeriodList() {
        return rentalPeriodList;
    }
    // значение "Сутки" из списка "Срок аренды"
    private final By rentalPeriod = By.xpath(".//div[text()='сутки']");
    public By getRentalPeriod() {
        return rentalPeriod;
    }
    //чекбокс "Цвет самоката" - Серая безысходность
    private final  By colorScooterGrey = By.xpath(".//label[text()='серая безысходность']/input[@type='checkbox']");
    public By getColorScooterGrey() {
        return colorScooterGrey;
    }
    // кнопка Заказать на странице условия заказа
    private  final By buttonOrder = By.xpath(".//div[@class='Order_Buttons__1xGrp']/child::button[text()='Заказать']");
    public By getButtonOrder() {
        return buttonOrder;
    }

    // кнопка "Да" всплывающего окна "Хотите оформить заказ?"
    private final By buttonOrderYes = By.xpath("//button[text()='Да']");
    public By getButtonOrderYes() {
        return buttonOrderYes;
    }
    // Всплывающее окно "Заказ оформлен"
    private final By orderSuccess = By.xpath(".//div[text()='Заказ оформлен']");
    public By getOrderSuccess() {
        return orderSuccess;
    }
}
