package steps;

import ui.DecohereHomePage;
import ui.LandingPage;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class DecohereUser {
    private DecohereHomePage decohereHomePage;
    private LandingPage landingPage;

    @Step
    public void isOnTheHomePage() {
        decohereHomePage.open();
    }

    @Step
    public void logsInAsAdmin() {
        decohereHomePage.loginAsAdmin();
    }

    @Step
    public void shouldBeOnLandingPage() {
        assertThat(landingPage.noticeMessage()).isEqualTo("You are now logged in as admin@decohere.com.");
    }
}
