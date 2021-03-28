package steps;

import net.thucydides.core.annotations.Step;
import ui.LandingPage;
import ui.TsumLoginPage;

import static org.assertj.core.api.Assertions.assertThat;

public class TsumExistingUser {
    private TsumLoginPage tsumLoginPage;
    private LandingPage landingPage;

    @Step
    public void isOnTheHomePage() {
        tsumLoginPage.open();
    }

    @Step
    public void logsInAsAdmin() {
        tsumLoginPage.login();
    }

    @Step
    public void shouldBeOnLandingPage() {
        assertThat(landingPage.noticeMessage()).isEqualTo("You are now logged in as admin@decohere.com.");
    }
}
