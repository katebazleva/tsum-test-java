package ui;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.tsum.ru/registration/")
public class TsumRegisterPage extends PageObject {

    public void register(String email, String password) {
        $("[placeholder=Email]").sendKeys(email);
        $("[placeholder=Пароль]").sendKeys(password);
        $("auth-register button").click();
    }

    public String getAgreementText() {
        return $(".text").getText();
    }

    public String getAgreementTermsLink() {
        return $(".text .text-link").getAttribute("href");
    }

    public String getNoticeMessage() {
        return $(".notice").getText();
    }
}
