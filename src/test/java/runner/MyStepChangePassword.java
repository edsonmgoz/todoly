package runner;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import page.ChangePasswordModal;
import page.LoginModal;
import page.MainPage;
import page.MenuSection;

import java.util.Map;

public class MyStepChangePassword {

    MainPage mainPage = new MainPage();
    LoginModal loginModal = new LoginModal();
    ChangePasswordModal changePasswordModal = new ChangePasswordModal();
    MenuSection menuSection = new MenuSection();

    @When("yo cambio mi password")
    public void yoCambioMiPassword(Map<String, String> data) {
        menuSection.settingsButton.click();
        changePasswordModal.oldPassTxtBox.writeText(data.get("oldpass"));
        changePasswordModal.newPassTxtBox.writeText(data.get("newpass"));
        changePasswordModal.okSettingsButton.click();
    }

    @And("yo cierro la sesion")
    public void yoCierroLaSesion() {
        menuSection.logoutButton.click();
    }

    @Then("yo deberia ingresar con mis nuevas credenciales a la app web")
    public void yoDeberiaIngresarConMisNuevasCredencialesALaAppWeb(Map<String, String> credential) {
        mainPage.loginButton.click();
        loginModal.emailTxtBox.writeText(credential.get("email"));
        loginModal.pwdTxtBox.writeText(credential.get("password"));
        loginModal.loginButton.click();
        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(), "Error, el login falló.");
    }
}
