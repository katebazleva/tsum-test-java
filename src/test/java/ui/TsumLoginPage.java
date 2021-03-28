package ui;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.tsum.ru/login/?")
public class TsumLoginPage extends PageObject {
    public void login() {
        $(".login-input").sendKeys("admin@decohere.com");
        $(".pwd-input").sendKeys("admin");
        $("auth-login button").click();
    }
}
