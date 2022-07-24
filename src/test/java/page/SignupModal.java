package page;

import control.Button;
import control.CheckBox;
import control.TextBox;
import org.openqa.selenium.By;

/**
 * fullname: ctl00_MainContent_SignupControl1_TextBoxFullName
 *
 * Email: ctl00_MainContent_SignupControl1_TextBoxEmail
 *
 * Pass: ctl00_MainContent_SignupControl1_TextBoxPassword
 *
 * Check: ctl00_MainContent_SignupControl1_CheckBoxTerms
 *
 * SignUpButton: ctl00_MainContent_SignupControl1_ButtonSignup
 */

public class SignupModal {

    public TextBox fullNameTxtBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxFullName"));
    public TextBox emailTxtBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxEmail"));
    public TextBox passwordTxtBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxPassword"));
    public CheckBox termsCheckBox = new CheckBox(By.id("ctl00_MainContent_SignupControl1_CheckBoxTerms"));
    public Button signupButton = new Button(By.id("ctl00_MainContent_SignupControl1_ButtonSignup"));
}
