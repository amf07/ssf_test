package vttp2023.model;

import java.io.Serializable;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class loginPage implements Serializable {
    
    private String login;
    @Size(min=  8, max= 16, message = "Username must be at least 2 characters in length")
    @NotNull(message =  "Name can not be empty")
    private String username;
    
    @Size(min=  8, max= 16, message = "Username must be at least 2 characters in length")
    private String password;
    
    
    
    @Override
    public String toString() {
        return "loginPage [login=" + login + ", username=" + username + ", password=" + password + "]";
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }


    
    
    
}
