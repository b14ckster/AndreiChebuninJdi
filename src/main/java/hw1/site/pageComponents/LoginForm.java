package hw1.site.pageComponents;

import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.ui.html.elements.common.TextField;
import hw1.entities.UserEntity;
import lombok.Getter;

@Getter
public class LoginForm extends Form<UserEntity> {

    @FindBy(id = "name")
    private TextField login;

    @FindBy(id = "password")
    private TextField password;

    @FindBy(id = "login-button")
    private Button loginButton;

}
