class Bank {
    private long[] balance;

    // Constructor: initializes the balance array
    public Bank(long[] balance) {
        this.balance = balance;
    }

    // Helper method to validate if an account exists
    private boolean isValidAccount(int account) {
        return account >= 1 && account <= balance.length;
    }

    // Withdraw method
    public boolean withdraw(int account, long money) {
        if (!isValidAccount(account)) return false; // invalid account
        if (balance[account - 1] < money) return false; // insufficient balance
        balance[account - 1] -= money; // deduct money
        return true;
    }

    // Deposit method
    public boolean deposit(int account, long money) {
        if (!isValidAccount(account)) return false; // invalid account
        balance[account - 1] += money; // add money
        return true;
    }

    // Transfer method
    public boolean transfer(int account1, int account2, long money) {
        if (!isValidAccount(account1) || !isValidAccount(account2)) return false; // invalid accounts
        if (balance[account1 - 1] < money) return false; // insufficient funds
        balance[account1 - 1] -= money; // withdraw from sender
        balance[account2 - 1] += money; // deposit to receiver
        return true;
    }
}


/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */