package page;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

/**
 - Settings link: //a[@href='javascript:OpenSettingsDialog();']
 - oldPass: TextPwOld
 - NewPass: TextPwNew
 - OK button: //span[text()='Ok']
 - logout link: ctl00_HeaderTopControl1_LinkButtonLogout
 */

public class ChangePasswordModal {

    public TextBox oldPassTxtBox = new TextBox(By.id("TextPwOld"));
    public TextBox newPassTxtBox = new TextBox(By.id("TextPwNew"));
    public Button okSettingsButton = new Button(By.xpath("//span[text()='Ok']"));
}
