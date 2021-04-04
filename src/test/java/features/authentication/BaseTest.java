package features.authentication;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.BaseUser;
import steps.TsumExistingUser;
import steps.TsumNotExistingUser;

@RunWith(SerenityRunner.class)
public class BaseTest {
    @Steps
    protected BaseUser user;
    @Steps
    protected TsumNotExistingUser notExistingUser;
    @Steps
    protected TsumExistingUser existingUser;

    @Managed(driver = "chrome")
    WebDriver browser;
}
