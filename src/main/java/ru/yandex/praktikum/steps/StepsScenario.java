package ru.yandex.praktikum.steps;

import org.openqa.selenium.WebDriver;
import ru.yandex.praktikum.pom.OrderPage;

public class StepsScenario extends Steps {

    public StepsScenario(WebDriver webDriver) {
        super(webDriver);
    }
    // форма заполнения персональных данных для заказа
    public void formOrderInputPersonData(String name, String surname, String address, String phoneNumber){
        OrderPage order = new OrderPage();
        click(order.getFirstButtonOrder());
        inputText(order.getName(),name);
        inputText(order.getSurname(),surname);
        inputText(order.getAddress(),address);
        selectList(order.getMetroList(),order.getMetroStationFirst());
        inputText(order.getPhoneNumber(),phoneNumber);
        click(order.getButtonFurther());
    }
    // форма заполнения условий аренды
    public void formOrderConditions(){
        OrderPage order = new OrderPage();
        inputCurrentDate(order.getDateDelivery());
        selectList(order.getRentalPeriodList(),order.getRentalPeriod());
        click(order.getColorScooterGrey());
        click(order.getButtonOrder());
    }



}
