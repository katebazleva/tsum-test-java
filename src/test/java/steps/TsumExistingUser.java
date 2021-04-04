package steps;

import net.thucydides.core.annotations.Step;
import ui.TsumBasePage;

import static org.assertj.core.api.Assertions.assertThat;

public class TsumExistingUser extends BaseUser {

    private TsumBasePage page;

    private String email = "katebazleva@gmail.com";
    private String password = "qwerty123";

    @Step
    public void logins() {
        super.logins(email, password);
    }

    @Step
    public void register() {
        super.registers(email, password);
    }

    @Step
    public void loginWithBadEmail() {
        String email = "test";
        String password = "test";
        super.logins(email, password);
    }

    @Step
    public void shouldSeeHeIsLoggedIn() {
        assertThat(page.getPrivateOfficeLinkText()).isEqualTo(email);
    }
}
