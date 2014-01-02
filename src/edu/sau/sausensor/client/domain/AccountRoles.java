package edu.sau.sausensor.client.domain;

public class AccountRoles {


    private Account account;

    private String AUTHORITY;

    public void setAUTHORITY(String AUTHORITY) {
        this.AUTHORITY = AUTHORITY;
    }

    public String getAUTHORITY() {
        return this.AUTHORITY;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return this.account;
    }
}
