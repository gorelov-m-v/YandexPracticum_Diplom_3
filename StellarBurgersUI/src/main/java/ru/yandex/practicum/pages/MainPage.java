package ru.yandex.practicum.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends PageBase {

    public MainPage(WebDriver webDriver) {
        super(webDriver);
    }

    private final String URL_MAIN_PAGE = "https://stellarburgers.nomoreparties.site/";

    private final By PERSONAL_ACCOUNT_LINK = By.xpath(".//a[contains(@href, '/account')]");
    private final By CONSTRUCTOR_LINK = By.linkText("Конструктор");
    private final By ORDER_LINE_LINK = By.linkText("Лента заказов");

    private final By BUNS_LINK = By.linkText("Булки");
    private final By SOUSES_LINK = By.linkText("Булки");
    private final By TOPPINGS_LINK = By.linkText("Булки");

    private final By ENTER_TO_ACCOUNT_BUTTON = By.xpath(".//div[@id='root']/div/main/section[2]/div/button");
    private final By STELLAR_BURGERS_LOGO = By.cssSelector("a.active > svg");
    private final By SUBMIT_ORDER = By.xpath(".//button");

    public void checkPage() {
        checkLocator(SUBMIT_ORDER);
    }
    public void getMainPage() {
        webDriver.get(URL_MAIN_PAGE);
    }
    public void initLogin() {
        click(ENTER_TO_ACCOUNT_BUTTON);
    }

    public void initEnterToPersonalAccount() {
        click(PERSONAL_ACCOUNT_LINK);
    }

}
