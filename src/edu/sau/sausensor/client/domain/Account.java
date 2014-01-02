package edu.sau.sausensor.client.domain;

public class Account {


    private String username;

    private String password;

    private Boolean enabled;

    public void setUsername(String username) {
        this.username = username;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public String getPassword() {
        return this.password;
    }

    public String getUsername() {
        return this.username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}
