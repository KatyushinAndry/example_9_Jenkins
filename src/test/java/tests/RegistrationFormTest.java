package tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import page.RegistrationFormPage;

import static io.qameta.allure.Allure.step;

public class RegistrationFormTest extends TestBase {

    RegistrationFormPage registrationFormPage = new RegistrationFormPage();

    @Test
    @DisplayName("This is regress")
    @Owner("Katyushin")
    @Tag("regress")
    void registrationFormTestRegress(){
        step("Open registration form", (step) -> {
            registrationFormPage.openPage();
        });
        step("Fill registration form", (step) -> {
            registrationFormPage.fillForm();
        });

        step("Check registration form", (step) -> {
            registrationFormPage.checkData();
        });

    }

    @Test
    @DisplayName("This is smoke")
    @Owner("Katyushin")
    @Tag("smoke")
    void registrationFormTestSmoke(){
        step("Open registration form", (step) -> {
            registrationFormPage.openPage();
        });
        step("Fill registration form", (step) -> {
            registrationFormPage.fillForm();
        });

        step("Check registration form", (step) -> {
            registrationFormPage.checkData();
        });

    }
}
