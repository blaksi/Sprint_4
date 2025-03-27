package ru.yandex.praktikum;

import org.hamcrest.MatcherAssert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.yandex.praktikum.pom.OrderPage;
import ru.yandex.praktikum.rules.BrowserRule;
import ru.yandex.praktikum.steps.StepsScenario;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class OrderTest {
    private final String name;
    private final String surname;
    private final String address;
    private final String phoneNumber;
    private final String result;


    public OrderTest(String name,String surname,String address, String phoneNumber, String result ) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.result = result;

    }
    @Parameterized.Parameters
    public static Object[][] getAnswers() {
        OrderPage order = new OrderPage();
        return new Object[][] {
                {"Том", "Ям", "Москва, ул Ленина д.9 кв 55", "+79169738222","Заказ оформлен"},
                {"НатальяИмябольш", "ОдинцоваФамилиябольшаяОдинцоваФамилия", "Санкт-Петербург, посёлок Левашово, ул. Дружбы 400", "+74957397000","Заказ оформлен"},

        };
    }
    @Rule
    public  final BrowserRule browserRule= new BrowserRule();

    @Test  //проверка оформления заказа через первую кнопку заказа
    public void orderByFirstButtonOrder(){
        StepsScenario steps = new StepsScenario(browserRule.getWebDriver());
        OrderPage order = new OrderPage();

        steps.click(order.getFirstButtonOrder());
        steps.formOrderInputPersonData(name,surname,address,phoneNumber);
        steps.formOrderConditions();
        steps.click(order.getButtonOrderYes());
        steps.getText(order.getOrderSuccess());

        String actual= steps.getText(order.getOrderSuccess());
        MatcherAssert.assertThat(actual, containsString(result));
        System.out.println(actual);
    }

    @Test   //проверка оформления заказа через вторую кнопку заказа
    public void orderBySecondButtonOrder(){
        StepsScenario steps = new StepsScenario(browserRule.getWebDriver());
        OrderPage order = new OrderPage();

        steps.scrollClick(order.getSecondButtonOrder());
        steps.formOrderInputPersonData(name,surname,address,phoneNumber);
        steps.formOrderConditions();
        steps.click(order.getButtonOrderYes());
        steps.getText(order.getOrderSuccess());

        String actual= steps.getText(order.getOrderSuccess());
        MatcherAssert.assertThat(actual, containsString(result));
        System.out.println(actual);
    }

    }

