package ru.test.step;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import ru.test.activity.LoginActivity;

public class LoginPageStep extends BaseStep<LoginActivity>{

    public LoginPageStep(AndroidDriver<AndroidElement> androidDriver) {
        super(new LoginActivity(androidDriver));
        log("Загрузилась страница 'Вход'");
    }

    public void enterPhoneNumber(String number) {
        log("Вводим номер телефона '%s'", number);
        activity.enterPhoneNumber(number);
    }

    public void clickOnLoginButton() {
        log("Нажимаем на кнопку 'Войти'");
        activity.clickOnLoginButton();
    }
}
