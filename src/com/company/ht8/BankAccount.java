package com.company.ht8;

import java.util.Objects;

public class BankAccount {
    private int accountID;
    private int accountBalance;
    private String accountOwner;

    BankAccount() {
        this(0, 0, "");
    }

    BankAccount(int nAccountID, int nAccountBalance, String nAccountOwner) {
        accountID = nAccountID;
        accountBalance = nAccountBalance;
        accountOwner = nAccountOwner;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        if (accountID != that.accountID) { return false; }
        if (accountBalance != that.accountBalance) { return false; }
        if (null == accountOwner) {
            return (accountOwner == that.accountOwner);
        } else {
            if (!accountOwner.equals(that.accountOwner)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + accountID;
        result = prime * result + accountBalance;
        result = prime * result + ((accountOwner == null) ? 0 : accountOwner.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountID=" + accountID +
                ", accountBalance=" + accountBalance +
                ", accountOwner='" + accountOwner + '\'' +
                '}';
    }
}
