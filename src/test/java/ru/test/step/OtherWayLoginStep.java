package ru.test.step;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import ru.test.activity.OtherWayLoginActivity;

public class OtherWayLoginStep extends BaseStep<OtherWayLoginActivity> {

    public OtherWayLoginStep(AndroidDriver<AndroidElement> androidDriver) {
        super(new OtherWayLoginActivity(androidDriver));
        log("Загрузилась страница 'Другие способы входа'");
    }

    public void enterPassword(String password) {
        log("Вводим пароль '%s'", password);
        activity.enterPassword(password);
    }

    public void clickOnLoginButton() {
        log("Нажимаем на кнопку 'Войти'");
        activity.clickOnLoginButton();
    }
}
