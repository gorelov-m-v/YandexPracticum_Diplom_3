package ru.yandex.practicum.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PasswordRecoveryPage extends PageBase{

    public PasswordRecoveryPage(WebDriver webDriver) {
        super(webDriver);
    }

    private final String URL_PASSWORD_RECOVERY_PAGE = "https://stellarburgers.nomoreparties.site/forgot-password";

    private final By INPUT_EMAIL_FIELD = By.xpath(".//input[@name='name']");

    private final By PASSWORD_RECOVERY_HEADER = By.linkText("Восстановление пароля");

    private final By ENTER_LINK = By.linkText("Войти");

    private final By RECOVER_BUTTON = By.linkText("recover");

    public void getPasswordRecoveryPage() {
        webDriver.get(URL_PASSWORD_RECOVERY_PAGE);
    }

    public void initLogin() {
        click(ENTER_LINK);
    }
}
