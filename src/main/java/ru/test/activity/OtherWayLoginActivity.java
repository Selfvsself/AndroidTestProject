package ru.test.activity;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class OtherWayLoginActivity extends BaseActivity{

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Пароль']")
    private AndroidElement passwordInputText;

    @AndroidFindBy(id = "ru.tele2.mytele2:id/loginButton")
    private AndroidElement onLoginButton;

    public OtherWayLoginActivity(AndroidDriver<AndroidElement> androidDriver) {
        super(androidDriver);
    }

    public void enterPassword(String password) {
        waitVisibility(passwordInputText).sendKeys(password);
    }

    public void clickOnLoginButton() {
        click(onLoginButton);
    }
}
