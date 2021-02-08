package ru.test.step;

import ru.test.activity.BaseActivity;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseStep<T extends BaseActivity> {

    protected final Logger logger = Logger.getLogger(getClass().getName());
    protected final T activity;

    public BaseStep(T activity) {
        this.activity = activity;
    }

    protected void log(String string) {
        logger.log(Level.SEVERE, string);
    }

    protected void log(String strFormat, Object... args) {
        logger.log(Level.SEVERE, String.format(strFormat, args));
    }
}
