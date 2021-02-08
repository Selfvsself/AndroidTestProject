package ru.test.activity;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginActivity extends BaseActivity{

    @AndroidFindBy(id = "ru.tele2.mytele2:id/editText")
    private AndroidElement phoneNumberInput;

    @AndroidFindBy(id = "ru.tele2.mytele2:id/login")
    private AndroidElement onLoginButton;

    public LoginActivity(AndroidDriver<AndroidElement> androidDriver) {
        super(androidDriver);
    }

    public void enterPhoneNumber(String number) {
        waitVisibility(phoneNumberInput).sendKeys(number);
    }

    public void clickOnLoginButton() {
        click(onLoginButton);
    }
}
