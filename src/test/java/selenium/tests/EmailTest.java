package selenium.tests;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import selenium.core.BaseTest;
import selenium.pages.EmailPage;

@Owner(value = "Илья Шайдуров")
@DisplayName("Класс EmailTest")
public class EmailTest extends BaseTest {

    EmailPage email = new EmailPage();
    String emailAddress = "test@mail.ru";

    @DisplayName("Тест подписки с email-генератором")
    @Description("Проверяет подписку на email рассылку с использованием генерированного email")
    @Test
    public void checkWithFakerEmail() {
        Assertions.assertTrue(email.subscribeWithFakerEmail());
    }

    @DisplayName("Тест подписки с заданным email")
    @Description("Проверяет что указынный email уже подписан на рассылку")
    @Test
    public void checkWithEmail() {
        Assertions.assertTrue(email.subscribeWithEmail(emailAddress));
    }
}
