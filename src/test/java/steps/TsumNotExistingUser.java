package steps;

import com.github.javafaker.Faker;
import net.thucydides.core.annotations.Step;

public class TsumNotExistingUser extends BaseUser {

    @Step
    public void logins() {
        String email = "test@test.ru";
        String password = "test";
        super.logins(email, password);
    }

    @Step
    public void register() {
        Faker faker = new Faker();
        String email = faker.internet().emailAddress();
        String password = "qwerty123";
        super.registers(email, password);
    }

    @Step
    public void registerWithBadPassword() {
        String email = "test@test.ru";
        String password = "test";
        super.registers(email, password);
    }
}
