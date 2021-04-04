package steps;

import net.thucydides.core.annotations.Step;
import ui.TsumLoginPage;
import ui.TsumRegisterPage;

import static org.assertj.core.api.Assertions.assertThat;

public class BaseUser {
    private TsumLoginPage tsumLoginPage;
    private TsumRegisterPage tsumRegisterPage;

    @Step
    public void openLoginPage() {
        tsumLoginPage.open();
    }

    @Step
    public void openRegisterPage() {
        tsumRegisterPage.open();
    }

    @Step
    public void logins(String email, String password) {
        tsumLoginPage.login(email, password);
    }

    @Step
    public void registers(String email, String password) {
        tsumRegisterPage.register(email, password);
    }

    @Step
    public void shouldSeeMessageOnLoginPage(String text) {
        assertThat(tsumLoginPage.getNoticeMessage()).isEqualTo(text);
    }

    @Step
    public void shouldSeeMessageOnRegisterPage(String text) {
        assertThat(tsumRegisterPage.getNoticeMessage()).isEqualTo(text);
    }

    @Step
    public void shouldSeeAgreementText() {
        assertThat(tsumRegisterPage.getAgreementText()).isEqualTo("Продолжая, вы принимаете «Правила продажи товаров»\n" +
                "и соглашаетесь на обработку персональных данных.");
    }

    @Step
    public void shouldHaveCorrectTermsLink() {
        assertThat(tsumRegisterPage.getAgreementTermsLink()).isEqualTo("https://www.tsum.ru/terms/");
    }

    @Step
    public void shouldSeeForgetPasswordLink() {
        assertThat(tsumLoginPage.getForgetLinkText()).isEqualTo("Забыли пароль?");
    }

    @Step
    public void shouldHaveCorrectForgetPasswordLink() {
        assertThat(tsumLoginPage.getForgetLink()).isEqualTo("https://www.tsum.ru/password/forgot/");
    }
}
