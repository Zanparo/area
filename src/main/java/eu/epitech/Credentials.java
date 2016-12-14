package eu.epitech;

/**
 * Created by lucien on 13/12/2016.
 */

import java.lang.String;

public class Credentials {

    public enum Services {
        MAIL,
        TWITTER,
        PHONE,
        STEAM;
    }

    private String  email;
    private String  password;

    public String   getEmail() {
        return this.email;
    }

    public void   setEmail(String _email) {
        this.email = _email;
    }

    public String   getPassword() {
        return this.password;
    }

    public void   setPassword(String _password) {
        this.password = _password;
    }

}
