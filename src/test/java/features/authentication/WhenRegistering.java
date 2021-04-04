package features.authentication;

import org.junit.Test;

public class WhenRegistering extends BaseTest {

    @Test
    public void shouldBeAbleToRegister() {
        notExistingUser.openRegisterPage();
        notExistingUser.register();
        notExistingUser.shouldSeeMessageOnRegisterPage("Успешная регистрация");
    }

    @Test
    public void shouldSeeAgreementText() {
        user.openRegisterPage();
        user.shouldSeeAgreementText();
        user.shouldHaveCorrectTermsLink();
    }

    @Test
    public void shouldSeePasswordValidationError() {
        notExistingUser.openRegisterPage();
        notExistingUser.registerWithBadPassword();
        notExistingUser.shouldSeeMessageOnRegisterPage("Пароль должен быть не менее 8 символов длиной");
    }

    @Test
    public void shouldNotBeAbleToRegisterAgain() {
        existingUser.openRegisterPage();
        existingUser.register();
        existingUser.shouldSeeMessageOnRegisterPage("Не удалось зарегистрироваться");
    }
}
