package hw1.entities;

import com.jdiai.tools.DataClass;
import lombok.Getter;

@Getter
public class UserEntity extends DataClass<UserEntity> {

    private String login;
    private String password;
    private String username;

    public UserEntity(String login, String password, String username) {
        this.login = login;
        this.password = password;
        this.username = username;
    }

}
