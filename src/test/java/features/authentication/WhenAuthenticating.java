package features.authentication;

import org.junit.Test;

public class WhenAuthenticating extends BaseTest {

    @Test
    public void shouldBeAbleToLogin() {
        existingUser.openLoginPage();
        existingUser.logins();
        existingUser.shouldSeeHeIsLoggedIn();
    }

    @Test
    public void shouldSeeLinkToRestorePassword() {
        user.openLoginPage();
        user.shouldSeeForgetPasswordLink();
        user.shouldSeeCorrectForgetPasswordLink();
    }

    @Test
    public void shouldNotBeAbleToLogin() {
        notExistingUser.openLoginPage();
        notExistingUser.logins();
        notExistingUser.shouldSeeMessageOnLoginPage("Неверный логин или пароль");
    }

    @Test
    public void shouldSeeEmailValidationError() {
        existingUser.openLoginPage();
        existingUser.loginWithBadEmail();
        existingUser.shouldSeeMessageOnRegisterPage("Указан некорректный email");
    }
}
