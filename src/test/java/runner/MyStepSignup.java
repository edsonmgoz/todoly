package runner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import page.MainPage;
import page.MenuSection;
import page.SignupModal;
import session.Session;

import java.util.Map;

public class MyStepSignup {

    MainPage mainPage = new MainPage();
    SignupModal signupModal = new SignupModal();
    MenuSection menuSection = new MenuSection();

    @Given("Acceder a {string}")
    public void accederA(String url) {
        Session.getInstance().getBrowser().get(url);
    }
    @When("yo quiero crear una nueva cuenta")
    public void yoQuieroCrearUnaNuevaCuenta(Map<String, String> credential) {
        int min = 50;
        int max = 100;
        Integer randomInt = (int)Math.floor(Math.random()*(max-min+1)+min);
        String email = credential.get("email");
        if (email.contains("[random]")) email = email.replace("[random]", randomInt.toString());
        mainPage.signupButton.click();
        signupModal.fullNameTxtBox.writeText(credential.get("fullname"));
        signupModal.emailTxtBox.writeText(email);
        signupModal.passwordTxtBox.writeText(credential.get("password"));
        signupModal.termsCheckBox.click();
        signupModal.signupButton.click();
    }

    @Then("yo deberia acceder a la web")
    public void yoDeberiaAccederALaWeb() {
        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(), "Error, el registro falló.");

    }
}
