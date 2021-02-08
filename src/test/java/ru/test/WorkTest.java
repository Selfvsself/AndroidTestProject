package ru.test;

import org.junit.Test;
import ru.test.step.LoginPageStep;
import ru.test.step.OtherWayLoginStep;
import ru.test.step.SMSCodeStep;

public class WorkTest extends BaseTest {

    private String phoneNumber = "9771231212";
    private String password = "123456";

    @Test
    public void test() {
        LoginPageStep loginPageStep = new LoginPageStep(androidDriver);
        loginPageStep.enterPhoneNumber(phoneNumber);
        loginPageStep.clickOnLoginButton();

        SMSCodeStep smsCodeStep = new SMSCodeStep(androidDriver);
        smsCodeStep.clickOnOtherWayButton();

        OtherWayLoginStep otherWayLoginStep = new OtherWayLoginStep(androidDriver);
        otherWayLoginStep.enterPassword(password);
        otherWayLoginStep.clickOnLoginButton();
    }
}
