package features.authentication;

import steps.DecohereUser;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.TsumNotExistingUser;

@RunWith(SerenityRunner.class)
public class WhenAuthenticating {
    @Steps
//    private DecohereUser user;
    private TsumNotExistingUser new_user;
    @Managed(driver = "chrome")
    WebDriver browser;

    @Test
    public void shouldBeAbleToLoginAsAdmin() {
        new_user.isOnTheHomePage();
        new_user.logsInAsAdmin();
//        user.shouldBeOnLandingPage();
    }
}
