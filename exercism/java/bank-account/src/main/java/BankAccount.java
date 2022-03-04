class BankAccount {
    private static int balance;
    private static boolean isClosed;

    public BankAccount(){
        balance = 0;
        isClosed = true;
    }

    public void open(){
        isClosed = false;
    }

    public void close(){
        isClosed = true;
    }

    public synchronized void deposit(int amount) throws BankAccountActionInvalidException {
        if(amount < 0 ) throw new BankAccountActionInvalidException("Cannot deposit or withdraw negative amount");
        if(!isClosed)
            balance += amount;
        else throw new BankAccountActionInvalidException("Account closed");
    }

    public int getBalance() throws BankAccountActionInvalidException {
        System.out.print(isClosed);
        if(isClosed) throw new BankAccountActionInvalidException("Account closed");
        else return balance;
    }

    public synchronized void withdraw(int amount) throws BankAccountActionInvalidException {
        System.out.println(balance);
        if(isClosed) throw new BankAccountActionInvalidException("Account closed");
        else if(balance == 0) throw new BankAccountActionInvalidException("Cannot withdraw money from an empty account");
        else if(amount < 0 ) throw new BankAccountActionInvalidException("Cannot deposit or withdraw negative amount");
        else if(balance - amount < 0) throw new BankAccountActionInvalidException("Cannot withdraw more money than is currently in the account");
        else {
            balance -= amount;
        }
    }
}