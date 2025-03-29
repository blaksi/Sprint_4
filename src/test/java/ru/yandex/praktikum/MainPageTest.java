package ru.yandex.praktikum;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import ru.yandex.praktikum.pom.MainPage;
import ru.yandex.praktikum.rules.BrowserRule;
import ru.yandex.praktikum.steps.Steps;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class MainPageTest {
    private final By question;
    private final By answer;
    private final String result;

    public MainPageTest(By question,By answer,String result) {
        this.question = question;
        this.answer = answer;
        this.result = result;
    }
    @Parameterized.Parameters
    public static Object[][] getAnswers() {
        MainPage mainPage = new MainPage();
        return new Object[][] {
                {mainPage.getFirstQuestion(),mainPage.getFirstAnswer(),"Сутки — 400 рублей. Оплата курьеру — наличными или картой."},
                {mainPage.getSecondQuestion(),mainPage.getSecondAnswer(),"Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."},
                {mainPage.getThirdQuestion(),mainPage.getThirdAnswer(),"Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."},
                {mainPage.getFourQuestion(),mainPage.getFourAnswer(),"Только начиная с завтрашнего дня. Но скоро станем расторопнее."},
                {mainPage.getFiveQuestion(),mainPage.getFiveAnswer(),"Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."},
                {mainPage.getSixQuestion(),mainPage.getSixAnswer(),"Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."},
                {mainPage.getSevenQuestion(),mainPage.getSevenAnswer(),"Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."},
                {mainPage.getEightQuestion(),mainPage.getEightAnswer(),"Да, обязательно. Всем самокатов! И Москве, и Московской области."},
        };
    }

    @Rule
    public  final BrowserRule browserRule= new BrowserRule();

    @Test
    public void answerOfQuestion(){
        Steps steps = new Steps(browserRule.getWebDriver());
        steps.scrollClickGetText(question,answer);
              String actual = steps.scrollClickGetText(question,answer);
        assertEquals("Неверный текст ответа на вопрос",result,actual);
    }
}
