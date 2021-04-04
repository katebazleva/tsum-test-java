package ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.tsum.ru/login/")
public class TsumLoginPage extends PageObject {

    @FindBy(css = ".forget-pwd")
    private WebElementFacade forgetLink;

    public void login(String email, String password) {
        $(".login-input").sendKeys(email);
        $(".pwd-input").sendKeys(password);
        $("auth-login button").click();
    }

    public String getForgetLinkText() {
        return forgetLink.getText();
    }

    public String getForgetLink() {
        return forgetLink.getAttribute("href");
    }

    public String getNoticeMessage() {
        return $(".notice").getText();
    }
}
