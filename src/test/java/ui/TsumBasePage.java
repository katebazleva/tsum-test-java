package ui;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class TsumBasePage extends PageObject {

    @FindBy(css=".header__private .header__link")
    private WebElementFacade privateOfficeLink;

    public String getPrivateOfficeLinkText(){
        return privateOfficeLink.waitUntilVisible().getText();
    }
}
